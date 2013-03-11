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

public class test extends JFrame {

	private JPanel contentPane;
	private final JTextField textField = new JTextField();
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
		contentPane.setFont(new Font("SWTOR Trajan", Font.BOLD | Font.ITALIC, 15));
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(51, 0, 0), null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField.setBounds(197, 105, 157, 32);
		textField.setMaximumSize(new Dimension(10, 10));
		textField.setBorder(UIManager.getBorder("Spinner.border"));
		textField.setBackground(SystemColor.control);
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(textField);
		textField.setColumns(5);
		
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
		lblNewLabel.setBounds(49, 148, 105, 32);
		lblNewLabel.setFont(new Font("SWTOR Trajan", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 148, 157, 32);
		passwordField.setBorder(UIManager.getBorder("Spinner.border"));
		passwordField.setBackground(SystemColor.control);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBounds(411, 0, 39, 23);
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
		btnNewButton_1.setBounds(373, 0, 39, 23);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(btnNewButton_1);
	}
}
