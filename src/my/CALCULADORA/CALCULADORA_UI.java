
package my.CALCULADORA;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class CALCULADORA_UI extends javax.swing.JFrame {
    ScriptEngineManager num = new ScriptEngineManager();
    ScriptEngine nu=num.getEngineByName("JavaScript");
    public CALCULADORA_UI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SENO1 = new javax.swing.JButton();
        PANELNUMEROS = new javax.swing.JPanel();
        TXTPRINCIPAL = new javax.swing.JLabel();
        TXTOPERACIONCHICO = new javax.swing.JLabel();
        DIVISION = new javax.swing.JButton();
        SENO = new javax.swing.JButton();
        COSENO = new javax.swing.JButton();
        TANGENTE = new javax.swing.JButton();
        SUMA = new javax.swing.JButton();
        RESTA = new javax.swing.JButton();
        MULTIPLICACION = new javax.swing.JButton();
        IGUAL = new javax.swing.JButton();
        BORRA = new javax.swing.JButton();
        NUMERO7 = new javax.swing.JButton();
        NUMERO0 = new javax.swing.JButton();
        COMA = new javax.swing.JButton();
        NUMERO4 = new javax.swing.JButton();
        NUMERO3 = new javax.swing.JButton();
        NUMERO8 = new javax.swing.JButton();
        NUMERO5 = new javax.swing.JButton();
        NUMERO2 = new javax.swing.JButton();
        NUMERO9 = new javax.swing.JButton();
        NUMERO6 = new javax.swing.JButton();
        NUMERO1 = new javax.swing.JButton();
        PARENTESISDER = new javax.swing.JButton();
        IVA = new javax.swing.JButton();
        RAIZ = new javax.swing.JButton();
        POTENCIA = new javax.swing.JButton();
        PARENTESISIZQ = new javax.swing.JButton();
        PPUNTO1 = new javax.swing.JButton();

        SENO1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        SENO1.setForeground(new java.awt.Color(0, 0, 0));
        SENO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SENO1.setText("SEN");
        SENO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SENO1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SENO1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SENO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        SENO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENO1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANELNUMEROS.setBackground(new java.awt.Color(255, 255, 255));

        TXTPRINCIPAL.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TXTPRINCIPAL.setForeground(new java.awt.Color(0, 0, 0));
        TXTPRINCIPAL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        TXTOPERACIONCHICO.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        TXTOPERACIONCHICO.setForeground(new java.awt.Color(102, 102, 102));
        TXTOPERACIONCHICO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PANELNUMEROSLayout = new javax.swing.GroupLayout(PANELNUMEROS);
        PANELNUMEROS.setLayout(PANELNUMEROSLayout);
        PANELNUMEROSLayout.setHorizontalGroup(
            PANELNUMEROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELNUMEROSLayout.createSequentialGroup()
                .addGroup(PANELNUMEROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELNUMEROSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TXTOPERACIONCHICO, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addComponent(TXTPRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PANELNUMEROSLayout.setVerticalGroup(
            PANELNUMEROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELNUMEROSLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(TXTOPERACIONCHICO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(PANELNUMEROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 150));

        DIVISION.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        DIVISION.setForeground(new java.awt.Color(0, 0, 0));
        DIVISION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        DIVISION.setText("÷");
        DIVISION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        DIVISION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DIVISION.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        DIVISION.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        DIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISIONActionPerformed(evt);
            }
        });
        getContentPane().add(DIVISION, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 450, 75, 75));

        SENO.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        SENO.setForeground(new java.awt.Color(0, 0, 0));
        SENO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SENO.setText("SEN");
        SENO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SENO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SENO.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SENO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        SENO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENOActionPerformed(evt);
            }
        });
        getContentPane().add(SENO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 75, 37));

        COSENO.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        COSENO.setForeground(new java.awt.Color(0, 0, 0));
        COSENO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        COSENO.setText("COS");
        COSENO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        COSENO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        COSENO.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        COSENO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        COSENO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COSENOActionPerformed(evt);
            }
        });
        getContentPane().add(COSENO, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 150, 75, 37));

        TANGENTE.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        TANGENTE.setForeground(new java.awt.Color(0, 0, 0));
        TANGENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        TANGENTE.setText("TAN");
        TANGENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TANGENTE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TANGENTE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        TANGENTE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        TANGENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TANGENTEActionPerformed(evt);
            }
        });
        getContentPane().add(TANGENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 75, 37));

        SUMA.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        SUMA.setForeground(new java.awt.Color(0, 0, 0));
        SUMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SUMA.setText("+");
        SUMA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SUMA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SUMA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        SUMA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        SUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMAActionPerformed(evt);
            }
        });
        getContentPane().add(SUMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 225, 75, 75));

        RESTA.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        RESTA.setForeground(new java.awt.Color(0, 0, 0));
        RESTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        RESTA.setText("-");
        RESTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        RESTA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RESTA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        RESTA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        RESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTAActionPerformed(evt);
            }
        });
        getContentPane().add(RESTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 300, 75, 75));

        MULTIPLICACION.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        MULTIPLICACION.setForeground(new java.awt.Color(0, 0, 0));
        MULTIPLICACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        MULTIPLICACION.setText("x");
        MULTIPLICACION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        MULTIPLICACION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MULTIPLICACION.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        MULTIPLICACION.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        MULTIPLICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICACIONActionPerformed(evt);
            }
        });
        getContentPane().add(MULTIPLICACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 375, 75, 75));

        IGUAL.setBackground(new java.awt.Color(255, 255, 255));
        IGUAL.setFont(new java.awt.Font("Dialog", 1, 43)); // NOI18N
        IGUAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RED BUTTOM.jpg"))); // NOI18N
        IGUAL.setText("=");
        IGUAL.setBorder(null);
        IGUAL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IGUAL.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RED BUTTOM.jpg"))); // NOI18N
        IGUAL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RED BUTTOM PRESS.jpg"))); // NOI18N
        IGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGUALActionPerformed(evt);
            }
        });
        getContentPane().add(IGUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 525, 300, 75));

        BORRA.setBackground(new java.awt.Color(255, 255, 255));
        BORRA.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        BORRA.setForeground(new java.awt.Color(255, 255, 255));
        BORRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        BORRA.setText("C");
        BORRA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BORRA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BORRA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        BORRA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        BORRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRAActionPerformed(evt);
            }
        });
        getContentPane().add(BORRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 75, 75));

        NUMERO7.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO7.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO7.setText("7");
        NUMERO7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO7ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 75, 75));

        NUMERO0.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO0.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO0.setText("0");
        NUMERO0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO0ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 450, 75, 75));

        COMA.setBackground(new java.awt.Color(255, 255, 255));
        COMA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        COMA.setForeground(new java.awt.Color(255, 255, 255));
        COMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        COMA.setText(",");
        COMA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        COMA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        COMA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        COMA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        COMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMAActionPerformed(evt);
            }
        });
        getContentPane().add(COMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 487, 75, 38));

        NUMERO4.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO4.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO4.setText("4");
        NUMERO4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO4ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 75, 75));

        NUMERO3.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO3.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO3.setText("3");
        NUMERO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO3ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 375, 75, 75));

        NUMERO8.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO8.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO8.setText("8");
        NUMERO8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO8ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 225, 75, 75));

        NUMERO5.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO5.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO5.setText("5");
        NUMERO5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO5ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 300, 75, 75));

        NUMERO2.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO2.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO2.setText("2");
        NUMERO2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO2ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 375, 75, 75));

        NUMERO9.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO9.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO9.setText("9");
        NUMERO9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO9ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, 75, 75));

        NUMERO6.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO6.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO6.setText("6");
        NUMERO6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO6ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 75, 75));

        NUMERO1.setBackground(new java.awt.Color(255, 255, 255));
        NUMERO1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NUMERO1.setForeground(new java.awt.Color(255, 255, 255));
        NUMERO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO1.setText("1");
        NUMERO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        NUMERO1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NUMERO1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        NUMERO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        NUMERO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO1ActionPerformed(evt);
            }
        });
        getContentPane().add(NUMERO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 375, 75, 75));

        PARENTESISDER.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        PARENTESISDER.setForeground(new java.awt.Color(0, 0, 0));
        PARENTESISDER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        PARENTESISDER.setText(")");
        PARENTESISDER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PARENTESISDER.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PARENTESISDER.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        PARENTESISDER.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        PARENTESISDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARENTESISDERActionPerformed(evt);
            }
        });
        getContentPane().add(PARENTESISDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 187, 75, 37));

        IVA.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        IVA.setForeground(new java.awt.Color(0, 0, 0));
        IVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        IVA.setText("IVA");
        IVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        IVA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IVA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        IVA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });
        getContentPane().add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 150, 75, 37));

        RAIZ.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        RAIZ.setForeground(new java.awt.Color(0, 0, 0));
        RAIZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        RAIZ.setText("Raiz(x,1/n)");
        RAIZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        RAIZ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RAIZ.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        RAIZ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        RAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAIZActionPerformed(evt);
            }
        });
        getContentPane().add(RAIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, 75, 37));

        POTENCIA.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        POTENCIA.setForeground(new java.awt.Color(0, 0, 0));
        POTENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        POTENCIA.setText("pow(x,n)");
        POTENCIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        POTENCIA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        POTENCIA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        POTENCIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        POTENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POTENCIAActionPerformed(evt);
            }
        });
        getContentPane().add(POTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 187, 75, 37));

        PARENTESISIZQ.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        PARENTESISIZQ.setForeground(new java.awt.Color(0, 0, 0));
        PARENTESISIZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        PARENTESISIZQ.setText("(");
        PARENTESISIZQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PARENTESISIZQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PARENTESISIZQ.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.jpg"))); // NOI18N
        PARENTESISIZQ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pressed (1).jpg"))); // NOI18N
        PARENTESISIZQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARENTESISIZQActionPerformed(evt);
            }
        });
        getContentPane().add(PARENTESISIZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 187, 75, 37));

        PPUNTO1.setBackground(new java.awt.Color(255, 255, 255));
        PPUNTO1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PPUNTO1.setForeground(new java.awt.Color(255, 255, 255));
        PPUNTO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        PPUNTO1.setText(".");
        PPUNTO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        PPUNTO1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PPUNTO1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS.jpg"))); // NOI18N
        PPUNTO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NUMEROS PRESS.jpg"))); // NOI18N
        PPUNTO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPUNTO1ActionPerformed(evt);
            }
        });
        getContentPane().add(PPUNTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 75, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISIONActionPerformed
        // TODO add your handling code here:
        numero("/");
    }//GEN-LAST:event_DIVISIONActionPerformed

    private void SENOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENOActionPerformed
        // TODO add your handling code here:
        numero("Math.sen((Math.PI/180)*");
    }//GEN-LAST:event_SENOActionPerformed

    private void COSENOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COSENOActionPerformed
        // TODO add your handling code here:
        numero("Math.cos((Math.PI/180)*");
    }//GEN-LAST:event_COSENOActionPerformed

    private void TANGENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TANGENTEActionPerformed
        // TODO add your handling code here:
        numero("Math.tan((Math.PI/180)*");
    }//GEN-LAST:event_TANGENTEActionPerformed

    private void SUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMAActionPerformed
        // TODO add your handling code here:
        numero("+");
    }//GEN-LAST:event_SUMAActionPerformed

    private void RESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTAActionPerformed
        // TODO add your handling code here:
        numero("-");
    }//GEN-LAST:event_RESTAActionPerformed

    private void MULTIPLICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICACIONActionPerformed
        // TODO add your handling code here:
        numero("*");
    }//GEN-LAST:event_MULTIPLICACIONActionPerformed

    private void BORRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRAActionPerformed
        // TODO add your handling code here:
        TXTPRINCIPAL.setText("");
        TXTOPERACIONCHICO.setText("");
    }//GEN-LAST:event_BORRAActionPerformed

    private void NUMERO0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO0ActionPerformed
        // TODO add your handling code here:
        numero("0");
        
    }//GEN-LAST:event_NUMERO0ActionPerformed

    private void COMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMAActionPerformed
        // TODO add your handling code here:
        numero(",");
    }//GEN-LAST:event_COMAActionPerformed

    private void NUMERO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO4ActionPerformed
        // TODO add your handling code here:
        numero("4");
         
    }//GEN-LAST:event_NUMERO4ActionPerformed

    private void NUMERO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO3ActionPerformed
        // TODO add your handling code here:
        numero("3");
       
    }//GEN-LAST:event_NUMERO3ActionPerformed

    private void NUMERO8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO8ActionPerformed
        // TODO add your handling code here:
        numero("8");
        
    }//GEN-LAST:event_NUMERO8ActionPerformed

    private void NUMERO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO5ActionPerformed
        // TODO add your handling code here:
        numero("5");
       
    }//GEN-LAST:event_NUMERO5ActionPerformed

    private void NUMERO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO2ActionPerformed
        // TODO add your handling code here:
        numero("2");
        
    }//GEN-LAST:event_NUMERO2ActionPerformed

    private void NUMERO9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO9ActionPerformed
        // TODO add your handling code here:
        numero("9");
       
    }//GEN-LAST:event_NUMERO9ActionPerformed

    private void NUMERO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO6ActionPerformed
        // TODO add your handling code here:
        numero("6");
       
    }//GEN-LAST:event_NUMERO6ActionPerformed

    private void NUMERO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO1ActionPerformed
        // TODO add your handling code here:
        numero("1");
         
    }//GEN-LAST:event_NUMERO1ActionPerformed

    private void SENO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENO1ActionPerformed
        // TODO add your handling code here:
        numero("Math.sin((Math.PI/180)*");
    }//GEN-LAST:event_SENO1ActionPerformed

    private void PARENTESISDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARENTESISDERActionPerformed
        // TODO add your handling code here:
        numero(")");
         
    }//GEN-LAST:event_PARENTESISDERActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        // TODO add your handling code here:
        numero("*0.19");
    }//GEN-LAST:event_IVAActionPerformed

    private void RAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAIZActionPerformed
        // TODO add your handling code here:
        numero("Math.pow(");
    }//GEN-LAST:event_RAIZActionPerformed

    private void POTENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POTENCIAActionPerformed
        // TODO add your handling code here:
        numero("Math.pow(");
    }//GEN-LAST:event_POTENCIAActionPerformed

    private void PARENTESISIZQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARENTESISIZQActionPerformed
        // TODO add your handling code here:
        numero("(");
         
    }//GEN-LAST:event_PARENTESISIZQActionPerformed

    private void NUMERO7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO7ActionPerformed
        // TODO add your handling code here:
        numero("7");
    }//GEN-LAST:event_NUMERO7ActionPerformed

    private void IGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGUALActionPerformed
        // TODO add your handling code here:
        try{
            String resultado=nu.eval(TXTOPERACIONCHICO.getText()).toString();
            TXTPRINCIPAL.setText(resultado);
        }catch(Exception e){   
            TXTOPERACIONCHICO.setText("ERROR");
            TXTPRINCIPAL.setText("ERROR");
        }
    }//GEN-LAST:event_IGUALActionPerformed

    private void PPUNTO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPUNTO1ActionPerformed
        // TODO add your handling code here:
        numero(".");
    }//GEN-LAST:event_PPUNTO1ActionPerformed

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
            java.util.logging.Logger.getLogger(CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULADORA_UI().setVisible(true);
            }
        });
    }
