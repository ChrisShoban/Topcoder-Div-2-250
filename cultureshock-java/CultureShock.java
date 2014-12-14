public class CultureShock {

	public String translate(String text) {
		text = text.replaceAll("\\bZEE\\b", "ZED");
		return text;
	}
}
