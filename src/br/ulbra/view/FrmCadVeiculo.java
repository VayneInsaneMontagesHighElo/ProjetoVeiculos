/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Veiculo;
import br.ulbra.model.VeiculoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrmCadVeiculo extends javax.swing.JFrame 
{

    /**
     * Creates new form FrmCadVeiculo
     */
    public FrmCadVeiculo() throws SQLException 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
        controlarTela(1);        
    }
    
    public void limpar()
    {
        txtId.setText(null);
        
        txtMarca.setText(null);
        txtModelo.setText(null);
        txtAno.setText(null);
        
        txtCor.setText(null);
        txtPlaca.setText(null);
        txtMotor.setText(null);
        
        txtKm.setText(null);
        txtValor.setText(null);
        
    }
    
    public void showTable() throws SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel)tbPesquisa.getModel();
        modelo.setNumRows(0);
        VeiculoDao vdao = new VeiculoDao();
        for(Veiculo v: vdao.read())
        {
            modelo.addRow(new Object[]
            {
                v.getId(), 
                
                v.getMarca(),
                v.getModelo(),
                v.getAno(),
                
                v.getCor(),
                v.getPlaca(),
                v.getMotor(),
                
                v.getKm(),
                v.getValor()
                
            });
           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtModelo1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPesquisa.setAutoCreateRowSorter(true);
        tbPesquisa.setBackground(new java.awt.Color(0, 51, 51));
        tbPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Ano", "Cor", "Placa", "Motor", "KM", "Valor"
            }
        ));
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPesquisa);
        if (tbPesquisa.getColumnModel().getColumnCount() > 0) {
            tbPesquisa.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbPesquisa.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 660, 90));

        jLabel2.setText("CODIGO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 610, -1));

        jLabel3.setText("MARCA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 150, -1));

        jLabel4.setText("MODELO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 150, -1));

        jLabel5.setText("ANO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel6.setText("COR:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel1.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, -1));

        jLabel7.setText("PLACA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, -1));

        jLabel8.setText("MOTOR:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, -1));

        jLabel9.setText("KM:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(txtKm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 250, -1));

        jLabel10.setText("VALOR:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 280, -1));

        jLabel11.setText("PESQUISAR:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 530, -1));

        btnPesquisar.setBackground(new java.awt.Color(0, 51, 51));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/iconfinder_search_4092559.png"))); // NOI18N
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 50, 40));

        btnNovo.setBackground(new java.awt.Color(0, 51, 51));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(0, 51, 51));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        btnAlterar.setBackground(new java.awt.Color(0, 51, 51));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 51, 51));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 290, 80, -1));

        btnLimpar.setBackground(new java.awt.Color(0, 51, 51));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/iconfinder_ic_directions_car_48px_352315.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 90, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/iconfinder_ic_directions_car_48px_352315.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 150, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Veiculo v = new Veiculo();
        
        v.setMarca(txtMarca.getText());
        v.setModelo(txtModelo.getText());
        v.setAno(Integer.parseInt(txtAno.getText()));
        
        v.setCor(txtCor.getText());
        v.setPlaca(txtPlaca.getText());
        v.setMotor(txtMotor.getText());
        
        v.setKm(Integer.parseInt(txtKm.getText()));
        v.setValor(Double.parseDouble(txtValor.getText()));
        
        try
        {
            VeiculoDao vdao = new VeiculoDao();
            vdao.create(v);
            showTable();
            
            controlarTela(1);
            limpar();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
                                          
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
         if(tbPesquisa.getSelectedRow()!= -1)
        {
            txtId.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0).toString());
            
            txtMarca.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 1).toString());
            txtModelo.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 2).toString());
            txtAno.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 3).toString());
            
            txtCor.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 4).toString());
            txtPlaca.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 5).toString());
            txtMotor.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 6).toString());  
            
            txtKm.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 7).toString());
            txtValor.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 8).toString());
            
            controlarTela(3);
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Veiculo v = new Veiculo();
        
        v.setId(Integer.parseInt(txtId.getText()));
        
        v.setMarca(txtMarca.getText());
        v.setModelo(txtModelo.getText());
        v.setAno(Integer.parseInt(txtAno.getText()));
        
        v.setCor(txtCor.getText());
        v.setPlaca(txtPlaca.getText());
        v.setMotor(txtMotor.getText());
        
        v.setKm(Integer.parseInt(txtKm.getText()));
        v.setValor(Double.parseDouble(txtValor.getText()));
        
        try 
        {
            VeiculoDao vdao = new VeiculoDao();
            vdao.update(v);
            showTable();
            
            controlarTela(1);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmCadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Veiculo v = new Veiculo();
        v.setId(Integer.parseInt(txtId.getText()));
        
        try 
        {
            VeiculoDao vdao = new VeiculoDao();
            vdao.delete(v);
            showTable();
            
            controlarTela(1);
            limpar();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmCadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        controlarTela(2);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
        controlarTela(1);
    }//GEN-LAST:event_btnLimparActionPerformed

    public void controlarTela(int op)
    {
        if(op ==1) //iniciar
        {
            txtId.setEnabled(false); 
            
            txtMarca.setEnabled(false);
            txtModelo.setEnabled(false);
            txtAno.setEnabled(false);
            txtCor.setEnabled(false);
            txtPlaca.setEnabled(false);
            txtMotor.setEnabled(false);
            txtKm.setEnabled(false);
            txtValor.setEnabled(false);
            
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(true);
        }
        else if(op ==2) //botao novo
        {
            txtId.setEnabled(false); 
            
            txtMarca.setEnabled(true);
            txtModelo.setEnabled(true);
            txtAno.setEnabled(true);
            txtCor.setEnabled(true);
            txtPlaca.setEnabled(true);
            txtMotor.setEnabled(true);
            txtKm.setEnabled(true);
            txtValor.setEnabled(true);
            
            btnSalvar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(false);
            
            txtModelo.requestFocus();
            limpar();
        }
        else if(op==3) //tabela 
        {
            txtId.setEnabled(true); 
            
            txtMarca.setEnabled(true);
            txtModelo.setEnabled(true);
            txtAno.setEnabled(true);
            txtCor.setEnabled(true);
            txtPlaca.setEnabled(true);
            txtMotor.setEnabled(true);
            txtKm.setEnabled(true);
            txtValor.setEnabled(true);
            
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnNovo.setEnabled(true);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new FrmCadVeiculo().setVisible(true);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(FrmCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
