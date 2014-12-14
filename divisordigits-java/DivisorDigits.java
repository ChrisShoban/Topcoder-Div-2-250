public class DivisorDigits {

	public int howMany(int number) {
		String check = number + "";
		int result = 0;
		for(int i = 0; i < check.length(); i++) {
			if(Integer.parseInt(check.charAt(i) + "") > 0 && number % Integer.parseInt(check.charAt(i) + "") == 0) {
				result++;
			}
		}
		return result;
	}
}
