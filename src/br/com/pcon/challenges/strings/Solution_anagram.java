package br.com.pcon.challenges.strings;

public class Solution_anagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		
		if(a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
		        char ch = a.toLowerCase().charAt(i);
		        b = b.toLowerCase();
		        if (b.indexOf(ch) != -1) {
		          b = b.replaceFirst(ch + "", "");
		        } else {
		          return false;
		        }
		      }
		      return b.length() == 0;
		} else {
			return false;			
		}
	}

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String a = scan.next();
//		String b = scan.next();
//		scan.close();

		String a = "anagram";
		String b = "margana";

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

}
