/**
 * Peter Laskai
 * Purpose: This program uses a GUI interface to find the calculation of property tax of a piece of lad; using several methods 
 * imported from other classes
 * Due Date: 11/24/2014
 */

//imported several packages
import java.awt.event.*;
import javax.swing.*;
public class TaxCalc extends JFrame
{
	//Definition of different items
    JPanel panel;
    JLabel messageLabel;
	JTextField PropertyTaxField;
	JButton calcButton;
	
	//Window Size
	private final int WINDOW_WIDTH = 410;
	private final int WINDOW_HEIGHT = 400;

	//Constructor of program
	public TaxCalc()
	{
		super("Tax Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanel();
		add(panel);

		setVisible(true);


	}
	//panel builder
	private void buildPanel()
	{
		messageLabel = new JLabel("Enter the property value");
		PropertyTaxField = new JTextField(10);

		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();

		panel.add(messageLabel);
		panel.add(PropertyTaxField);
		panel.add(calcButton);

	}
	//Actions performed by CalcButton; several calculations
	private class CalcButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent arg0) {
			final double CONVERSION = .6;
			String input = PropertyTaxField.getText();
			double setval = .64;
			double calculatedAmount = Double.parseDouble(input)*CONVERSION;
			double finalvalue = (calculatedAmount / 100.0)* .64;

			JOptionPane.showMessageDialog(null, "The value of $"+input+" in taxes is $"+finalvalue);


		}

	}
	//Call and intiate program
	public static void main(String[] args) 
	{
		new TaxCalc();
	}

}
/* Psuedocode:
 * 1.0 Import java swing and event packages
 * 2.0 create panels, textfields, and labels
 * 3.0 Define window size with WINDOW_WIDTH and WINDOW_HEIGHT
 * 4.0 Go through TaxCalc construct to construct applet
 * 5.0 Build panel in the buildpane method
 * 6.0 Crated an actionlistener class for the calculate button
 * 7.0 but in calculations that will be implemented by the calcbutton
 * 8.0 final double CONVERSION = .6;
			String input = PropertyTaxField.getText();
			double setval = .64;
			double calculatedAmount = Double.parseDouble(input)*CONVERSION;
			double finalvalue = (calculatedAmount / 100.0)* .64;
   9.0 print calculations
 * 10.0 exit program
 * 
 */
/*
 * prints message box with calculations
 */
