import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewMember extends JFrame {
	private final JFrame frameN;
	JPanel contentPane;
	JTextField fnameField;
	JTextField lnameField;
	JTextField passField;
	JTextField rePassField;
	JTextField userNameField;
	JTextField phoneNoField;
	JTextField emailField;
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DATABASE_URL = "jdbc:mysql://localhost/Registerr";

	
	Connection con = null;
	private JTextField idField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public NewMember() {
		frameN = this;
		frameN.setLocationRelativeTo(null);
		frameN.setResizable(false);
		con = Connector.dbconnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("First name :");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(new Color(0, 0, 51));
		label.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label.setBounds(10, 71, 108, 22);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Last name :");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(0, 0, 51));
		label_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_1.setBounds(10, 104, 108, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Password :");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(new Color(0, 0, 51));
		label_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_2.setBounds(10, 137, 108, 22);
		contentPane.add(label_2);
		
		fnameField = new JTextField();
		fnameField.setSelectionColor(new Color(255, 215, 0));
		fnameField.setOpaque(false);
		fnameField.setForeground(Color.BLACK);
		fnameField.setFont(new Font("Rockwell", Font.BOLD, 13));
		fnameField.setDisabledTextColor(Color.BLACK);
		fnameField.setColumns(10);
		fnameField.setCaretColor(Color.WHITE);
		fnameField.setBorder(UIManager.getBorder("CheckBox.border"));
		fnameField.setBackground(Color.BLACK);
		fnameField.setBounds(128, 75, 213, 20);
		contentPane.add(fnameField);
		
		lnameField = new JTextField();
		lnameField.setSelectionColor(new Color(255, 215, 0));
		lnameField.setOpaque(false);
		lnameField.setForeground(Color.BLACK);
		lnameField.setFont(new Font("Rockwell", Font.BOLD, 13));
		lnameField.setDisabledTextColor(Color.BLACK);
		lnameField.setColumns(10);
		lnameField.setCaretColor(Color.LIGHT_GRAY);
		lnameField.setBorder(UIManager.getBorder("CheckBox.border"));
		lnameField.setBackground(Color.BLACK);
		lnameField.setBounds(128, 106, 213, 20);
		contentPane.add(lnameField);
		
		passField = new JTextField();
		passField.setSelectionColor(new Color(255, 215, 0));
		passField.setOpaque(false);
		passField.setForeground(Color.BLACK);
		passField.setFont(new Font("Rockwell", Font.BOLD, 13));
		passField.setDisabledTextColor(Color.BLACK);
		passField.setColumns(10);
		passField.setCaretColor(Color.LIGHT_GRAY);
		passField.setBorder(UIManager.getBorder("CheckBox.border"));
		passField.setBackground(Color.BLACK);
		passField.setBounds(128, 139, 213, 20);
		contentPane.add(passField);
		
		JLabel label_3 = new JLabel("Re-type password:");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(new Color(0, 0, 51));
		label_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_3.setBounds(10, 170, 108, 22);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Experiance");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(new Color(0, 0, 51));
		label_4.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_4.setBounds(10, 305, 108, 22);
		contentPane.add(label_4);
		
		JLabel lblLibrary = new JLabel("Library :");
		lblLibrary.setHorizontalAlignment(SwingConstants.LEFT);
		lblLibrary.setForeground(new Color(0, 0, 51));
		lblLibrary.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		lblLibrary.setBounds(10, 203, 108, 22);
		contentPane.add(lblLibrary);
		
		JLabel label_6 = new JLabel("Username:");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(new Color(0, 0, 51));
		label_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_6.setBounds(10, 368, 108, 22);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Phone No:  +251");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(new Color(0, 0, 51));
		label_7.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_7.setBounds(10, 236, 108, 27);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setForeground(new Color(0, 0, 51));
		label_8.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		label_8.setBounds(10, 269, 108, 22);
		contentPane.add(label_8);
		
		rePassField = new JTextField();
		rePassField.setSelectionColor(new Color(255, 215, 0));
		rePassField.setOpaque(false);
		rePassField.setForeground(Color.BLACK);
		rePassField.setFont(new Font("Rockwell", Font.BOLD, 13));
		rePassField.setDisabledTextColor(Color.BLACK);
		rePassField.setColumns(10);
		rePassField.setCaretColor(Color.LIGHT_GRAY);
		rePassField.setBorder(UIManager.getBorder("CheckBox.border"));
		rePassField.setBackground(Color.BLACK);
		rePassField.setBounds(128, 170, 213, 20);
		contentPane.add(rePassField);
		
		userNameField = new JTextField();
		userNameField.setSelectionColor(new Color(255, 215, 0));
		userNameField.setOpaque(false);
		userNameField.setForeground(Color.BLACK);
		userNameField.setFont(new Font("Rockwell", Font.BOLD, 13));
		userNameField.setDisabledTextColor(Color.BLACK);
		userNameField.setColumns(10);
		userNameField.setCaretColor(Color.LIGHT_GRAY);
		userNameField.setBorder(UIManager.getBorder("CheckBox.border"));
		userNameField.setBackground(Color.BLACK);
		userNameField.setBounds(128, 370, 213, 20);
		contentPane.add(userNameField);
		
		phoneNoField = new JTextField();
		phoneNoField.setSelectionColor(new Color(255, 215, 0));
		phoneNoField.setOpaque(false);
		phoneNoField.setForeground(Color.BLACK);
		phoneNoField.setFont(new Font("Rockwell", Font.BOLD, 13));
		phoneNoField.setDisabledTextColor(Color.BLACK);
		phoneNoField.setColumns(10);
		phoneNoField.setCaretColor(Color.LIGHT_GRAY);
		phoneNoField.setBorder(UIManager.getBorder("CheckBox.border"));
		phoneNoField.setBackground(Color.BLACK);
		phoneNoField.setBounds(128, 239, 213, 20);
		contentPane.add(phoneNoField);
  
  }
