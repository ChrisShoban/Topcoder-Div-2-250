public class VLNString {

	public String makeAcronym(String longName) {
		longName = longName.trim();
		String[] words = longName.split("\\s");
		String result = "";
		for(String word : words) {
			if(!word.equals("of") && !word.equals("the") && !word.equals("and")) {
				if(word.length() > 0) {
					result += word.toUpperCase().charAt(0);
				}
			}
		}
		return result;
	}

}
