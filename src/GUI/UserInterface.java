
package GUI;

import POO.Problema;
import POO.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class UserInterface extends javax.swing.JFrame {
    private AlmacenLogin listaUsuarios;
    private AlmacenProblemas listaProblemas;
    private Clasificacion clasificacion;
    private Usuario miUsuario;
    private Problema problemaActivo;

    public UserInterface() {
        initComponents();
        listaUsuarios = new AlmacenLogin();
        listaProblemas = new AlmacenProblemas();
        initTestData();
        jPanelMenu.setVisible(false);
        jPanelClasificacion.setVisible(false);
        jPanelPersonalStats.setVisible(false);
        jPanelIO.setVisible(false);
        jPanelSubirProblema.setVisible(false);
        jStatsPlayButton.setVisible(false);
        jResetStatsButton.setVisible(false);
        jPanelStats.setVisible(false);
        jPanelPartida.setVisible(false);
    }
    private void initTestData(){
        listaProblemas.problemasBase();
        listaUsuarios.initUsuariosPrueba();
        
        Usuario u1 = listaUsuarios.getUsuario("Pepe");
        listaProblemas.getListaProblemas().get(0).getIntentado_por().add(u1);
        listaProblemas.getListaProblemas().get(2).getIntentado_por().add(u1);
        listaProblemas.getListaProblemas().get(2).getResuelto_por().add(u1);
        u1.updatePorcentajeExitos();
        
        Usuario u2 = listaUsuarios.getUsuario("Pepin");
        listaProblemas.getListaProblemas().get(0).getIntentado_por().add(u2);
        listaProblemas.getListaProblemas().get(3).getIntentado_por().add(u2);
        listaProblemas.getListaProblemas().get(6).getIntentado_por().add(u2);
        listaProblemas.getListaProblemas().get(0).getResuelto_por().add(u2);
        listaProblemas.getListaProblemas().get(3).getResuelto_por().add(u2);
        u2.updatePorcentajeExitos();
        
        Usuario u3 = listaUsuarios.getUsuario("Pepa");
        listaProblemas.getListaProblemas().get(0).getIntentado_por().add(u3);
        listaProblemas.getListaProblemas().get(1).getIntentado_por().add(u3);
        listaProblemas.getListaProblemas().get(2).getIntentado_por().add(u3);
        listaProblemas.getListaProblemas().get(3).getIntentado_por().add(u3);
        listaProblemas.getListaProblemas().get(4).getIntentado_por().add(u3);
        u3.updatePorcentajeExitos();
        
        Usuario u4 = listaUsuarios.getUsuario("Pepu");
        listaProblemas.getListaProblemas().get(0).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(1).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(2).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(3).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(4).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(5).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(6).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(7).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(8).getIntentado_por().add(u4);
        listaProblemas.getListaProblemas().get(0).getResuelto_por().add(u4);
        listaProblemas.getListaProblemas().get(2).getResuelto_por().add(u4);
        listaProblemas.getListaProblemas().get(3).getResuelto_por().add(u4);
        listaProblemas.getListaProblemas().get(6).getResuelto_por().add(u4);
        u4.updatePorcentajeExitos();
        for (int i = 0; i < listaProblemas.getListaProblemas().size(); i++) {
            if(!listaProblemas.getListaProblemas().get(i).getIntentado_por().isEmpty())
                listaProblemas.getListaProblemas().get(i).updatePorcentajeExitos();        
        }      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jPasswordField = new javax.swing.JPasswordField();
        jNombreTextField = new javax.swing.JTextField();
        jAccederButton = new javax.swing.JButton();
        jRadioRegistro = new javax.swing.JRadioButton();
        jRadioLogin = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ioButton = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jMenuCerrarButton = new javax.swing.JButton();
        jMenuPersonalStatsButton = new javax.swing.JButton();
        jMenuClasificacionButton = new javax.swing.JButton();
        jMenuStatsButton = new javax.swing.JButton();
        jMenuSubirProblemaButton = new javax.swing.JButton();
        jMenuJugarButton = new javax.swing.JButton();
        jPanelClasificacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaClasificacion = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jVolverClasificacionButton = new javax.swing.JButton();
        jProblemasRadio = new javax.swing.JRadioButton();
        jVictoriasRadio = new javax.swing.JRadioButton();
        jPanelStats = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaStats = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jVolverStatsButton = new javax.swing.JButton();
        jStatsPlayButton = new javax.swing.JButton();
        jResetStatsButton = new javax.swing.JButton();
        jPanelPersonalStats = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListaPersonalStats = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jVolverPersonalStatsButton = new javax.swing.JButton();
        jPanelSubirProblema = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jVolverSubirProblemaButton = new javax.swing.JButton();
        jSubirButton = new javax.swing.JButton();
        jRutaProblemaTextField = new javax.swing.JTextField();
        jPanelIO = new javax.swing.JPanel();
        jVolverIOButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jImportRadio = new javax.swing.JRadioButton();
        jExportRadio = new javax.swing.JRadioButton();
        jIOButton = new javax.swing.JButton();
        jIOTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jExportRadio1 = new javax.swing.JRadioButton();
        jIOButton1 = new javax.swing.JButton();
        jIOTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jImportRadio1 = new javax.swing.JRadioButton();
        jPanelPartida = new javax.swing.JPanel();
        jVueltaPartidaButton = new javax.swing.JButton();
        jManualCheckMateRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jProblemaTextArea = new javax.swing.JTextArea();
        jSolTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComprobarButton = new javax.swing.JButton();
        jLabelProblema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla de acceso");
        setAlwaysOnTop(true);

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jAccederButton.setText("Acceder");
        jAccederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccederButtonActionPerformed(evt);
            }
        });

        jRadioRegistro.setText("Registro");
        jRadioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRegistroActionPerformed(evt);
            }
        });

        jRadioLogin.setText("Login");
        jRadioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        ioButton.setText("Importar/Exportar");
        ioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jNombreTextField)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jAccederButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jRadioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))))
                .addGap(102, 102, 102))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAccederButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );

        jMenuCerrarButton.setText("Cerrar Sesión");
        jMenuCerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarButtonActionPerformed(evt);
            }
        });

        jMenuPersonalStatsButton.setText("Estadísticas personales");
        jMenuPersonalStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPersonalStatsButtonActionPerformed(evt);
            }
        });

        jMenuClasificacionButton.setText("Clasificación");
        jMenuClasificacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClasificacionButtonActionPerformed(evt);
            }
        });

        jMenuStatsButton.setText("Estadísticas de los problemas");
        jMenuStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuStatsButtonActionPerformed(evt);
            }
        });

        jMenuSubirProblemaButton.setText("Subir problema");
        jMenuSubirProblemaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubirProblemaButtonActionPerformed(evt);
            }
        });

        jMenuJugarButton.setText("JUGAR");
        jMenuJugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuJugarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jMenuCerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jMenuStatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMenuClasificacionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMenuPersonalStatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMenuSubirProblemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMenuLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jMenuJugarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMenuCerrarButton)
                .addGap(99, 99, 99)
                .addComponent(jMenuSubirProblemaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMenuStatsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMenuClasificacionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMenuPersonalStatsButton)
                .addGap(18, 18, 18)
                .addComponent(jMenuJugarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jListaClasificacion);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLASIFICACION");

        jVolverClasificacionButton.setText("Volver");
        jVolverClasificacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverClasificacionButtonActionPerformed(evt);
            }
        });

        jProblemasRadio.setText("Ordenar por problemas resueltos");
        jProblemasRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProblemasRadioActionPerformed(evt);
            }
        });

        jVictoriasRadio.setText("Ordenar por porcentaje de victorias");
        jVictoriasRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVictoriasRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClasificacionLayout = new javax.swing.GroupLayout(jPanelClasificacion);
        jPanelClasificacion.setLayout(jPanelClasificacionLayout);
        jPanelClasificacionLayout.setHorizontalGroup(
            jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClasificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVolverClasificacionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                    .addGroup(jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jVictoriasRadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProblemasRadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        jPanelClasificacionLayout.setVerticalGroup(
            jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClasificacionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVolverClasificacionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jProblemasRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jVictoriasRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        jListaStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaStatsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListaStats);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESTADÍSTICAS DE LOS PROBLEMAS");

        jVolverStatsButton.setText("Menú");
        jVolverStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverStatsButtonActionPerformed(evt);
            }
        });

        jStatsPlayButton.setText("Jugar");
        jStatsPlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatsPlayButtonActionPerformed(evt);
            }
        });

        jResetStatsButton.setText("Volver");
        jResetStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelStatsLayout = new javax.swing.GroupLayout(jPanelStats);
        jPanelStats.setLayout(jPanelStatsLayout);
        jPanelStatsLayout.setHorizontalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVolverStatsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStatsLayout.createSequentialGroup()
                        .addComponent(jResetStatsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStatsPlayButton))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(42, 42, 42))
        );
        jPanelStatsLayout.setVerticalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVolverStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStatsPlayButton)
                    .addComponent(jResetStatsButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jListaPersonalStats);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ESTADÍSTICAS PERSONALES");

        jVolverPersonalStatsButton.setText("Volver");
        jVolverPersonalStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverPersonalStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPersonalStatsLayout = new javax.swing.GroupLayout(jPanelPersonalStats);
        jPanelPersonalStats.setLayout(jPanelPersonalStatsLayout);
        jPanelPersonalStatsLayout.setHorizontalGroup(
            jPanelPersonalStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonalStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVolverPersonalStatsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPersonalStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(42, 42, 42))
        );
        jPanelPersonalStatsLayout.setVerticalGroup(
            jPanelPersonalStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonalStatsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelPersonalStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVolverPersonalStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanelSubirProblema.setPreferredSize(new java.awt.Dimension(374, 364));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SUBIR PROBLEMA");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jVolverSubirProblemaButton.setText("Volver");
        jVolverSubirProblemaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverSubirProblemaButtonActionPerformed(evt);
            }
        });

        jSubirButton.setText("Subir");
        jSubirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubirButtonActionPerformed(evt);
            }
        });

        jRutaProblemaTextField.setText("Escribir ruta del problema....");
        jRutaProblemaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutaProblemaTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSubirProblemaLayout = new javax.swing.GroupLayout(jPanelSubirProblema);
        jPanelSubirProblema.setLayout(jPanelSubirProblemaLayout);
        jPanelSubirProblemaLayout.setHorizontalGroup(
            jPanelSubirProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubirProblemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubirProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubirProblemaLayout.createSequentialGroup()
                        .addComponent(jVolverSubirProblemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubirProblemaLayout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanelSubirProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubirProblemaLayout.createSequentialGroup()
                                .addComponent(jRutaProblemaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubirProblemaLayout.createSequentialGroup()
                                .addComponent(jSubirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))))))
        );
        jPanelSubirProblemaLayout.setVerticalGroup(
            jPanelSubirProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubirProblemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubirProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jVolverSubirProblemaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jRutaProblemaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSubirButton)
                .addGap(120, 120, 120))
        );

        jVolverIOButton.setText("Volver");
        jVolverIOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverIOButtonActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("IMPORTAR / EXPORTAR DATOS BINARIOS");

        jImportRadio.setText("Importar");
        jImportRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImportRadioActionPerformed(evt);
            }
        });

        jExportRadio.setText("Exportar");
        jExportRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExportRadioActionPerformed(evt);
            }
        });

        jIOButton.setText("Hecho");
        jIOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIOButtonActionPerformed(evt);
            }
        });

        jIOTextField.setText("Introduzca la ruta...");
        jIOTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIOTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("PROBLEMAS:");

        jExportRadio1.setText("Exportar");
        jExportRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExportRadio1ActionPerformed(evt);
            }
        });

        jIOButton1.setText("Hecho");
        jIOButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIOButton1ActionPerformed(evt);
            }
        });

        jIOTextField1.setText("Introduzca la ruta...");
        jIOTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIOTextField1ActionPerformed(evt);
            }
        });

        jLabel11.setText("USUARIOS:");

        jImportRadio1.setText("Importar");
        jImportRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImportRadio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIOLayout = new javax.swing.GroupLayout(jPanelIO);
        jPanelIO.setLayout(jPanelIOLayout);
        jPanelIOLayout.setHorizontalGroup(
            jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIOLayout.createSequentialGroup()
                        .addComponent(jVolverIOButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelIOLayout.createSequentialGroup()
                        .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jIOTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelIOLayout.createSequentialGroup()
                                .addComponent(jExportRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImportRadio))
                            .addComponent(jIOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jIOTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelIOLayout.createSequentialGroup()
                                .addComponent(jExportRadio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImportRadio1))
                            .addComponent(jIOButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelIOLayout.setVerticalGroup(
            jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVolverIOButton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIOLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIOTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jExportRadio)
                            .addComponent(jImportRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIOButton))
                    .addGroup(jPanelIOLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIOTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jExportRadio1)
                            .addComponent(jImportRadio1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIOButton1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jVueltaPartidaButton.setText("Volver");
        jVueltaPartidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVueltaPartidaButtonActionPerformed(evt);
            }
        });

        jManualCheckMateRadio.setText("Jaque Mate manual");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RETO ALEATORIO DE MASTERCHESS");

        jProblemaTextArea.setEditable(false);
        jProblemaTextArea.setColumns(20);
        jProblemaTextArea.setRows(5);
        jScrollPane3.setViewportView(jProblemaTextArea);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Introduzca la solución (PGN):");

        jComprobarButton.setText("Comprobar");
        jComprobarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprobarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPartidaLayout = new javax.swing.GroupLayout(jPanelPartida);
        jPanelPartida.setLayout(jPanelPartidaLayout);
        jPanelPartidaLayout.setHorizontalGroup(
            jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVueltaPartidaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPartidaLayout.createSequentialGroup()
                        .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPartidaLayout.createSequentialGroup()
                        .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSolTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jComprobarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jManualCheckMateRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanelPartidaLayout.setVerticalGroup(
            jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPartidaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jVueltaPartidaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProblema)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComprobarButton)
                    .addComponent(jManualCheckMateRadio))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(582, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPersonalStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSubirProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPersonalStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSubirProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListaStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaStatsMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 1) {
            int index = list.locationToIndex(evt.getPoint());
            String s = list.getModel().getElementAt(index).toString();
            if(s.contains("Problema")){
                jListaStats.setListData(mostrarProblema(index));
                problemaActivo=listaProblemas.getListaProblemas().get(index);
                jStatsPlayButton.setVisible(true);
                jResetStatsButton.setVisible(true);
            }else if (index>2 && listaUsuarios.existeUsuario(s))
                jListaStats.setListData(estadisticasToString(listaUsuarios.getUsuario(s)));
        }
    }//GEN-LAST:event_jListaStatsMouseClicked

    private void jStatsPlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatsPlayButtonActionPerformed
            miUsuario.problemaIntentado(problemaActivo);
            jProblemaTextArea.setText(problemaActivo.getTablero().toString());
            jPanelStats.setVisible(false);
            jPanelPartida.setVisible(true);
    }//GEN-LAST:event_jStatsPlayButtonActionPerformed

    private void jResetStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetStatsButtonActionPerformed
        jListaStats.setListData(estadisticasProblemas());
        jResetStatsButton.setVisible(false);
    }//GEN-LAST:event_jResetStatsButtonActionPerformed

    private void jRadioRegistroActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioLogin.isSelected())
            jRadioLogin.setSelected(false);
    }

    private void jAccederButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (jNombreTextField.getText().isEmpty() || "".equals(jPasswordField.getText()) || (!jRadioLogin.isSelected() && !jRadioRegistro.isSelected()))
            JOptionPane.showMessageDialog(this,"Compruebe que ningún campo esté vacío","ERROR",JOptionPane.ERROR_MESSAGE);
        else if (jRadioRegistro.isSelected()){
            if(!(listaUsuarios.addUsuario(new Usuario(jNombreTextField.getText(),jPasswordField.getText()))))
                JOptionPane.showMessageDialog(this,"Ya existe una cuenta con ese nombre","ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                miUsuario=listaUsuarios.getUsuario(jNombreTextField.getText());
                this.clasificacion = new Clasificacion();
                jPanelMenu.setVisible(true);
                jPanelLogin.setVisible(false);
            }
        } else if (jRadioLogin.isSelected()){
            if(!(listaUsuarios.existeUsuario(jNombreTextField.getText())))
                JOptionPane.showMessageDialog(this,"No existe cuenta con ese nombre","ERROR",JOptionPane.ERROR_MESSAGE);
            else if (!(listaUsuarios.getUsuario(jNombreTextField.getText()).getPwd().equals(jPasswordField.getText())))
                JOptionPane.showMessageDialog(this,"Contraseña incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                miUsuario=listaUsuarios.getUsuario(jNombreTextField.getText());
                this.clasificacion = new Clasificacion();
                jPanelMenu.setVisible(true);
                jPanelLogin.setVisible(false);
            }
        }
    }

    private void ioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelLogin.setVisible(false);
        jPanelIO.setVisible(true);
    }

    private void jMenuCerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelLogin.setVisible(true);
        jPanelMenu.setVisible(false);
    }

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioLoginActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioRegistro.isSelected())
            jRadioRegistro.setSelected(false);
    }

    private void jProblemasRadioActionPerformed(java.awt.event.ActionEvent evt) {
        if (jVictoriasRadio.isSelected())
            jVictoriasRadio.setSelected(false);
        clasificacion.ordenarNumProblemas();
        mostrarClasificacion();
    }

    private void jVolverClasificacionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelClasificacion.setVisible(false);
        jPanelMenu.setVisible(true);
    }

    private void jMenuClasificacionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelClasificacion.setVisible(true);
        jPanelMenu.setVisible(false);
    }

    private void jVolverStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(true);
        jPanelStats.setVisible(false);
    }

    private void jMenuStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(false);
        jListaStats.setListData(estadisticasProblemas());
        jPanelStats.setVisible(true);
    }

    private void jVolverPersonalStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(true);
        jPanelPersonalStats.setVisible(false);
    }

    private void jMenuPersonalStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(false);
        jPanelPersonalStats.setVisible(true);
        mostrarEstadisticas();
    }

    private void jVolverSubirProblemaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(true);
        jPanelSubirProblema.setVisible(false);
    }

    private void jRutaProblemaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuSubirProblemaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(false);
        jPanelSubirProblema.setVisible(true);
    }

    private void jVolverIOButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelLogin.setVisible(true);
        jPanelIO.setVisible(false);
    }
     private void jExportRadioActionPerformed(java.awt.event.ActionEvent evt) {
        if (jImportRadio.isSelected())
            jImportRadio.setSelected(false);
    }

    private void jImportRadioActionPerformed(java.awt.event.ActionEvent evt) {
        if (jExportRadio.isSelected())
            jExportRadio.setSelected(false);
    }

    

    private void jVictoriasRadioActionPerformed(java.awt.event.ActionEvent evt) {
        if (jProblemasRadio.isSelected())
            jProblemasRadio.setSelected(false);
        clasificacion.ordenarPorcentaje();
        mostrarClasificacion();
    }

    private void jSubirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            File file = new File(jRutaProblemaTextField.getText());
            listaProblemas.addProblema(new Problema(file));
            if (file != null){
                JOptionPane.showMessageDialog(this,"YUPI PROBLEMA AÑADIDO","CHUPICHUPI",JOptionPane.INFORMATION_MESSAGE);}
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR DE CARGA",JOptionPane.ERROR_MESSAGE);
        }
        jRutaProblemaTextField.setText("");
    }

    private void jVueltaPartidaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(true);
        jManualCheckMateRadio.setSelected(false);
        jPanelPartida.setVisible(false);
    }

    private void jMenuJugarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelMenu.setVisible(false);
        problemaActivo = listaProblemas.problemAleatorio(miUsuario);
        miUsuario.problemaIntentado(problemaActivo);
        jProblemaTextArea.setText(problemaActivo.getTablero().toString());
        jLabelProblema.setText("Problema "+ listaProblemas.getIndexOf(problemaActivo));
        jPanelPartida.setVisible(true);
    }

    private void jComprobarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(!jManualCheckMateRadio.isSelected()){
            if(problemaActivo.checkSol(jSolTextField.getText())){
                JOptionPane.showMessageDialog(this,"SOLUCION CORRECTA","FELICIDADES",JOptionPane.INFORMATION_MESSAGE);
                miUsuario.problemaResuelto(problemaActivo);
                jSolTextField.setText("");
                jManualCheckMateRadio.setSelected(false);
                jPanelMenu.setVisible(true);
                jPanelPartida.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"SOLUCION INCORRECTA","INTENTELO DE NUEVO",JOptionPane.WARNING_MESSAGE);
                miUsuario.problemaFallido(problemaActivo);
                jSolTextField.setText("");
            }
        }else{
            if(problemaActivo.checkMov(jSolTextField.getText())){
                JOptionPane.showMessageDialog(this,"SOLUCION CORRECTÍSIMA","MUCHAS FELICIDADES",JOptionPane.INFORMATION_MESSAGE);
                miUsuario.problemaResuelto(problemaActivo);
                jSolTextField.setText("");
                jManualCheckMateRadio.setSelected(false);
                jPanelMenu.setVisible(true);
                jPanelPartida.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"UPS, SOLUCION INCORRECTA","INTENTELO DE NUEVO",JOptionPane.WARNING_MESSAGE);
                miUsuario.problemaFallido(problemaActivo);
                jSolTextField.setText("");
            }
        }
    }

    private void jIOTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jIOButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (jImportRadio.isSelected()){
            try{
                listaProblemas.leerAlmacenProblemas(jIOTextField.getText());
                JOptionPane.showMessageDialog(this,jIOTextField.getText().toString()+" ha sido leido correctamente. "+"\n");
            }catch(IOException | ClassNotFoundException ioException){
                JOptionPane.showMessageDialog(this,"Error de lectura: "+ioException.getMessage(),"UPS...",JOptionPane.ERROR_MESSAGE);
            }       
        }else if(jExportRadio.isSelected()){
            try{
               listaProblemas.escribeAlmacenProblemas(jIOTextField.getText());
               JOptionPane.showMessageDialog(this, "Lista guardada en "+ jIOTextField1.getText().toString()+ "\n");
            }catch(IOException ioException){
                JOptionPane.showMessageDialog(this,"Error de escritura: "+ioException.getMessage(),"UPS...",JOptionPane.ERROR_MESSAGE);}
        }else
           JOptionPane.showMessageDialog(this,"Seleccione una opción","UPS...",JOptionPane.WARNING_MESSAGE);
    }

    private void jExportRadio1ActionPerformed(java.awt.event.ActionEvent evt) {
          if (jImportRadio1.isSelected())
            jImportRadio1.setSelected(false);
    }

    private void jIOButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jImportRadio1.isSelected()){
            try{
                listaUsuarios.leerAlmacenLogin(jIOTextField1.getText());
                JOptionPane.showMessageDialog(this,jIOTextField1.getText().toString()+" ha sido leido correctamente. "+"\n");
            }catch(IOException | ClassNotFoundException ioException){
                JOptionPane.showMessageDialog(this,"Error de lectura: "+ioException.getMessage(),"UPS...",JOptionPane.ERROR_MESSAGE);
            }
        }else if(jExportRadio1.isSelected()){
            try{
                listaUsuarios.escribeAlmacenLogin(jIOTextField1.getText());
                JOptionPane.showMessageDialog(this, "Lista guardada en "+ jIOTextField1.getText().toString()+ "\n");
            }catch(IOException ioException){
                JOptionPane.showMessageDialog(this,"Error de escritura: "+ioException.getMessage(),"UPS...",JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(this,"Seleccione una opción","UPS...",JOptionPane.WARNING_MESSAGE);
    }

    private void jIOTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jImportRadio1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jExportRadio1.isSelected())
            jExportRadio1.setSelected(false);
    }
    private void mostrarClasificacion(){
        jListaClasificacion.setListData(clasificacionToString());
    }
    private String[] clasificacionToString(){
        String ls[] = new String[clasificacion.getLista().size()+1];
        ls[0]="Nombre - Problemas intentados - Problemas resueltos - Errores totales - Porcentaje éxito";
        ArrayList<Usuario> list = new ArrayList<>(clasificacion.getLista());
        for (int i=0; i<list.size();i++){
            ls[i+1]=list.get(i).toString();
        }
        return ls;
    }
    private String[] estadisticasProblemas(){
        int size = listaProblemas.getListaProblemas().size();
        setVisible(true);
        String lista[] = new String[size];
        for (int i = 0; i < listaProblemas.getListaProblemas().size(); i++)
            lista[i] = "Problema "+(i+1); 
        return lista;
    }
    private void mostrarEstadisticas(){
        jListaPersonalStats.setListData(estadisticasToString(miUsuario));
    }
    
    private String[] estadisticasToString(Usuario u){
        String personalStats [] = new String[5]; //Tamaño fijo : atributos
        NumberFormat formatter = new DecimalFormat("#0.00");
        personalStats[0]= "Nombre: "+u.getNombre();
        personalStats[1]= "Problemas intentados: "+(String.valueOf(u.getProblemas_intentados()));
        personalStats[2]= "Problemas resueltos :"+(String.valueOf(u.getProblemas_resueltos()));
        personalStats[3]= "Errores totales: "+(String.valueOf(u.getErrores()));
        personalStats[4]= "Porcentaje exito: "+(String.valueOf(formatter.format(u.getPorcentaje_exito())))+"%";
        return personalStats;
    }
    
    private String[] mostrarProblema(int index){  
        Problema p = listaProblemas.getListaProblemas().get(index);
        int tamaño = p.getResuelto_por().size();
        String back[];
        if(!p.getResuelto_por().isEmpty()){
            back = new String[tamaño+3];
            back[2]="Usuarios que lo han resuelto: ";
        }else
            back = new String[tamaño+2];
        back[0]="Resuelto por: "+tamaño+" usuarios.";
        NumberFormat formatter = new DecimalFormat("#0.00");
        back[1]="Porcentaje de éxito= "+formatter.format(p.getPorcentaje_exito())+" %.";
        int i = 3;
        for (Usuario u : p.getResuelto_por()){
            back[i] = u.getNombre();
            i++;
        }return back;
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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ioButton;
    private javax.swing.JButton jAccederButton;
    private javax.swing.JButton jComprobarButton;
    private javax.swing.JRadioButton jExportRadio;
    private javax.swing.JRadioButton jExportRadio1;
    private javax.swing.JButton jIOButton;
    private javax.swing.JButton jIOButton1;
    private javax.swing.JTextField jIOTextField;
    private javax.swing.JTextField jIOTextField1;
    private javax.swing.JRadioButton jImportRadio;
    private javax.swing.JRadioButton jImportRadio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProblema;
    private javax.swing.JList<String> jListaClasificacion;
    private javax.swing.JList<String> jListaPersonalStats;
    private javax.swing.JList<String> jListaStats;
    private javax.swing.JRadioButton jManualCheckMateRadio;
    private javax.swing.JButton jMenuCerrarButton;
    private javax.swing.JButton jMenuClasificacionButton;
    private javax.swing.JButton jMenuJugarButton;
    private javax.swing.JButton jMenuPersonalStatsButton;
    private javax.swing.JButton jMenuStatsButton;
    private javax.swing.JButton jMenuSubirProblemaButton;
    private javax.swing.JTextField jNombreTextField;
    private javax.swing.JPanel jPanelClasificacion;
    private javax.swing.JPanel jPanelIO;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPartida;
    private javax.swing.JPanel jPanelPersonalStats;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JPanel jPanelSubirProblema;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextArea jProblemaTextArea;
    private javax.swing.JRadioButton jProblemasRadio;
    private javax.swing.JRadioButton jRadioLogin;
    private javax.swing.JRadioButton jRadioRegistro;
    private javax.swing.JButton jResetStatsButton;
    private javax.swing.JTextField jRutaProblemaTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jSolTextField;
    private javax.swing.JButton jStatsPlayButton;
    private javax.swing.JButton jSubirButton;
    private javax.swing.JRadioButton jVictoriasRadio;
    private javax.swing.JButton jVolverClasificacionButton;
    private javax.swing.JButton jVolverIOButton;
    private javax.swing.JButton jVolverPersonalStatsButton;
    private javax.swing.JButton jVolverStatsButton;
    private javax.swing.JButton jVolverSubirProblemaButton;
    private javax.swing.JButton jVueltaPartidaButton;
    // End of variables declaration//GEN-END:variables
}
