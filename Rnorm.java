package prog3;  //remove before making loki submission
// Instructors rnorm file.  
// Returns based on the seed so the same input to seed results
// in the same final output
public class Rnorm {
	private static final int XRAND_MAX = 65535;
	private final int NCASES = 6;
	private int seed = 1;
	private final int N = 1000000;
	public double amean = 0.0;
	public double astdev = 0.0;
	
	public void xsrand(int xseed){
		seed = xseed;
	}
	
	public int xrand(){
		seed = seed * 1103515245 + 12345;
		return (seed >> 16)  & XRAND_MAX;
	}
	
	private double sqr(double x){
		return x * x;
	}
	
	public double rnorm(){
		
		double s = 0.449871;
		double t = -0.386595;
		double a = 0.19600;
		double b = 0.25472;
		double r1 = 0.27597;
		double r2 = 0.27846;
		double u, v, x, y, q;
		
		for(;;) {
		    u = xrand() / (double)XRAND_MAX;	// u in 0..1
		    v = xrand() / (double)XRAND_MAX;	// v in 0..1
		    v = 1.7156 * (v - 0.5);

		    // Evaluate the quadratic form.
		    x = u - s;
		    y = Math.abs(v) - t;
		    q = sqr(x) + y * (a * y - b * x);

		    // Accept p if inside inner elipse
		    if (q < r1)
			break;
		    if (q <= r2 && sqr(v) < -4.0 * Math.log(u) * sqr(u))
			break;
		}
		
		return v/u;
	}
	
	public double rnorms(double mean, double stdev){
		return rnorm() * stdev + mean;
	}
	
	private void calc(double mean, double stdev){
		int i;
		double v;
		double sum, deviation;
		
		sum = 0;
		deviation = 0;
		for(i = 0; i < N; i++){
			v = rnorms(mean,stdev);
			sum += v;
			deviation += sqr(mean - v);
		}
		amean = sum/N;
		astdev =  Math.sqrt(deviation/N);
	}
	
	public void testRand(){
		double[] cases = {
		     0.0, 1.0,
		     10.0, 5.0,
		     -2.5, 2.5,
		     5.0, 1.0,
		     50.0, 25.0,
		     99.0, 0.5
		};
		int i;
		
		System.out.println("   Expected    Expected      Actual      Actual");
		System.out.println("       Mean       Stdev        Mean       Stdev");
		System.out.println("----------- ----------- ----------- -----------");
		
		for(i = 0; i < NCASES; i++){
			calc(cases[2*i], cases[2*i+1]);
			System.out.format("%11.8f %11.8f %11.8f %11.8f",
					cases[2*i], cases[2*i+1], amean, astdev);
			System.out.println();
			
		}
		
		
	}
}
