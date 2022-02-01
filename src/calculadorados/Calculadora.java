/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorados;

import java.awt.Color;
import javax.script.ScriptEngineManager;

/**
 *
 * @author marti
 */
public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    javax.script.ScriptEngine se = sem.getEngineByName("JavaScript");
    
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        igual = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        Porcentaje = new javax.swing.JButton();
        Dividendo = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        C = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 528, 340, -1));

        jPanel3.setBackground(new java.awt.Color(244, 251, 253));
        jPanel3.setForeground(new java.awt.Color(244, 251, 253));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(244, 251, 253));
        txtOperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 40));

        txtResultado.setBackground(new java.awt.Color(244, 251, 253));
        txtResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 90));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        igual.setBackground(new java.awt.Color(244, 251, 253));
        igual.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 26)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        igual.setText("=");
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setMaximumSize(new java.awt.Dimension(50, 50));
        igual.setMinimumSize(new java.awt.Dimension(50, 50));
        igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel1.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 50, 50));

        btn_8.setBackground(new java.awt.Color(244, 251, 253));
        btn_8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_8.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 50));

        Potencia.setBackground(new java.awt.Color(244, 251, 253));
        Potencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 10)); // NOI18N
        Potencia.setForeground(new java.awt.Color(55, 62, 71));
        Potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Potencia.setText("CE");
        Potencia.setFocusPainted(false);
        Potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Potencia.setMaximumSize(new java.awt.Dimension(50, 50));
        Potencia.setMinimumSize(new java.awt.Dimension(50, 50));
        Potencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        Porcentaje.setBackground(new java.awt.Color(244, 251, 253));
        Porcentaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Porcentaje.setText("%");
        Porcentaje.setFocusPainted(false);
        Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Porcentaje.setMaximumSize(new java.awt.Dimension(50, 50));
        Porcentaje.setMinimumSize(new java.awt.Dimension(50, 50));
        Porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        Dividendo.setBackground(new java.awt.Color(244, 251, 253));
        Dividendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Dividendo.setForeground(new java.awt.Color(55, 62, 71));
        Dividendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Dividendo.setText("/");
        Dividendo.setFocusPainted(false);
        Dividendo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dividendo.setMaximumSize(new java.awt.Dimension(50, 50));
        Dividendo.setMinimumSize(new java.awt.Dimension(50, 50));
        Dividendo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Dividendo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        Dividendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividendoActionPerformed(evt);
            }
        });
        jPanel1.add(Dividendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        multiplicar.setBackground(new java.awt.Color(244, 251, 253));
        multiplicar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(55, 62, 71));
        multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        multiplicar.setText("*");
        multiplicar.setFocusPainted(false);
        multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicar.setMaximumSize(new java.awt.Dimension(50, 50));
        multiplicar.setMinimumSize(new java.awt.Dimension(50, 50));
        multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 50, 50));

        restar.setBackground(new java.awt.Color(244, 251, 253));
        restar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        restar.setForeground(new java.awt.Color(55, 62, 71));
        restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        restar.setText("-");
        restar.setFocusPainted(false);
        restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        restar.setMaximumSize(new java.awt.Dimension(50, 50));
        restar.setMinimumSize(new java.awt.Dimension(50, 50));
        restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        jPanel1.add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 50, 50));

        sumar.setBackground(new java.awt.Color(244, 251, 253));
        sumar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        sumar.setForeground(new java.awt.Color(55, 62, 71));
        sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        sumar.setText("+");
        sumar.setFocusPainted(false);
        sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sumar.setMaximumSize(new java.awt.Dimension(50, 50));
        sumar.setMinimumSize(new java.awt.Dimension(50, 50));
        sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        jPanel1.add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 50));

        C.setBackground(new java.awt.Color(244, 251, 253));
        C.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        C.setForeground(new java.awt.Color(55, 62, 71));
        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        C.setText("C");
        C.setFocusPainted(false);
        C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C.setMaximumSize(new java.awt.Dimension(50, 50));
        C.setMinimumSize(new java.awt.Dimension(50, 50));
        C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        btn_9.setBackground(new java.awt.Color(244, 251, 253));
        btn_9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_9.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 50));

        btn_7.setBackground(new java.awt.Color(244, 251, 253));
        btn_7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_7.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        btn_4.setBackground(new java.awt.Color(244, 251, 253));
        btn_4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_4.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 50));

        btn_5.setBackground(new java.awt.Color(244, 251, 253));
        btn_5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_5.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 50));

        btn_6.setBackground(new java.awt.Color(244, 251, 253));
        btn_6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_6.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 50));

        btn_3.setBackground(new java.awt.Color(244, 251, 253));
        btn_3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_3.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 50));

        btn_2.setBackground(new java.awt.Color(244, 251, 253));
        btn_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 50));

        btn_1.setBackground(new java.awt.Color(244, 251, 253));
        btn_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_1.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        btn_0.setBackground(new java.awt.Color(244, 251, 253));
        btn_0.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_0.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 50));

        punto.setBackground(new java.awt.Color(244, 251, 253));
        punto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        punto.setForeground(new java.awt.Color(55, 62, 71));
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        punto.setText(".");
        punto.setFocusPainted(false);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.setMaximumSize(new java.awt.Dimension(50, 50));
        punto.setMinimumSize(new java.awt.Dimension(50, 50));
        punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel1.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        AgregarNumero("9");
        igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_CActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        AgregarNumero("7");
        igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
       AgregarNumero("8");
       igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        AgregarNumero("4");
        igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        AgregarNumero("5");
        igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        AgregarNumero("6");
        igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        AgregarNumero("1");
        igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        AgregarNumero("2");
        igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        AgregarNumero("3");
        igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        AgregarNumero("0");
        igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        igual.doClick();
    }//GEN-LAST:event_PotenciaActionPerformed

    private void PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeActionPerformed
        AgregarNumero("%");
        igual.doClick();
    }//GEN-LAST:event_PorcentajeActionPerformed

    private void DividendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividendoActionPerformed
        AgregarNumero("/");
        igual.doClick();
    }//GEN-LAST:event_DividendoActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        AgregarNumero("*");
        igual.doClick();
    }//GEN-LAST:event_multiplicarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        AgregarNumero("-");
        igual.doClick();
    }//GEN-LAST:event_restarActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        AgregarNumero("+");
        igual.doClick();
    }//GEN-LAST:event_sumarActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        AgregarNumero(".");
        igual.doClick();
    }//GEN-LAST:event_puntoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try {
           String resultado = se.eval(txtOperacion.getText()).toString();
           txtResultado.setText(resultado);
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_igualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel3.setBackground(Color.decode("#2e3951"));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void AgregarNumero(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JButton Dividendo;
    private javax.swing.JButton Porcentaje;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton punto;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
