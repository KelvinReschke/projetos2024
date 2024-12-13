
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Calculadora extends javax.swing.JFrame {

    String op = "";
    double valor01 = 0;
    double valor02 = 0;
    DecimalFormat df = new DecimalFormat("#,#####");

    public Calculadora() {
        initComponents();
    }

    public void preencherVisor(String digito) {
        if (jtfVisor.getText().length() < 10) {
            if (jtfVisor.getText().equals("0") && !digito.equals(".")) {
                jtfVisor.setText("");
            }
            jtfVisor.setText(jtfVisor.getText() + digito);
        }
    }

    public void operacoes() {
        valor01 = Double.parseDouble(jtfVisor.getText());
        jtfVisor.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb7 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jbPonto = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbIgual = new javax.swing.JButton();
        jbSoma = new javax.swing.JButton();
        jbSubtracao = new javax.swing.JButton();
        jbMultiplicacao = new javax.swing.JButton();
        jbDivisao = new javax.swing.JButton();
        jtfVisor = new javax.swing.JTextField();
        jbPorcentagem = new javax.swing.JButton();
        jbFatorial = new javax.swing.JButton();
        jbAoQuadrado = new javax.swing.JButton();
        jbExpoente = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbRaizQuadrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 0, 0));

        jb7.setBackground(new java.awt.Color(204, 0, 0));
        jb7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb7.setText("7");
        jb7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(255, 0, 0));
        jb4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb4.setText("4");
        jb4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(0, 102, 102));
        jb1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb1.setText("1");
        jb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(255, 255, 255));
        jb0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb0.setText("0");
        jb0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(255, 0, 102));
        jb8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb8.setText("8");
        jb8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(255, 51, 0));
        jb5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb5.setText("5");
        jb5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(0, 204, 204));
        jb2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb2.setText("2");
        jb2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jbPonto.setBackground(new java.awt.Color(204, 255, 255));
        jbPonto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbPonto.setText(".");
        jbPonto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPontoActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(255, 0, 153));
        jb9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb9.setText("9");
        jb9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(255, 102, 0));
        jb6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb6.setText("6");
        jb6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(0, 204, 153));
        jb3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb3.setText("3");
        jb3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jbIgual.setBackground(new java.awt.Color(153, 153, 153));
        jbIgual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbIgual.setText("=");
        jbIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIgualActionPerformed(evt);
            }
        });

        jbSoma.setBackground(new java.awt.Color(255, 0, 153));
        jbSoma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSoma.setText("+");
        jbSoma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomaActionPerformed(evt);
            }
        });

        jbSubtracao.setBackground(new java.awt.Color(255, 204, 0));
        jbSubtracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSubtracao.setText("-");
        jbSubtracao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtracaoActionPerformed(evt);
            }
        });

        jbMultiplicacao.setBackground(new java.awt.Color(0, 204, 51));
        jbMultiplicacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbMultiplicacao.setText("×");
        jbMultiplicacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicacaoActionPerformed(evt);
            }
        });

        jbDivisao.setBackground(new java.awt.Color(102, 102, 102));
        jbDivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDivisao.setText("÷");
        jbDivisao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivisaoActionPerformed(evt);
            }
        });

        jtfVisor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfVisor.setText("0");
        jtfVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVisorActionPerformed(evt);
            }
        });

        jbPorcentagem.setBackground(new java.awt.Color(255, 0, 255));
        jbPorcentagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbPorcentagem.setText("%");
        jbPorcentagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorcentagemActionPerformed(evt);
            }
        });

        jbFatorial.setBackground(new java.awt.Color(255, 255, 0));
        jbFatorial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbFatorial.setText("!");
        jbFatorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFatorialActionPerformed(evt);
            }
        });

        jbAoQuadrado.setBackground(new java.awt.Color(102, 255, 0));
        jbAoQuadrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAoQuadrado.setText("x²");
        jbAoQuadrado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAoQuadradoActionPerformed(evt);
            }
        });

        jbExpoente.setBackground(new java.awt.Color(102, 102, 102));
        jbExpoente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbExpoente.setText("x^");
        jbExpoente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbExpoente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExpoenteActionPerformed(evt);
            }
        });

        jbLimpar.setBackground(new java.awt.Color(0, 0, 204));
        jbLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbLimpar.setText("CE");
        jbLimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setBackground(new java.awt.Color(102, 0, 255));
        jbDeletar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDeletar.setText("«");
        jbDeletar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbRaizQuadrada.setBackground(new java.awt.Color(204, 102, 255));
        jbRaizQuadrada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbRaizQuadrada.setText("√");
        jbRaizQuadrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaizQuadradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfVisor)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbPonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jb6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbSubtracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbExpoente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbAoQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbFatorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jtfVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAoQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExpoente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        preencherVisor("7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        preencherVisor("4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        preencherVisor("1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        if (!jtfVisor.getText().equals("0")) {
            preencherVisor("0");
        }

    }//GEN-LAST:event_jb0ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        preencherVisor("8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        preencherVisor("5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        preencherVisor("2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jbPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPontoActionPerformed
        if (!jtfVisor.getText().contains(".")) {
            preencherVisor(".");
        }
    }//GEN-LAST:event_jbPontoActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        preencherVisor("9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        preencherVisor("6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        preencherVisor("3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jbIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIgualActionPerformed
        valor02 = Double.parseDouble(jtfVisor.getText());
        double resultado = 0;
        switch (op) {
            case "+":
                resultado = valor01 + valor02;
                break;
            case "-":
                resultado = valor01 - valor02;
                break;
            case "÷":
                resultado = valor01 / valor02;
                break;
            case "×":
                resultado = valor01 * valor02;
                break;
            case "^":
                resultado = Math.pow(valor01, valor02);
                break;

        }
        jtfVisor.setText(df.format(resultado + ""));
    }//GEN-LAST:event_jbIgualActionPerformed

    private void jbSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomaActionPerformed
        operacoes();
        op = "+";
    }//GEN-LAST:event_jbSomaActionPerformed

    private void jbSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtracaoActionPerformed
        operacoes();
        op = "-";
    }//GEN-LAST:event_jbSubtracaoActionPerformed

    private void jbMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicacaoActionPerformed
        operacoes();
        op = "*";
    }//GEN-LAST:event_jbMultiplicacaoActionPerformed

    private void jbDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivisaoActionPerformed
        operacoes();
        op = "/";
    }//GEN-LAST:event_jbDivisaoActionPerformed

    private void jtfVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVisorActionPerformed

    }//GEN-LAST:event_jtfVisorActionPerformed

    private void jbPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorcentagemActionPerformed
        valor02 = Double.parseDouble(jtfVisor.getText());
        double resultado = 0;
        switch (op) {
            case "+":
                resultado = valor01 + (valor02 / 100) * valor01;
                break;
            case "-":
                resultado = valor01 - (valor02 / 100) * valor01;
                break;
            case "*":
                resultado = valor01 * (valor02 / 100) * valor01;
                break;
            case "/":
                resultado = valor01 / (valor02 / 100) * valor01;
                break;
        }
        jtfVisor.setText(df.format(resultado));

    }//GEN-LAST:event_jbPorcentagemActionPerformed

    private void jbFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFatorialActionPerformed
        int valor = Integer.parseInt(jtfVisor.getText());
        for (int i = 0; i < i; i++) {
            valor *= i;
        }
        jtfVisor.setText(df.format(valor));
    }//GEN-LAST:event_jbFatorialActionPerformed

    private void jbAoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAoQuadradoActionPerformed
        int valor = Integer.parseInt(jtfVisor.getText());
        int resultado = valor * valor;
        jtfVisor.setText(df.format(resultado));
    }//GEN-LAST:event_jbAoQuadradoActionPerformed

    private void jbExpoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExpoenteActionPerformed
        operacoes();
        op = "^";

    }//GEN-LAST:event_jbExpoenteActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfVisor.setText("0");
        op = "";
        valor01 = 0;
        valor02 = 0;
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        String numero = jtfVisor.getText();
        if (numero.length() > 1) {
            jtfVisor.setText(numero.substring(0, jtfVisor.getText().length() - 1));
        } else {
            jtfVisor.setText("0");
        }
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRaizQuadradaActionPerformed
        valor01 = Double.parseDouble(jtfVisor.getText());
        valor01 = Math.sqrt(valor01);
        jtfVisor.setText(df.format(valor01));

    }//GEN-LAST:event_jbRaizQuadradaActionPerformed

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAoQuadrado;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbDivisao;
    private javax.swing.JButton jbExpoente;
    private javax.swing.JButton jbFatorial;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbMultiplicacao;
    private javax.swing.JButton jbPonto;
    private javax.swing.JButton jbPorcentagem;
    private javax.swing.JButton jbRaizQuadrada;
    private javax.swing.JButton jbSoma;
    private javax.swing.JButton jbSubtracao;
    private javax.swing.JTextField jtfVisor;
    // End of variables declaration//GEN-END:variables
}
