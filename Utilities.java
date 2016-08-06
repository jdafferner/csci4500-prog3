package prog3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;


public class Utilities {


	private static final int NF = 30;
	private static final int NP = 300;
	private static final int NR = 5000;

	
public boolean getLine() throws FileNotFoundException{

	File file = new File("prog3.input");
	FileInputStream fis = new FileInputStream(file);
	
	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
				String x = br.readLine();
				if(x == "0"){
					return false;
				}
				else{
					setLine(x);
					return true;
				}
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

}
 private void setLine(String s){
	 String line = s; 
 }
 
}