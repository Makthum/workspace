package com.ubc.ca.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;

public class ChatWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindow frame = new ChatWindow();
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
	public ChatWindow() {
		setVisible(true);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(345, 220, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 245, 238));
		textPane.setBorder(UIManager.getBorder("TextField.border"));
		textPane.setBounds(0, 0, 434, 209);
		contentPane.add(textPane);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 240, 245));
		textField.setBounds(0, 252, 340, 37);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
