package DiagClases_M0;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Identificación {

 JFrame frmIdentificacin;
 private JPanel panel;
 private JLabel lblUsuario;
 private JLabel lblContrasea;
 private JTextField textusuario;
 private JButton btnAcceder;
 private JButton btnLimpiar;
 private JButton btnIn;
 private JButton btnEsp;
 private JPasswordField passwordcontraseña;
 private JButton button;
 private Border bordeRojo = BorderFactory.createLineBorder(Color.RED); 
 private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     Identificación window = new Identificación();
     window.frmIdentificacin.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 public Identificación() {
  initialize();
 }
 private void initialize() {
  frmIdentificacin = new JFrame();
  frmIdentificacin.getContentPane().setBounds(new Rectangle(0, 0, 500, 500));
  frmIdentificacin.setBounds(400, 200, 553, 330);
  //frmIdentificacin.setIconImage(Toolkit.getDefaultToolkit().getImage(Identificación.class.getResource("/presentacion/Captura de pantalla 2018-11-13 a las 13.19.02.png")));
  frmIdentificacin.setForeground(UIManager.getColor("FormattedTextField.selectionBackground"));
  
  frmIdentificacin.setTitle("IDENTIFICACIÓN");
  
  frmIdentificacin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  panel = new JPanel();
  panel.setFocusable(false);
  panel.setBounds(new Rectangle(0, 0, 500, 500));
  
  frmIdentificacin.getContentPane().add(panel, BorderLayout.WEST);
  
  btnEsp = new JButton("");
  btnEsp.setBorderPainted(false);
  btnEsp.setForeground(new Color(255, 255, 255));
  btnEsp.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/banderaEsp.gif")));
  
  btnIn = new JButton("");
  btnIn.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/banderaIng.gif")));
  btnIn.setBorderPainted(false);
  
  button = new JButton("");
  button.setBorderPainted(false);
  button.setBackground(new Color(238, 238, 238));
  button.setIcon(new ImageIcon(Identificación.class.getResource("/presentacion/Captura de pantalla 2018-11-14 a las 17_opt.png")));
  
  lblUsuario = new JLabel("Usuario:");
  
  textusuario = new JTextField();
 
  textusuario.addFocusListener(new TextusuarioFocusListener());
  textusuario.addKeyListener(new TextusuarioKeyListener());
 
  textusuario.setColumns(10);
  
  lblContrasea = new JLabel("Contraseña:");
  lblContrasea.setRequestFocusEnabled(false);
  lblContrasea.setEnabled(true);
  
  passwordcontraseña = new JPasswordField();
 
  passwordcontraseña.addFocusListener(new PasswordcontraseñaFocusListener());
  passwordcontraseña.addKeyListener(new PasswordcontraseñaKeyListener());

 passwordcontraseña.setEnabled(false);
  
  btnAcceder = new JButton("Acceder");
  btnAcceder.addActionListener(new BtnAccederActionListener());
  btnAcceder.setEnabled(false);
  
  btnLimpiar = new JButton("Limpiar");
  btnLimpiar.addActionListener(new
BtnLimpiarActionListener());
  GroupLayout gl_panel = new GroupLayout(panel);
  gl_panel.setHorizontalGroup(
   gl_panel.createParallelGroup(Alignment.LEADING)
    .addGroup(gl_panel.createSequentialGroup()
     .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(104)
       .addComponent(lblUsuario)
       .addPreferredGap(ComponentPlacement.RELATED)
       .addComponent(textusuario, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(84)
       .addComponent(lblContrasea)
       .addPreferredGap(ComponentPlacement.RELATED)
       .addComponent(passwordcontraseña, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(315)
       .addComponent(btnEsp)
       .addGap(5)
       .addComponent(btnIn)
       .addGap(5)
       .addComponent(button))
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(179)
       .addComponent(btnAcceder)
       .addPreferredGap(ComponentPlacement.UNRELATED)
       .addComponent(btnLimpiar)))
     .addContainerGap(132, Short.MAX_VALUE))
  );
  gl_panel.setVerticalGroup(
   gl_panel.createParallelGroup(Alignment.LEADING)
    .addGroup(gl_panel.createSequentialGroup()
     .addGap(9)
     .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(3)
       .addComponent(btnEsp))
      .addGroup(gl_panel.createSequentialGroup()
       .addGap(3)
       .addComponent(btnIn))
      .addComponent(button))
     .addGap(35)
     .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
      .addComponent(lblUsuario)
      .addComponent(textusuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
     .addGap(36)
     .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
      .addComponent(lblContrasea)
      .addComponent(passwordcontraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
     .addGap(46)
     .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
      .addComponent(btnAcceder)
      .addComponent(btnLimpiar))
     .addContainerGap(71, Short.MAX_VALUE))
  );
  panel.setLayout(gl_panel);
 }
 

 private class BtnLimpiarActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   textusuario.setText("");
   passwordcontraseña.setText("");
  
  }
 
 }
 
 private class BtnAccederActionListener implements ActionListener {
  public void actionPerformed(ActionEvent arg0) {
   
   menu me = new menu();
   me.frame.setVisible(true);
 
  }
 }
 
 private class TextusuarioKeyListener extends KeyAdapter {
  
  public void keyReleased(KeyEvent e) {
   if (textusuario.getText().equals("nerea")) {
    textusuario.setBorder(bordeVerde);
    lblUsuario.setIcon(new ImageIcon (Identificación.class.getResource("/presentacion/ti_opt.png")));
    passwordcontraseña.setEnabled(true);
    passwordcontraseña.requestFocus();
   }
   else {
    textusuario.setBorder(bordeRojo);
    lblUsuario.setIcon(new ImageIcon (Identificación.class.getResource("/presentacion/c.png")));
   }
  }
 }
 private class PasswordcontraseñaKeyListener extends KeyAdapter {

  public void keyReleased(KeyEvent e) {
   String password="hola";
   if (String.valueOf(passwordcontraseña.getPassword()).equals(password)) {
   
    passwordcontraseña.setBorder(bordeVerde);
    lblContrasea.setIcon(new ImageIcon (Identificación.class.getResource("/presentacion/ti_opt.png")));
    btnAcceder.setEnabled(true);
   }
   else {
    passwordcontraseña.setBorder(bordeRojo);
    lblContrasea.setIcon(new ImageIcon (Identificación.class.getResource("/presentacion/c.png")));
    btnAcceder.setEnabled(false);
   }
   
  }
 }
 private class TextusuarioFocusListener extends FocusAdapter {

  public void focusGained(FocusEvent e) {
   textusuario.setBackground(new Color(250,250,210));
  }
 
  public void focusLost(FocusEvent e) {

   textusuario.setBackground(new C
olor(250,250,250));
  }
 }
 private class PasswordcontraseñaFocusListener extends FocusAdapter {

  public void focusGained(FocusEvent e) {
   passwordcontraseña.setBackground(new Color(250,250,210));
  }
  
  public void focusLost(FocusEvent e) {
   passwordcontraseña.setBackground(new Color(250,250,250));
  }
 }

 
 
}
/*
public class Autenticarse {

	private string usuario;
	private string password;
	private int prioridad;
	
	public static void main(args) {
		System.out.print("Introduce usuario");
		System.out.print("Introduce password");
	}

	public string getUsuario() {
		return this.usuario;
	}

	public void setUsuario(string usuario) {
		this.usuario = usuario;
	}

	public string getPassword() {
		return this.password;
	}

	public void setPassword(string password) {
		this.password = password;
	}

	public int getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public void login() {
		// TODO - implement Autenticarse.login
		throw new UnsupportedOperationException();
	}

}
*/
