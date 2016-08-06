package prog3;
/*Package prog3 will need to be removed in order to use all .java files on loki.
Utilities contains the methods to read in input and return what is needed to main.
Rnorm is a copy of the professor's rnorm java file, I'm not sure what this is used for yet but it's important and it works.
import java.io.FileNotFoundException;*/
//prog 3 csci4500 James Dafferner and Mark Bradshaw
public class Prog3 { //need to change to prog3 and save before submission.


	public static void main(String[] args) {
	
		int page;
		int r = 0;
		int t = 0;
		double prePage;

		//Rnorm grabRand = new Rnorm();
		Utilities u = new Utilities();
		/*This code is a going to use u.*/
		grabRand.xsrand(r);
		prePage = grabRand.rnorm();
		page = (int)(Math.abs(prePage) * 100);
		
		//System.out.printf("prePage value = %f, page value = %d\n", prePage, page);

	}

}
