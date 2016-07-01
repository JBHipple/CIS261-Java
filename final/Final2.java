// Joshua Hipple
// CIS 261 - W1
// Final Exam - Question 2
// ImageViewer test application

import javax.swing.*;

public class Final2
{
	public static void main(String[] args)
	{
		ImageViewer imageWindow = new ImageViewer();
		imageWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imageWindow.setSize(600, 800);
		imageWindow.setVisible(true);
	}
}