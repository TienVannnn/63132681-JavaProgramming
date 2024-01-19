package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
	
	public static void nhap(ArrayList<String> ds, Scanner s) {
		
		int n;
		System.out.print("Nhập số lượng họ tên: ");
		n = s.nextInt();
		s.nextLine();
		for(int i = 1; i <= n; i++) {
			System.out.printf("Nhập họ tên thứ %d: ", i);
			String ho = s.nextLine();
			ds.add(ho);
		}
	}
	
	public static void xuat(ArrayList<String> ds) {
		for (String i : ds) {
			System.out.println(i);
		}
	}
	
	public static void xuatNgauNhien(ArrayList<String> ds) {
		Collections.shuffle(ds);
		xuat(ds);
	}
	
	public static void sxGiamDan(ArrayList<String> ds) {
		Collections.sort(ds);
		Collections.reverse(ds);
		xuat(ds);
	}
	
	public static void xoaHoTen(ArrayList<String> ds, Scanner s) {
		String tk;
		System.out.print("Nhập họ tên cần xóa: ");
		tk = s.nextLine();
		int tam = 0;
		for (String i : ds) {
			if(i.equalsIgnoreCase(tk)) {
				ds.remove(i);
				tam = 1;
				break;
			}
		}
		if(tam == 0) System.out.printf("Không có họ tên %s", tk);
		else {
			System.out.println("Danh sách sau khi xóa: ");
			xuat(ds);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		ArrayList<String> ds = new ArrayList<String>();
		
		int choice;
		do {
			
			System.out.println("+-----------------+");
			System.out.println("Các lựa chọn: ");
			System.out.println("1. Nhập danh sách họ tên");
			System.out.println("2. Xuất danh sách: ");
			System.out.println("3. Xuất danh sách ngẫu nhiên");
			System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
			System.out.println("5. Tìm và xóa họ tên");
			System.out.println("6. Kết thúc ");
			System.out.println("+-----------------+");
			System.out.print("\nBạn chọn: ");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:{
				nhap(ds,s);
				break;
			}
			case 2:{
				System.out.println("Danh sách họ tên vừa nhập là:");
				xuat(ds);
				break;
			}
			case 3:{
				System.out.println("Danh sách họ tên được hoán đổi ngẫu nhiên:");
				xuatNgauNhien(ds);
				break;
			}
			case 4:{
				System.out.println("Danh sách họ tên được sắp xếp giảm dần:");
				sxGiamDan(ds);
				break;
			}
			case 5:{
				xoaHoTen(ds,s);
				break;
			}
			case 6:{
				System.out.print("Kết thúc chương trình!!!");
				System.exit(0);
			}
			default:{
				System.out.print("Nhập không hợp lệ, vui lòng nhập lại!");
			}
			}
		}while(choice != 6);
	}
}
