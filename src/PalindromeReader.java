
public class PalindromeReader extends Reader {

	public PalindromeReader(String file) {
		super.file = file;
	}
	
	private boolean estPalindrome(int begin, int end) {
    	if(begin == end) {
    		return true;
    	}
    	if(content.charAt(begin) != content.charAt(end)) {
    		return false;
    	}
    	return estPalindrome(begin+1, end-1);
	 
	}
	
	public void display() {
		super.read(file);
		if(estPalindrome(0, super.content.length()-1)) {
			System.out.println("C'est un palindrome");
		} 
		else {
			System.out.println("Ce n'est pas un palindrome");
		} 
	}
	
}
