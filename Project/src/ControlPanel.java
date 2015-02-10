
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel{

	public ControlPanel(){
		this.setPreferredSize(new Dimension(250, 300));
		this.setMaximumSize(new Dimension(250, 300));
		this.setLayout(new MigLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JTextField searchBox = new JTextField("search", 10);
		this.add(searchBox, "cell 0 0, gapy 30::30");
		
		JButton searchButton = new JButton("GO");
		this.add(searchButton, "cell 1 0, span");
		
		
		JLabel startlabel = new JLabel("start: ");
		this.add(startlabel, "cell 0 1, span");
		
		JTextField startBox = new JTextField(10);
		this.add(startBox, "cell 0 1");
		
		JLabel endLabel = new JLabel("end: ");
		this.add(endLabel, "cell 0 2, span");
		
		JTextField endBox = new JTextField(10);
		this.add(endBox, "cell 0 2");
		
		JRadioButton byDistance = new JRadioButton("shortest distance");
		byDistance.setSelected(true);
		JRadioButton byTime = new JRadioButton("least time");
		ButtonGroup group =  new ButtonGroup();
		group.add(byDistance);
		group.add(byTime);
		
		this.add(byDistance, "cell 1 3 1 2");
		this.add(byTime, "cell 0 3 1 2");
	
		
		
		
	}
}