package prog3;  //remove before loki submission.  Used by eclipse

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;


public class Utilities {


	private static final int NF = 30; 	// these three ints are required by the assignment
	private static final int NP = 300;	// still not sure where they need to be used but I'm guessing mostly
	private static final int NR = 5000;    // in getLine, or a function down the chain that sets up the pages
	String line = null;
	
public boolean getLine() throws FileNotFoundException{
// reads a line from prog3.input and sends it to setLine.
// Method getLine will retrieve it for use by main() or other called methods orginating from main() such as Rnorm etc.
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
 
 public String getLine(){
 	return line;
 }
 
}
