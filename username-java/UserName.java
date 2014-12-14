public class UserName {

	public String newMember(String[] existingNames, String newName) {
		boolean newMemberCheck = true;
		int num = 1;
		int total = 0;
		String result = newName;
		while(newMemberCheck) {
			for(String name : existingNames) {
				if(result.equals(name)) {
					result = newName + num;
					num++;
					break;
				}
				total++;
			}
			if(total == existingNames.length) {
				break;
			}
			total = 0;
		}
		return result;
	}

}
