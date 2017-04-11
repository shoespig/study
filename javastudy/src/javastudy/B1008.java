package javastudy;

import java.util.Scanner;
public class B1008 {

		public static void main(String[] args) {
			double A, B;
			Scanner s = new Scanner(System.in);

			A = s.nextInt();
			B = s.nextInt();

			
			if (0 < A&&B < 10) {
			System.out.printf("%.9f", A / B);
			}
		}

	

}
