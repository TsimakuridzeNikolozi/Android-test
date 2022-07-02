public class Proper_Braces {
	public static boolean isProperly(String sequence){
		int opened = 0, closed = 0;
		for (int i = 0; i < sequence.length(); i++){
			char c = sequence.charAt(i);
			
			if (c == '(') opened++;
			else if (c == ')') closed++;
			
			if (closed > opened)
				return false;
			else if (closed == opened){
				opened = 0;
				closed = 0;
			}
		}
		
		if (opened != closed) return false;
		return true;
	}
}
