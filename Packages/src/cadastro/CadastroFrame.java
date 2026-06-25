package cadastro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroFrame extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private javax.swing.DefaultListModel<String> listModel;
    private int proximoId = 1;

    public CadastroFrame() {
        initComponents();
        inicializarTabela();
        inicializarLista();
        setLocationRelativeTo(null);
    }

    private void inicializarTabela() {
        tableModel = new DefaultTableModel(
            new Object[]{"ID", "Nome", "E-mail", "Idade", "Genero", "Ativo", "Newsletter", "Permissoes"},
            0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblUsuarios.setModel(tableModel);
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(160);
        tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblUsuarios.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblUsuarios.getColumnModel().getColumn(5).setPreferredWidth(50);
        tblUsuarios.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblUsuarios.getColumnModel().getColumn(7).setPreferredWidth(150);
    }

    private void inicializarLista() {
        listModel = new javax.swing.DefaultListModel<>();
        lstPermissoes.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        pnlFormulario = new javax.swing.JPanel();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        pnlGenero = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbOutro = new javax.swing.JRadioButton();
        pnlOpcoes = new javax.swing.JPanel();
        lblOpcoes = new javax.swing.JLabel();
        chkAtivo = new javax.swing.JCheckBox();
        chkNewsletter = new javax.swing.JCheckBox();
        pnlPermissoes = new javax.swing.JPanel();
        lblPermissao = new javax.swing.JLabel();
        cmbPermissao = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPermissoes = new javax.swing.JList<>();
        btnAdicionarPermissao = new javax.swing.JButton();
        btnRemoverPermissao = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemCarregar = new javax.swing.JMenuItem();
        menuItemSalvar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Usuarios");
        setMinimumSize(new java.awt.Dimension(950, 620));

        // --- Painel Formulario ---
        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario de Cadastro"));

        // Dados Pessoais
        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNome.setText("Nome:");
        lblEmail.setText("E-mail:");
        lblIdade.setText("Idade:");

        txtNome.setColumns(20);
        txtEmail.setColumns(20);
        txtIdade.setColumns(5);

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblEmail)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        // Genero
        pnlGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));

        lblGenero.setText("Selecione:");
        bgGenero.add(rbMasculino);
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");
        bgGenero.add(rbFeminino);
        rbFeminino.setText("Feminino");
        bgGenero.add(rbOutro);
        rbOutro.setText("Outro");

        javax.swing.GroupLayout pnlGeneroLayout = new javax.swing.GroupLayout(pnlGenero);
        pnlGenero.setLayout(pnlGeneroLayout);
        pnlGeneroLayout.setHorizontalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeneroLayout.setVerticalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(rbOutro))
                .addContainerGap())
        );

        // Opcoes
        pnlOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcoes"));

        lblOpcoes.setText("Marque:");
        chkAtivo.setSelected(true);
        chkAtivo.setText("Usuario Ativo");
        chkNewsletter.setText("Receber Newsletter");

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkNewsletter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOpcoes)
                    .addComponent(chkAtivo)
                    .addComponent(chkNewsletter))
                .addContainerGap())
        );

        // Permissoes
        pnlPermissoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissoes"));

        lblPermissao.setText("Permissao:");
        cmbPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[]{"Selecione", "Administrador", "Editor", "Visualizador", "Moderador", "Suporte", "Financeiro"}
        ));

        jScrollPane2.setViewportView(lstPermissoes);

        btnAdicionarPermissao.setText("Adicionar");
        btnAdicionarPermissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPermissaoActionPerformed(evt);
            }
        });

        btnRemoverPermissao.setText("Remover");
        btnRemoverPermissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPermissaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPermissoesLayout = new javax.swing.GroupLayout(pnlPermissoes);
        pnlPermissoes.setLayout(pnlPermissoesLayout);
        pnlPermissoesLayout.setHorizontalGroup(
            pnlPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPermissoesLayout.createSequentialGroup()
                        .addComponent(lblPermissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPermissao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(pnlPermissoesLayout.createSequentialGroup()
                        .addComponent(btnAdicionarPermissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverPermissao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPermissoesLayout.setVerticalGroup(
            pnlPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPermissao)
                    .addComponent(cmbPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarPermissao)
                    .addComponent(btnRemoverPermissao))
                .addContainerGap())
        );

        // Botoes do formulario
        btnAdicionar.setText("Adicionar Registro");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPermissoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- Painel Tabela ---
        pnlTabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros Cadastrados"));

        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblUsuarios);

        btnExcluir.setText("Excluir Registro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Ver Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(pnlTabelaLayout.createSequentialGroup()
                        .addComponent(btnDetalhes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalhes)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        // --- Layout Principal ---
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        // --- Menu Bar ---
        menuArquivo.setText("Arquivo");

        menuItemCarregar.setText("Carregar Dados");
        menuItemCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCarregarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemCarregar);

        menuItemSalvar.setText("Salvar Dados");
        menuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvar);
        menuArquivo.add(jSeparator1);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);
        menuBar.add(menuArquivo);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemSobre);
        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        pack();
    }

    private void btnAdicionarPermissaoActionPerformed(java.awt.event.ActionEvent evt) {
        String selecionado = (String) cmbPermissao.getSelectedItem();
        if (selecionado == null || selecionado.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Selecione uma permissao valida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (listModel.contains(selecionado)) {
            JOptionPane.showMessageDialog(this, "Permissao ja adicionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        listModel.addElement(selecionado);
        cmbPermissao.setSelectedIndex(0);
    }

    private void btnRemoverPermissaoActionPerformed(java.awt.event.ActionEvent evt) {
        int indice = lstPermissoes.getSelectedIndex();
        if (indice < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma permissao para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        listModel.remove(indice);
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome  = txtNome.getText().trim();
        String email = txtEmail.getText().trim();
        String idade = txtIdade.getText().trim();

        if (nome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome e E-mail sao obrigatorios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.matches(".+@.+\\..+")) {
            JOptionPane.showMessageDialog(this, "E-mail invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!idade.isEmpty() && !idade.matches("\\d{1,3}")) {
            JOptionPane.showMessageDialog(this, "Idade deve ser um numero valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String genero = rbMasculino.isSelected() ? "Masculino"
                      : rbFeminino.isSelected()  ? "Feminino" : "Outro";
        String ativo      = chkAtivo.isSelected()      ? "Sim" : "Nao";
        String newsletter = chkNewsletter.isSelected() ? "Sim" : "Nao";

        List<String> perms = new ArrayList<>();
        for (int i = 0; i < listModel.size(); i++) {
            perms.add(listModel.get(i));
        }
        String permissoes = perms.isEmpty() ? "Nenhuma" : String.join(", ", perms);

        tableModel.addRow(new Object[]{
            proximoId++, nome, email,
            idade.isEmpty() ? "-" : idade,
            genero, ativo, newsletter, permissoes
        });

        limparFormulario();
        JOptionPane.showMessageDialog(this, "Usuario \"" + nome + "\" cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limparFormulario();
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        int linhaSelecionada = tblUsuarios.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um registro para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nome = (String) tableModel.getValueAt(linhaSelecionada, 1);
        int confirmacao = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente excluir o registro de \"" + nome + "\"?",
            "Confirmar Exclusao",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );
        if (confirmacao == JOptionPane.YES_OPTION) {
            tableModel.removeRow(linhaSelecionada);
            reindexar();
            JOptionPane.showMessageDialog(this, "Registro excluido com sucesso.", "Excluido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {
        int linhaSelecionada = tblUsuarios.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um registro para visualizar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String[] dados = new String[tableModel.getColumnCount()];
        String[] colunas = new String[tableModel.getColumnCount()];
        for (int c = 0; c < tableModel.getColumnCount(); c++) {
            dados[c]   = String.valueOf(tableModel.getValueAt(linhaSelecionada, c));
            colunas[c] = tableModel.getColumnName(c);
        }
        DetalhesFrame detalhes = new DetalhesFrame(this, true, dados, colunas);
        detalhes.setVisible(true);
    }

    private void menuItemCarregarActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Carregar Dados");
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado != JFileChooser.APPROVE_OPTION) return;

        File arquivo = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int carregados = 0;
            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("#") || linha.isBlank()) continue;
                String[] partes = linha.split("\\|", -1);
                if (partes.length >= 8) {
                    tableModel.addRow(partes);
                    carregados++;
                }
            }
            reindexar();
            JOptionPane.showMessageDialog(this, carregados + " registro(s) carregado(s) com sucesso!", "Carregar Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void menuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Nao ha dados para salvar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File("usuarios.txt"));
        fileChooser.setDialogTitle("Salvar Dados");
        int resultado = fileChooser.showSaveDialog(this);
        if (resultado != JFileChooser.APPROVE_OPTION) return;

        File arquivo = fileChooser.getSelectedFile();
        if (!arquivo.getName().endsWith(".txt")) {
            arquivo = new File(arquivo.getAbsolutePath() + ".txt");
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivo))) {
            pw.println("# Cadastro de Usuarios - " + new java.util.Date());
            pw.println("# Formato: ID|Nome|Email|Idade|Genero|Ativo|Newsletter|Permissoes");
            for (int r = 0; r < tableModel.getRowCount(); r++) {
                StringBuilder sb = new StringBuilder();
                for (int c = 0; c < tableModel.getColumnCount(); c++) {
                    if (c > 0) sb.append("|");
                    sb.append(tableModel.getValueAt(r, c));
                }
                pw.println(sb.toString());
            }
            JOptionPane.showMessageDialog(this, "Dados salvos em:\n" + arquivo.getAbsolutePath(), "Salvar Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this,
            "<html><center><b>Sistema de Cadastro de Usuarios</b><br>Versao 1.0<br><br>Desenvolvido com Java Swing + NetBeans</center></html>",
            "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }

    // --- Metodos auxiliares ---

    private void limparFormulario() {
        txtNome.setText("");
        txtEmail.setText("");
        txtIdade.setText("");
        rbMasculino.setSelected(true);
        chkAtivo.setSelected(true);
        chkNewsletter.setSelected(false);
        cmbPermissao.setSelectedIndex(0);
        listModel.clear();
    }

    private void reindexar() {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.setValueAt(i + 1, i, 0);
        }
        proximoId = tableModel.getRowCount() + 1;
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrame().setVisible(true);
            }
        });
    }

    
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionarPermissao;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemoverPermissao;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JCheckBox chkNewsletter;
    private javax.swing.JComboBox<String> cmbPermissao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOpcoes;
    private javax.swing.JLabel lblPermissao;
    private javax.swing.JList<String> lstPermissoes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemCarregar;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSalvar;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlPermissoes;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbOutro;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    
}
