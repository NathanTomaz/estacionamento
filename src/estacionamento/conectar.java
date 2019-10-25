package estacionamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conectar {
    private Connection con; //formaliza uma conecção com a base de dados
    private Statement stt; // gerêcia o acesso aos dados.
    public conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/estacionamento3",
                    "root", "12345678");
            stt = con.createStatement();
            System.out.println("Sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public int persistir(String sql) {
        try {
            stt.executeUpdate(sql);
            ResultSet id = recupera("SELECT LAST_INSERT_ID()");
            if (id.next()) {
                return id.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return 0;
    }
    public ResultSet recupera(String sql) {
        try {
            return stt.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return null;
    }

}

//Quais strings precisam para aceessar bd: host, porta, usuario do db, senha do bd
