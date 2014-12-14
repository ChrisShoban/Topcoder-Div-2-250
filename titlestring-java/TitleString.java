public class TitleString {

	public String toFirstUpperCase(String title) {
		/*
		char[] c = title.toCharArray(); 
        boolean first=true; 
        for( int i=0; i<c.length; i++ ) { 
            if(c[i]==' ') { 
                first = true; 
                continue; 
            } 
            if(first) { 
                c[i] = Character.toUpperCase(c[i]); 
                first=false; 
            } 
        } 
        return new String(c); 
        */
        //*
		String result = "";
		for(int i = 0; i < title.length(); i++) {
			if((i == 0 && title.charAt(i) != ' ') || (i > 0 && title.charAt(i - 1) == ' ' && title.charAt(i) != ' ')) {
				result += ((char)(title.charAt(i) + ('A' - 'a')));
			}
			else {
				result += title.charAt(i);
			}
			
		}
		System.out.println(title.length());
		System.out.println(result.length());
		return result.toString();
		//*/
	}

}
