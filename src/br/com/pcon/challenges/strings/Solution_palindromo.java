package br.com.pcon.challenges.strings;

public class Solution_palindromo {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
    	
    	String A = "sdfsdfsdff";
    	
    	String[] aux = new String[A.length()];
    	String palindromo = "";
    	
    	for(int i = A.length(); i > 0; i--) {
    		aux[i-1] = A.substring(i-1, i);
    		palindromo = palindromo + aux[i-1];
    	}
    	
    	System.out.println(palindromo);
    	if(palindromo.equals(A)) {
    		System.out.println("Yes");
    	}
    }
}
