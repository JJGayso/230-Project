
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	infoPanel infopanel;

	public ControlPanel(infoPanel info){
		//this.setPreferredSize(new Dimension(250, 300));
		this.setLayout(new MigLayout());
		infopanel = info;
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JTextField searchBox = new JTextField("search", 10);
		this.add(searchBox, "cell 0 0, gapy 30::30");
		
		JButton searchButton = new JButton("search");
		this.add(searchButton, "cell 1 0, span");
		ActionListener search = new ActionListener(){
			public void actionPerformed(ActionEvent f){
				infopanel.removeAll();
				JLabel searching = new JLabel("searching");
				infopanel.add(searching, "cell 0 1");
				infopanel.revalidate();
				infopanel.repaint();
			}
		};
		searchButton.addActionListener(search);
		
		
		JLabel startlabel = new JLabel("start: ");
		this.add(startlabel, "cell 0 1, span");
		
		JTextField startBox = new JTextField(10);
		this.add(startBox, "cell 0 1");
		
		JLabel endLabel = new JLabel("end: ");
		this.add(endLabel, "cell 0 2, span");
		
		JTextField endBox = new JTextField(10);
		this.add(endBox, "cell 0 2");
		
		final JRadioButton byDistance = new JRadioButton("shortest distance");
		byDistance.setSelected(true);
		JRadioButton byTime = new JRadioButton("least time");
		ButtonGroup group =  new ButtonGroup();
		group.add(byDistance);
		group.add(byTime);
		
		this.add(byDistance, "cell 1 3 1 2");
		this.add(byTime, "cell 0 3 1 2");
	
		JButton goButton = new JButton("GO!");
		this.add(goButton, "cell 0 5");
		ActionListener go = new ActionListener(){
			public void actionPerformed(ActionEvent f){
				infopanel.removeAll();
				JLabel goLabel = new JLabel("GO by time");
				if(byDistance.isSelected()) {
					goLabel.setText("GO by distance");
				}
				infopanel.add(goLabel, "cell 0 1");
				infopanel.revalidate();
				infopanel.repaint();
			}
		};
		goButton.addActionListener(go);
		
		
		
	}
}