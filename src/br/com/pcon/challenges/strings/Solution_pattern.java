package br.com.pcon.challenges.strings;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution_pattern {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		String b = scan.next();
//		scan.close();
		
		String array[] = {"([A-Z])(.+)", "[AZ[a-z](a-z)", "batcatpat(nat"};
		
		int testCases = 3;
		while(testCases > 0) {
			String aux = array[testCases - 1];

			try {
				Pattern.compile(aux);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
		
		

	}

}
