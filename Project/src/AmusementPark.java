import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class AmusementPark {
	public int levelOfFun;
	public Point2D.Double location = new Point2D.Double();
	public ArrayList<Links> parkConnections = new ArrayList<Links>();
	public String name; 
	public Color color;
	public BufferedImage image;
	
	public AmusementPark(String name, double xCoordinate, double yCoordinate, int levelOfFun){
		this.location = new Point2D.Double(xCoordinate, yCoordinate);
		this.levelOfFun = levelOfFun;
		this.name = name;
		color = Color.RED;
		try{
			this.image = ImageIO.read(new File("Images/" + this.name + ".png"));			
		} catch (IOException ex){
			System.out.println("image error with park " + this.name);
		}
	}
	
	public ArrayList<Links> getLinks(){
		return this.parkConnections;
	}
	
	public int getLevelOfFun(){
		return this.levelOfFun;
	}
	
	public Point2D.Double getLocation(){
		return this.location;
	}	
	
	public String getName(){
		return this.name;
	}
	
	public void drawOn(Graphics g1, infoPanel panel){
		g1.drawImage(image, 30, 50, image.getWidth() + 30, image.getHeight() + 20, panel);
	}
	
	public void addLink(Links q){
		this.parkConnections.add(q);
	}
}
