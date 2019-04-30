import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HammingDistance {
	
	private String city;
	private ArrayList<String> hammingArray = new ArrayList<String>();
	
	public HammingDistance() throws IOException {
		
		
		File file = new File("Mesonet.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		str = br.readLine();
		str = br.readLine();
		str = br.readLine();
		str = br.readLine();
		while(str != null) {
			hammingArray.add(str.substring(1,  5));
			str = br.readLine();
			System.out.println(str);
		}
		br.close();
		
	}
	
	public ArrayList<String> getSameStations(int value){
		//TODO used to return same stations using value from the slider use treeset to store same stations
	}
	

}
