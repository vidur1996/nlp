/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nlp1;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;
/**
 *
 * @author VIDURSHAN
 */
public class nerapp extends javax.swing.JFrame {
    
    
    /**
     * Creates new form nerapp
     */
    public nerapp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        intext = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outtext = new javax.swing.JTextArea();
        person_btn = new javax.swing.JButton();
        location_btn = new javax.swing.JButton();
        time_btn = new javax.swing.JButton();
        number_btn = new javax.swing.JButton();
        org_btn = new javax.swing.JButton();
        title_btn = new javax.swing.JButton();
        email_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Name Entity Recognition");

        intext.setColumns(20);
        intext.setRows(5);
        jScrollPane1.setViewportView(intext);

        outtext.setColumns(20);
        outtext.setRows(5);
        jScrollPane2.setViewportView(outtext);

        person_btn.setText("PERSON");
        person_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_btnActionPerformed(evt);
            }
        });

        location_btn.setText("LOCATION");
        location_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location_btnActionPerformed(evt);
            }
        });

        time_btn.setText("TIME");
        time_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_btnActionPerformed(evt);
            }
        });

        number_btn.setText("NUMBER");
        number_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_btnActionPerformed(evt);
            }
        });

        org_btn.setText("ORGANIZATION");
        org_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                org_btnActionPerformed(evt);
            }
        });

        title_btn.setText("TITLE");
        title_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title_btnActionPerformed(evt);
            }
        });

        email_btn.setText("EMAIL");
        email_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_btnActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please select the  catogory your wanted to extract");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(person_btn)
                .addGap(46, 46, 46)
                .addComponent(location_btn)
                .addGap(51, 51, 51)
                .addComponent(time_btn)
                .addGap(54, 54, 54)
                .addComponent(number_btn)
                .addGap(43, 43, 43)
                .addComponent(org_btn)
                .addGap(54, 54, 54)
                .addComponent(title_btn)
                .addGap(48, 48, 48)
                .addComponent(email_btn)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(person_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(location_btn)
                        .addComponent(time_btn)
                        .addComponent(number_btn)
                        .addComponent(org_btn)
                        .addComponent(title_btn)
                        .addComponent(email_btn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void person_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
    
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("PERSON"))
             {
                 

            if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
             
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_person_btnActionPerformed

    private void location_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("LOCATION")|| nerr.equals("CITY")||nerr.equals("PROVINCE") ||nerr.equals("STATE"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_location_btnActionPerformed

    private void time_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("DATE"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_time_btnActionPerformed

    private void number_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("NUMBER"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_number_btnActionPerformed

    private void org_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_org_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("ORGANIZATION"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_org_btnActionPerformed

    private void title_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("TITLE"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_title_btnActionPerformed

    private void email_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_btnActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         //String text = "Jim bought 300 shares of Acme Corp. in 2006.";
         String indata = intext.getText();
         CoreDocument coreDocument = new CoreDocument(indata);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         int count =0;
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             if(nerr.equals("EMAIL"))
             {
             if (outtext.getText().contains(coreLabel.originalText())) 
             {
               count++;
            }
           else
           {
             outtext.append(coreLabel.originalText());
             outtext.append("\n");
             count++;
           }
             }
         }
         if(count==0)
         {
            outtext.setText("no entity found"); 
         }
    }//GEN-LAST:event_email_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        outtext.setText("");
        intext.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nerapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nerapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nerapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nerapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nerapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton email_btn;
    private javax.swing.JTextArea intext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton location_btn;
    private javax.swing.JButton number_btn;
    private javax.swing.JButton org_btn;
    private javax.swing.JTextArea outtext;
    private javax.swing.JButton person_btn;
    private javax.swing.JButton time_btn;
    private javax.swing.JButton title_btn;
    // End of variables declaration//GEN-END:variables
}
