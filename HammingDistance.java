import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class HammingDistance {
	
	private ArrayList<String> hammingArray = new ArrayList<String>();
	String compare = "";

	public HammingDistance() throws IOException {
		
		
		File file = new File("Mesonet.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		str = br.readLine();
		while(str != null) {
			hammingArray.add(str.substring(0,  4));
			str = br.readLine();
		}
		br.close();
		
	}
	
	public ArrayList<String> getStations() {
		/**ArrayList<String> stationsList = new ArrayList<String>;
		
		for(int i = 0; i < hammingArray.size(); i++) {
			stationsList[i] = hammingArray.get(i);
		}*/
		return hammingArray;
	}
	
	public ArrayList<String> getSameStations(String input, int value){
		ArrayList<String> stations = getStations();
		
		ArrayList<String> sameList = new ArrayList<String>();
		
		
		for(int i = 0; i < hammingArray.size(); i++) {
			compare = stations.get(i);
			
			int count = 0;
			
			
			if(input.charAt(0) == compare.charAt(0)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(1) == compare.charAt(1)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(2) == compare.charAt(2)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(3) == compare.charAt(3)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			
			if (count == value) {
				sameList.add(compare);
			}
			
			
		}
		
		return sameList;
		
		
		
		//TODO used to return same stations using value from the slider use treeset to store same stations
	}
	
	public ArrayList<String> addStation(String input){
		
		boolean isIn = false;
		
		for(int i = 0; i < hammingArray.size(); i++) {
			if(input.equalsIgnoreCase(hammingArray.get(i))) {
				isIn = true;
				break;
			}
		}
		
		
		if(isIn == false) {
			hammingArray.add(input);
			Collections.sort(hammingArray);
			return hammingArray;
		}	
		else {
			System.out.println("Stations already exists!");
			return hammingArray;
		}
		
	}
	
	public int[] distanceBetween(String input) {
		int[] node = new int[5];
		
		for(int i = 0; i < hammingArray.size(); i++) {
			
			int count = 0;
			
			if(input.charAt(0) == hammingArray.get(i).charAt(0)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(1) == hammingArray.get(i).charAt(1)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(2) == hammingArray.get(i).charAt(2)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(input.charAt(3) == hammingArray.get(i).charAt(3)) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(count == 0) {
				node[0] += 1;
			}
			else if(count == 1) {
				node[1] += 1;
			}
			else if(count == 2) {
				node[2] += 1;
			}
			else if(count == 3) {
				node[3] += 1;
			}
			else if(count == 4) {
				node[4] += 1;
			}
			
			
		}
		
		return node;
		
		
	}
	
	

}
