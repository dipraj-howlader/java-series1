package Series;

import java.util.Scanner;

public class Series3 {
	public static void main(String[] args) {
		System.out.println("I dont know anything\n");
		
	 /*	5 2
		6 3
		5 0 */
		
		/* 2 3 4 5 Sum=14
		3 4 5 6 Sum=18 */
		
		Scanner input1 = new Scanner(System.in);
		
		Scanner input2 = new Scanner(System.in);
		
		//where to end
		System.out.println("End Point:\n");
		int end = input1.nextInt();
		System.out.println("Start Point: \n");
		int start = input2.nextInt();
		int sum = 0;
		
		while(start <= end) {
			System.out.printf("%d ", start);
			sum = sum+ start;
			start++;
			
			
		}
		System.out.println("Sum="+ sum);
		
		
	}
}
