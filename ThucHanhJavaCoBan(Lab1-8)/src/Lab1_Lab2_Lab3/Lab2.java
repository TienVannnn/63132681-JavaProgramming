package Lab1_Lab2_Lab3;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//nhapbai1(s);
		//bai2(s);
		//bai3(s);
		bai4(s);

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
	
	// bài 3: Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
	// phương pháp lũy tiến
	public static void bai3(Scanner s) {
		float soDien, tien;
		System.out.print("Nhập số điện: ");
		soDien = s.nextFloat();
		if(soDien <= 50) tien = soDien * 1000;
		else tien  = 50 * 1000 + (soDien - 50) * 1200;
		System.out.printf("Tien dien = %.2f", tien);
	}

	
	// bài 4:
	public static void bai4(Scanner s) {
		int choice;
		System.out.println("+------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");	
		System.out.println("+------------------+");
		do {
			System.out.print("Bạn chọn: ");
			choice = s.nextInt();   
			switch(choice) {
			case 1:{
				nhapbai1(s);
				break;
			}
			case 2:{
				bai2(s);
				break;
			}
			case 3:{
				bai3(s);
				break;
			}
			case 4:{
				System.out.print("Thoát chương trình!!!");
				System.exit(0);
			}
			default: {
				System.out.print("Nhập không hợp lệ, vui lòng nhập lại: \n");
			}
			}
		}while(choice < 1 || choice > 4);
	}

}
