import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HammingDistGUI {
	
	public HammingDistGUI() {
		JFrame HammingDist = new JFrame();
		JPanel leftSide = new JPanel();
		JPanel rightSide = new JPanel();
		
		
		
		
		
		
		
		
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
