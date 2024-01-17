package BTTH;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		bai1(s);

	}
	
	public static void bai1(Scanner s) {
		int a, b;
		System.out.print("Nhập a: ");
		a = s.nextInt();
		
		System.out.print("Nhập b: ");
		b = s.nextInt();
		
		if(a == 0) {
			if(b == 0) System.out.println("Phương trình vô số nghiệm");
			else System.out.println("Phương trình vô nghiệm");
		}
		else {
			float x = (float)-b / a;
			System.out.printf("Nghiệm của phương trình (%dx + %d)\n x = %.2f", a,b,x);
		}
	}

}
