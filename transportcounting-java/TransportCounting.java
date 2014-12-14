public class TransportCounting {

	public int countBuses(int speed, int[] positions, int[] velocities, int time) {
		int count = 0;
		int distance = speed * time;
		for(int i = 0; i < velocities.length; i++) {
			if(positions[i] == 0) {
				count++;
			}
			else {
				positions[i] += (velocities[i] * time); 
				if(positions[i] <= distance) {
					count++;
				}
			}
		}
		return count;
	}

}
