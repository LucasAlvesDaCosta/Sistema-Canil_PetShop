package sistema_canil;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JFramePrincipal extends javax.swing.JFrame {
    
    public static ArrayList<Cachorro> lstc = new ArrayList<Cachorro>();
    public static ArrayList<Canil> lstcan = new ArrayList<Canil>();
    public static ArrayList<Treinador> lstt = new ArrayList<Treinador>();
    
    int regAtualCachorro = 0;
    int regAtualCanil = 0;
    int regAtualTreinador = 0;

    public JFramePrincipal() {
        initComponents();
    }
    
    public void recarregarCachorro(int registro){
        txtNomeCachorro.setText(lstc.get(registro).getNome());
        txtRacaCachorro.setText(lstc.get(registro).getRaca());
        txtCorCachorro.setText(lstc.get(registro).getCor());
        txtIdadeCachorro.setText(lstc.get(registro).getIdade() + "");
        regAtualCachorro = registro; 
    }
    
    public void recarregarCanil(int registro){
        txtNomeCanil.setText(lstcan.get(registro).getNome());
        txtEnderecoCanil.setText(lstcan.get(registro).getEndereco());
        txtProprietarioCanil.setText(lstcan.get(registro).getProprietario());
        txtTelefoneCanil.setText(lstcan.get(registro).getTelefone());
        regAtualCanil = registro; 
    }
    
    public void recarregarTreinador(int registro){
        txtNomeTreinador.setText(lstt.get(registro).getNome());
        txtCPFTreinador.setText(lstt.get(registro).getCpf());
        txtEnderecoTreinador.setText(lstt.get(registro).getEndereco());
        txtTelefoneTreinador.setText(lstt.get(registro).getTelefone());
        regAtualTreinador = registro; 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCachorro = new javax.swing.JTextField();
        txtIdadeCachorro = new javax.swing.JTextField();
        txtRacaCachorro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorCachorro = new javax.swing.JTextField();
        btnPrimeiroCachorro = new javax.swing.JButton();
        btnUltimoCachorro = new javax.swing.JButton();
        btnAnteriorCachorro = new javax.swing.JButton();
        btnExcluirCachorro = new javax.swing.JButton();
        btnProximoCachorro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCanil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEnderecoCanil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProprietarioCanil = new javax.swing.JTextField();
        txtTelefoneCanil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnPrimeiroCanil = new javax.swing.JButton();
        btnAnteriorCanil = new javax.swing.JButton();
        btnExcluirCanil = new javax.swing.JButton();
        btnProximoCanil = new javax.swing.JButton();
        btnUltimoCanil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNomeTreinador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCPFTreinador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEnderecoTreinador = new javax.swing.JTextField();
        txtTelefoneTreinador = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnUltimoTreinador = new javax.swing.JButton();
        btnProximoTreinador = new javax.swing.JButton();
        btnExcluirTreinador = new javax.swing.JButton();
        btnAnteriorTreinador = new javax.swing.JButton();
        btnPrimeiroTreinador = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Canil");
        setResizable(false);

        jLabel1.setText("Cahorros Cadastrados");

        jLabel2.setText("Nome:");

        jLabel3.setText("Raça:");

        jLabel4.setText("Idade:");

        txtNomeCachorro.setEditable(false);

        txtIdadeCachorro.setEditable(false);

        txtRacaCachorro.setEditable(false);

        jLabel5.setText("Cor:");

        txtCorCachorro.setEditable(false);

        btnPrimeiroCachorro.setText("<< Primeiro");
        btnPrimeiroCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroCachorroActionPerformed(evt);
            }
        });

        btnUltimoCachorro.setText("Último >>");
        btnUltimoCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoCachorroActionPerformed(evt);
            }
        });

        btnAnteriorCachorro.setText("< Anterior");
        btnAnteriorCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorCachorroActionPerformed(evt);
            }
        });

        btnExcluirCachorro.setText("X Excluir");
        btnExcluirCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCachorroActionPerformed(evt);
            }
        });

        btnProximoCachorro.setText("Próximo >");
        btnProximoCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoCachorroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRacaCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdadeCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(txtCorCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrimeiroCachorro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnteriorCachorro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCachorro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximoCachorro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimoCachorro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtNomeCachorro, txtRacaCachorro});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnteriorCachorro, btnExcluirCachorro, btnPrimeiroCachorro, btnProximoCachorro, btnUltimoCachorro});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRacaCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdadeCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiroCachorro)
                    .addComponent(btnAnteriorCachorro)
                    .addComponent(btnUltimoCachorro)
                    .addComponent(btnExcluirCachorro)
                    .addComponent(btnProximoCachorro))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Cachorros", jPanel1);

        jLabel6.setText("Canis Cadastrados");

        txtNomeCanil.setEditable(false);

        jLabel7.setText("Nome:");

        txtEnderecoCanil.setEditable(false);

        jLabel8.setText("Endereço:");

        jLabel9.setText("Proprietário:");

        txtProprietarioCanil.setEditable(false);

        txtTelefoneCanil.setEditable(false);

        jLabel10.setText("Telefone:");

        btnPrimeiroCanil.setText("<< Primeiro");
        btnPrimeiroCanil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroCanilActionPerformed(evt);
            }
        });

        btnAnteriorCanil.setText("< Anterior");
        btnAnteriorCanil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorCanilActionPerformed(evt);
            }
        });

        btnExcluirCanil.setText("X Excluir");
        btnExcluirCanil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCanilActionPerformed(evt);
            }
        });

        btnProximoCanil.setText("Próximo >");
        btnProximoCanil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoCanilActionPerformed(evt);
            }
        });

        btnUltimoCanil.setText("Último >>");
        btnUltimoCanil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoCanilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtProprietarioCanil, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneCanil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeCanil)
                            .addComponent(txtEnderecoCanil)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrimeiroCanil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnteriorCanil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCanil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximoCanil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimoCanil)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnteriorCanil, btnExcluirCanil, btnPrimeiroCanil, btnProximoCanil, btnUltimoCanil});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomeCanil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEnderecoCanil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProprietarioCanil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCanil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiroCanil)
                    .addComponent(btnAnteriorCanil)
                    .addComponent(btnUltimoCanil)
                    .addComponent(btnExcluirCanil)
                    .addComponent(btnProximoCanil))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Canis", jPanel2);

        jLabel11.setText("Treinadores Cadastrados");

        txtNomeTreinador.setEditable(false);

        jLabel12.setText("Nome:");

        txtCPFTreinador.setEditable(false);

        jLabel13.setText("CPF:");

        jLabel14.setText("Endereço:");

        txtEnderecoTreinador.setEditable(false);

        txtTelefoneTreinador.setEditable(false);

        jLabel15.setText("Telefone:");

        btnUltimoTreinador.setText("Último >>");
        btnUltimoTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoTreinadorActionPerformed(evt);
            }
        });

        btnProximoTreinador.setText("Próximo >");
        btnProximoTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoTreinadorActionPerformed(evt);
            }
        });

        btnExcluirTreinador.setText("X Excluir");
        btnExcluirTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTreinadorActionPerformed(evt);
            }
        });

        btnAnteriorTreinador.setText("< Anterior");
        btnAnteriorTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorTreinadorActionPerformed(evt);
            }
        });

        btnPrimeiroTreinador.setText("<< Primeiro");
        btnPrimeiroTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroTreinadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeTreinador, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCPFTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneTreinador))
                            .addComponent(txtEnderecoTreinador)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrimeiroTreinador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnteriorTreinador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirTreinador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximoTreinador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimoTreinador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnteriorTreinador, btnExcluirTreinador, btnPrimeiroTreinador, btnProximoTreinador, btnUltimoTreinador});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNomeTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCPFTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefoneTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEnderecoTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiroTreinador)
                    .addComponent(btnAnteriorTreinador)
                    .addComponent(btnUltimoTreinador)
                    .addComponent(btnExcluirTreinador)
                    .addComponent(btnProximoTreinador))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Treinadores", jPanel3);

        jMenu1.setText("Cadastrar");

        jMenuItem1.setText("Cachorro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Canil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Treinador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenu3.setText("Tópicos de Ajuda");

        jMenuItem4.setText("FAQ");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Manual");
        jMenu3.add(jMenuItem5);

        jMenu2.add(jMenu3);

        jMenuItem6.setText("Sobre");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUltimoCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoCachorroActionPerformed
        if(lstc.size() > 0){
            regAtualCachorro = lstc.size() - 1;
            recarregarCachorro(regAtualCachorro);
        }
    }//GEN-LAST:event_btnUltimoCachorroActionPerformed

    private void btnUltimoCanilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoCanilActionPerformed
        if(lstcan.size() > 0){
            regAtualCanil = lstcan.size() - 1;
            recarregarCanil(regAtualCanil);
        }
    }//GEN-LAST:event_btnUltimoCanilActionPerformed

    private void btnUltimoTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoTreinadorActionPerformed
        if(lstt.size() > 0){
            regAtualTreinador = lstt.size() - 1;
            recarregarTreinador(regAtualTreinador);
        }
    }//GEN-LAST:event_btnUltimoTreinadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFrameCachorro jfc = new JFrameCachorro(lstc, this);
        jfc.setLocationRelativeTo(null);
        jfc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFrameCanil jfca = new JFrameCanil(lstcan, this);
        jfca.setLocationRelativeTo(null);
        jfca.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFrameTreinador jft = new JFrameTreinador(lstt, this);
        jft.setLocationRelativeTo(null);
        jft.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnPrimeiroCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroCachorroActionPerformed
        if(lstc.size() > 0){
            regAtualCachorro = 0;
            recarregarCachorro(regAtualCachorro);
        }
    }//GEN-LAST:event_btnPrimeiroCachorroActionPerformed

    private void btnAnteriorCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorCachorroActionPerformed
        if(regAtualCachorro > 0){
            regAtualCachorro--;
            recarregarCachorro(regAtualCachorro);
        }
    }//GEN-LAST:event_btnAnteriorCachorroActionPerformed

    private void btnProximoCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCachorroActionPerformed
        if(regAtualCachorro < lstc.size() - 1){
            regAtualCachorro++;
            recarregarCachorro(regAtualCachorro);
        }
    }//GEN-LAST:event_btnProximoCachorroActionPerformed

    private void btnExcluirCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCachorroActionPerformed
        if (lstc.size() > 0) {
            int confirmacaoExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Cachorro?", null, JOptionPane.YES_NO_OPTION);
            if (confirmacaoExclusao == JOptionPane.YES_OPTION) {
                lstc.remove(regAtualCachorro);
                if (lstc.size() == 0) {
                    txtNomeCachorro.setText("");
                    txtRacaCachorro.setText("");
                    txtCorCachorro.setText("");
                    txtIdadeCachorro.setText("");
                } 
                else {
                    regAtualCachorro = 0;
                    recarregarCachorro(regAtualCachorro);
                }
            }
        }
    }//GEN-LAST:event_btnExcluirCachorroActionPerformed

    private void btnPrimeiroCanilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroCanilActionPerformed
        if(lstcan.size() > 0){
            regAtualCanil = 0;
            recarregarCanil(regAtualCanil);
        }
    }//GEN-LAST:event_btnPrimeiroCanilActionPerformed

    private void btnAnteriorCanilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorCanilActionPerformed
        if(regAtualCanil > 0){
            regAtualCanil--;
            recarregarCanil(regAtualCanil);
        }
    }//GEN-LAST:event_btnAnteriorCanilActionPerformed

    private void btnExcluirCanilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCanilActionPerformed
        if (lstcan.size() > 0) {
            int confirmacaoExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Canil?", null, JOptionPane.YES_NO_OPTION);
            if (confirmacaoExclusao == JOptionPane.YES_OPTION) {
                lstcan.remove(regAtualCanil);
                if (lstcan.size() == 0) {
                    txtNomeCanil.setText("");
                    txtEnderecoCanil.setText("");
                    txtTelefoneCanil.setText("");
                    txtProprietarioCanil.setText("");
                } 
                else {
                    regAtualCanil = 0;
                    recarregarCanil(regAtualCanil);
                }
            }
        }
    }//GEN-LAST:event_btnExcluirCanilActionPerformed

    private void btnProximoCanilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoCanilActionPerformed
        if(regAtualCanil < lstcan.size() - 1){
            regAtualCanil++;
            recarregarCanil(regAtualCanil);
        }
    }//GEN-LAST:event_btnProximoCanilActionPerformed

    private void btnPrimeiroTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroTreinadorActionPerformed
        if(lstt.size() > 0){
            regAtualTreinador = 0;
            recarregarTreinador(regAtualTreinador);
        }
    }//GEN-LAST:event_btnPrimeiroTreinadorActionPerformed

    private void btnAnteriorTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorTreinadorActionPerformed
        if(regAtualTreinador > 0){
            regAtualTreinador--;
            recarregarTreinador(regAtualTreinador);
        }
    }//GEN-LAST:event_btnAnteriorTreinadorActionPerformed

    private void btnExcluirTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTreinadorActionPerformed
        if (lstt.size() > 0) {
            int confirmacaoExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Treinador?", null, JOptionPane.YES_NO_OPTION);
            if (confirmacaoExclusao == JOptionPane.YES_OPTION) {
                lstt.remove(regAtualTreinador);
                if (lstt.size() == 0) {
                    txtNomeTreinador.setText("");
                    txtCPFTreinador.setText("");
                    txtEnderecoTreinador.setText("");
                    txtTelefoneTreinador.setText("");
                } 
                else {
                    regAtualTreinador = 0;
                    recarregarTreinador(regAtualTreinador);
                }
            }

        }

    }//GEN-LAST:event_btnExcluirTreinadorActionPerformed

    private void btnProximoTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoTreinadorActionPerformed
        if(regAtualTreinador < lstt.size() - 1){
            regAtualTreinador++;
            recarregarTreinador(regAtualTreinador);
        }
    }//GEN-LAST:event_btnProximoTreinadorActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnteriorCachorro;
    private javax.swing.JButton btnAnteriorCanil;
    private javax.swing.JButton btnAnteriorTreinador;
    private javax.swing.JButton btnExcluirCachorro;
    private javax.swing.JButton btnExcluirCanil;
    private javax.swing.JButton btnExcluirTreinador;
    private javax.swing.JButton btnPrimeiroCachorro;
    private javax.swing.JButton btnPrimeiroCanil;
    private javax.swing.JButton btnPrimeiroTreinador;
    private javax.swing.JButton btnProximoCachorro;
    private javax.swing.JButton btnProximoCanil;
    private javax.swing.JButton btnProximoTreinador;
    private javax.swing.JButton btnUltimoCachorro;
    private javax.swing.JButton btnUltimoCanil;
    private javax.swing.JButton btnUltimoTreinador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCPFTreinador;
    private javax.swing.JTextField txtCorCachorro;
    private javax.swing.JTextField txtEnderecoCanil;
    private javax.swing.JTextField txtEnderecoTreinador;
    private javax.swing.JTextField txtIdadeCachorro;
    private javax.swing.JTextField txtNomeCachorro;
    private javax.swing.JTextField txtNomeCanil;
    private javax.swing.JTextField txtNomeTreinador;
    private javax.swing.JTextField txtProprietarioCanil;
    private javax.swing.JTextField txtRacaCachorro;
    private javax.swing.JTextField txtTelefoneCanil;
    private javax.swing.JTextField txtTelefoneTreinador;
    // End of variables declaration//GEN-END:variables
}
