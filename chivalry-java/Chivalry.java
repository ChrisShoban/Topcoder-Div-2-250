public class Chivalry {

	public String getOrder(String first, String second) {
		int f = 0;
		int s = 0;
		String result = "";
		while(f < first.length() && s < second.length()) {
			if(first.charAt(f) == second.charAt(s) || (first.charAt(f) == 'W' && second.charAt(s) == 'M')) {
				result += first.charAt(f);
				f++;
			}
			else {
				result += second.charAt(s);
				s++;
			}
		}
		while(f < first.length()) {
			result += first.charAt(f);
			f++;
		}
		while(s < second.length()) {
			result += second.charAt(s);
			s++;
		}
		return result;
	}

}