public void numero(String tecla){
    TXTOPERACIONCHICO.setText(TXTOPERACIONCHICO.getText()+tecla);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRA;
    private javax.swing.JButton COMA;
    private javax.swing.JButton COSENO;
    private javax.swing.JButton DIVISION;
    private javax.swing.JButton IGUAL;
    private javax.swing.JButton IVA;
    private javax.swing.JButton MULTIPLICACION;
    private javax.swing.JButton NUMERO0;
    private javax.swing.JButton NUMERO1;
    private javax.swing.JButton NUMERO2;
    private javax.swing.JButton NUMERO3;
    private javax.swing.JButton NUMERO4;
    private javax.swing.JButton NUMERO5;
    private javax.swing.JButton NUMERO6;
    private javax.swing.JButton NUMERO7;
    private javax.swing.JButton NUMERO8;
    private javax.swing.JButton NUMERO9;
    private javax.swing.JPanel PANELNUMEROS;
    private javax.swing.JButton PARENTESISDER;
    private javax.swing.JButton PARENTESISIZQ;
    private javax.swing.JButton POTENCIA;
    private javax.swing.JButton PPUNTO1;
    private javax.swing.JButton RAIZ;
    private javax.swing.JButton RESTA;
    private javax.swing.JButton SENO;
    private javax.swing.JButton SENO1;
    private javax.swing.JButton SUMA;
    private javax.swing.JButton TANGENTE;
    private javax.swing.JLabel TXTOPERACIONCHICO;
    private javax.swing.JLabel TXTPRINCIPAL;
    // End of variables declaration//GEN-END:variables
}
