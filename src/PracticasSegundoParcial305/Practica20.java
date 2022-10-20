package PracticasSegundoParcial305;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Practica20 {

	private JFrame frame;
	private JRadioButton rdbChica;
	private JCheckBox chkAlitas;
	private JCheckBox chkRefresco;
	private JCheckBox chkPapas;
	private JRadioButton rdbMediana;
	private JRadioButton rdbGrande;
	private JSlider slCantidad;
	private JLabel lblCantidad;
	ButtonGroup grupotamaño = new ButtonGroup();
	ButtonGroup grupoextras = new ButtonGroup();
	int a = 0;
	int Chica = 70;
	int Mediana = 95;
	int Grande = 120;
	int Papas = 50;
	int Alitas = 70;
	int Refresco = 30;
	private JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica20 window = new Practica20();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Practica20() {
		initialize();
		grupotamaño.add(rdbChica);
		grupotamaño.add(rdbMediana);
		grupotamaño.add(rdbGrande);
		grupoextras.add(chkPapas);
		grupoextras.add(chkAlitas);
		grupoextras.add(chkRefresco);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setFont(new Font("Agency FB", Font.PLAIN, 35));
		btnCalcular.setBounds(59, 386, 154, 57);
		frame.getContentPane().add(btnCalcular);
	}

	public void total() {

	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 525);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.jpg")));
		frame.setTitle("PIZZAS CHESTER");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 10, 108, 36);
		frame.getContentPane().add(lblNewLabel);

		lblCantidad = new JLabel("");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCantidad.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblCantidad.setBounds(554, 45, 108, 64);
		frame.getContentPane().add(lblCantidad);

		slCantidad = new JSlider();
		slCantidad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a = slCantidad.getValue();
				lblCantidad.setText("" + a);
				total();
			}
		});
		slCantidad.setValue(0);
		slCantidad.setSnapToTicks(true);
		slCantidad.setPaintTicks(true);
		slCantidad.setPaintLabels(true);
		slCantidad.setMinorTickSpacing(10);
		slCantidad.setMaximum(10);
		slCantidad.setMajorTickSpacing(50);
		slCantidad.setBounds(36, 56, 508, 71);
		frame.getContentPane().add(slCantidad);

		JLabel lblTotallll = new JLabel("Total");
		lblTotallll.setFont(new Font("Agency FB", Font.PLAIN, 42));
		lblTotallll.setBounds(236, 386, 83, 71);
		frame.getContentPane().add(lblTotallll);

		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.setToolTipText("");
		panel.setName("");
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tama\u00F1o", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(204, 102, 0)));
		panel.setBounds(25, 137, 249, 219);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		rdbChica = new JRadioButton("Chica");
		rdbChica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});

		rdbChica.setFont(new Font("Agency FB", Font.PLAIN, 35));
		rdbChica.setBounds(16, 37, 132, 33);
		panel.add(rdbChica);

		rdbMediana = new JRadioButton("Mediana");
		rdbMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
		rdbMediana.setFont(new Font("Agency FB", Font.PLAIN, 35));
		rdbMediana.setBounds(16, 86, 132, 33);
		panel.add(rdbMediana);

		rdbGrande = new JRadioButton("Grande");
		rdbGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
		rdbGrande.setFont(new Font("Agency FB", Font.PLAIN, 35));
		rdbGrande.setBounds(16, 135, 132, 33);
		panel.add(rdbGrande);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setName("");
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Extras",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(204, 102, 0)));
		panel_1.setBounds(313, 137, 249, 219);
		frame.getContentPane().add(panel_1);

		chkPapas = new JCheckBox("Papas");
		chkPapas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
		chkPapas.setFont(new Font("Agency FB", Font.PLAIN, 31));
		chkPapas.setBounds(23, 41, 171, 39);
		panel_1.add(chkPapas);

		chkAlitas = new JCheckBox("Alitas");
		chkAlitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
		chkAlitas.setFont(new Font("Agency FB", Font.PLAIN, 31));
		chkAlitas.setBounds(23, 97, 171, 39);
		panel_1.add(chkAlitas);

		chkRefresco = new JCheckBox("Refresco");
		chkRefresco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
		chkRefresco.setFont(new Font("Agency FB", Font.PLAIN, 31));
		chkRefresco.setBounds(23, 152, 171, 39);
		panel_1.add(chkRefresco);

		JLabel lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotal.setBounds(313, 386, 302, 64);
		frame.getContentPane().add(lblTotal);
	}
}