import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class mapPanel extends JPanel{
	private BufferedImage usa;
	
	public mapPanel() {
		this.setPreferredSize(new Dimension(900, 600));
		try {
			usa = ImageIO.read(new File("Images/usa.png"));
			
		} catch (IOException ex){
			
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(usa,150,100,null);
	}
}