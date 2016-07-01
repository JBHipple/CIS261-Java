//  Assignment 7 - RadioButtons.java

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class RadioButtons extends JPanel
{
	private Graphics text; // displays text in changing fonts, colors, and sizes
	
	private JPanel panel;
	private final JLabel colorLabel;

	private final JRadioButton blackJRadioButton;
	private final JRadioButton redJRadioButton;
	private final JRadioButton greenJRadioButton;
	private final JRadioButton blueJRadioButton;
	private final ButtonGroup radioGroup;

	public RadioButtons(JPanel panel)
	{
		super();
		this.panel = panel;

		colorLabel = new JLabel(); //Create and add "Color" JLabel
		colorLabel.setText("Color");
		add(colorLabel);

		//Instantiate and add radio buttons
		blackJRadioButton = new JRadioButton("Black", true);
		redJRadioButton = new JRadioButton("Red", false);
		greenJRadioButton = new JRadioButton("Green", false);
		blueJRadioButton = new JRadioButton("Blue", false);
		add(blackJRadioButton);
		add(redJRadioButton);
		add(greenJRadioButton);
		add(blueJRadioButton);

		//Create ButtonGroup and add all buttons
		radioGroup = new ButtonGroup();
		radioGroup.add(blackJRadioButton);
		radioGroup.add(redJRadioButton);
		radioGroup.add(greenJRadioButton);
		radioGroup.add(blueJRadioButton);

		//Add all ItemListeners
		blackJRadioButton.addItemListener(new RadioButtonHandler(Color.BLACK));
		redJRadioButton.addItemListener(new RadioButtonHandler(Color.RED));
		greenJRadioButton.addItemListener(new RadioButtonHandler(Color.GREEN));
		blueJRadioButton.addItemListener(new RadioButtonHandler(Color.BLUE));


	}		

	private class RadioButtonHandler implements ItemListener //ItemListener for the RadioButtons
	{
		private Color color; //Local variable Color

		public RadioButtonHandler(Color c)
		{
			color = c;
		}

		@Override
		public void itemStateChanged(ItemEvent event)
		{
			Lab7.color = this.color; //Set Lab7 color variable to desired color
			panel.repaint();
		}
}
}
