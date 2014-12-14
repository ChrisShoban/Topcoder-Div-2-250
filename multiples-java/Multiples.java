public class Multiples {

	public int number(int min, int max, int factor) {
		int total = 0;
		while(min <= max) {
			if(min%factor == 0) {
				return (max - min)/factor + 1;
			}
			else {
				min++;
			}
		}
		return total;
	}
}
