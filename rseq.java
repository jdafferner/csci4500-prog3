//---------------------------------------------------------------
//Demonstrate generation of a sequence of pseudo-random numbers.
//Each generated value will be between 0 and 65535. 
//---------------------------------------------------------------
import java.io.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class rseq {
 static int seed = -1;
 static int nvalues;

 static int nextrand()
 {
	seed = seed * 1103515245 + 12345;
	return (seed >> 16) & 0xffff;
 }

 public static void main(String args[])
 {
	 Scanner s = new Scanner(System.in);
	int i;
	int rnum;

	/*if (args.length != 2) {
	    System.err.println("Usage: java rseq SEED #VALUES");
	    System.err.println("    SEED is the seed for the pseudo-random"
			       + " number sequence.");
	    System.err.println("    #VALUES is the number of values to generate"
			       + " and display.");
	    System.exit(1);
	}*/
	System.out.printf("Enter the seed:  ");
	seed = s.nextInt();
	System.out.print("Enter the number of numbers to produce:  ");
	nvalues = s.nextInt();

	for(i=0;i<nvalues;i++) {
	    rnum = nextrand();
	    System.out.println(rnum);
	}
	s.close();
	System.exit(0);
 }
}
