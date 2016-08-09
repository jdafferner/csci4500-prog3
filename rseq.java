import java.io.*;

public class rseq {
    static int seed = 85;
    static int nvalues = 4;

    static int nextrand()
    {
	seed = seed * 1103515245 + 12345;
	return (seed >> 16) & 0xffff;
    }

    public static void main(String args[])
    {
	int i;
	int rnum;

	if (args.length != 2) {
	    System.err.println("Usage: java rseq SEED #VALUES");
	    System.err.println("    SEED is the seed for the pseudo-random"
			       + " number sequence.");
	    System.err.println("    #VALUES is the number of values to generate"
			       + " and display.");
	    System.exit(1);
	}

	seed = Integer.parseInt(args[0]);
	nvalues = Integer.parseInt(args[1]);

	for(i=0;i<nvalues;i++) {
	    rnum = nextrand();
	    System.out.println(rnum);
	}
	System.exit(0);
    }
}
