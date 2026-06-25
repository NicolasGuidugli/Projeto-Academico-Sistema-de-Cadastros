# Projeto-Academico-Sistema-de-Cadastros

Sistema de Cadastros utilizando Java Swing

Projeto academico com intuito de massificar os aprendizados na crianção de interfaces gráficas
utilizando a ferramenta Java Swing.
Neste sistema você é capaz de fazer cadastros de funcionarios, definindo seus cargos, sexualidade, email, nome.
E também salvando estes dados em arquivos .txt e carregando os mesmos com opçoes intuitivas no painel.

# Ferramentas utilizadas:

- JAVA
- JAVA SWING

# COMO EXECUTAR
-------------
1. Certifique-se de ter o Java  instalado
2. Execute: java -jar CadastroUsuarios.jar

FUNCIONALIDADES
---------------
- Cadastro de usuários com: Nome, E-mail, Idade, Gênero
- CheckBox: Usuário Ativo / Receber Newsletter
- ComboBox + List: Gerenciamento de Permissões
- Table: Listagem de todos os registros
- Botão "Adicionar Registro": valida e adiciona à tabela
- Botão "Excluir": remove registro com confirmação
- Botão "Ver Detalhes": abre janela secundária detalhada
- Menu > Arquivo > Salvar Dados: grava em arquivo .txt
- Menu > Arquivo > Carregar Dados: carrega arquivo .txt

COMPONENTES UTILIZADOS
----------------------
✓ JFrame (janela principal + janela de detalhes)
✓ JLabel
✓ JTextField
✓ JButton
✓ JRadioButton (Masculino / Feminino / Outro)
✓ JCheckBox (Ativo / Newsletter)
✓ JComboBox (Seleção de permissões)
✓ JList (Lista de permissões do usuário)
✓ JTable (Tabela de registros)
✓ JMenuBar com JMenu e JMenuItem

FORMATO DO ARQUIVO DE DADOS
----------------------------
Campos separados por | (pipe):
ID|Nome|Email|Idade|Genero|Ativo|Newsletter|Permissões

Exemplo:
1|Maria Silva|maria@email.com|28|Feminino|Sim|Não|Administrador, Editor
