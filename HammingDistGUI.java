import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class HammingDistGUI {
	
	public HammingDistGUI() throws IOException {
		JFrame HammingDist = new JFrame();
		
		JPanel leftSide = new JPanel(new GridLayout(8,1));
		JPanel rightSide = new JPanel(new GridLayout(8,1));
		
		HammingDistance hd = new HammingDistance();
		ArrayList<String> stationList = hd.getStations();
		
		//add textarea to right side
		JPanel messagePanel = new JPanel(new BorderLayout());
		JLabel rightTitle = new JLabel("Message Board:");
		JButton erase = new JButton("Clear Messages");
		JTextArea messageBox1 = new JTextArea();
		JTextArea messageBox2 = new JTextArea();
		JTextArea messageBox3 = new JTextArea();
		JTextArea messageBox4 = new JTextArea();
		JTextArea messageBox5 = new JTextArea();
		JTextArea messageBox6 = new JTextArea();
		JTextArea messageBox7 = new JTextArea();
		messagePanel.add(rightTitle, BorderLayout.SOUTH);
		messagePanel.add(erase);
		rightSide.add(messagePanel);
		rightSide.add(messageBox1);
		rightSide.add(messageBox2);
		rightSide.add(messageBox3);
		rightSide.add(messageBox4);
		rightSide.add(messageBox5);
		rightSide.add(messageBox6);
		rightSide.add(messageBox7);
		
		
		
		//add enterHammingDist label and textbox
		JPanel row1 = new JPanel(new GridLayout(1, 2));
		JLabel enterHammDist = new JLabel("Enter Hamming Dist:");
		JTextField inputDist = new JTextField();
		inputDist.setText("1");
		row1.add(enterHammDist);
		row1.add(inputDist);
		leftSide.add(row1);
		
		//add slider for row2
		JSlider row2 = new JSlider(1, 4, 1);
		row2.setMinorTickSpacing(1);
	    row2.setMajorTickSpacing(1);
		row2.setPaintTicks(true);
	    row2.setPaintLabels(true);
	    row2.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent event) {
	    		messageBox1.setText("\nSlider Set To: " + row2.getValue());
	            int value = row2.getValue();
	            inputDist.setText(Integer.toString(value));
	          }
	    });
	    
		leftSide.add(row2);
		
		//row 3 is the show status button
		JPanel row3 = new JPanel(new BorderLayout());
		JButton showStations = new JButton("Show Stations");
		row3.add(showStations, BorderLayout.WEST);
		leftSide.add(row3);
		
		// row 4 is the JTextArea
		JPanel row4 = new JPanel(new GridLayout(1, 1));
		row4.setSize(300, 400);
		JTextArea displayHammDist = new JTextArea();
		JScrollPane scroll = new JScrollPane (displayHammDist);
		displayHammDist.setEditable(true);
		row4.add(scroll);
		leftSide.add(row4);
		
		//row 5 is label and combo box
		JPanel row5 = new JPanel(new GridLayout(1, 2));
		JLabel compareWith = new JLabel("Compare with:");
		JComboBox dropBox = new JComboBox(stationList.toArray());
		row5.add(compareWith);
		row5.add(dropBox);
		leftSide.add(row5);
		
		//row 6
		JPanel row6 = new JPanel(new BorderLayout());
		JButton calculateHD = new JButton("Calculate HD");
		row6.add(calculateHD, BorderLayout.WEST);
		leftSide.add(row6);
		
		//row7 is distance labels and text fields
		JPanel row7 = new JPanel(new GridLayout(5, 2));
		JLabel Distance0 = new JLabel("Distance 0");
		JLabel Distance1 = new JLabel("Distance 1");
		JLabel Distance2 = new JLabel("Distance 2");
		JLabel Distance3 = new JLabel("Distance 3");
		JLabel Distance4 = new JLabel("Distance 4");
		JTextField answer0 = new JTextField();
		JTextField answer1 = new JTextField();
		JTextField answer2 = new JTextField();
		JTextField answer3 = new JTextField();
		JTextField answer4 = new JTextField();
		answer0.setEditable(false);
		answer1.setEditable(false);
		answer2.setEditable(false);
		answer3.setEditable(false);
		answer4.setEditable(false);
		row7.add(Distance0);
		row7.add(answer0);
		row7.add(Distance1);
		row7.add(answer1);
		row7.add(Distance2);
		row7.add(answer2);
		row7.add(Distance3);
		row7.add(answer3);
		row7.add(Distance4);
		row7.add(answer4);
		leftSide.add(row7);
		
		//row 8 is jbutton and jtextarea
		JPanel row8 = new JPanel(new GridLayout(1, 2));
		JButton addStation = new JButton("Add Station");
		JTextArea stationInput = new JTextArea(1, 1);
		row8.add(addStation);
		row8.add(stationInput);
		leftSide.add(row8);
		
		
		//erase message board
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//messageBox1.setText("");
				messageBox2.setText("");
				messageBox3.setText("");
				messageBox4.setText("");
				messageBox5.setText("");
				messageBox6.setText("");
				messageBox7.setText("");
				
			}
			
		});
		
		// action listeners for buttons and other gui components
		inputDist.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        String value = inputDist.getText();
		        int compare = Integer.parseInt(value);
		        if(compare >= 1 && compare <= 4) {
	            	row2.setValue(Integer.parseInt(value));
		        }
		        else {
		        	messageBox1.setText("\nThat Number Is Not On The Slider!");
		        }
		      }
		});
		
		showStations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				messageBox2.setText("\n\nShowing Stations!");
				displayHammDist.setText("");
				int value = row2.getValue();
				String sameList = "";
				String dropBoxItem = (String) dropBox.getSelectedItem();
				ArrayList<String> list = hd.getSameStations(dropBoxItem, value);
				Collections.sort(list);
				for(String s : list) {
					sameList += s + "\n";
				}
				displayHammDist.setText(sameList);
			
			}
			
		});
		
		calculateHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = (String) dropBox.getSelectedItem();
				
				messageBox5.setText("\n\nCalculating Hamming Distance!");
				
				int[] node = hd.distanceBetween(input);
				answer0.setText("" + node[0]);
				answer1.setText("" + node[1]);
				answer2.setText("" + node[2]);
				answer3.setText("" + node[3]);
				answer4.setText("" + node[4]);
				
				
				
			}
		});
		
		messageBox5.setText("");
		
		addStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = stationInput.getText().toUpperCase();
				if(input.length() == 4) {
					messageBox7.setText("");
					hd.addStation(input);
					Object[] newStations = hd.getStations().toArray();
					DefaultComboBoxModel dcm = new DefaultComboBoxModel(newStations);
					dropBox.setModel(dcm);
					messageBox7.setText(hd.getAddMessage());
					
					
				}
				else {
					messageBox7.setText("");
					System.out.println("Station isn't the right length");
					messageBox7.setText("\n\nStation isn't the right length!");
				}
				
			}
			
		});
		
		
		
		
		
		//add left and right sides to JFrame and create JFrame specifics
		
		HammingDist.setLayout(new GridLayout(1, 2));
		HammingDist.add(leftSide);
		HammingDist.add(rightSide);
		HammingDist.setTitle("Hamming Distance");
		HammingDist.setSize(550, 600);
		HammingDist.setVisible(true);
		HammingDist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		new HammingDistGUI();
	}

}
