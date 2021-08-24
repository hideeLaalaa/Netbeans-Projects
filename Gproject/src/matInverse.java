/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;
/**
 *
 * @author Hidee
 */
public class matInverse extends javax.swing.JFrame {
    private int i=0; public static Integer time = 30;
     private Timeline timeline;
    private KeyFrame countDownKeyFrame;
  
     private double matrix4[][] = new double[4][4];
    public matInverse() {
        initComponents();
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        countDownKeyFrame = new KeyFrame(Duration.seconds(1), evt -> over());
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m10 = new javax.swing.JTextField();
        m01 = new javax.swing.JTextField();
        m11 = new javax.swing.JTextField();
        m20 = new javax.swing.JTextField();
        m21 = new javax.swing.JTextField();
        m00 = new javax.swing.JTextField();
        m22 = new javax.swing.JTextField();
        m23 = new javax.swing.JTextField();
        m02 = new javax.swing.JTextField();
        m30 = new javax.swing.JTextField();
        m03 = new javax.swing.JTextField();
        m31 = new javax.swing.JTextField();
        m13 = new javax.swing.JTextField();
        m32 = new javax.swing.JTextField();
        m12 = new javax.swing.JTextField();
        m33 = new javax.swing.JTextField();
        tim = new javax.swing.JLabel();
        inv00 = new javax.swing.JTextField();
        inv20 = new javax.swing.JTextField();
        inv10 = new javax.swing.JTextField();
        inv01 = new javax.swing.JTextField();
        inv30 = new javax.swing.JTextField();
        inv02 = new javax.swing.JTextField();
        inv03 = new javax.swing.JTextField();
        inv11 = new javax.swing.JTextField();
        inv12 = new javax.swing.JTextField();
        inv13 = new javax.swing.JTextField();
        inv21 = new javax.swing.JTextField();
        inv22 = new javax.swing.JTextField();
        inv23 = new javax.swing.JTextField();
        inv32 = new javax.swing.JTextField();
        inv31 = new javax.swing.JTextField();
        inv33 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        warn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        m10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m10MouseExited(evt);
            }
        });

        m01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m01MouseExited(evt);
            }
        });
        m01.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                m01InputMethodTextChanged(evt);
            }
        });
        m01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m01ActionPerformed(evt);
            }
        });

        m11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m11MouseExited(evt);
            }
        });
        m11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m11ActionPerformed(evt);
            }
        });

        m20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m20MouseExited(evt);
            }
        });
        m20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m20ActionPerformed(evt);
            }
        });

        m21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m21MouseExited(evt);
            }
        });
        m21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m21ActionPerformed(evt);
            }
        });

        m00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m00MouseExited(evt);
            }
        });
        m00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m00ActionPerformed(evt);
            }
        });
        m00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m00KeyTyped(evt);
            }
        });

        m22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m22MouseExited(evt);
            }
        });
        m22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m22ActionPerformed(evt);
            }
        });

        m23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m23MouseExited(evt);
            }
        });
        m23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m23ActionPerformed(evt);
            }
        });

        m02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m02MouseExited(evt);
            }
        });

        m30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m30MouseExited(evt);
            }
        });
        m30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m30ActionPerformed(evt);
            }
        });

        m03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m03MouseExited(evt);
            }
        });
        m03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m03ActionPerformed(evt);
            }
        });

        m31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m31MouseExited(evt);
            }
        });
        m31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m31ActionPerformed(evt);
            }
        });

        m13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m13MouseExited(evt);
            }
        });

        m32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m32MouseExited(evt);
            }
        });
        m32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m32ActionPerformed(evt);
            }
        });

        m12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m12MouseExited(evt);
            }
        });
        m12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m12ActionPerformed(evt);
            }
        });

        m33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m33MouseExited(evt);
            }
        });
        m33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m33ActionPerformed(evt);
            }
        });

        tim.setText("jLabel1");

        inv01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv01ActionPerformed(evt);
            }
        });

        inv30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv30ActionPerformed(evt);
            }
        });

        inv02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv02ActionPerformed(evt);
            }
        });

        inv03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv03ActionPerformed(evt);
            }
        });

        inv11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv11ActionPerformed(evt);
            }
        });

        inv12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv12ActionPerformed(evt);
            }
        });

        inv21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv21ActionPerformed(evt);
            }
        });

        inv22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv22ActionPerformed(evt);
            }
        });

        inv23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv23ActionPerformed(evt);
            }
        });

        inv32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv32ActionPerformed(evt);
            }
        });

        inv31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv31ActionPerformed(evt);
            }
        });

        inv33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv33ActionPerformed(evt);
            }
        });

        jButton1.setText("INVERSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textKeyPressed(evt);
            }
        });

        warn.setText("h");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(9, 9, 9))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(m00, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(m01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(m02)
                                                .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(m03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(m20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(m23))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(m30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inv10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inv20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inv21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inv30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inv31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inv32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inv22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inv23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inv33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inv00, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inv03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m02)
                    .addComponent(m03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m22)
                            .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(warn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inv00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inv10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inv20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inv30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inv31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inv32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inv33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m10MouseExited
        matrix4[1][0]=Double.parseDouble(m10.getText());
    }//GEN-LAST:event_m10MouseExited

    private void m01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m01MouseExited
        matrix4[0][1]=Double.parseDouble(m01.getText());
    }//GEN-LAST:event_m01MouseExited

    private void m01InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_m01InputMethodTextChanged

    }//GEN-LAST:event_m01InputMethodTextChanged

    private void m11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MouseExited
        matrix4[1][1]=Double.parseDouble(m11.getText());
    }//GEN-LAST:event_m11MouseExited

    private void m11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m11ActionPerformed

    private void m20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m20MouseExited
        matrix4[2][0]=Double.parseDouble(m20.getText());
    }//GEN-LAST:event_m20MouseExited

    private void m20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m20ActionPerformed

    private void m21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m21MouseExited
        matrix4[2][1]=Double.parseDouble(m21.getText());
    }//GEN-LAST:event_m21MouseExited

    private void m21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m21ActionPerformed

    private void m00MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m00MouseExited
        matrix4[0][0]=Double.parseDouble(m00.getText());
    }//GEN-LAST:event_m00MouseExited

    private void m22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m22MouseExited
        matrix4[2][2]=Double.parseDouble(m22.getText());
    }//GEN-LAST:event_m22MouseExited

    private void m22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m22ActionPerformed
 
    }//GEN-LAST:event_m22ActionPerformed

    private void m23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m23MouseExited
        matrix4[2][3]=Double.parseDouble(m23.getText());
    }//GEN-LAST:event_m23MouseExited

    private void m23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m23ActionPerformed

    private void m02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m02MouseExited
        matrix4[0][2]=Double.parseDouble(m02.getText());
    }//GEN-LAST:event_m02MouseExited

    private void m30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m30MouseExited
        matrix4[3][0]=Double.parseDouble(m30.getText());
    }//GEN-LAST:event_m30MouseExited

    private void m30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m30ActionPerformed

    private void m03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m03MouseExited
        matrix4[0][3]=Double.parseDouble(m03.getText());
    }//GEN-LAST:event_m03MouseExited

    private void m03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m03ActionPerformed

    private void m31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m31MouseExited
        matrix4[3][1]=Double.parseDouble(m31.getText());
    }//GEN-LAST:event_m31MouseExited

    private void m31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m31ActionPerformed

    private void m13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m13MouseExited
        matrix4[1][3]=Double.parseDouble(m13.getText());
    }//GEN-LAST:event_m13MouseExited

    private void m32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m32MouseExited
        matrix4[3][2]=Double.parseDouble(m32.getText());
    }//GEN-LAST:event_m32MouseExited

    private void m32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m32ActionPerformed

    private void m12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m12MouseExited
        matrix4[1][2]=Double.parseDouble(m12.getText());
    }//GEN-LAST:event_m12MouseExited

    private void m12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m12ActionPerformed

    private void m33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m33MouseExited
        matrix4[3][3]=Double.parseDouble(m33.getText());
    }//GEN-LAST:event_m33MouseExited

    private void m33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m33ActionPerformed

    private void inv01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv01ActionPerformed

    private void inv30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv30ActionPerformed

    private void inv02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv02ActionPerformed

    private void inv03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv03ActionPerformed

    private void inv11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv11ActionPerformed

    private void inv12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv12ActionPerformed

    private void inv21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv21ActionPerformed

    private void inv22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv22ActionPerformed

    private void inv23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv23ActionPerformed

    private void inv32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv32ActionPerformed

    private void inv31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv31ActionPerformed

    private void inv33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv33ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String swap01,swap02,swap03;
        int r = new Random().nextInt();
       warn.setText(r+"");
       swap01=(m10.getText());
       swap02=(m20.getText());
       swap03=(m30.getText());
       m10.setText(m01.getText());
       m20.setText(m02.getText());
       m30.setText(m03.getText());
       m01.setText(swap01);
       m02.setText(swap02);
       m03.setText(swap03);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m01ActionPerformed

    private void m00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m00ActionPerformed

    private void m00KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m00KeyTyped
     
    }//GEN-LAST:event_m00KeyTyped

    private void textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyPressed
         try{
          int nd = Integer.parseInt(text.getText());
          warn.setText("");
      }catch(NumberFormatException f){
          warn.setText("Only text allowed");
      }
    }//GEN-LAST:event_textKeyPressed

      public void over(){
        time--;
            warn.setText(time.toString() + " secs");
            if (time <= 0) {
                timeline.stop();
    }
      }
            
    public void set(){
        warn.setText(time.toString() + " secs");
        if (!timeline.getKeyFrames().contains(countDownKeyFrame))
            timeline.getKeyFrames().add(countDownKeyFrame);
        timeline.playFromStart();
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
            java.util.logging.Logger.getLogger(matInverse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matInverse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matInverse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matInverse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Random ran = new Random(4);
        //</editor-fold>
        Thread thread = new Thread();
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matInverse().setVisible(true);
                for(int i=0;i<100;i++){
            new matInverse().set();
        }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inv00;
    private javax.swing.JTextField inv01;
    private javax.swing.JTextField inv02;
    private javax.swing.JTextField inv03;
    private javax.swing.JTextField inv10;
    private javax.swing.JTextField inv11;
    private javax.swing.JTextField inv12;
    private javax.swing.JTextField inv13;
    private javax.swing.JTextField inv20;
    private javax.swing.JTextField inv21;
    private javax.swing.JTextField inv22;
    private javax.swing.JTextField inv23;
    private javax.swing.JTextField inv30;
    private javax.swing.JTextField inv31;
    private javax.swing.JTextField inv32;
    private javax.swing.JTextField inv33;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField m00;
    private javax.swing.JTextField m01;
    private javax.swing.JTextField m02;
    private javax.swing.JTextField m03;
    private javax.swing.JTextField m10;
    private javax.swing.JTextField m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m13;
    private javax.swing.JTextField m20;
    private javax.swing.JTextField m21;
    private javax.swing.JTextField m22;
    private javax.swing.JTextField m23;
    private javax.swing.JTextField m30;
    private javax.swing.JTextField m31;
    private javax.swing.JTextField m32;
    private javax.swing.JTextField m33;
    private javax.swing.JTextField text;
    private javax.swing.JLabel tim;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables
}
