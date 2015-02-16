import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class mapPanel extends JPanel{
	private BufferedImage usa;
	private ArrayList<AmusementPark> parkList;
	private	infoPanel infopanel;
	private ControlPanel controlpanel;
	private AmusementPark clickedPark;
	
	public mapPanel(ArrayList<AmusementPark> parks, infoPanel info) {
		this.controlpanel = null;
		this.clickedPark = null;
		this.infopanel = info;
		this.parkList = parks;
		this.setPreferredSize(new Dimension(900, 600));
		try {
			usa = ImageIO.read(new File("Images/usa.png"));
			
		} catch (IOException ex){
			
		}
		MouseAdapter adapter = new MouseAdapter(){
			  @Override
	            public void mousePressed(MouseEvent me) {
	                super.mousePressed(me);
	                for (AmusementPark park : parkList) {
	                	Point2D point = me.getPoint();
	                    if (isContained(point, park.location)) {
	                        //System.out.println("Clicked "+park.name);
	                        JLabel parkLabel = new JLabel(park.name);
	                        clickedPark = park;
	                        clickedPark.color = Color.GREEN;
	                        revalidate();
	                        repaint();
	                        infopanel.removeAll();
	                        infopanel.add(parkLabel);
	        				infopanel.revalidate();
	        				infopanel.repaint();
	        				
	        				if (controlpanel != null){
	        					controlpanel.setBox(park);
	        				}
	                    }
	                }
	            }
			  
			  public void mouseReleased(MouseEvent me){
				  super.mouseReleased(me);
				  clickedPark.color = Color.BLUE;
				  revalidate();
				  repaint();
			  }
			  @Override  
			  public void mouseMoved(MouseEvent me){
	            	super.mouseMoved(me);
	                for (AmusementPark park : parkList) {
	                	if (isContained(me.getPoint(), park.location)) {
	                        park.color = Color.BLUE;
	                        revalidate();
	                        repaint();
	                	}
	                	else{
	                		park.color = Color.RED;
	                		revalidate();
	                		repaint();
	                	}
	                }
	            }
		};
		this.addMouseListener(adapter);
		this.addMouseMotionListener(adapter);
	}
	
	public void setControl(ControlPanel panel){
		this.controlpanel = panel;
	}
	
	public boolean isContained(Point2D click, Point2D park){
		if (click.getX() > park.getX() && click.getX() < park.getX() + 15){
			if (click.getY() > park.getY() && click.getY() < park.getY() + 15){
				return true;
			}
		}
		return false;
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D graphics2 = (Graphics2D) g;
		
		double scale = 1.3;
		g.drawImage(usa,50,50,(int)(usa.getWidth() * scale), (int)(usa.getHeight() * scale), this);
		
		for(int i=0; i < parkList.size(); i++){
			Point2D point = parkList.get(i).location;
			Ellipse2D.Double circ = new Ellipse2D.Double(point.getX(), point.getY(), 15, 15);
			graphics2.setColor(parkList.get(i).color);
			g.drawString(parkList.get(i).name, (int)point.getX(), (int)point.getY());
			graphics2.fill(circ);
		}
	}
}