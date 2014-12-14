import java.util.Arrays;

public class Medici {

	public int winner(int[] fame, int[] fortune, int[] secrets) {
		int[] playersHighestLows = new int[fame.length];
		Arrays.fill(playersHighestLows, Integer.MAX_VALUE);
		for(int i = 0; i < fame.length; i++) {
			if(playersHighestLows[i] > fame[i]) {
				playersHighestLows[i] = fame[i];
			}
		}
		for(int i = 0; i < fortune.length; i++) {
			if(playersHighestLows[i] > fortune[i]) {
				playersHighestLows[i] = fortune[i];
			}
		}
		for(int i = 0; i < secrets.length; i++) {
			if(playersHighestLows[i] > secrets[i]) {
				playersHighestLows[i] = secrets[i];
			}
		}
		int highestScore = playersHighestLows[0];
		int highestPlayer = 0;
		int highestPlayCount = 1;
		for(int i = 1; i < playersHighestLows.length; i++) {
			if(playersHighestLows[i] > highestScore) {
				highestScore = playersHighestLows[i];
				highestPlayCount = 1;
				highestPlayer = i;
			}
			else if(playersHighestLows[i] == highestScore) {
				highestPlayCount++;
			}
		}
		if(highestPlayCount > 1) {
			return -1;
		}
		else {
			return highestPlayer;
		}
	}

}
