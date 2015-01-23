import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;

public class Dropper {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Dropper() {

		JFrame Drop = new JFrame("Stochastic Network Calculator");

		Drop.setSize(800, 400);
		Drop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridBagLayout());
		Drop.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagConstraints c = new GridBagConstraints();

		JLabel label = new JLabel("\u03A3");
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		panel.add(label, c);

		JTextField textField = new JTextField(10);
		c.gridx = 1;
		c.gridy = 0;
		panel.add(textField, c);

		JLabel lblN = new JLabel("n");
		c.gridx = 0;
		c.gridy = 1;
		panel.add(lblN, c);

		JTextField textField_1 = new JTextField(10);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(textField_1, c);

		JLabel lblDelay = new JLabel("Arrival");
		c.gridx = 0;
		c.gridy = 2;
		panel.add(lblDelay, c);

		String[] Arrivals = { "Markov Modulated On/OFF", "Bernoulli", "Poisson" };
		JComboBox comboBoxArrival = new JComboBox(Arrivals);
		c.gridx = 1;
		c.gridy = 2;
		panel.add(comboBoxArrival, c);

		JLabel lblC = new JLabel("c");
		c.gridx = 0;
		c.gridy = 3;
		panel.add(lblC, c);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("    Constant");
		rdbtnNewRadioButton.setFocusPainted(false);
		c.gridx = 1;
		c.gridy = 3;
		panel.add(rdbtnNewRadioButton, c);

		JRadioButton radioButton = new JRadioButton("    Formula with c1 =");
		radioButton.setFocusPainted(false);
		c.gridx = 1;
		c.gridy = 4;
		panel.add(radioButton, c);

		ButtonGroup g = new ButtonGroup();
		g.add(rdbtnNewRadioButton);
		g.add(radioButton);

		JTextField textField_2 = new JTextField(5);
		c.gridx = 2;
		c.gridy = 4;
		panel.add(textField_2, c);

		JLabel lblScaling = new JLabel("Scaling");
		c.gridx = 0;
		c.gridy = 5;
		panel.add(lblScaling, c);

		String[] Scaling = { "Bernoulli Scaling Process", "Markov Modulated",
				"item3" };
		JComboBox comboBoxScaling = new JComboBox(Scaling);
		c.gridx = 1;
		c.gridy = 5;
		panel.add(comboBoxScaling, c);

		JButton btnNewButton = new JButton("Calculate Delay");
		c.gridx = 1;
		c.gridy = 6;
		panel.add(btnNewButton, c);
		Drop.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Dropper dropper = new Dropper();
			}
		});
	}
}
