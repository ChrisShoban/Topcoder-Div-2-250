public class YahtzeeScore {

	public int maxPoints(int[] toss) {
		int[] dice = new int[toss.length + 1 + 1];
		int max = 0;
		for(int i = 0; i < toss.length; i++) {
			dice[toss[i]] += toss[i];
			if(max < dice[toss[i]]) {
				max = dice[toss[i]];
			}
		}
		return max;
	}

}
