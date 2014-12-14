public class bloggoShortcuts {

	public String expand(String text) {
		int starC = 0;
		int lineC = 0;
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '*') {
				if(starC % 2 == 0) {
					result += "<b>";
				}
				else {
					result += "</b>";
				}
				starC++;	
			}
			else if(text.charAt(i) == '_') {
				if(lineC % 2 == 0) {
					result += "<i>";
				}
				else {
					result += "</i>";
				}
				lineC++;
			}
			else {
				result += text.charAt(i);
			}
		}
		return result;
	}

}
