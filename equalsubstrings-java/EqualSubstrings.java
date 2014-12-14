public class EqualSubstrings {

	public String[] getSubstrings(String str) {
		String x = "";
		String y = "";
		int xCount;
		int yCount;
		for(int i = str.length(); i >= 0; i--) {
			x = str.substring(0, i);
			y = str.substring(i, str.length());
			xCount = x.length() - x.replaceAll("a", "").length();
			yCount = y.length() - y.replaceAll("b", "").length();
			System.out.println(x);
			System.out.println(y);
			if(xCount == yCount) {
				System.out.println();
				return new String[]{x,y};
			}
		}
		System.out.println();
		return new String[]{x,y};
	}

}
