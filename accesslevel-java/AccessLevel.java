public class AccessLevel {

	public String canAccess(int[] rights, int minPermission) {
		String result = "";
		for(int i = 0; i < rights.length; i++) {
			result += (rights[i] < minPermission) ? "D" : "A";
		}
		return result;
	}

}
