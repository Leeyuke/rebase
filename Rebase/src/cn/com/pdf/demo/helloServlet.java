package cn.com.pdf.demo;

import java.awt.AWTException;
import java.io.IOException;

public class helloServlet{
	
	public static void main(String[] args) throws IOException, AWTException {
		
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		java.awt.Rectangle screenRectangle = new java.awt.Rectangle(screenSize);
		java.awt.Robot robot = new java.awt.Robot();
		java.awt.image.BufferedImage image = robot.createScreenCapture(screenRectangle);
		javax.imageio.ImageIO.write(image, "jpg", new java.io.File("F:\\a.jpg"));
		
	}
	
}
