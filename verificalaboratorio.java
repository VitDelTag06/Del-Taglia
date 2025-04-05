package verificalaboratorio;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class verificalaboratorio extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public verificalaboratorio() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importo:");
		lblNewLabel.setBounds(20, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Totale");
		lblNewLabel_1.setBounds(20, 75, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(70, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 72, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Bottone Calcola");
		btnNewButton.setBounds(223, 85, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Esci");
		btnNewButton_1.setBounds(335, 85, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eventuale sconto");
		lblNewLabel_2.setBounds(259, 11, 86, 14);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 36, 74, 22);
		getContentPane().add(comboBox);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importo:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Totale:");
		lblNewLabel_1.setBounds(20, 82, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 8, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(63, 79, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Eventuale sconto");
		lblNewLabel_2.setBounds(283, 11, 92, 14);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(283, 36, 92, 22);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Calcola");
		btnNewButton.setBounds(244, 107, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Esci");
		btnNewButton_1.setBounds(343, 107, 89, 23);
		getContentPane().add(btnNewButton_1);
	
