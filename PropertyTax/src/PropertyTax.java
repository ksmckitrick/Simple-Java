import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PropertyTax extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel = new JPanel();
	private JPanel panel = new JPanel();
	private JPanel btnPanel = new JPanel();
	
	private JLabel valueLabel = new JLabel("Property Value");
	private JTextField valueTF = new JTextField(10);
	private JButton calcBtn = new JButton("Calculate");
	private JButton exitBtn = new JButton("Exit");
	
	public PropertyTax() {
		
		super("Property Tax Calculator");
		
		buildPanel();
		
		add(mainPanel, BorderLayout.NORTH);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildPanel() {
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		panel.setLayout(new GridLayout(1, 1));
		btnPanel.setLayout(new GridLayout(1, 1));
		
		panel.add(valueLabel);
		panel.add(valueTF);
		mainPanel.add(panel, BorderLayout.CENTER);
		
		btnPanel.add(exitBtn);
		btnPanel.add(calcBtn);
		mainPanel.add(btnPanel, BorderLayout.SOUTH);
		
		exitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
	});
		
	calcBtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			double actualValue = Double.parseDouble(valueTF.getText());
			double assesment = actualValue * 0.6;
			double propertyTax = assesment * 0.0064;
			
			DecimalFormat df = new DecimalFormat("#,###.00");
			JOptionPane.showMessageDialog(null, "Actual Value: $" + df.format(actualValue)
												+"\nAssesment: $" + df.format(assesment)
												+"\nProperty Tax: $" + df.format(propertyTax));
		}
	});
		
	}
}
