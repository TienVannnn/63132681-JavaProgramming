package BTTH;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//bai1(s);
		bai2();
		   

	}
	   
	// bài 1: Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số nguyên tố hay không
	public static void bai1(Scanner s) {
		int n;  
		boolean check = true;
		System.out.print("Nhập n: ");
		n = s.nextInt();
		if(n < 2) {
			System.out.printf("%d không phải là số nguyên tố", n);
			return; 
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				check = false;
				break;
			}
		}
		if(!check) System.out.printf("%d không phải là số nguyên tố", n);
		else System.out.printf("%d là số nguyên tố", n);
	}
	
	// bài 2: Viết chương trình xuất ra màn hình bảng cửu chương
	public static void bai2() {
		for(int i = 1; i <= 9; i++) {
			System.out.println("Bảng cửu chương: " + i);
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j, i * j);
			}
			System.out.println();
		}
	}
	
	// bài 3:

}
