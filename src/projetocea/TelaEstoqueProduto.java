/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetocea;


import Model.ProdutoModel;
import projetocea.CriarProduto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gabriel
 */
public class TelaEstoqueProduto extends javax.swing.JFrame {
    
    private DefaultTableModel model;
  
    
    
    public TelaEstoqueProduto() {
        initComponents();
         
         model = (javax.swing.table.DefaultTableModel) TabelaProduto.getModel();
       
    }
    public void adicionarProdutoNaTabela(ProdutoModel produto) {
        DefaultTableModel model = (DefaultTableModel) TabelaProduto.getModel();
        model.addRow(new Object[]{produto.getID(), produto.getNome(), produto.getTipo(),String.format("R$ %.2f", produto.getPreco()) // Formata o preço como moeda
    }); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ImportarCSVBTT = new javax.swing.JButton();
        criarProdutoBTT = new javax.swing.JButton();
        ExcluirBTT = new javax.swing.JButton();
        VoltarBTT = new javax.swing.JButton();
        ConsultarBtt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        abaPesquisa = new javax.swing.JTextField();
        filtroCombo = new javax.swing.JComboBox<>();
        FiltroComboTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CONTROLE DE PRODUTOS - ESTOQUE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        ImportarCSVBTT.setBackground(new java.awt.Color(87, 119, 119));
        ImportarCSVBTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ImportarCSVBTT.setForeground(new java.awt.Color(255, 255, 255));
        ImportarCSVBTT.setText("IMPORTAR CSV");
        ImportarCSVBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarCSVBTTActionPerformed(evt);
            }
        });

        criarProdutoBTT.setBackground(new java.awt.Color(87, 119, 119));
        criarProdutoBTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        criarProdutoBTT.setForeground(new java.awt.Color(255, 255, 255));
        criarProdutoBTT.setText("CRIAR PRODUTO");
        criarProdutoBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProdutoBTTActionPerformed(evt);
            }
        });

        ExcluirBTT.setBackground(new java.awt.Color(87, 119, 119));
        ExcluirBTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExcluirBTT.setForeground(new java.awt.Color(255, 255, 255));
        ExcluirBTT.setText("EXCLUIR PRODUTO");
        ExcluirBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBTTActionPerformed(evt);
            }
        });

        VoltarBTT.setBackground(new java.awt.Color(255, 255, 255));
        VoltarBTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VoltarBTT.setForeground(new java.awt.Color(0, 0, 0));
        VoltarBTT.setText("VOLTAR");
        VoltarBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBTTActionPerformed(evt);
            }
        });

        ConsultarBtt.setBackground(new java.awt.Color(51, 51, 51));
        ConsultarBtt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConsultarBtt.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarBtt.setText("CONSULTAR PRODUTO");
        ConsultarBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBttActionPerformed(evt);
            }
        });

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "TIPO", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(TabelaProduto);

        filtroCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "NOME" }));

        FiltroComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Produtos de Limpeza", "Produtos Alimenticios", "Produtos Tecnologicos" }));

        jLabel1.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(abaPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FiltroComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ExcluirBTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(criarProdutoBTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ImportarCSVBTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(VoltarBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ConsultarBtt))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FiltroComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filtroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConsultarBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ImportarCSVBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(criarProdutoBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExcluirBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VoltarBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(849, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImportarCSVBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarCSVBTTActionPerformed
         JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            importarCSV(selectedFile);
        }
    }//GEN-LAST:event_ImportarCSVBTTActionPerformed

    private void ExcluirBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBTTActionPerformed
         int selectedRow = TabelaProduto.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ExcluirBTTActionPerformed

    private void VoltarBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBTTActionPerformed
        TelaAdm TLA = new TelaAdm();
        TLA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_VoltarBTTActionPerformed

    private void criarProdutoBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProdutoBTTActionPerformed
        CriarProduto criarProdutoFrame = new CriarProduto(this); // Passa a referência da tela principal
        criarProdutoFrame.setVisible(true);
      
    }//GEN-LAST:event_criarProdutoBTTActionPerformed

    private void ConsultarBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBttActionPerformed
        String termoPesquisa = abaPesquisa.getText().trim().toLowerCase();
        String filtroPesquisa = (String) filtroCombo.getSelectedItem();
        String filtroTipo = (String) FiltroComboTipo.getSelectedItem();
        
       //Utilizando RowFilter e TableRowSorter para Busca e filtro de pesquisa dos produtos
        DefaultTableModel model = (DefaultTableModel) TabelaProduto.getModel();
       // Cria um TableRowSorter associado ao modelo de tabela
          
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        TabelaProduto.setRowSorter(sorter);
        
       // Lista para armazenar os filtros que serão aplicados
        List<RowFilter<Object, Object>> filters = new ArrayList<>();

    try {
         // Verifica se o filtro de pesquisa é por "ID" ou por "Nome"
        int indiceColunaFiltro = -1;
        if ("ID".equals(filtroPesquisa)) {
            indiceColunaFiltro = 0;// Coluna de ID na tabela
        } else if ("Nome".equals(filtroPesquisa)) {
            indiceColunaFiltro = 1;// Coluna de Nome na tabela
        }
        
        
        // Se houver um índice válido de coluna e um termo de pesquisa não vazio
        if (indiceColunaFiltro >= 0 && !termoPesquisa.isEmpty()) {
            // Cria um filtro regex para o termo de pesquisa na coluna específica
            RowFilter<Object, Object> rf = RowFilter.regexFilter("(?i)" + termoPesquisa, indiceColunaFiltro);
            filters.add(rf);// Adiciona o filtro à lista de filtros
        }

        
        // Se o filtro de tipo não for "Todos", cria um filtro para o tipo de produto
        if (!"Todos".equals(filtroTipo)) {
            // Cria um filtro regex para o tipo de produto na coluna de tipo (índice 2, por exemplo)
            RowFilter<Object, Object> filtroTipoRf = RowFilter.regexFilter(filtroTipo, 2);
            filters.add(filtroTipoRf);
        }
        
        // Combina todos os filtros em um filtro composto usando RowFilter.andFilter
        sorter.setRowFilter(RowFilter.andFilter(filters));
        
    } catch (java.util.regex.PatternSyntaxException e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_ConsultarBttActionPerformed
    
    
    
    private void importarCSV(File arquivoCSV) {
        DefaultTableModel model = (DefaultTableModel) TabelaProduto.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

    try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
        String linha;
        boolean header = true; // Flag para verificar se é a linha de cabeçalho

        while ((linha = br.readLine()) != null) {
            System.out.println("Linha lida: " + linha); // Debug: imprime a linha lida

            if (header) {
                header = false;
                continue; // Pula a linha de cabeçalho
            }

            String[] dados = linha.split(",");
            if (dados.length == 4) { // Verifica se a linha possui 4 colunas
                // Adiciona os dados à tabela nas colunas específicas
                model.addRow(new Object[]{dados[0], dados[1], dados[2], dados[3]});
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao ler arquivo CSV: formato inválido",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Erro ao ler arquivo CSV: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    
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
            java.util.logging.Logger.getLogger(TelaEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoqueProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoqueProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarBtt;
    private javax.swing.JButton ExcluirBTT;
    private javax.swing.JComboBox<String> FiltroComboTipo;
    private javax.swing.JButton ImportarCSVBTT;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JButton VoltarBTT;
    private javax.swing.JTextField abaPesquisa;
    private javax.swing.JButton criarProdutoBTT;
    private javax.swing.JComboBox<String> filtroCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
