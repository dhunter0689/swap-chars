
public class SwapChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String Swap2(String str) {
		// TODO Auto-generated method stub
		
		int strLength = str.length();
		if(strLength < 2) {
		return str;
		}char lastCharacter = str.charAt(strLength - 1);
		char secondLastCharacter = str.charAt(strLength - 2);
		
		return "" + lastCharacter + secondLastCharacter; // returns string with the swap of characters in an index
	}
	
}
