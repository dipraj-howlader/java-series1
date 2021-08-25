package Series;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
		int power = 2;
		 //1^2 2^2 3^2 4^2 ........n^2
		
		System.out.println("---Enter Series Last digit : \n\n");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum =0;
		for(int i = 1 ; i<=num; i++) {
			int mathPower = (int) Math.pow(i, power);
			System.out.printf("%d ", mathPower);
			sum = sum + mathPower;
			
		}
		//sum of Series values
		
		System.out.println("\nSum is : " + sum);
	}
}
