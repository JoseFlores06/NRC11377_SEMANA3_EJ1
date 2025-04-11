package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumaTresEnteros;
	private JButton btnSumaDosReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(10, 11, 100, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número:");
			lblSegundoNmero.setBounds(10, 36, 100, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número:");
			lblNewLabel_2.setBounds(10, 61, 100, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(147, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(147, 33, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(147, 58, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("Suma dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(83, 96, 176, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumaTresEnteros = new JButton("Suma tres enteros");
			btnSumaTresEnteros.addActionListener(this);
			btnSumaTresEnteros.setBounds(83, 130, 176, 23);
			contentPane.add(btnSumaTresEnteros);
		}
		{
			btnSumaDosReales = new JButton("Suma dos reales");
			btnSumaDosReales.addActionListener(this);
			btnSumaDosReales.setBounds(83, 167, 176, 23);
			contentPane.add(btnSumaDosReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(24, 211, 366, 151);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Verificando");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaDosReales) {
			do_btnSumaDosReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaTresEnteros) {
			do_btnSumaTresEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			Calculadora c = new Calculadora(n1, n2);
			txtS.setText("");
			txtS.append("La suma es: "+c.sumar(n1, n2));
		} catch(Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese 2 números enteros.");
		}
	}
	protected void do_btnSumaTresEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			Calculadora c = new Calculadora(n1, n2, n3);
			txtS.setText("");
			txtS.append("La suma es: "+c.sumar(n1, n2, n3));
		} catch(Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese 3 números enteros.");
		}
	}
	
	protected void do_btnSumaDosReales_actionPerformed(ActionEvent e) {
		try {
			double num1=Double.parseDouble(txtN1.getText());
			double num2=Double.parseDouble(txtN2.getText());
			Calculadora c = new Calculadora(num1, num2);
			txtS.setText("");
			txtS.append("La suma es: "+c.sumar(num1, num2));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese números.");
		}	
	}
}
