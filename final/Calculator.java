// Joshua Hipple
// CIS 261 - W1
// Final Exam - Question 1
// Calulator window class

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame
{
	private final JTextField outputField;  // Text area for output
	private final JButton clearButton;     // 'C' button
	private final JButton plusButton;	   // '+' button
	private final JButton minusButton;     // '-' button
	private final JButton equalsButton;    // '=' button
	private final JButton oneButton;       // '1' button
	private final JButton twoButton;       // '2' button
	private final JButton threeButton;     // '3' button
	private final JButton fourButton;      // '4' button
	
	private int currentTotal = 0;          // Holds current total
	private int displayed = 0;             // Holds displayed value
	private int previous = 0;			   // holds previous value
	private boolean isMinus = false;       // true if minus pressed
	
	//  Calculator constructor
	public Calculator()
	{
		super("Calculator");
		setLayout(new FlowLayout(FlowLayout.CENTER, 3, 10));
		setResizable(false);
		
		// add text area for output
		outputField = new JTextField(15);
		outputField.setEditable(false);
		outputField.setText(Integer.toString(displayed));
		add(outputField);
		
		// add buttons
		clearButton = new JButton("C");
		add(clearButton);
		
		plusButton = new JButton("+");
		add(plusButton);
		
		minusButton = new JButton("-");
		add(minusButton);
		
		equalsButton = new JButton("=");
		add(equalsButton);
		
		oneButton = new JButton("1");
		add(oneButton);
		
		twoButton = new JButton("2");
		add(twoButton);
		
		threeButton = new JButton("3");
		add(threeButton);
		
		fourButton = new JButton("4");
		add(fourButton);
		
		// Create handlers
		ButtonHandler handler = new ButtonHandler();
		clearButton.addActionListener(handler);
		plusButton.addActionListener(handler);
		minusButton.addActionListener(handler);
		equalsButton.addActionListener(handler);
		oneButton.addActionListener(handler);
		twoButton.addActionListener(handler);
		threeButton.addActionListener(handler);
		fourButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			switch(event.getActionCommand())
			{
				case "C":
					currentTotal = 0;
					displayed = 0;
					previous = 0;
					isMinus = false;
					outputField.setText(Integer.toString(displayed));
					break;
				case "+":
					if(isMinus)
					{
						currentTotal -= displayed;
					} else
					{
						currentTotal += displayed;
					}
					outputField.setText(Integer.toString(currentTotal));
					displayed = 0;
					isMinus = false;
					break;
				case "-":
					if(isMinus)
					{
						currentTotal -= displayed;
					} else
					{
						currentTotal += displayed;
					}
					outputField.setText(Integer.toString(currentTotal));
					displayed = 0;
					isMinus = true;
					break;
				case "=":
					if(isMinus)
					{
						currentTotal -= displayed;
					} else
					{
						currentTotal += displayed;
					}
					outputField.setText(Integer.toString(currentTotal));
					displayed = 0;
					break;
				case "1":
					displayed = Integer.parseInt(Integer.toString(displayed) + "1");
					outputField.setText(Integer.toString(displayed));
					break;
				case "2":
					displayed = Integer.parseInt(Integer.toString(displayed) + "2");
					outputField.setText(Integer.toString(displayed));
					break;
				case "3":
					displayed = Integer.parseInt(Integer.toString(displayed) + "3");
					outputField.setText(Integer.toString(displayed));
					break;
				case "4":
					displayed = Integer.parseInt(Integer.toString(displayed) + "4");
					outputField.setText(Integer.toString(displayed));
					break;
			}
		}
	}
}