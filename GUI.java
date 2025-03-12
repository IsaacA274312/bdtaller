/*
 * import java.awt.Color;
 * import java.awt.Font;
 * import java.sql.SQLException;
 * import java.util.logging.Level;
 * import java.util.logging.Logger;
 * import javax.swing.*;
 * 
 * public class GUI extends JFrame {
 * private JPanel mainPanel;
 * private JPanel loginPanel;
 * private JTextField usernameField;
 * private JPasswordField passwordField;
 * private JButton loginButton;
 * private JLabel usernameLabel;
 * private JLabel passwordLabel;
 * private JLabel titleLabel;
 * private JLabel iconLabel;
 * 
 * public GUI() {
 * initialize();
 * }
 * 
 * private void initialize() {
 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * setTitle("Iniciar Sesión");
 * setBackground(new Color(0, 0, 255));
 * 
 * mainPanel = new JPanel();
 * mainPanel.setBackground(new Color(153, 204, 255));
 * mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 * 
 * loginPanel = new JPanel();
 * loginPanel.setBackground(new Color(255, 255, 255));
 * loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
 * 
 * titleLabel = new JLabel("Iniciar Sesión");
 * titleLabel.setFont(new java.awt.Font("Sitka Text", Font.BOLD, 24));
 * titleLabel.setForeground(Color.WHITE);
 * titleLabel.setAlignmentX(CENTER_ALIGNMENT);
 * 
 * usernameLabel = new JLabel("Usuario:");
 * usernameField = new JTextField(20);
 * usernameField.setFont(new java.awt.Font("Perpetua", Font.BOLD, 18));
 * usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,
 * Color.BLACK));
 * 
 * passwordLabel = new JLabel("Contraseña:");
 * passwordField = new JPasswordField(20);
 * passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,
 * Color.BLACK));
 * 
 * loginButton = new JButton("Iniciar Sesión");
 * loginButton.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
 * loginButton.setForeground(new Color(0, 153, 153));
 * loginButton.setBackground(Color.WHITE);
 * loginButton.setBorder(BorderFactory.createEtchedBorder());
 * loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
 * loginButton.addActionListener(e -> loginButtonActionPerformed());
 * loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
 * public void mouseEntered(java.awt.event.MouseEvent evt) {
 * loginButton.setBackground(Color.GRAY);
 * }
 * 
 * public void mouseExited(java.awt.event.MouseEvent evt) {
 * loginButton.setBackground(Color.WHITE);
 * }
 * });
 * 
 * iconLabel = new JLabel(new
 * ImageIcon(getClass().getResource("/Imagenes/perfil-del-usuario (1).png")));
 * 
 * loginPanel.add(Box.createVerticalStrut(20));
 * loginPanel.add(usernameLabel);
 * loginPanel.add(usernameField);
 * loginPanel.add(Box.createVerticalStrut(10));
 * loginPanel.add(passwordLabel);
 * loginPanel.add(passwordField);
 * loginPanel.add(Box.createVerticalStrut(20));
 * loginPanel.add(loginButton);
 * loginPanel.add(Box.createVerticalStrut(20));
 * 
 * mainPanel.add(Box.createVerticalStrut(20));
 * mainPanel.add(titleLabel);
 * mainPanel.add(Box.createVerticalStrut(20));
 * mainPanel.add(loginPanel);
 * mainPanel.add(Box.createVerticalStrut(20));
 * 
 * add(mainPanel);
 * pack();
 * setLocationRelativeTo(null);
 * }
 * 
 * private void loginButtonActionPerformed() {
 * conexion bd = new conexion();
 * bd.setUSUARIO(usernameField.getText());
 * bd.setCONTRASEÑA(new String(passwordField.getPassword()));
 * try {
 * bd.iniciar_conexion();
 * } catch (SQLException ex) {
 * Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
 * }
 * this.dispose();
 * }
 * 
 * 
 * public static void main(String[] args) {
 * try {
 * UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
 * } catch (ClassNotFoundException | InstantiationException |
 * IllegalAccessException | UnsupportedLookAndFeelException ex) {
 * Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
 * }
 * 
 * java.awt.EventQueue.invokeLater(() -> {
 * new GUI().setVisible(true);
 * });
 * }
 * }
 */
