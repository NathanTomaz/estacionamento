package estacionamento;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class carros extends javax.swing.JPanel {

    private conectar bd;

    private DefaultTableModel tCar;

    public carros(conectar BD) {
        bd = BD;
        initComponents();
        tCar = (DefaultTableModel) carrroTab.getModel();
        preencheTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTex = new javax.swing.JTextField();
        corText = new javax.swing.JTextField();
        placaTex = new javax.swing.JTextField();
        guardarBt = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carrroTab = new javax.swing.JTable();
        limparBt = new javax.swing.JToggleButton();

        setBackground(java.awt.Color.lightGray);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Carros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Carro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Cor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Placa");

        nomeTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        corText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        placaTex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        guardarBt.setBackground(new java.awt.Color(241, 242, 244));
        guardarBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardarBt.setForeground(new java.awt.Color(51, 0, 51));
        guardarBt.setText("Guardar");
        guardarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtActionPerformed(evt);
            }
        });

        carrroTab.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        carrroTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Carro", "Cor", "Placa", "Deletar", "Alterar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carrroTab.setToolTipText("");
        carrroTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrroTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carrroTab);

        limparBt.setBackground(new java.awt.Color(241, 242, 244));
        limparBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limparBt.setForeground(new java.awt.Color(51, 0, 51));
        limparBt.setText("↺");
        limparBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(guardarBt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(limparBt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(nomeTex, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .add(corText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .add(placaTex, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(nomeTex, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(corText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(placaTex, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(guardarBt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(limparBt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 373, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        int confirma;
        confirma = JOptionPane.showConfirmDialog(null, "Deseja Gravar esses dados?");
        if (confirma == JOptionPane.YES_OPTION) {
        String car, cor, pla;
        car = nomeTex.getText();
        cor = corText.getText();
        pla = placaTex.getText();
        conectar aa = new conectar();
        try {
            if(idSelect.equals("")){
            bd.persistir("INSERT INTO carros(nome, cor, placa) "
                    + "VALUES('" + car + "','" + cor + "','" + pla + "')");
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
            
            }else{
                bd.persistir("update carros set "
                        + "nome = '" + car + "'"
                        + ",cor = '" + cor + "'"
                        + ",placa = '" + pla + "' "
                                + "where id = '"+idSelect+"'");
                JOptionPane.showMessageDialog(null, "Editado com sucesso!");       
            }
            preencheTabel();
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage()+" ERROR-BD");
        }
        
            }
        else {
      JOptionPane.showMessageDialog(null, "Cancelado!");
        }
    }//GEN-LAST:event_guardarBtActionPerformed

    private void carrroTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrroTabMouseClicked
        int li = carrroTab.getSelectedRow();
        int col = carrroTab.getSelectedColumn();
        String texto = (String) carrroTab.getValueAt(li, col);
        String id = (String) carrroTab.getValueAt(li, 0);
        //idSelect = "";
        if(texto.equals("            X")){
            excluir(id);
            
        }else if(texto.equals("            O")){
            editar(id);
        }
        preencheTabel();
    }//GEN-LAST:event_carrroTabMouseClicked

    private void limparBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtActionPerformed
        // TODO add your handling code here:
    limpar();     
    }//GEN-LAST:event_limparBtActionPerformed
    public void excluir(String id){
        bd.persistir("DELETE FROM carros where id = "+id);
        this.idSelect = "";
        this.nomeTex.setText("");
        this.corText.setText("");
        this.placaTex.setText("");
    }
    public void editar(String id){
        ResultSet carro;
        try{
        carro =  bd.recupera("SELECT * FROM carros where id = "+id);
        while(carro.next()){
            this.idSelect = carro.getString("id");
            this.nomeTex.setText(carro.getString("nome"));
            this.corText.setText(carro.getString("cor"));
            this.placaTex.setText(carro.getString("placa"));
        }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage()+" ERROR");
        }
    }
    
    public void limpar(String id) {
        ResultSet carro;
        try{
        carro =  bd.recupera("SELECT * FROM carros where id = "+id);
            while(carro.next()){
            this.idSelect = null;
            this.nomeTex.setText("");
            this.corText.setText("");
            this.placaTex.setText("");
        }
            }catch(Exception ex){
            System.out.println(ex.getMessage()+" ERROR");
        }
            
    }

    public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from carros");
            tCar.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("nome"),
                    todos.getString("cor"),
                    todos.getString("placa"),
                    "            X", "            O"
                };
                tCar.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage()+" ERROR - Alterar");
        }
    }

    public ResultSet busca() {
        return bd.recupera("select * from carros");
    }
    
        public void limpar() {
        this.idSelect = "";
        this.nomeTex.setText("");
        this.corText.setText("");
        this.placaTex.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carrroTab;
    private javax.swing.JTextField corText;
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton limparBt;
    private javax.swing.JTextField nomeTex;
    private javax.swing.JTextField placaTex;
    // End of variables declaration//GEN-END:variables
private String idSelect = "";

}
