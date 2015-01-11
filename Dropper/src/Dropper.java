//import java.awt.Frame;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class Dropper {
	private static JTextField textField;
	private static JTextField textField_1;
	private static final ButtonGroup buttonGroup = new ButtonGroup();
	private static JTextField textField_2;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame Drop = new JFrame();
		Drop.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Drop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Drop.setVisible(true);
		Drop.getContentPane();
		Drop.setSize(800, 400);
		JPanel panel = new JPanel();
		Drop.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel label = new JLabel("\u03A3");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(130, 8, 46, 14);
		panel.add(label);
		textField = new JTextField();
		textField.setBounds(214, 5, 237, 20);
		panel.add(textField);
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setBounds(214, 62, 237, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		String[] Arrivals = { "Markov Modulated On/OFF", "Bernoulli", "Poisson" };
		JComboBox comboBoxArrival = new JComboBox(Arrivals);
		comboBoxArrival.setBounds(214, 127, 237, 20);
		panel.add(comboBoxArrival);
		JButton btnNewButton = new JButton("Calculate Delay");
		btnNewButton.setBounds(240, 288, 188, 23);
		panel.add(btnNewButton);
		JLabel lblDelay = new JLabel("Arrival");
		lblDelay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDelay.setBounds(130, 130, 46, 14);
		panel.add(lblDelay);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(214, 175, 23, 23);
		panel.add(rdbtnNewRadioButton);
		JRadioButton radioButton = new JRadioButton("");
		buttonGroup.add(radioButton);
		radioButton.setBounds(214, 201, 23, 23);
		panel.add(radioButton);
		JLabel lblC = new JLabel("c");
		lblC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC.setBounds(130, 176, 46, 14);
		panel.add(lblC);
		JLabel lblN = new JLabel("n");
		lblN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblN.setBounds(130, 65, 46, 14);
		panel.add(lblN);
		String[] Scaling = { "item1", "item2", "item3" };
		JComboBox comboBoxScaling = new JComboBox(Scaling);
		comboBoxScaling.setBounds(214, 245, 237, 20);
		panel.add(comboBoxScaling);

		JLabel lblScaling = new JLabel("Scaling");
		lblScaling.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScaling.setBounds(130, 248, 46, 14);
		panel.add(lblScaling);
		
		JLabel lblConstant = new JLabel("Constant");
		lblConstant.setBounds(256, 185, 46, 14);
		panel.add(lblConstant);
		
		JLabel lblFormulaWithC = new JLabel("Formula with c1 = ");
		lblFormulaWithC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormulaWithC.setBounds(256, 210, 89, 14);
		panel.add(lblFormulaWithC);
		
		textField_2 = new JTextField();
		textField_2.setBounds(355, 205, 46, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
