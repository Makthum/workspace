package com.ubc.ca.socketprogramming;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

public class test extends JFrame {

	private JPanel contentPane;
	private final JTextField textField1 = new JTextField();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(5, 0, 0, 0));
		contentPane.setFont(new Font("SWTOR Trajan", Font.BOLD, 15));
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(UIManager.getBorder("TextField.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField1.setBounds(197, 105, 157, 32);
		textField1.setMaximumSize(new Dimension(10, 10));
		textField1.setBorder(UIManager.getBorder("Spinner.border"));
		textField1.setBackground(SystemColor.control);
		textField1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(textField1);
		textField1.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("Login ");
		lblNewLabel_1.setBounds(170, 23, 80, 41);
		lblNewLabel_1.setPreferredSize(new Dimension(12, 8));
		lblNewLabel_1.setMaximumSize(new Dimension(14, 14));
		lblNewLabel_1.setFont(new Font("SWTOR Trajan", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name ");
		lblNewLabel_2.setBounds(49, 105, 134, 32);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setPreferredSize(new Dimension(14, 14));
		lblNewLabel_2.setFont(new Font("SWTOR Trajan", Font.BOLD, 15));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(49, 148, 105, 32);
		lblNewLabel.setFont(new Font("SWTOR Trajan", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 148, 157, 32);
		passwordField.setBorder(UIManager.getBorder("Spinner.border"));
		passwordField.setBackground(SystemColor.control);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBorder(UIManager.getBorder("TextPane.border"));
		btnNewButton.setBounds(396, 0, 54, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("_");
		btnNewButton_1.setBorder(UIManager.getBorder("RadioButtonMenuItem.border"));
		btnNewButton_1.setBounds(349, 0, 48, 23);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Let Me Chat !");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String textfield1=textField1.getText();
			System.out.print(textfield1);
			char[] passwordFd=passwordField.getPassword();
			System.out.print(passwordFd);
			}
		});
		btnNewButton_2.setFont(new Font("SWTOR Trajan", Font.BOLD, 12));
		btnNewButton_2.setBackground(new Color(51, 102, 255));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_2.setBounds(108, 220, 201, 23);
		contentPane.add(btnNewButton_2);
	}
}
