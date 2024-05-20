package p1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int x[][]=new int[3][4];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Rows");
		int row=scan.nextInt();
		System.out.println("enter Cols");
		int col=scan.nextInt();
		System.out.println("enter 2D Array elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			x[i][j]=scan.nextInt();	
			}
			//System.out.println();
		}
		System.out.println("Entered Array is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
			)
		
	}
	
}
