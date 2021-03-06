/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmwork;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author Hidee
 */
public class instructionPage extends javax.swing.JFrame {
javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();  
boolean in = false;    
    /**
     * Creates new form instructionPage
     */
    public instructionPage() {
        initComponents();
        UIManager.put("PopupMenu.consumeEventOnClose", false);
        UserName.setText(IBMwork.getTitle()+""+IBMwork.getUserName());
        instruct.setText("To complete each section of this inventory, tick in appropriate boxes the one,"
                + " two or three sentences most applicable to yourself. Then split 10 points between those"
                + " sentences you have ticked, thus indicating the relative extent to which each applies. For examples, "
                + "in one section you might feel there are only three sentences that apply to you: one which you feel "
                + "sums you up well while the other two apply some of the time. In this instance, you could give your first "
                + "choice six points and the remaining points to your second and third choices. In some instances, you might decide "
                + "that there are two sentences, which apply to you equally; if this is the case, award five points to each. "
                + "You must allocate all 10 points in each section.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instruct = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setNextFocusableComponent(playButton);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.white));

        loginBack.setBackground(new java.awt.Color(102, 102, 102));
        loginBack.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        loginBack.setForeground(new java.awt.Color(255, 255, 255));
        loginBack.setText("<<<");
        loginBack.setToolTipText("");
        loginBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginBack.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loginBack.setPreferredSize(new java.awt.Dimension(39, 21));
        loginBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBackMouseExited(evt);
            }
        });
        loginBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTRUCTIONS    ");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(104, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(84, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(430, 24));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(loginBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(loginBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 2, 12)); // NOI18N
        jLabel3.setText("Please read the instructions carefully");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        playButton.setBackground(new java.awt.Color(0, 102, 102));
        playButton.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("CONTINUE");
        playButton.setActionCommand("login");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome, ");

        UserName.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        instruct.setEditable(false);
        instruct.setBackground(new java.awt.Color(0, 153, 153));
        instruct.setColumns(20);
        instruct.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        instruct.setForeground(new java.awt.Color(255, 255, 255));
        instruct.setLineWrap(true);
        instruct.setRows(10);
        instruct.setTabSize(6);
        instruct.setText("To complete each section of this inventory, tick in appropriate boxes the one, two or three sentences most applicable to yourself. Then split 10 points between those sentences you have ticked, thus indicating the relative extent to which each applies. For examples, in one section you might feel there are only three sentences that apply to you: one which you feel sums you up well while the other two apply some of the time. In this instance, you could give your first choice six points and the remaining points to your second and third choices. In some instances, you might decide that there are two sentences, which apply to you equally; if this is the case, award five points to each. You must allocate all 10 points in each section");
        instruct.setToolTipText("");
        instruct.setWrapStyleWord(true);
        instruct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        instruct.setCaretPosition(0);
        instruct.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jScrollPane1.setViewportView(instruct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 33, Short.MAX_VALUE)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackActionPerformed
        loginPage test = new loginPage();
        test.setSize(this.getSize());
        test.setLocation(this.getLocation());
//        test.setMaximizedBounds(new Rectangle(800,710));
        test.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginBackActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        IBMwork.sectNo=0;
        testPage test = new testPage();
        test.setSize(this.getSize());
        test.setLocation(this.getLocation());
//        test.setMaximizedBounds(new Rectangle(800,710));
        test.setVisible(true);
        dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    
    private void loginBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBackMouseEntered
//        in=false
  
//        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\olatoyosi\\Desktop\\finalistinz\\Sophies Magic\\icons8-exit-30.png")); // NOI18N
//        jMenuItem1.setText("Exit");
//        
//                               
//        System.out.println("She se de");
//        jPopupMenu1.setLocation(loginBack.getX()+8,loginBack.getY() +jPanel2.getHeight()+20);
//        jPopupMenu1.setPopupSize(100, 100);
//        jPopupMenu1.setVisible(true);
//        
//        jPopupMenu1.add(jMenuItem1);
//        jPopupMenu1.add(new JMenuItem("Section1",new javax.swing.ImageIcon("C:\\Users\\olatoyosi\\Desktop\\finalistinz\\Sophies Magic\\icons8-exit-30.png")));
//        jPopupMenu1.add(new JMenuItem("Section2",new javax.swing.ImageIcon("C:\\Users\\olatoyosi\\Desktop\\finalistinz\\Sophies Magic\\icons8-exit-30.png")));
//        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItem1ActionPerformed(evt);
//            }
//        });
//        
//        
//        MouseListener mousel = new MouseAdapter(){
//            public void mouseEntered(MouseEvent event){
//                System.out.println("Mouse Entered");
////                in=true;
//            }
//            
//    };
//        
//        jPopupMenu1.addMouseListener(mousel);

    }//GEN-LAST:event_loginBackMouseEntered

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
//           IBMwork.sectNo=0;
//           jPopupMenu1.setVisible(false); 
//           testPage test = new testPage();
//           test.setSize(this.getSize());
//           test.setLocation(this.getLocation());
//   //        test.setMaximizedBounds(new Rectangle(800,710));
//           test.setVisible(true);
//           dispose();
    }
    
    private void loginBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBackMouseExited
//        UIManager.put("PopupMenu.consumeEventOnClose", false);
    }//GEN-LAST:event_loginBackMouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
//        jPopupMenu1.setVisible(false); 
    }//GEN-LAST:event_jPanel1MouseEntered

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
            java.util.logging.Logger.getLogger(instructionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                instructionPage test = new instructionPage();
//                test.setMaximizedBounds(new Rectangle(800,710));
                test.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserName;
    private javax.swing.JTextArea instruct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBack;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables

}
