package BTTH;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// Bài 1
		Scanner s = new Scanner(System.in);
		String hoTen;
		float dtb;
		
		System.out.print("Nhập họ tên: ");
		hoTen = s.nextLine();
		
		System.out.print("Nhập điểm trung bình: ");
		dtb = s.nextFloat();
		
		System.out.print(hoTen + " " + dtb + " điểm\n");
		System.out.println(hoTen + " " + dtb + " điểm");
		System.out.printf("%s %.2f điểm", hoTen, dtb);
		s.close();
		
		
		// Bài 2
		
	}

}
