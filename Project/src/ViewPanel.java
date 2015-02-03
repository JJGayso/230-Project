import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ViewPanel extends JPanel{
	private BufferedImage usa;
	
	public ViewPanel() {
		try {
			usa = ImageIO.read(new File("Images/usa.png"));
			
		} catch (IOException ex){
			
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(usa,200,200,null);
	}
}