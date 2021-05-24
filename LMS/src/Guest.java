import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Guest extends JFrame {
	private final JFrame frame;
	private JPanel contentPane;
	private JTextField txtIcpcDevelopmentClub;
	public Guest() {
		frame = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIcpcDevelopmentClub = new JTextField();
		txtIcpcDevelopmentClub.setEnabled(false);
		txtIcpcDevelopmentClub.setEditable(false);
		txtIcpcDevelopmentClub.setDisabledTextColor(Color.BLACK);
		txtIcpcDevelopmentClub.setFont(new Font("Jokerman", Font.BOLD, 16));
		txtIcpcDevelopmentClub.setHorizontalAlignment(SwingConstants.CENTER);
		txtIcpcDevelopmentClub.setText("Handy Library Management System");
		txtIcpcDevelopmentClub.setBackground(Color.LIGHT_GRAY);
		txtIcpcDevelopmentClub.setBounds(57, 11, 311, 45);
		contentPane.add(txtIcpcDevelopmentClub);
		txtIcpcDevelopmentClub.setColumns(10);
		
		JTextArea txtrDuringTheLast = new JTextArea();
		txtrDuringTheLast.setDisabledTextColor(Color.BLACK);
		txtrDuringTheLast.setEnabled(false);
		txtrDuringTheLast.setEditable(false);
		txtrDuringTheLast.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrDuringTheLast.setText("This desktop application, a handy library management system, is an offline university library management system. Our software is designed to mitigate problems that are being faced by the library staff. After identification of the problem, we developed a software or desktop application that uses a complex database system to facilitate the workflow in the library and efficiently keep track of library resources. It\u2019s inadvisable and inefficient to use paperwork in today\u2019s world, so the application we developed will enable the library to conduct its day-to-day activities efficiently and effectively.\r\nBooks and student maintenance modules are also included in this system which would\r\nkeep track of the students using the library and also a detailed description of the\r\nbooks a library contains. With this computerized system, there will be no loss of book\r\nrecords or member records which generally happens when a non-computerized system is used.");
		txtrDuringTheLast.setLineWrap(true);
		txtrDuringTheLast.setWrapStyleWord(true);
		txtrDuringTheLast.setBackground(Color.GRAY);
		txtrDuringTheLast.setBounds(10, 68, 414, 324);
		contentPane.add(txtrDuringTheLast);
		
		JButton button = new JButton("Back");
		button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					LgIn l = new LgIn();
					l.setLocationRelativeTo(null);
					l.setVisible(true);
					
				}
		});
		button.setForeground(new Color(0, 51, 51));
		button.setFont(new Font("Sitka Display", Font.BOLD, 14));
		button.setBorder(UIManager.getBorder("Button.border"));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(332, 400, 92, 27);
		contentPane.add(button);
	}
}
