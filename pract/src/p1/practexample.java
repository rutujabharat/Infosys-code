package p1;

import java.util.Scanner;

public class practexample {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = scan.nextInt();
	
	if(n>=2 && n<=20) {
		for(int i=1; i<=10; i++) {
			int y = i*n;
			System.out.println(y);
		}
		
	}
	
	
	
			
}	
	
}
