import java.util.ArrayList;

public class grafixClick {

	public int[] checkSaveButton(int[] mouseRows, int[] mouseCols) {
		ArrayList<Integer> validClicks = new ArrayList<Integer>();
		for(int i = 0; i < mouseRows.length; i++) {
			if((20 <= mouseRows[i] && mouseRows[i] <= 39) && (50 <= mouseCols[i] && mouseCols[i] <= 99)) {
				validClicks.add(i);
			}
		}
		int[] result = new int[validClicks.size()];
		for(int i = 0; i < validClicks.size(); i++) {
			result[i] = validClicks.get(i);
		}
		return result;
	}

}
