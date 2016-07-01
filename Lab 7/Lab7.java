//  Assignment 7  - Lab7.java

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lab7 extends JPanel
{

	protected static JFrame frame; 
	protected static Graphics g;
	protected static RadioButtons radioButtonPanel;
	protected static CheckBoxes checkBoxesPanel;
	protected static ComboListPanel comboListPanel;
	protected static Color color;
	protected static int style = Font.PLAIN; //Variable to store font style; set default to Font.PLAIN
	protected static String font = "Courier"; //Variable to store font as string; set default to Courier
	protected static int size = 10; //Variable to store font size as int; set default to 10
	
	public Lab7()
	{
		this.setSize(350, 500); //Set JPanel Size
		setLayout(new FlowLayout()); 

		radioButtonPanel = new RadioButtons(this); //Create and add RadioButtons to panel
		add(radioButtonPanel);

		comboListPanel = new ComboListPanel(this); //Create and add combo box and list to panel
		add(comboListPanel);

		checkBoxesPanel = new CheckBoxes(this);		//Create and add check boxes to panel
		add(checkBoxesPanel);		

		repaint();

	}

	public static void main(String[] args)
	{
		frame = new JFrame("Lab 7"); //Create JFrame to hold and display panels
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new Lab7());
		frame.setSize(350, 500);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		g.setColor(color); //set the color for the text
		g.setFont(new Font(font, style, size)); //set font, style, and size for text
		g.drawString("SAMPLE", 25, 250); //draw text at proper location
	}
}
