import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class HammingDistGUI {
	
	public HammingDistGUI() {
		JFrame HammingDist = new JFrame();
		JPanel leftSide = new JPanel();
		JPanel rightSide = new JPanel();
		
		JPanel leftContents = new JPanel(new GridLayout(8,1));
		
		//add enterHammingDist label and textbox
		JPanel row1 = new JPanel(new GridLayout(1, 2));
		JLabel enterHammDist = new JLabel("Enter Hamming Dist:");
		JTextField inputDist = new JTextField();
		//TODO have textfield correspond with slider in row 2
		row1.add(enterHammDist);
		row1.add(inputDist);
		leftContents.add(row1);
		
		//add slider for row2
		JSlider row2 = new JSlider(1, 4, 1);
		row2.setMinorTickSpacing(1);
	    row2.setMajorTickSpacing(1);
		row2.setPaintTicks(true);
	    row2.setPaintLabels(true);
		leftContents.add(row2);
		
		
		
		
		leftSide.add(leftContents);
		
		HammingDist.setLayout(new GridLayout(1, 2));
		HammingDist.add(leftSide);
		HammingDist.add(rightSide);
		HammingDist.setTitle("Hamming Distance");
		HammingDist.setSize(600, 900);
		HammingDist.setVisible(true);
		HammingDist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new HammingDistGUI();
	}

}
