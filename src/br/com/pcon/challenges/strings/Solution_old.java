package br.com.pcon.challenges.strings;

public class Solution_old {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

    	for(int i = 0; i < s.length()-k+1; i++) {
    		String sub =  s.substring(i, i + k);
    		if(sub.compareTo(smallest) < 0) {
    			smallest = sub;
    		}
    		if(sub.compareTo(largest) > 0) {
    			largest = sub;
    		}
    	}
    	
    	System.out.println(smallest);
    	System.out.println(largest);

        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

    	
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
    	
    	String s = "welcometojava";
        int k = 3;
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
