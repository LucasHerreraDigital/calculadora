package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Pamtalaa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField resultado;
	private int primerNum;
	private int segundoNum;
	private int resultadoFinal;
	private String operacion;


	public Pamtalaa() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 61, 349, 197);
		contentPane.add(panel);
		
		JButton button1 = new JButton("1");
		button1.setBounds(10, 11, 51, 34);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"1");
			}
		});
		panel.setLayout(null);
		panel.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"2");
			}
		});
		button2.setBounds(86, 11, 51, 34);
		panel.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"3");
			}
		});
		button3.setBounds(162, 11, 51, 34);
		panel.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"4");
			}
		});
		button4.setBounds(10, 56, 51, 34);
		panel.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"5");
			}
		});
		button5.setBounds(86, 56, 51, 34);
		panel.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"6");
			}
		});
		button6.setBounds(162, 56, 51, 34);
		panel.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"7");
			}
		});
		button7.setBounds(10, 101, 51, 34);
		panel.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"8");
			}
		});
		button8.setBounds(86, 101, 51, 34);
		panel.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"9");
			}
		});
		button9.setBounds(162, 101, 51, 34);
		panel.add(button9);
		
		JButton mas = new JButton("+");
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum = Integer.parseInt(resultado.getText());
				operacion = "+";
				resultado.setText("");
			}
		});
		mas.setBounds(250, 11, 89, 23);
		panel.add(mas);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum = Integer.parseInt(resultado.getText());
				operacion = "-";
				resultado.setText("");
			}
		});
		menos.setBounds(250, 37, 89, 23);
		panel.add(menos);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum = Integer.parseInt(resultado.getText());
				operacion = "*";
				resultado.setText("");
			}
		});
		multiplicacion.setBounds(250, 71, 89, 23);
		panel.add(multiplicacion);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum = Integer.parseInt(resultado.getText());
				operacion = "/";
				resultado.setText("");
			}
		});
		division.setBounds(250, 97, 89, 23);
		panel.add(division);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundoNum = Integer.parseInt(resultado.getText());
				resultado.setText("");
				
				switch (operacion) {
				case "+":
					resultadoFinal = segundoNum + primerNum;
					resultado.setText(String.valueOf(resultadoFinal) );
					break;
				case "-":
					resultadoFinal = primerNum - segundoNum ;
					resultado.setText(String.valueOf(resultadoFinal) );
					break;
				case "*":
					resultadoFinal = segundoNum * primerNum;
					resultado.setText(String.valueOf(resultadoFinal) );
					break;
				case "/":
					resultadoFinal =primerNum / segundoNum ;
					resultado.setText(String.valueOf(resultadoFinal) );
					break;
				case "":
					break;
				default:
					break;
				} 
			primerNum = 0;
			segundoNum = 0;
			operacion = "";	
			}
		});
		igual.setBounds(250, 131, 89, 43);
		panel.add(igual);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"0");
			}
		});
		button0.setBounds(86, 141, 51, 34);
		panel.add(button0);
		
		resultado = new JTextField();
		resultado.setBounds(10, 11, 349, 39);
		contentPane.add(resultado);
		resultado.setColumns(10);
	}
}
