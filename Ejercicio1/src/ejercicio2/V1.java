package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
	private JTextField txtN;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
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
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese número:");
			lblNewLabel.setBounds(10, 11, 105, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtN = new JTextField();
			txtN.setBounds(161, 8, 86, 20);
			contentPane.add(txtN);
			txtN.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celcius a Fahrenheit");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 36, 209, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Kilómetros a Millas");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(10, 63, 209, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Segundos a Minutos");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(10, 90, 209, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 138, 414, 172);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double n= Double.parseDouble(txtN.getText());
		Conversor c = new Conversor(n);
		txtS.setText("");
		txtS.append("La conversión a Fahrenheit es: "+c.Convertir(n));
	}
	
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		int n= Integer.parseInt(txtN.getText());
		Conversor c = new Conversor(n);
		txtS.setText("");
		txtS.append("La conversión a Millas es: "+c.Convertir(n));
	}
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		int n= Integer.parseInt(txtN.getText());
		Conversor c = new Conversor(n);
		txtS.setText("");
		txtS.append(c.Convertir(n, true));
	}
}
