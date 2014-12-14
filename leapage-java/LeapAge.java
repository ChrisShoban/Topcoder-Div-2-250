public class LeapAge {

	public int getAge(int year, int born) {
		int leapYearCount = 0;
		born++;
		while(born <= year) {
			if(born % 4 == 0) {
				if(born %400 == 0) {
					leapYearCount++;
				}
				else if(born % 100 == 0) {
					
				}
				else {
					leapYearCount++;
				}
				born+=4;
			}
			else {
				born++;
			}
		}
		return leapYearCount;
	}

}
