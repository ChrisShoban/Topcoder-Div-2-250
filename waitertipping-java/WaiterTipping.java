public class WaiterTipping {

	public int maxPercent(int total, int taxPercent, int money) {
		int tip = 0;
		if(total + Math.floor(total*taxPercent/100.0) + Math.floor(total*tip/100.0) > money) {
			return -1;
		}
		while(total + Math.floor(total*taxPercent/100.0) + Math.floor(total*tip/100.0) <= money) {
			tip++;
		}
		if(total + Math.floor(total*taxPercent/100.0) + Math.floor(total*tip/100.0) == money) {
			return tip;
		}
		else {
			return tip - 1;
		}
	}
}
