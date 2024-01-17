package BTTH;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		nhapbai1(s);
		
		//bai2(s);

	}
	
	public static void nhapbai1(Scanner s) {
		int a, b;
		System.out.print("Nhập hệ số pt bac nhat(ax + b):\n");
		System.out.print("Nhập a: ");
		a = s.nextInt();
		
		System.out.print("Nhập b: ");
		b = s.nextInt();
		bai1(s,a,b);
	}
	
	
//	 bài 1: Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
//	nhập từ bàn phím
	public static void bai1(Scanner s, int a, int b) {
		if(a == 0) {
			if(b == 0) System.out.println("Phương trình vô số nghiệm");
			else System.out.println("Phương trình vô nghiệm");
		}
		else {
			float x = (float)-b / a;
			System.out.printf("Nghiệm của phương trình  x = %.2f", x);
		}
	}
	
//	// bài 2: Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
//	nhập từ bàn phím
	public static void bai2(Scanner s) {
		int a, b, c;
		System.out.print("Nhập 3 hệ số của phương trình bậc 2(ax^2 + bx + c):\n");
		System.out.print("Nhập a: ");
		a = s.nextInt();
		
		System.out.print("Nhập b: ");
		b = s.nextInt();
		
		System.out.print("Nhập c: ");
		c = s.nextInt();
		
		if(a == 0) {
			bai1(s,b,c);
		}
		else {
			int denTa = b * b - 4 * a * c;
			if(denTa < 0) System.out.println("Phương trình vô nghiệm");
			else if(denTa == 0) System.out.printf("Phương trình có 1 nghiệm kép: x = %.2f", (float)-b/(2 * a));
			else {
				float x1 = (float)(-b - Math.sqrt(denTa))/ (2 * a);
				float x2 = (float)(-b + Math.sqrt(denTa))/ (2 * a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f; x2 = %.2f", x1,x2);
			}
		}
		
	}
	
	

}
