package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtN;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JLabel lblIngreseSueldo;
	private JTextField txtSueldo;

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
		setBounds(100, 100, 363, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese nombre:");
			lblNewLabel.setBounds(10, 11, 96, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtN = new JTextField();
			txtN.setBounds(141, 8, 86, 20);
			contentPane.add(txtN);
			txtN.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 80, 253, 147);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(248, 7, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			lblIngreseSueldo = new JLabel("Ingrese sueldo:");
			lblIngreseSueldo.setBounds(10, 36, 96, 14);
			contentPane.add(lblIngreseSueldo);
		}
		{
			txtSueldo = new JTextField();
			txtSueldo.setColumns(10);
			txtSueldo.setBounds(141, 39, 86, 20);
			contentPane.add(txtSueldo);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		if(txtN.getText().trim().isEmpty()) {//ES PARA VERIFICAR SI TIENE VACIO.
			JOptionPane.showMessageDialog(this, "Ingrese nombre.");
		}
		else {
			String nom=txtN.getText();
			double sue=Double.parseDouble(txtSueldo.getText());
			Contador c = new Contador(nom, sue);
			txtS.setText("");
			txtS.append("Ingresó "+c.cantidad()+" nombres");
			txtS.append("\nLa suma del sueldo es: "+c.c());
		}
	}
}
