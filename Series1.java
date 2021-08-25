package Series;

import java.util.Scanner;


public class Series1 {
	public static void main(String[] args) {
		// 1+2+3+4+5+........n
		System.out.println("Enter the last digit of the loop:\n\n");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum=0;
		for(int i = 0; i<=n; i++) {
			System.out.printf("%d ", i);
			sum =sum+i;
		}
		System.out.println("\n");
		//if I want to get the sum, please wait
		
		System.out.println("The Sum is :" + sum);
	}
}
