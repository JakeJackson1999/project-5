import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class HammingDistance {
	
	private String city;
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
	
	public ArrayList<String> getSameStations(String city, int value){
		this.city = city;
		ArrayList<String> stations = getStations();
		
		ArrayList<String> sameList = new ArrayList<String>();
		
		
		for(int i = 0; i < sameList.size(); i++) {
			compare = stations.get(i);
			
			int count = 0;
			char city1 = city.charAt(0);
			char city2 = city.charAt(1);
			char city3 = city.charAt(2);
			char city4 = city.charAt(3);
			
			char compare1 = compare.charAt(0);
			char compare2 = compare.charAt(1);
			char compare3 = compare.charAt(2);
			char compare4 = compare.charAt(3);
			
			if(city1 == compare1) {
				count += 1;
			}
			else if(city2 == compare2) {
				count += 1;
			}
			else if(city3 == compare3) {
				count += 1;
			}
			else if(city4 == compare4) {
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
	
	

}
