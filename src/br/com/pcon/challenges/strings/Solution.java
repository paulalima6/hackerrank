package br.com.pcon.challenges.strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
		

	}

}

class MyRegex {

	public String pattern;

//	IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
//	Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
	
	
	
}