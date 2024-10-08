/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ej02;

/**
 *
 * @author Multipropósito2
 */
public class CalculadoraGrafica extends javax.swing.JFrame {

    /*
     * Creates new form CalculadoraGrafica
     */
    private boolean inicio = true;
    private double cos,sin,tan,resultado,valor1,valor2;
    private String funciones,tipooperaciones;
    
    
    public CalculadoraGrafica() {
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

        btnBORRAR = new javax.swing.JButton();
        btnSUMAR = new javax.swing.JButton();
        btnRESTAR = new javax.swing.JButton();
        btnMULTIPL = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnDIVIDIR = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnRAIZ = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnIGUAL = new javax.swing.JButton();
        btnPUNTODECIMAL = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnSEN = new javax.swing.JButton();
        btnELEV2 = new javax.swing.JButton();
        btnCOS = new javax.swing.JButton();
        btnTAN = new javax.swing.JButton();
        btnELEVA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtPantallaposterior = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        btnBORRAR.setText("C");
        btnBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARActionPerformed(evt);
            }
        });

        btnSUMAR.setText("+");
        btnSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUMARActionPerformed(evt);
            }
        });

        btnRESTAR.setText("-");
        btnRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESTARActionPerformed(evt);
            }
        });

        btnMULTIPL.setText("*");
        btnMULTIPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULTIPLActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnDIVIDIR.setText("/");
        btnDIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVIDIRActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnRAIZ.setText("√");
        btnRAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAIZActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnIGUAL.setText("=");
        btnIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIGUALActionPerformed(evt);
            }
        });

        btnPUNTODECIMAL.setText(".");
        btnPUNTODECIMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPUNTODECIMALActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnSEN.setText("sen(");
        btnSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSENActionPerformed(evt);
            }
        });

        btnELEV2.setText("^2");
        btnELEV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELEV2ActionPerformed(evt);
            }
        });

        btnCOS.setText("cos(");
        btnCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOSActionPerformed(evt);
            }
        });

        btnTAN.setText("tan(");
        btnTAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTANActionPerformed(evt);
            }
        });

        btnELEVA.setText("^");
        btnELEVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELEVAActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPantallaposterior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPantallaposterior.setFocusable(false);

        txtPantalla.setFont(new java.awt.Font("Segoe UI Symbol", 1, 23)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPantalla.setText("0");
        txtPantalla.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPantallaposterior, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantallaposterior, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSEN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTAN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnELEVA, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(btnELEV2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSUMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRESTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMULTIPL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDIVIDIR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPUNTODECIMAL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSEN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCOS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnELEVA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnELEV2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSUMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRESTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMULTIPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDIVIDIR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPUNTODECIMAL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
if (inicio==true){
       this.txtPantalla.setText("");     
       this.txtPantalla.setText("0");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"0");

    }//GEN-LAST:event_btn0ActionPerformed

    private void btnELEV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELEV2ActionPerformed
valor1=Double.parseDouble(txtPantalla.getText());
txtPantallaposterior.setText(valor1+"^2");
txtPantalla.setText(Math.pow(valor1,2)+"");
        



// TODO add your handling code here:
    }//GEN-LAST:event_btnELEV2ActionPerformed

    public void trigonometria(){
        switch(funciones){
            case "sin":
                valor1=Double.parseDouble(txtPantalla.getText());
                this.txtPantallaposterior.setText("sin("+valor1+")");
                sin=Math.sin(Math.PI*(valor1)/180);
                 txtPantalla.setText(sin+" ");
               
                 break;
       case "cos":
                valor1=Double.parseDouble(txtPantalla.getText());
                this.txtPantallaposterior.setText("cos("+valor1+")");
                cos=Math.cos(Math.PI*(valor1)/180);
                 txtPantalla.setText(cos+" ");
           
                 break;
       case "tan":
               
                    valor1 = Double.parseDouble(txtPantalla.getText());
                this.txtPantallaposterior.setText("tan(" + valor1 + ")");
//
              
                if ((valor1 % 180) == 90 || (valor1 % 180) == -90) {
                    txtPantalla.setText("Error: Indeterminación");
                } else {
                    tan = Math.tan(Math.PI * (valor1) / 180);
                    txtPantalla.setText(tan + " ");
                    
                }
                 break;
        }   
        
    }
    private void btnSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSENActionPerformed

funciones="sin";
trigonometria();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSENActionPerformed

    private void btnELEVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELEVAActionPerformed
inicio= true;
valor1=Double.parseDouble( txtPantalla.getText());

