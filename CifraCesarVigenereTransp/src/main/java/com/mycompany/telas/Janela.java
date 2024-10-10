package com.mycompany.telas;

import com.mycompany.cifracesar.CifraCesar;
import com.mycompany.cifracesar.CifraTransp;
import com.mycompany.cifracesar.CifraVigenere;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {
    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtf_mensagem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_chaveCesar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_chaveVigenere = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_chaveTransp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_codificarCesar = new javax.swing.JButton();
        jb_codificarVigenere = new javax.swing.JButton();
        jb_codificarTransp = new javax.swing.JButton();
        jb_descodificarCesar = new javax.swing.JButton();
        jb_descodificarTransp = new javax.swing.JButton();
        jb_descodificarVigenere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Teste de Cifras");

        jtf_mensagem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Cifra de Cesar");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Cifra de Vigenere");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Cifra de Transposição de Colunas");

        jtf_chaveCesar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Chave:");

        jtf_chaveVigenere.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Chave:");

        jtf_chaveTransp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Chave:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Escreva sua mensagem:");

        jb_codificarCesar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_codificarCesar.setText("Codificar");
        jb_codificarCesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_codificarCesarActionPerformed(evt);
            }
        });

        jb_codificarVigenere.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_codificarVigenere.setText("Codificar");
        jb_codificarVigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_codificarVigenereActionPerformed(evt);
            }
        });

        jb_codificarTransp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_codificarTransp.setText("Codificar");
        jb_codificarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_codificarTranspActionPerformed(evt);
            }
        });

        jb_descodificarCesar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_descodificarCesar.setText("Descodificar");
        jb_descodificarCesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_descodificarCesarActionPerformed(evt);
            }
        });

        jb_descodificarTransp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_descodificarTransp.setText("Descodificar");
        jb_descodificarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_descodificarTranspActionPerformed(evt);
            }
        });

        jb_descodificarVigenere.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jb_descodificarVigenere.setText("Descodificar");
        jb_descodificarVigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_descodificarVigenereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_codificarCesar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_descodificarCesar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_chaveCesar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtf_chaveVigenere))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jb_codificarVigenere)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_descodificarVigenere))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_codificarTransp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_descodificarTransp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_chaveTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jtf_chaveTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_codificarTransp)
                                        .addComponent(jb_descodificarTransp)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jtf_chaveVigenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_codificarVigenere)
                                        .addComponent(jb_descodificarVigenere)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jtf_chaveCesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_descodificarCesar)
                                .addComponent(jb_codificarCesar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean estaEscrito(){
        boolean estaEscrito=false;
        
        if(!jtf_mensagem.equals("")){
            estaEscrito = true;
        }
        return estaEscrito;
    }
    
    private void jb_descodificarCesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_descodificarCesarActionPerformed
        if(estaEscrito()&&!jtf_chaveCesar.equals("")){
            String mensagem = jtf_mensagem.getText();
            int chave = Integer.parseInt(jtf_chaveCesar.getText());
            jtf_mensagem.setText(CifraCesar.desencriptar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_descodificarCesarActionPerformed

    private void jb_descodificarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_descodificarTranspActionPerformed
        if(estaEscrito()&&!jtf_chaveTransp.equals("")){
            String mensagem = jtf_mensagem.getText();
            String chave = jtf_chaveTransp.getText();
            jtf_mensagem.setText(CifraTransp.descriptografar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_descodificarTranspActionPerformed

    private void jb_descodificarVigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_descodificarVigenereActionPerformed
        if(estaEscrito()&&!jtf_chaveVigenere.equals("")){
            String mensagem = jtf_mensagem.getText();
            String chave = jtf_chaveVigenere.getText();
            jtf_mensagem.setText(CifraVigenere.descriptografar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_descodificarVigenereActionPerformed

    private void jb_codificarCesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_codificarCesarActionPerformed
        if(estaEscrito()&&!jtf_chaveCesar.equals("")){
            String mensagem = jtf_mensagem.getText();
            int chave = Integer.parseInt(jtf_chaveCesar.getText());
            jtf_mensagem.setText(CifraCesar.encriptar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_codificarCesarActionPerformed

    private void jb_codificarVigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_codificarVigenereActionPerformed
        if(estaEscrito()&&!jtf_chaveVigenere.equals("")){
            String mensagem = jtf_mensagem.getText();
            String chave = jtf_chaveVigenere.getText();
            jtf_mensagem.setText(CifraVigenere.criptografar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_codificarVigenereActionPerformed

    private void jb_codificarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_codificarTranspActionPerformed
        if(estaEscrito()&&!jtf_chaveTransp.equals("")){
            String mensagem = jtf_mensagem.getText();
            String chave = jtf_chaveTransp.getText();
            jtf_mensagem.setText(CifraTransp.criptografar(mensagem, chave));
        }else{
            JOptionPane.showConfirmDialog(null, "Escreva um texto/chave antes de codificar!");
        }
    }//GEN-LAST:event_jb_codificarTranspActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jb_codificarCesar;
    private javax.swing.JButton jb_codificarTransp;
    private javax.swing.JButton jb_codificarVigenere;
    private javax.swing.JButton jb_descodificarCesar;
    private javax.swing.JButton jb_descodificarTransp;
    private javax.swing.JButton jb_descodificarVigenere;
    private javax.swing.JTextField jtf_chaveCesar;
    private javax.swing.JTextField jtf_chaveTransp;
    private javax.swing.JTextField jtf_chaveVigenere;
    private javax.swing.JTextField jtf_mensagem;
    // End of variables declaration//GEN-END:variables
}
