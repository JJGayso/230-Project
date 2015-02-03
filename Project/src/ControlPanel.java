
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel{
	
	public ControlPanel(){
		JButton testButton = new JButton("Test Button");
		this.add(testButton);
		
		JLabel label = new JLabel("This area will be filled in later with user input objects");
		this.add(label);
		
		
	}
}