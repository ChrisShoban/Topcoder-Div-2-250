public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int c = 0;
		for(String s : screen) {
			for(char next : s.toCharArray()) {
				if(dithered.contains(next + "")) {
					c++;
				}
			}
		}
		return c;
	}

}
