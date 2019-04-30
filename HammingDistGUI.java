import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
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
		
		//row 3 is the show status button
		JPanel row3 = new JPanel(new BorderLayout());
		JButton showStatus = new JButton("Show Status");
		//TODO make button do stuff
		row3.add(showStatus, BorderLayout.WEST);
		leftContents.add(row3);
		
		// row 4 is the JTextArea
		JPanel row4 = new JPanel(new GridLayout(1, 1));
		row4.setSize(300, 400);
		JTextArea displayHammDist = new JTextArea();
		displayHammDist.setSize(300, 400); //TODO Figure out why sizing will not work
		displayHammDist.setEditable(false);
		row4.add(displayHammDist);
		leftContents.add(row4);
		
		//row 5 is label and combo box
		JPanel row5 = new JPanel(new GridLayout(1, 2));
		JLabel compareWith = new JLabel("Compare with:");
		JComboBox dropBox = new JComboBox();
		row5.add(compareWith);
		row5.add(dropBox);
		leftContents.add(row5);
		

		
		
		
		
		
		
		
		
		//add left and right sides to JFrame and create JFrame specifics
		leftSide.add(leftContents);
		
		HammingDist.setLayout(new GridLayout(1, 2));
		HammingDist.add(leftSide);
		HammingDist.add(rightSide);
		HammingDist.setTitle("Hamming Distance");
		HammingDist.setSize(700, 900);
		HammingDist.setVisible(true);
		HammingDist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new HammingDistGUI();
	}

}
