public class CalcB {

	double b, a = 4.0;
	double n = 10.0;

	public double CalcB() {

		for (double k = 0; k <= n - 1; k++) {
			double C = n - k;
			b = (Math.pow(Math.E, (a * (C))));
			
		}
		
		return b;
	}
//sagar
}
