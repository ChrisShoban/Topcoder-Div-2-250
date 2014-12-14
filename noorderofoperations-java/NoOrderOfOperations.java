public class NoOrderOfOperations {

	public int evaluate(String expr) {
		int total = Integer.parseInt(expr.charAt(0) + "");
		for(int i = 1; i < expr.length(); i+=2) {
			if(expr.charAt(i) == '+') {
				total += Integer.parseInt(expr.charAt(i + 1) + "");
			}
			else if(expr.charAt(i) == '-') {
				total -= Integer.parseInt(expr.charAt(i + 1) + "");	
			}
			else if(expr.charAt(i) == '*') {
				total *= Integer.parseInt(expr.charAt(i + 1) + "");
			}
		}
		return total;
	}

}
