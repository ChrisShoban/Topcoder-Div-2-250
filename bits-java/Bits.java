public class Bits {

	public int minBits(int n) {
		double two = 2;
		int power = 0;
		while(Math.pow(two, power) <= n) {
			power++;
		}
		return power;
	}

}
