/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nathan
 */
public class precos extends javax.swing.JPanel {
       private conectar bd;

       private DefaultTableModel tPrec;
    /**
     * Creates new form precos
     */
    public precos(conectar BD) {
                bd = BD;
        initComponents();
        tPrec = (DefaultTableModel) precoTab.getModel();
        preencheTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        guardarBt = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        precoTab = new javax.swing.JTable();
        limparBt = new javax.swing.JToggleButton();
        valorHoraTx = new javax.swing.JFormattedTextField();
        valorMesTx = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Preços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Valor/hora");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Valor/mês");

        guardarBt.setBackground(new java.awt.Color(241, 242, 244));
        guardarBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardarBt.setForeground(new java.awt.Color(51, 0, 51));
        guardarBt.setText("Guardar");
        guardarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtActionPerformed(evt);
            }
        });

        precoTab.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        precoTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Valor p/Hora", "Valor p/Mês", "Deletar", "Alterar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        precoTab.setToolTipText("");
        precoTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precoTabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(precoTab);

        limparBt.setBackground(new java.awt.Color(241, 242, 244));
        limparBt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limparBt.setForeground(new java.awt.Color(51, 0, 51));
        limparBt.setText("↺");
        limparBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtActionPerformed(evt);
            }
        });

        valorHoraTx.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        valorMesTx.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorHoraTx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorMesTx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparBt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(valorHoraTx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(valorMesTx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limparBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtActionPerformed
        // TODO add your handling code here:
                    int confirma;
        confirma = JOptionPane.showConfirmDialog(null, "Deseja Gravar esses dados?");
        if (confirma == JOptionPane.YES_OPTION) {
            // verifica se o usuário clicou no botão YES
            Float vhora, vmensal;
            vhora = Float.parseFloat(valorHoraTx.getText());
            vmensal = Float.parseFloat(valorMesTx.getText());
            conectar bb = new conectar();

            try {

                if(idSelect.equals("")){
                    bd.persistir("INSERT INTO precos(valor_hora, valor_mensal) "
                        + "VALUES('" + vhora + "','" + vmensal + "')");

                    JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
                }else{
                    bd.persistir("update precos set "
                        + "valor_hora = '" + vhora + "'"
                        + ",valor_mensal = '" + vmensal + "' "
                        + "where id = '"+idSelect+"'");
                    JOptionPane.showMessageDialog(null, "Editado com sucesso!");
                }
                preencheTabel();

            } catch (Exception ex) {
                System.out.println(ex.getMessage()+" ERROR");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cancelado!");
        }
    }//GEN-LAST:event_guardarBtActionPerformed

    private void precoTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precoTabMouseClicked
        // TODO add your handling code here:
        int li = precoTab.getSelectedRow();
        int col = precoTab.getSelectedColumn();
        String texto = (String) precoTab.getValueAt(li, col);
        String id = (String) precoTab.getValueAt(li, 0);
        //idSelect = "";
        if(texto.equals("              X")){
            excluir(id);
        }else if(texto.equals("            O")){
            editar(id);
        }
        preencheTabel();
    }//GEN-LAST:event_precoTabMouseClicked

    private void limparBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_limparBtActionPerformed
public void excluir(String id){
        bd.persistir("DELETE FROM precos where id = "+id);
        limpar();
    }
    public void editar(String id){
        ResultSet precos;
        try{
        precos =  bd.recupera("SELECT * FROM precos where id = "+id);
        while(precos.next()){
            this.idSelect = precos.getString("id");
            this.valorHoraTx.setText(precos.getString("valor_hora"));
            this.valorMesTx.setText(precos.getString("valor_mensal"));
        }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void preencheTabel() {
        try {
            ResultSet todos = bd.recupera("select * from precos");
            tPrec.setNumRows(0);
            while (todos.next()) {
                String[] Nlinha = {
                    todos.getString("id"),
                    todos.getString("valor_hora"),
                    todos.getString("valor_mensal"),
                    "              X", "            O"
                };
                tPrec.addRow(Nlinha);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet busca() {
        return bd.recupera("select * from precos");
    }
    
    public void limpar() {
        this.idSelect = "";
        this.valorHoraTx.setText("");
        this.valorMesTx.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton guardarBt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton limparBt;
    private javax.swing.JTable precoTab;
    private javax.swing.JFormattedTextField valorHoraTx;
    private javax.swing.JFormattedTextField valorMesTx;
    // End of variables declaration//GEN-END:variables
private String idSelect = "";
}
