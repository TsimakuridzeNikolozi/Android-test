public class Palindrome {
	public static boolean isPalindrome(String s){
		s = s.toLowerCase();
		for(int i = 0; i < s.length()/2; i++){
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
}
