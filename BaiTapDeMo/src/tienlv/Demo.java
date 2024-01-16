package tienlv;

import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cộng 2 số nguyên
//		int a = 5, b = 6, c;
//		c = a + b;
//		System.out.print(c);
		
		// tính điểm trung bình
		float a = 8.7f;
		float b = 7.2f;
		float c = 6.0f;
		float dtb = (a * 2 + b + c)/4;
		System.out.printf("Điểm trung bình: %.3f\n", dtb);
		
		// khai báo 2 biến họtên và năm sinh, tính tuổi và in ra màn hình
		String hoTen = "Lê Văn Tiến";
		int namSinh = 2003;
		int age;
		Calendar ca = Calendar.getInstance();
		age = ca.get(Calendar.YEAR) - namSinh;
		System.out.print(hoTen + " năm nay " + age + " tuổi");
		System.out.printf("\n%s năm nay %d tuổi", hoTen, age);
	}

}