txtPantallaposterior.setText(valor1+"^");
tipooperaciones="potencia";


    
// TODO add your handling code here:
    }//GEN-LAST:event_btnELEVAActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("1");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"1");        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (inicio==true){
               this.txtPantalla.setText(" ");     
               this.txtPantalla.setText("2");  
               inicio=false;
        } else 
            this.txtPantalla.setText(this.txtPantalla.getText()+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("3");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("4");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("5");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("6");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("7");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("8");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
if (inicio==true){
       this.txtPantalla.setText(" ");     
       this.txtPantalla.setText("9");  
       inicio=false;
} else 
    this.txtPantalla.setText(this.txtPantalla.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPUNTODECIMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPUNTODECIMALActionPerformed


if(this.txtPantalla.getText().contains(".")){
    
}else{ this.txtPantalla.setText(this.txtPantalla.getText()+".");

}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPUNTODECIMALActionPerformed
private void Operaciones(double valor1,double valor2){
switch(tipooperaciones){

    case "+":
        resultado=valor1+valor2;
        this.txtPantalla.setText(resultado+"");
       
        break;
    case "-":
        resultado=valor1-valor2;
        this.txtPantalla.setText(resultado+" ");
      
        break;
         case "x":
        resultado=valor1*valor2;
        this.txtPantalla.setText(resultado+" ");
      
        break;
         case "/":
             if(valor1==0){
                 txtPantalla.setText("Error");
             }   else{        

        resultado=valor1/valor2;
        this.txtPantalla.setText(resultado+" ");
       
        break;
        
             }
         case "potencia":
        resultado = Math.pow(valor1,valor2);   
             txtPantalla.setText(resultado+" ");
             break;
         

}
}
    private void btnIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIGUALActionPerformed

        inicio=true;  
      
                    if(tipooperaciones== null){
txtPantallaposterior.setText("");
        }else
        {
            valor2 =Double.parseDouble(txtPantalla.getText());
            this.txtPantallaposterior.setText(txtPantallaposterior.getText()+txtPantalla.getText());
             Operaciones(valor1,valor2);
             
        }
         
        
       
        tipooperaciones=null;
      
// TODO add your handling code here:
    }//GEN-LAST:event_btnIGUALActionPerformed

    private void btnRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESTARActionPerformed
 inicio=true;

    valor1=Double.parseDouble(this.txtPantalla.getText());
    this.txtPantallaposterior.setText("");
    this.txtPantallaposterior.setText(this.txtPantalla.getText()+"-");
      txtPantalla.setText("");
   
    tipooperaciones="-";        // TODO add your handling code here:
    }//GEN-LAST:event_btnRESTARActionPerformed

    private void btnMULTIPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIPLActionPerformed
 inicio=true;

    valor1=Double.parseDouble(this.txtPantalla.getText());
    this.txtPantallaposterior.setText("");
    this.txtPantallaposterior.setText(this.txtPantalla.getText()+"x");
    txtPantalla.setText("");
       tipooperaciones="x";        // TODO add your handling code here:
    }//GEN-LAST:event_btnMULTIPLActionPerformed

    private void btnSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMARActionPerformed
inicio=true;

    valor1=Double.parseDouble(this.txtPantalla.getText());
    this.txtPantallaposterior.setText("");
    this.txtPantallaposterior.setText(this.txtPantalla.getText()+"+");
     txtPantalla.setText("");
  
   tipooperaciones="+";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSUMARActionPerformed

    private void btnDIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVIDIRActionPerformed
inicio=true;

    valor1=Double.parseDouble(this.txtPantalla.getText());
    this.txtPantallaposterior.setText("");
    this.txtPantallaposterior.setText(this.txtPantalla.getText()+"/");
     txtPantalla.setText("");
    
tipooperaciones="/";
        
    }//GEN-LAST:event_btnDIVIDIRActionPerformed

    private void btnRAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAIZActionPerformed
valor1=Double.parseDouble(this.txtPantalla.getText());
if(valor1>=0){
    
this.txtPantallaposterior.setText("sqrt("+valor1+")" );
txtPantalla.setText(Math.sqrt(valor1)+" ");

}else{
    txtPantalla.setText("Error");
}

    }//GEN-LAST:event_btnRAIZActionPerformed

    private void btnBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARActionPerformed
  inicio=true;
        funciones="";
     
        valor1=0;
        valor2=0;
        resultado=0;
        txtPantallaposterior.setText("");
        txtPantalla.setText("0");
      
    }//GEN-LAST:event_btnBORRARActionPerformed

    private void btnCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOSActionPerformed
 

funciones="cos";
trigonometria();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCOSActionPerformed

    private void btnTANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTANActionPerformed

funciones="tan";
trigonometria();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTANActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBORRAR;
    private javax.swing.JButton btnCOS;
    private javax.swing.JButton btnDIVIDIR;
    private javax.swing.JButton btnELEV2;
    private javax.swing.JButton btnELEVA;
    private javax.swing.JButton btnIGUAL;
    private javax.swing.JButton btnMULTIPL;
    private javax.swing.JButton btnPUNTODECIMAL;
    private javax.swing.JButton btnRAIZ;
    private javax.swing.JButton btnRESTAR;
    private javax.swing.JButton btnSEN;
    private javax.swing.JButton btnSUMAR;
    private javax.swing.JButton btnTAN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtPantalla;
    private javax.swing.JLabel txtPantallaposterior;
    // End of variables declaration//GEN-END:variables
}
