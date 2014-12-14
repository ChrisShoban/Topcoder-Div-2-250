public class InsideOut {

	public String unscramble(String line) {
		StringBuilder result = new StringBuilder();
		int mid = line.length() / 2;
		for(int i = 0; i < line.length(); i++) {
			if(i < mid) {
				result.insert(0, line.charAt(i));
			}
			else {
				result.insert(mid, line.charAt(i));
			}
		}
		return result.toString();
	}

}
