public class LetterStrings {

	public int sum(String[] s) {
		int total = 0;
		for(String line : s) {
			line = line.replaceAll("-", "");
			total += line.length();
		}
		return total;
	}

}
