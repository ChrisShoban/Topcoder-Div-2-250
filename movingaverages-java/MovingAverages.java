public class MovingAverages {

	public int[] calculate(String[] times, int n) {
		int[] results = new int[times.length - n + 1];
		for(int i = 0; i < times.length - n + 1; i++) {
			for(int j = i; j < i + n; j++) {
				String[] hhmmss = times[j].split(":");
				int h = Integer.parseInt(hhmmss[0]) * 3600;
				int m = Integer.parseInt(hhmmss[1]) * 60;
				int s = Integer.parseInt(hhmmss[2]);
				results[i] += h + m + s;
			}
			results[i] /= n;
		}
		return results;
	}

}
