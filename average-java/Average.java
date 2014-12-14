public class Average {

	public int belowAvg(int[] math, int[] verbal) {
		double avg = 0;
		int[] scores = new int[math.length];
		for(int i = 0; i < math.length; i++) {
			avg += math[i] + verbal[i];
			scores[i] = math[i] + verbal[i];
		}
		avg /= math.length;
		int result = 0;
		for(int i = 0; i < scores.length; i++) {
			if(avg > scores[i]) {
				result++;
			}
		}
		return result;
	}

}
