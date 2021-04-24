import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuItem;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField finame;
	private JTextField textField_1;
	private JTextField txtAnswer;
	private JTextField passText;
	private JTextField fnameField;
	private JTextField lnameField;
	private JTextField passField;
	private JTextField rePassField;
	private JTextField secAnsField;
	private JTextField userField;
	private JTextField emailField;
	private JTextField phoneNoField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DATABASE_URL = "jdbc:mysql://localhost/Library";

	Connection con = null;
	private JTextField txtTitle;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPublisher;
	private JTextField txtIsbnxxxxxxxx;
	private JTextField txtPublishedDateYyyymmdd;
	private JTextField txtPageNumber;
	private JTextField txtSeries;
	private JTextField txtVol;
	private JTextField textField_3;
	private JTextField textFieldPic;
	static Main frame;
	private JTextField txtDpublishedDateYyyymmdd;
	private JTextField txtDueDateYyyymmdd;
	private JTextField txtBorrowersName;
	private JTextField txtAuthor;
	private JTextField txtTitle_1;
	private JTextField txtAccessionNo;
	private JTextField txtCirculation;
	private JTextField txtSignature;
	private JTextField txtAttendant;
	private JTextField txtBorrowersLastname;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Main() {
		Image back = new ImageIcon(this.getClass().getResource("icons/library3.png")).getImage();
		Image user = new ImageIcon(this.getClass().getResource("icons/user.png")).getImage();
		Image lock = new ImageIcon(this.getClass().getResource("icons/locky.png")).getImage();
		Image imenu1 = new ImageIcon(this.getClass().getResource("icons/007-open-book.png")).getImage();
		Image imenu2 = new ImageIcon(this.getClass().getResource("icons/001-book.png")).getImage();
		Image imenu3 = new ImageIcon(this.getClass().getResource("icons/005-book-2.png")).getImage();
		Image imenu4 = new ImageIcon(this.getClass().getResource("icons/004-book-1.png")).getImage();
		Image imenu5 = new ImageIcon(this.getClass().getResource("icons/001-book.png")).getImage();
		Image imenu6 = new ImageIcon(this.getClass().getResource("icons/008-book-4.png")).getImage();
		Image iback3 = new ImageIcon(this.getClass().getResource("icons/newback.png")).getImage();
		Image iback4 = new ImageIcon(this.getClass().getResource("icons/6.png")).getImage();
		
		con = Connector.dbconnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel Login = new JPanel();
		Login.setBackground(Color.GRAY);
		contentPane.add(Login, "name_21399719639800");
		
		Login.setLayout(null);
		
		textField = new JTextField();
		textField.setSelectionColor(SystemColor.scrollbar);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textField.setDisabledTextColor(Color.WHITE);
		textField.setColumns(10);
		textField.setCaretColor(Color.WHITE);
		textField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(304, 158, 206, 29);
		Login.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter your password here");
		passwordField.setSelectionColor(SystemColor.scrollbar);
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(304, 217, 206, 29);
		Login.add(passwordField);
		
		JPanel NewMember = new JPanel();
		NewMember.setBackground(Color.GRAY);
		contentPane.add(NewMember, "name_21690578538100");
		NewMember.setLayout(null);
		
		JButton button = new JButton("Back");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewMember.getInputContext().endComposition();
				NewMember.getInputContext().dispose();
				NewMember.setVisible(false);
				Login.setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Bell MT", Font.BOLD, 14));
		button.setBackground(new Color(230, 230, 250));
		button.setAlignmentX(0.5f);
		button.setBounds(10, 11, 71, 29);
		NewMember.add(button);
		
		fnameField = new JTextField();
		fnameField.setText("Firstname");
		fnameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (fnameField.getText().equals("Firstname")){
					fnameField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (fnameField.getText().equals("")){
					fnameField.setText("Firstname");
				}
			}
		});
		fnameField.setSelectionColor(SystemColor.scrollbar);
		fnameField.setForeground(Color.BLACK);
		fnameField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		fnameField.setDisabledTextColor(Color.WHITE);
		fnameField.setColumns(10);
		fnameField.setCaretColor(Color.WHITE);
		fnameField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		fnameField.setBackground(Color.LIGHT_GRAY);
		fnameField.setBounds(136, 50, 264, 29);
		NewMember.add(fnameField);
		
		lnameField = new JTextField();
		lnameField.setText("Lastname");
		lnameField.setSelectionColor(SystemColor.scrollbar);
		lnameField.setForeground(Color.BLACK);
		lnameField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		lnameField.setDisabledTextColor(Color.WHITE);
		lnameField.setColumns(10);
		lnameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (lnameField.getText().equals("Lastname")){
					lnameField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (lnameField.getText().equals("")){
					lnameField.setText("Lastname");
				}
			}
		});
		lnameField.setCaretColor(Color.WHITE);
		lnameField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		lnameField.setBackground(Color.LIGHT_GRAY);
		lnameField.setBounds(410, 50, 264, 29);
		NewMember.add(lnameField);
		
		passField = new JTextField();
		passField.setText("Password");
		passField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (passField.getText().equals("Password")){
					passField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (passField.getText().equals("")){
					passField.setText("Password");
				}
			}
		});
		passField.setSelectionColor(SystemColor.scrollbar);
		passField.setForeground(Color.BLACK);
		passField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		passField.setDisabledTextColor(Color.WHITE);
		passField.setColumns(10);
		passField.setCaretColor(Color.WHITE);
		passField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		passField.setBackground(Color.LIGHT_GRAY);
		passField.setBounds(136, 90, 264, 29);
		NewMember.add(passField);
		
		rePassField = new JTextField();
		rePassField.setText("Re-type password");
		rePassField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (rePassField.getText().equals("Re-type password")){
					rePassField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (rePassField.getText().equals("")){
					rePassField.setText("Re-type password");
				}
			}
		});
		rePassField.setSelectionColor(SystemColor.scrollbar);
		rePassField.setForeground(Color.BLACK);
		rePassField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		rePassField.setDisabledTextColor(Color.WHITE);
		rePassField.setColumns(10);
		rePassField.setCaretColor(Color.WHITE);
		rePassField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		rePassField.setBackground(Color.LIGHT_GRAY);
		rePassField.setBounds(136, 130, 264, 29);
		NewMember.add(rePassField);
		
		secAnsField = new JTextField();
		secAnsField.setText("Your answer");
		secAnsField.setSelectionColor(SystemColor.scrollbar);
		secAnsField.setForeground(Color.BLACK);
		secAnsField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		secAnsField.setDisabledTextColor(Color.WHITE);
		secAnsField.setColumns(10);
		secAnsField.setCaretColor(Color.WHITE);
		secAnsField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		secAnsField.setBackground(Color.LIGHT_GRAY);
		secAnsField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (secAnsField.getText().equals("Your answer")){
					secAnsField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (secAnsField.getText().equals("")){
					secAnsField.setText("Your answer");
				}
			}
		});
		secAnsField.setBounds(136, 322, 264, 29);
		NewMember.add(secAnsField);
		
		JRadioButton radioMButton = new JRadioButton("Male");
		radioMButton.setOpaque(false);
		radioMButton.setForeground(new Color(0, 0, 51));
		radioMButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		radioMButton.setBackground(Color.GRAY);
		radioMButton.setBounds(136, 206, 92, 29);
		buttonGroup.add(radioMButton);
		NewMember.add(radioMButton);
		
		JRadioButton radioFButton = new JRadioButton("Female");
		radioFButton.setOpaque(false);
		radioFButton.setForeground(new Color(0, 0, 51));
		radioFButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		radioFButton.setBackground(Color.GRAY);
		radioFButton.setBounds(230, 206, 92, 29);
		buttonGroup.add(radioFButton);
		NewMember.add(radioFButton);
		
		JComboBox secComboBox = new JComboBox();
		secComboBox.setModel(new DefaultComboBoxModel(new String[] {"What's your favourite movie?", "What do you like most?", "What's your nickname?"}));
		secComboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		secComboBox.setBackground(Color.LIGHT_GRAY);
		secComboBox.setBounds(136, 282, 264, 29);
		NewMember.add(secComboBox);
		
		JButton btnRegister = new JButton("Sign up");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = userField.getText();
				String fname = fnameField.getText();
				String lname = lnameField.getText();
				String email = emailField.getText();
				String pass = passField.getText();
				String rePass = rePassField.getText();
				String sec = secComboBox.getSelectedItem().toString();
				String secAns = secAnsField.getText();
				String phone = phoneNoField.getText();
				String sex = null;
								
				if(radioMButton.isSelected())
					sex = "M";
				else if(radioFButton.isSelected())
					sex = "F";
				
				try {
					String query = "INSERT INTO STAFF VALUES(?,?,?,?,?,?,?,?, ?)";
					PreparedStatement pst = con.prepareStatement(query);
					if(user.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your username", "Warning", 1);
						return;
					}else {
						pst.setString(1, user);
					}
					if(fname.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your first name", "Warning", 1);
						return;
					}else {
						pst.setString(2, fname);
					}
					if(lname.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your last name", "Warning", 1);
						return;
					}else {
						pst.setString(3, lname);
					}if(pass.isBlank() || rePass.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your password and re-type", "Warning", 1);
						return;
					}
					else if(!pass.equals(rePass)){
						JOptionPane.showMessageDialog(null, "Your password didn't match", "Warning", 1);
						return;
					}
					else {
						pst.setString(4, pass);
					}
					
					pst.setString(5, sec);
					pst.setString(6, secAns);
				    String regexx = "[0-9]{9}";
				   	if(phone.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your phone number", "Warning", 1);
						return;
					}else if (!phone.matches(regexx)) {
						JOptionPane.showMessageDialog(null, "Please enter valid phone number", "Warning", 1);
						return;
					}
					else {
						pst.setString(7, phone);
					}
					String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
					 
					Pattern pattern = Pattern.compile(regex);
					 
					Matcher matcher = pattern.matcher(email);
					boolean ans = matcher.matches();
					if(email.isBlank()) {
						JOptionPane.showMessageDialog(null, "Please enter your email address", "Warning", 1);
						return;
					}else if (!ans) {
						JOptionPane.showMessageDialog(null, "Please enter valid email address", "Warning", 1);
						return;
					}
					else {
						pst.setString(8, email);
					}
					if(radioMButton.isSelected() || radioFButton.isSelected()) {
						pst.setString(9, sex);
					}else {
						JOptionPane.showMessageDialog(null, "Please select your gender", "Warning", 1);
						return;
					}
					pst.execute();
					JOptionPane.showMessageDialog(null, String.format("Congrats %s, you have registered successfully!", fname),"Success", 1);
					pst.close();
					}
				catch(java.sql.SQLIntegrityConstraintViolationException e2) {
					JOptionPane.showMessageDialog(null, "This username belongs to another user. Please choose different username","Warning",1);
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnRegister.setToolTipText("Sign up for a new Account");
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Bell MT", Font.BOLD, 16));
		btnRegister.setBackground(new Color(230, 230, 250));
		btnRegister.setAlignmentX(0.5f);
		btnRegister.setBounds(39, 439, 99, 29);
		NewMember.add(btnRegister);
		
		userField = new JTextField();
		userField.setText("Enter your username");
		userField.setSelectionColor(SystemColor.scrollbar);
		userField.setForeground(Color.BLACK);
		userField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		userField.setDisabledTextColor(Color.WHITE);
		userField.setColumns(10);
		userField.setCaretColor(Color.WHITE);
		userField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (userField.getText().equals("Enter your username")){
					userField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (userField.getText().equals("")){
					userField.setText("Enter your username");
				}
			}
		});
		userField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		userField.setBackground(Color.LIGHT_GRAY);
		userField.setBounds(136, 170, 264, 29);
		NewMember.add(userField);
		
		emailField = new JTextField();
		emailField.setText("Enter your email");
		emailField.setSelectionColor(SystemColor.scrollbar);
		emailField.setForeground(Color.BLACK);
		emailField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		emailField.setDisabledTextColor(Color.WHITE);
		emailField.setColumns(10);
		emailField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (emailField.getText().equals("Enter your email")){
					emailField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (emailField.getText().equals("")){
					emailField.setText("Enter your email");
				}
			}
		});
		emailField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		emailField.setBackground(Color.LIGHT_GRAY);
		emailField.setBounds(136, 360, 264, 29);
		NewMember.add(emailField);
		
		phoneNoField = new JTextField();
		phoneNoField.setText("Phone no");
		phoneNoField.setSelectionColor(SystemColor.scrollbar);
		phoneNoField.setForeground(Color.BLACK);
		phoneNoField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		phoneNoField.setDisabledTextColor(Color.WHITE);
		phoneNoField.setColumns(10);
		phoneNoField.setCaretColor(Color.WHITE);
		phoneNoField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (phoneNoField.getText().equals("Phone no")){
					phoneNoField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (phoneNoField.getText().equals("")){
					phoneNoField.setText("Phone no");
				}
			}
		});
		phoneNoField.setBorder(UIManager.getBorder("DesktopIcon.border"));
		phoneNoField.setBackground(Color.LIGHT_GRAY);
		phoneNoField.setBounds(136, 242, 264, 29);
		NewMember.add(phoneNoField);
		
		JLabel back3 = new JLabel("");
		back3.setBounds(0, 0, 854, 491);
		back3.setIcon(new ImageIcon(iback3));
		NewMember.add(back3);
		
		JButton btnRegisterHere = new JButton("Register here");
		btnRegisterHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login.setVisible(false);
				NewMember.setVisible(true);
			}
		});
		btnRegisterHere.setToolTipText("Sign up for a new Account");
		btnRegisterHere.setForeground(Color.BLACK);
		btnRegisterHere.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnRegisterHere.setBackground(new Color(230, 230, 250));
		btnRegisterHere.setAlignmentX(0.5f);
		btnRegisterHere.setBounds(170, 412, 121, 29);
		Login.add(btnRegisterHere);
		
		JPanel ForgotPass = new JPanel();
		ForgotPass.setBackground(Color.GRAY);
		contentPane.add(ForgotPass, "name_4307740738000");
		ForgotPass.setLayout(null);
		
		JButton btnForgotPassword = new JButton("Forgot password ?");
		btnForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login.setVisible(false);
				ForgotPass.setVisible(true);
			}
		});
		btnForgotPassword.setToolTipText("Click here to retrieve your password");
		btnForgotPassword.setForeground(Color.BLACK);
		btnForgotPassword.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnForgotPassword.setBackground(new Color(230, 230, 250));
		btnForgotPassword.setAlignmentX(0.5f);
		btnForgotPassword.setBounds(334, 347, 152, 29);
		Login.add(btnForgotPassword);
		
		JLabel lblNewStaff = new JLabel("New staff ?");
		lblNewStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewStaff.setForeground(Color.WHITE);
		lblNewStaff.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblNewStaff.setBounds(60, 413, 100, 22);
		Login.add(lblNewStaff);
		
		JPanel Home = new JPanel();
		Home.setBackground(Color.GRAY);
		contentPane.add(Home, "name_67601937842500");
		Home.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String query = "SELECT * FROM STAFF WHERE  username = ? and password = ?";
					PreparedStatement pst = con.prepareStatement(query);
					String user_name = textField.getText();
					pst.setString(1, user_name);
					pst.setString(2, passwordField.getText());
					
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count++;
					}
					
					if(user_name == null)
						JOptionPane.showMessageDialog(null, "You haven't entered your username");
					else if(passwordField.getText() == null)
						JOptionPane.showMessageDialog(null, "You haven't entered your password");
					else if(count == 1){
						Login.setVisible(false);
						Home.setVisible(true);
						/*String q = "SELECT ADMIN FROM MEMBERS WHERE  User = ?";
						PreparedStatement p = con.prepareStatement(q);
						p.setString(1, user_name);
					
						ResultSet rset = pst.executeQuery();
						String admn = null;
						while (rset.next()) {
					        admn = rset.getString(11);
						}
						if (admn.equalsIgnoreCase("yes")) {
							Login.setVisible(false);
							Home.setVisible(true);
						}
						else {
							Login.setVisible(false);
							Home.setVisible(true);
						}*/
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect Username and password, Try Again!", "Warnning", 2);
					}
					rs.close();
					pst.close();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setAlignmentX(0.5f);
		btnLogin.setBounds(435, 270, 75, 29);
		Login.add(btnLogin);
		
		JLabel userLbl = new JLabel("");
		userLbl.setBounds(247, 149, 35, 48);
		userLbl.setIcon(new ImageIcon(user));
		Login.add(userLbl);
		
		JLabel label = new JLabel("");
		label.setBounds(247, 208, 35, 48);
		label.setIcon(new ImageIcon(lock));
		Login.add(label);
		
		JLabel backImg = new JLabel("");
		backImg.setBounds(0, 0, 854, 491);
		backImg.setIcon(new ImageIcon(back));
		Login.add(backImg);
		
		finame = new JTextField();
		finame.setText("Enter your firstname");
		finame.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (finame.getText().equals("Enter your firstname")){
					finame.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (finame.getText().equals("")){
					finame.setText("Enter your firstname");
				}
			}
		});
		finame.setSelectionColor(SystemColor.scrollbar);
		finame.setForeground(Color.BLACK);
		finame.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		finame.setDisabledTextColor(Color.WHITE);
		finame.setColumns(10);
		finame.setCaretColor(Color.WHITE);
		finame.setBorder(UIManager.getBorder("DesktopIcon.border"));
		finame.setBackground(Color.LIGHT_GRAY);
		finame.setBounds(243, 66, 275, 29);
		ForgotPass.add(finame);
		
		JButton btnSubmit = new JButton("Retrieve");
		btnSubmit.setToolTipText("Sign up for a new Account");
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		btnSubmit.setBackground(new Color(230, 230, 250));
		btnSubmit.setAlignmentX(0.5f);
		btnSubmit.setBounds(541, 215, 93, 29);
		ForgotPass.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass.setVisible(false);
				Login.setVisible(true);
				textField_1.setText("");
				finame.setText("");
				txtAnswer.setText("");
				passText.setText("");
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnBack.setBackground(new Color(230, 230, 250));
		btnBack.setAlignmentX(0.5f);
		btnBack.setBounds(10, 11, 71, 29);
		ForgotPass.add(btnBack);
		
		textField_1 = new JTextField();
		textField_1.setText("Enter your username");
		textField_1.setSelectionColor(SystemColor.scrollbar);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		textField_1.setDisabledTextColor(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("Enter your username")){
					textField_1.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().equals("")){
					textField_1.setText("Enter your username");
				}
			}
		});
		textField_1.setCaretColor(Color.WHITE);
		textField_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(243, 117, 275, 29);
		ForgotPass.add(textField_1);
		
		txtAnswer = new JTextField();
		txtAnswer.setText("Your security answer");
		txtAnswer.setSelectionColor(SystemColor.scrollbar);
		txtAnswer.setForeground(Color.BLACK);
		txtAnswer.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		txtAnswer.setDisabledTextColor(Color.WHITE);
		txtAnswer.setColumns(10);
		txtAnswer.setCaretColor(Color.WHITE);
		txtAnswer.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtAnswer.getText().equals("Your security answer")){
					txtAnswer.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtAnswer.getText().equals("")){
					txtAnswer.setText("Your security answer");
				}
			}
		});
		txtAnswer.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtAnswer.setBackground(Color.LIGHT_GRAY);
		
		txtAnswer.setBounds(243, 215, 275, 29);
		ForgotPass.add(txtAnswer);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What's your favourite movie?", "What do you like most?", "What's your nickname?"}));
		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(243, 165, 275, 29);
		ForgotPass.add(comboBox);
		
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String i = comboBox.getSelectedItem().toString();
				try {
					Statement stm = con.createStatement();
					String query = "SELECT * FROM STAFF WHERE USERNAME = ?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, textField_1.getText());
					ResultSet rs = pst.executeQuery();
					String first = null, user= null, sec_que= null, sec_ans= null, pass = null;
					while(rs.next()) {
						first = rs.getString(2);
						user = rs.getString(1);
						sec_que = rs.getString(5);
						sec_ans = rs.getString(6);
						pass = rs.getString(4);
						}
					if(user.equals(textField_1.getText()) && first.equals(finame.getText()) && sec_que.equals(comboBox.getSelectedItem()) && sec_ans.equals(txtAnswer.getText())){
						passText.setText(pass);
					}
				}catch(Exception e4){
					JOptionPane.showMessageDialog(null, "Please check your entries");
				}
			}
		});
		
		passText = new JTextField();
		passText.setSelectionColor(SystemColor.scrollbar);
		passText.setForeground(Color.BLACK);
		passText.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		passText.setDisabledTextColor(Color.WHITE);
		passText.setColumns(10);
		passText.setCaretColor(Color.WHITE);
		passText.setBorder(UIManager.getBorder("DesktopIcon.border"));
		passText.setBackground(Color.LIGHT_GRAY);
		passText.setBounds(243, 262, 275, 29);
		ForgotPass.add(passText);
		
		JLabel back4 = new JLabel("");
		back4.setBounds(0, 0, 854, 491);
		back4.setIcon(new ImageIcon(iback4));
		ForgotPass.add(back4);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				textField.setText("");
				passwordField.setText("");
				Login.setVisible(true);
			}
		});
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnLogout.setBackground(new Color(230, 230, 250));
		btnLogout.setAlignmentX(0.5f);
		btnLogout.setBounds(697, 424, 94, 29);
		Home.add(btnLogout);
		
		
		JLabel menu1 = new JLabel("Books");
		menu1.setBackground(new Color(255, 255, 255));
		menu1.setVerticalTextPosition(JLabel.BOTTOM);
		menu1.setToolTipText("Choose cars  to buy");
		menu1.setHorizontalTextPosition(JLabel.CENTER);
		menu1.setHorizontalAlignment(SwingConstants.CENTER);
		menu1.setForeground(new Color(255, 255, 255));
		menu1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu1.setBounds(127, 88, 84, 89);
		menu1.setIcon(new ImageIcon(imenu1));
		Home.add(menu1);
		
		JLabel menu2 = new JLabel("Issue Book");
		menu2.setVerticalTextPosition(SwingConstants.BOTTOM);
		menu2.setToolTipText("Choose cars  to buy");
		menu2.setHorizontalTextPosition(SwingConstants.CENTER);
		menu2.setHorizontalAlignment(SwingConstants.CENTER);
		menu2.setForeground(Color.WHITE);
		menu2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu2.setBackground(Color.WHITE);
		menu2.setBounds(374, 88, 84, 89);
		menu2.setIcon(new ImageIcon(imenu2));
		Home.add(menu2);
		
		JLabel menu3 = new JLabel("Return Book");
		menu3.setVerticalTextPosition(SwingConstants.BOTTOM);
		menu3.setToolTipText("Choose cars  to buy");
		menu3.setHorizontalTextPosition(SwingConstants.CENTER);
		menu3.setHorizontalAlignment(SwingConstants.CENTER);
		menu3.setForeground(Color.WHITE);
		menu3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu3.setBackground(Color.WHITE);
		menu3.setBounds(634, 88, 84, 89);
		menu3.setIcon(new ImageIcon(imenu3));
		Home.add(menu3);
		
		JLabel menu4 = new JLabel("Add Book");
		menu4.setVerticalTextPosition(SwingConstants.BOTTOM);
		menu4.setToolTipText("Choose cars  to buy");
		menu4.setHorizontalTextPosition(SwingConstants.CENTER);
		menu4.setHorizontalAlignment(SwingConstants.CENTER);
		menu4.setForeground(Color.WHITE);
		menu4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu4.setBackground(Color.WHITE);
		menu4.setBounds(127, 286, 84, 89);
		menu4.setIcon(new ImageIcon(imenu4));
		Home.add(menu4);
		
		JLabel menu5 = new JLabel("Wish List");
		menu5.setVerticalTextPosition(SwingConstants.BOTTOM);
		menu5.setToolTipText("Choose cars  to buy");
		menu5.setHorizontalTextPosition(SwingConstants.CENTER);
		menu5.setHorizontalAlignment(SwingConstants.CENTER);
		menu5.setForeground(Color.WHITE);
		menu5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu5.setBackground(Color.WHITE);
		menu5.setBounds(374, 286, 84, 89);
		menu5.setIcon(new ImageIcon(imenu5));
		Home.add(menu5);
		
		JLabel menu6 = new JLabel("Buy Car");
		menu6.setVerticalTextPosition(SwingConstants.BOTTOM);
		menu6.setToolTipText("Choose cars  to buy");
		menu6.setHorizontalTextPosition(SwingConstants.CENTER);
		menu6.setHorizontalAlignment(SwingConstants.CENTER);
		menu6.setForeground(Color.WHITE);
		menu6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menu6.setBackground(Color.WHITE);
		menu6.setBounds(634, 286, 84, 89);
		menu6.setIcon(new ImageIcon(imenu6));
		Home.add(menu6);
		
		JLabel back2 = new JLabel("");
		back2.setBounds(0, 0, 854, 491);
		back2.setIcon(new ImageIcon(back));
		Home.add(back2);
		
		JPanel Books = new JPanel();
		Books.setBackground(Color.GRAY);
		contentPane.add(Books, "name_78707278309400");
		Books.setLayout(null);
		
		Statement stm;
		Vector<Vector<Object>> dt = new Vector<Vector<Object>>();
		try {
			stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM STAFF");
			ResultSetMetaData metaData = res.getMetaData();
			int columns = metaData.getColumnCount();
			while(res.next()) {
				Vector<Object> row = new Vector<Object>(columns);
				for(int i = 1; i <= columns; i++) {
					row.addElement(res.getObject(i));
				}
				dt.addElement(row);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		Vector<String> columnNm = new Vector<String>();
		columnNm.addElement("FirstName");
		columnNm.addElement("LastName");
		columnNm.addElement("Email");
		columnNm.addElement("Password");
		columnNm.addElement("Department");
		columnNm.addElement("Academic Year");
		columnNm.addElement("Phone No");
		columnNm.addElement("Gender");
		columnNm.addElement("Username");
		columnNm.addElement("ID");
		columnNm.addElement("Administrator");
		
		table = new JTable(dt, columnNm);
		table.setRowMargin(3);
		table.setGridColor(Color.WHITE);
		table.setForeground(Color.WHITE);
		table.setForeground(new Color(255, 255, 255));
		table.getTableHeader().setFont(new Font("Book Antiqua", Font.BOLD, 13));
		table.setFont(new Font("Century", Font.PLAIN, 13));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setColumnSelectionAllowed(false);
		table.setBackground(Color.GRAY);
		
		JScrollPane scrollPanee = new JScrollPane(table);
		scrollPanee.setBounds(10, 106, 834, 374);
		scrollPanee.setVisible(true);
		scrollPanee.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		Books.add(scrollPanee);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 43, 22);
		Books.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("SansSerif", Font.PLAIN, 12));
		menuBar.add(mnMenu);
		
		JMenuItem home = new JMenuItem("New menu item");
		home.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnMenu.add(home);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Books.setVisible(false);
				Login.setVisible(true);
			}
		});
		mnMenu.add(mntmNewMenuItem);
		
		JButton button_5 = new JButton("Back");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Books.setVisible(false);
				Home.setVisible(true);
			}
		});
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Bell MT", Font.BOLD, 14));
		button_5.setBackground(new Color(230, 230, 250));
		button_5.setAlignmentX(0.5f);
		button_5.setBounds(773, 11, 71, 29);
		Books.add(button_5);
		
		JPanel IssueBook = new JPanel();
		IssueBook.setBackground(Color.GRAY);
		contentPane.add(IssueBook, "name_79366432286700");
		IssueBook.setLayout(null);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblIssueBook.setBounds(232, 11, 347, 29);
		IssueBook.add(lblIssueBook);
		
		txtDpublishedDateYyyymmdd = new JTextField();
		txtDpublishedDateYyyymmdd.setText("Date:    yyyy-mm-dd");
		txtDpublishedDateYyyymmdd.setSelectionColor(SystemColor.scrollbar);
		txtDpublishedDateYyyymmdd.setForeground(Color.BLACK);
		txtDpublishedDateYyyymmdd.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtDpublishedDateYyyymmdd.setDisabledTextColor(Color.WHITE);
		txtDpublishedDateYyyymmdd.setColumns(10);
		txtDpublishedDateYyyymmdd.setCaretColor(Color.WHITE);
		txtDpublishedDateYyyymmdd.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtDpublishedDateYyyymmdd.setBackground(Color.LIGHT_GRAY);
		txtDpublishedDateYyyymmdd.setBounds(10, 51, 235, 29);
		IssueBook.add(txtDpublishedDateYyyymmdd);
		
		txtDueDateYyyymmdd = new JTextField();
		txtDueDateYyyymmdd.setText("Due Date:    yyyy-mm-dd");
		txtDueDateYyyymmdd.setSelectionColor(SystemColor.scrollbar);
		txtDueDateYyyymmdd.setForeground(Color.BLACK);
		txtDueDateYyyymmdd.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtDueDateYyyymmdd.setDisabledTextColor(Color.WHITE);
		txtDueDateYyyymmdd.setColumns(10);
		txtDueDateYyyymmdd.setCaretColor(Color.WHITE);
		txtDueDateYyyymmdd.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtDueDateYyyymmdd.setBackground(Color.LIGHT_GRAY);
		txtDueDateYyyymmdd.setBounds(418, 51, 235, 29);
		IssueBook.add(txtDueDateYyyymmdd);
		
		txtBorrowersName = new JTextField();
		txtBorrowersName.setText("Borrower's firstname");
		txtBorrowersName.setSelectionColor(SystemColor.scrollbar);
		txtBorrowersName.setForeground(Color.BLACK);
		txtBorrowersName.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtBorrowersName.setDisabledTextColor(Color.WHITE);
		txtBorrowersName.setColumns(10);
		txtBorrowersName.setCaretColor(Color.WHITE);
		txtBorrowersName.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtBorrowersName.setBackground(Color.LIGHT_GRAY);
		txtBorrowersName.setBounds(10, 91, 288, 29);
		IssueBook.add(txtBorrowersName);
		
		txtAuthor = new JTextField();
		txtAuthor.setText("Author");
		txtAuthor.setSelectionColor(SystemColor.scrollbar);
		txtAuthor.setForeground(Color.BLACK);
		txtAuthor.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtAuthor.setDisabledTextColor(Color.WHITE);
		txtAuthor.setColumns(10);
		txtAuthor.setCaretColor(Color.WHITE);
		txtAuthor.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtAuthor.setBackground(Color.LIGHT_GRAY);
		txtAuthor.setBounds(10, 131, 347, 29);
		IssueBook.add(txtAuthor);
		
		txtTitle_1 = new JTextField();
		txtTitle_1.setText("Title");
		txtTitle_1.setSelectionColor(SystemColor.scrollbar);
		txtTitle_1.setForeground(Color.BLACK);
		txtTitle_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtTitle_1.setDisabledTextColor(Color.WHITE);
		txtTitle_1.setColumns(10);
		txtTitle_1.setCaretColor(Color.WHITE);
		txtTitle_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtTitle_1.setBackground(Color.LIGHT_GRAY);
		txtTitle_1.setBounds(10, 171, 347, 29);
		IssueBook.add(txtTitle_1);
		
		txtAccessionNo = new JTextField();
		txtAccessionNo.setText("Accession No");
		txtAccessionNo.setSelectionColor(SystemColor.scrollbar);
		txtAccessionNo.setForeground(Color.BLACK);
		txtAccessionNo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtAccessionNo.setDisabledTextColor(Color.WHITE);
		txtAccessionNo.setColumns(10);
		txtAccessionNo.setCaretColor(Color.WHITE);
		txtAccessionNo.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtAccessionNo.setBackground(Color.LIGHT_GRAY);
		txtAccessionNo.setBounds(10, 247, 411, 29);
		IssueBook.add(txtAccessionNo);
		
		txtCirculation = new JTextField();
		txtCirculation.setText("Circulation");
		txtCirculation.setSelectionColor(SystemColor.scrollbar);
		txtCirculation.setForeground(Color.BLACK);
		txtCirculation.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtCirculation.setDisabledTextColor(Color.WHITE);
		txtCirculation.setColumns(10);
		txtCirculation.setCaretColor(Color.WHITE);
		txtCirculation.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtCirculation.setBackground(Color.LIGHT_GRAY);
		txtCirculation.setBounds(10, 287, 347, 29);
		IssueBook.add(txtCirculation);
		
		txtSignature = new JTextField();
		txtSignature.setText("Signature");
		txtSignature.setSelectionColor(SystemColor.scrollbar);
		txtSignature.setForeground(Color.BLACK);
		txtSignature.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtSignature.setDisabledTextColor(Color.WHITE);
		txtSignature.setColumns(10);
		txtSignature.setCaretColor(Color.WHITE);
		txtSignature.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtSignature.setBackground(Color.LIGHT_GRAY);
		txtSignature.setBounds(10, 327, 347, 29);
		IssueBook.add(txtSignature);
		
		txtAttendant = new JTextField();
		txtAttendant.setText("Attendant");
		txtAttendant.setSelectionColor(SystemColor.scrollbar);
		txtAttendant.setForeground(Color.BLACK);
		txtAttendant.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtAttendant.setDisabledTextColor(Color.WHITE);
		txtAttendant.setColumns(10);
		txtAttendant.setCaretColor(Color.WHITE);
		txtAttendant.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtAttendant.setBackground(Color.LIGHT_GRAY);
		txtAttendant.setBounds(418, 327, 347, 29);
		IssueBook.add(txtAttendant);
		
		txtBorrowersLastname = new JTextField();
		txtBorrowersLastname.setText("Borrower's lastname");
		txtBorrowersLastname.setSelectionColor(SystemColor.scrollbar);
		txtBorrowersLastname.setForeground(Color.BLACK);
		txtBorrowersLastname.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtBorrowersLastname.setDisabledTextColor(Color.WHITE);
		txtBorrowersLastname.setColumns(10);
		txtBorrowersLastname.setCaretColor(Color.WHITE);
		txtBorrowersLastname.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtBorrowersLastname.setBackground(Color.LIGHT_GRAY);
		txtBorrowersLastname.setBounds(336, 91, 288, 29);
		IssueBook.add(txtBorrowersLastname);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.setToolTipText("Sign up for a new Account");
		btnIssue.setForeground(Color.BLACK);
		btnIssue.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnIssue.setBackground(new Color(230, 230, 250));
		btnIssue.setAlignmentX(0.5f);
		btnIssue.setBounds(40, 431, 91, 29);
		IssueBook.add(btnIssue);
		
		JButton button_1 = new JButton("Back");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IssueBook.setVisible(false);
				Home.setVisible(true);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Bell MT", Font.BOLD, 14));
		button_1.setBackground(new Color(230, 230, 250));
		button_1.setAlignmentX(0.5f);
		button_1.setBounds(10, 11, 71, 29);
		IssueBook.add(button_1);
		
		JPanel ReturnBook = new JPanel();
		ReturnBook.setBackground(Color.GRAY);
		contentPane.add(ReturnBook, "name_79381030595800");
		ReturnBook.setLayout(null);
		
		JButton button_2 = new JButton("Back");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReturnBook.setVisible(false);
				Home.setVisible(true);
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Bell MT", Font.BOLD, 14));
		button_2.setBackground(new Color(230, 230, 250));
		button_2.setAlignmentX(0.5f);
		button_2.setBounds(10, 11, 71, 29);
		ReturnBook.add(button_2);
		
		JPanel AddBook = new JPanel();
		AddBook.setBackground(Color.GRAY);
		contentPane.add(AddBook, "name_79390898065100");
		AddBook.setLayout(null);
		
		txtTitle = new JTextField();
		txtTitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTitle.setText("");
			}
		});
		txtTitle.setText("Title");
		txtTitle.setSelectionColor(SystemColor.scrollbar);
		txtTitle.setForeground(Color.BLACK);
		txtTitle.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtTitle.setDisabledTextColor(Color.WHITE);
		txtTitle.setColumns(10);
		txtTitle.setCaretColor(Color.WHITE);
		txtTitle.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtTitle.setBackground(Color.LIGHT_GRAY);
		txtTitle.setBounds(26, 47, 466, 29);
		AddBook.add(txtTitle);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First name");
		txtFirstName.setSelectionColor(SystemColor.scrollbar);
		txtFirstName.setForeground(Color.BLACK);
		txtFirstName.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtFirstName.setDisabledTextColor(Color.WHITE);
		txtFirstName.setColumns(10);
		txtFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFirstName.setText("");
			}
		});
		txtFirstName.setCaretColor(Color.WHITE);
		txtFirstName.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtFirstName.setBackground(Color.LIGHT_GRAY);
		txtFirstName.setBounds(26, 87, 219, 29);
		AddBook.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last name");
		txtLastName.setSelectionColor(SystemColor.scrollbar);
		txtLastName.setForeground(Color.BLACK);
		txtLastName.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtLastName.setDisabledTextColor(Color.WHITE);
		txtLastName.setColumns(10);
		txtLastName.setCaretColor(Color.WHITE);
		txtLastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLastName.setText("");
			}
		});
		txtLastName.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtLastName.setBackground(Color.LIGHT_GRAY);
		txtLastName.setBounds(273, 87, 219, 29);
		AddBook.add(txtLastName);
		
		txtPublisher = new JTextField();
		txtPublisher.setText("Publisher");
		txtPublisher.setSelectionColor(SystemColor.scrollbar);
		txtPublisher.setForeground(Color.BLACK);
		txtPublisher.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtPublisher.setDisabledTextColor(Color.WHITE);
		txtPublisher.setColumns(10);
		txtPublisher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPublisher.setText("");
			}
		});
		txtPublisher.setCaretColor(Color.WHITE);
		txtPublisher.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtPublisher.setBackground(Color.LIGHT_GRAY);
		txtPublisher.setBounds(26, 127, 219, 29);
		AddBook.add(txtPublisher);
		
		txtIsbnxxxxxxxx = new JTextField();
		txtIsbnxxxxxxxx.setText("ISBN 978xxxxxxxx");
		txtIsbnxxxxxxxx.setSelectionColor(SystemColor.scrollbar);
		txtIsbnxxxxxxxx.setForeground(Color.BLACK);
		txtIsbnxxxxxxxx.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtIsbnxxxxxxxx.setDisabledTextColor(Color.WHITE);
		txtIsbnxxxxxxxx.setColumns(10);
		txtIsbnxxxxxxxx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIsbnxxxxxxxx.setText("");
			}
		});
		txtIsbnxxxxxxxx.setCaretColor(Color.WHITE);
		txtIsbnxxxxxxxx.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtIsbnxxxxxxxx.setBackground(Color.LIGHT_GRAY);
		txtIsbnxxxxxxxx.setBounds(26, 167, 219, 29);
		AddBook.add(txtIsbnxxxxxxxx);
		
		txtPublishedDateYyyymmdd = new JTextField();
		txtPublishedDateYyyymmdd.setText("Published Date:    yyyy-mm-dd");
		txtPublishedDateYyyymmdd.setSelectionColor(SystemColor.scrollbar);
		txtPublishedDateYyyymmdd.setForeground(Color.BLACK);
		txtPublishedDateYyyymmdd.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtPublishedDateYyyymmdd.setDisabledTextColor(Color.WHITE);
		txtPublishedDateYyyymmdd.setColumns(10);
		txtPublishedDateYyyymmdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPublishedDateYyyymmdd.setText("");
			}
		});
		txtPublishedDateYyyymmdd.setCaretColor(Color.WHITE);
		txtPublishedDateYyyymmdd.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtPublishedDateYyyymmdd.setBackground(Color.LIGHT_GRAY);
		txtPublishedDateYyyymmdd.setBounds(26, 207, 251, 29);
		AddBook.add(txtPublishedDateYyyymmdd);
		
		txtPageNumber = new JTextField();
		txtPageNumber.setText("Page number");
		txtPageNumber.setSelectionColor(SystemColor.scrollbar);
		txtPageNumber.setForeground(Color.BLACK);
		txtPageNumber.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtPageNumber.setDisabledTextColor(Color.WHITE);
		txtPageNumber.setColumns(10);
		txtPageNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPageNumber.setText("");
			}
		});
		txtPageNumber.setCaretColor(Color.WHITE);
		txtPageNumber.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtPageNumber.setBackground(Color.LIGHT_GRAY);
		txtPageNumber.setBounds(26, 247, 219, 29);
		AddBook.add(txtPageNumber);
		
		txtSeries = new JTextField();
		txtSeries.setText("Series");
		txtSeries.setSelectionColor(SystemColor.scrollbar);
		txtSeries.setForeground(Color.BLACK);
		txtSeries.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtSeries.setDisabledTextColor(Color.WHITE);
		txtSeries.setColumns(10);
		txtSeries.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSeries.setText("");
			}
		});
		txtSeries.setCaretColor(Color.WHITE);
		txtSeries.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtSeries.setBackground(Color.LIGHT_GRAY);
		txtSeries.setBounds(26, 287, 167, 29);
		AddBook.add(txtSeries);
		
		txtVol = new JTextField();
		txtVol.setText("Vol");
		txtVol.setSelectionColor(SystemColor.scrollbar);
		txtVol.setForeground(Color.BLACK);
		txtVol.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtVol.setDisabledTextColor(Color.WHITE);
		txtVol.setColumns(10);
		txtVol.setCaretColor(Color.WHITE);
		txtVol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtVol.setText("");
			}
		});
		txtVol.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtVol.setBackground(Color.LIGHT_GRAY);
		txtVol.setBounds(273, 287, 167, 29);
		AddBook.add(txtVol);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Others", "Arts", "Business", "Children's Books", "Comics", "Education", "History", "Literature", "Social Sciences", "Travel"}));
		comboBox_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setBounds(26, 327, 264, 29);
		AddBook.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Page number");
		textField_3.setSelectionColor(SystemColor.scrollbar);
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		textField_3.setDisabledTextColor(Color.WHITE);
		textField_3.setColumns(10);
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setText("");
			}
		});
		textField_3.setCaretColor(Color.WHITE);
		textField_3.setBorder(UIManager.getBorder("DesktopIcon.border"));
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(26, 367, 219, 29);
		AddBook.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Add Book");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 11, 347, 29);
		AddBook.add(lblNewLabel);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setToolTipText("Sign up for a new Account");
		btnAddBook.setForeground(Color.BLACK);
		btnAddBook.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnAddBook.setBackground(new Color(230, 230, 250));
		btnAddBook.setAlignmentX(0.5f);
		btnAddBook.setBounds(26, 451, 121, 29);
		AddBook.add(btnAddBook);
		
		JLabel label_1 = new JLabel("");
		label_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		label_1.setBounds(574, 47, 218, 309);
		AddBook.add(label_1);
		
		JButton btnAddFrontCover = new JButton("Add Front Cover :");
		btnAddFrontCover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					JFileChooser file = new JFileChooser("C:\\Users\\Jack\\Desktop\\");
					FileNameExtensionFilter filter = new FileNameExtensionFilter("only .png and .jpg files","png", "jpg");
					file.setDialogTitle("Select a .png and .jpg files only");
					file.setFileFilter(filter);
					file.setAcceptAllFileFilterUsed(false);
					
					int returnVal = file.showOpenDialog(frame);
					if(returnVal == JFileChooser.APPROVE_OPTION) {
						File selectedFile = file.getSelectedFile();
						String filePath = selectedFile.getAbsolutePath();
						try {
							File source = new File(filePath);
							File dest = new File("C:\\Users\\Jack\\eclipse-workspace\\Final Pro\\src\\Cars\\" + selectedFile.getName());
							dest.setReadable(true);
							FileInputStream inStream = new FileInputStream(source);
							FileOutputStream outStream = new FileOutputStream(dest);
							
							byte[] buffer = new byte[1024];
							
							int length;
							
							while((length = inStream.read(buffer)) > 0) {
								outStream.write(buffer, 0, length);
							}
							if(inStream != null)inStream.close();
							if(outStream != null)outStream.close();
							
						}catch(Exception e2) {
							e2.printStackTrace();
						}
						textFieldPic.setText("/Cars/"+selectedFile.getName());
					}
					frame.getContentPane().add(file);
					file.setVisible(false);
			}
		});
		btnAddFrontCover.setToolTipText("Click here to add car pic");
		btnAddFrontCover.setOpaque(false);
		btnAddFrontCover.setForeground(Color.WHITE);
		btnAddFrontCover.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnAddFrontCover.setBackground(Color.GRAY);
		btnAddFrontCover.setBounds(404, 398, 152, 23);
		AddBook.add(btnAddFrontCover);
		
		textFieldPic = new JTextField();
		textFieldPic.setOpaque(false);
		textFieldPic.setForeground(Color.WHITE);
		textFieldPic.setFont(new Font("Sitka Display", Font.PLAIN, 16));
		textFieldPic.setColumns(10);
		textFieldPic.setCaretColor(Color.WHITE);
		textFieldPic.setBorder(UIManager.getBorder("DesktopIcon.border"));
		textFieldPic.setBounds(574, 399, 268, 27);
		AddBook.add(textFieldPic);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.setToolTipText("Sign up for a new Account");
		btnSubmit_1.setForeground(Color.BLACK);
		btnSubmit_1.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnSubmit_1.setBackground(new Color(230, 230, 250));
		btnSubmit_1.setAlignmentX(0.5f);
		btnSubmit_1.setBounds(574, 437, 86, 29);
		AddBook.add(btnSubmit_1);
		
		JButton button_3 = new JButton("Back");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddBook.setVisible(false);
				Home.setVisible(true);
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Bell MT", Font.BOLD, 14));
		button_3.setBackground(new Color(230, 230, 250));
		button_3.setAlignmentX(0.5f);
		button_3.setBounds(10, 10, 71, 29);
		AddBook.add(button_3);
		
		JPanel WishList = new JPanel();
		WishList.setBackground(Color.GRAY);
		contentPane.add(WishList, "name_79407087710900");
		WishList.setLayout(null);
		
		JButton button_4 = new JButton("Back");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WishList.setVisible(false);
				Home.setVisible(true);
			}
		});
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Bell MT", Font.BOLD, 14));
		button_4.setBackground(new Color(230, 230, 250));
		button_4.setAlignmentX(0.5f);
		button_4.setBounds(10, 11, 71, 29);
		WishList.add(button_4);
		
		menu1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu1.setOpaque(true);
				menu1.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu1.setOpaque(false);
				menu1.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				Books.setVisible(true);
			}
		});
		
		menu2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu2.setOpaque(true);
				menu2.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu2.setOpaque(false);
				menu2.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				IssueBook.setVisible(true);
			}
		});
		
		menu3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu3.setOpaque(true);
				menu3.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu3.setOpaque(false);
				menu3.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				ReturnBook.setVisible(true);
			}
		});
		
		menu4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu4.setOpaque(true);
				menu4.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu4.setOpaque(false);
				menu4.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				AddBook.setVisible(true);
			}
		});
		
		menu5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu5.setOpaque(true);
				menu5.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu5.setOpaque(false);
				menu5.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				WishList.setVisible(true);
			}
		});
		
		menu6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				menu6.setOpaque(true);
				menu6.setBackground(new Color(51,102,255));
			}
			public void mouseExited(MouseEvent e) {
				menu6.setOpaque(false);
				menu6.setBackground(null);
			}
			public void mouseClicked(MouseEvent e) {
				Home.setVisible(false);
				Login.setVisible(true);
			}
		});
	}
}
