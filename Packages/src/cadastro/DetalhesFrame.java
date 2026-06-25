package cadastro;

import javax.swing.*;

public class DetalhesFrame extends javax.swing.JDialog {

    private String[] dados;
    private String[] colunas;

    public DetalhesFrame(java.awt.Frame parent, boolean modal, String[] dados, String[] colunas) {
        super(parent, modal);
        this.dados   = dados;
        this.colunas = colunas;
        initComponents();
        preencherDados();
        setLocationRelativeTo(parent);
    }

    private void preencherDados() {
        lblIdValue.setText(dados.length > 0 ? dados[0] : "-");
        lblNomeValue.setText(dados.length > 1 ? dados[1] : "-");
        lblEmailValue.setText(dados.length > 2 ? dados[2] : "-");
        lblIdadeValue.setText(dados.length > 3 ? dados[3] : "-");
        lblGeneroValue.setText(dados.length > 4 ? dados[4] : "-");
        lblAtivoValue.setText(dados.length > 5 ? dados[5] : "-");
        lblNewsletterValue.setText(dados.length > 6 ? dados[6] : "-");
        lblPermissoesValue.setText(dados.length > 7 ? dados[7] : "-");
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        pnlDetalhes = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblIdValue = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNomeValue = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEmailValue = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblIdadeValue = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblGeneroValue = new javax.swing.JLabel();
        lblAtivo = new javax.swing.JLabel();
        lblAtivoValue = new javax.swing.JLabel();
        lblNewsletter = new javax.swing.JLabel();
        lblNewsletterValue = new javax.swing.JLabel();
        lblPermissoes = new javax.swing.JLabel();
        lblPermissoesValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes do Usuario");
        setResizable(false);

        pnlDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacoes do Usuario"));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblId.setText("ID:");

        lblIdValue.setText("-");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblNome.setText("Nome:");

        lblNomeValue.setText("-");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblEmail.setText("E-mail:");

        lblEmailValue.setText("-");

        lblIdade.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblIdade.setText("Idade:");

        lblIdadeValue.setText("-");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblGenero.setText("Genero:");

        lblGeneroValue.setText("-");

        lblAtivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblAtivo.setText("Ativo:");

        lblAtivoValue.setText("-");

        lblNewsletter.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblNewsletter.setText("Newsletter:");

        lblNewsletterValue.setText("-");

        lblPermissoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lblPermissoes.setText("Permissoes:");

        lblPermissoesValue.setText("-");

        javax.swing.GroupLayout pnlDetalhesLayout = new javax.swing.GroupLayout(pnlDetalhes);
        pnlDetalhes.setLayout(pnlDetalhesLayout);
        pnlDetalhesLayout.setHorizontalGroup(
            pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblNome)
                    .addComponent(lblEmail)
                    .addComponent(lblIdade)
                    .addComponent(lblGenero)
                    .addComponent(lblAtivo)
                    .addComponent(lblNewsletter)
                    .addComponent(lblPermissoes))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblNomeValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblEmailValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblIdadeValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblGeneroValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblAtivoValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblNewsletterValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblPermissoesValue, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDetalhesLayout.setVerticalGroup(
            pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblIdValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblNomeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblEmailValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(lblIdadeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(lblGeneroValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtivo)
                    .addComponent(lblAtivoValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewsletter)
                    .addComponent(lblNewsletterValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPermissoes)
                    .addComponent(lblPermissoesValue))
                .addContainerGap())
        );

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        pack();
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    
    private javax.swing.JButton btnFechar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblAtivoValue;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailValue;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroValue;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdValue;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdadeValue;
    private javax.swing.JLabel lblNewsletter;
    private javax.swing.JLabel lblNewsletterValue;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeValue;
    private javax.swing.JLabel lblPermissoes;
    private javax.swing.JLabel lblPermissoesValue;
    private javax.swing.JPanel pnlDetalhes;
    
}
