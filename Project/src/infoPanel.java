
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class infoPanel extends JPanel{

	public infoPanel(){
		//this.setPreferredSize(new Dimension(250, 300));
		this.setLayout(new MigLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JLabel label = new JLabel(" This area will contain useful info");
		this.add(label);
		
		
	}
}