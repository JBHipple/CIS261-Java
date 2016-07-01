// Joshua Hipple
// CIS 261 - W1
// Final Exam - Question 2
// ImageViewer window class

import javax.swing.*;
import java.awt.*;
import java.awt.Image.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class ImageViewer extends JFrame
{
	private final JButton openFile;			// "Open File" button
	private final JButton zoomIn;			// "Zoom In" button
	private final JButton zoomOut;			// "Zoom Out" button
	private final JLabel thePicture;		// Label to hold picture
	private final JPanel buttonPanel;
	private ImageIcon newIcon;
	private String imagePath;
	private Image image;
	private Image newImage;
	private int width;						// width of picture
	private int height;						// height of picture
	private int result;						// result of fileChooser
	private final JFileChooser fileChooser; // FileChooser
	
	// ImageViewer constructor
	public ImageViewer()
	{
		super("Image Zooming");
		setLayout(new BorderLayout(5, 5));
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		add(buttonPanel, BorderLayout.NORTH);
		
		// add buttons
		openFile = new JButton("Open File");
		buttonPanel.add(openFile);
		
		zoomIn = new JButton("Zoom In");
		buttonPanel.add(zoomIn);
		
		zoomOut = new JButton("Zoom Out");
		buttonPanel.add(zoomOut);
		
		thePicture = new JLabel("");
		add(thePicture, BorderLayout.WEST);
		
		// Create handlers
		ButtonHandler handler = new ButtonHandler();
		openFile.addActionListener(handler);
		zoomIn.addActionListener(handler);
		zoomOut.addActionListener(handler);
		
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	}
	
	
	private class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			switch(event.getActionCommand())
			{
				case "Open File":
					result = fileChooser.showOpenDialog(null);
					if (result == JFileChooser.CANCEL_OPTION)
					{
						return;
					}
					imagePath = fileChooser.getSelectedFile().getName();
					System.out.println(imagePath);
					newIcon = new ImageIcon(getClass().getResource(imagePath));
					thePicture.setIcon(newIcon);
					width = newIcon.getIconWidth();
					height = newIcon.getIconHeight();
					break;
				case "Zoom In":
					image = newIcon.getImage();
					newImage = image.getScaledInstance((width*2), (height*2), java.awt.Image.SCALE_SMOOTH);
					newIcon = new ImageIcon(newImage);
					thePicture.setIcon(newIcon);
					width = width * 2;
					height = height * 2;
					break;
				case "Zoom Out":
					image = newIcon.getImage();
					newImage = image.getScaledInstance((width/2), (height/2), java.awt.Image.SCALE_SMOOTH);
					newIcon = new ImageIcon(newImage);
					thePicture.setIcon(newIcon);
					width = width / 2;
					height = height / 2;
					break;
			}
		}
	}
}