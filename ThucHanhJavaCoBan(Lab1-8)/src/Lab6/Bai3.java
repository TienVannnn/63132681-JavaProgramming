package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
	Scanner s = new Scanner(System.in);
	String hoTen, email, sdt, cmnd;
	
	public SinhVien() {
		
	}

	public SinhVien(String hoTen, String email, String sdt, String cmnd) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}
	
	public void nhap() {
		String regexEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
		String regexSdt = "(0[3|5|7|8|9])+([0-9]{8})";
		String regexCmnd = "[0-9]{9}";
		System.out.print("Nhập họ tên: ");
		hoTen = s.nextLine();
		do {
			System.out.print("Nhập email: ");
			email = s.nextLine();
			if(!email.matches(regexEmail))System.out.print("Không đúng định dạng email, vui lòng nhập lại..\n");
		}while(!email.matches(regexEmail));
		do {
			System.out.print("Nhập số điện thoại: ");
			sdt = s.nextLine();
			if(!sdt.matches(regexSdt))System.out.print("Không đúng định dạng số điện thoại, vui lòng nhập lại..\n");
		}while(!sdt.matches(regexSdt));
		do {
			System.out.print("Nhập số chứng minh nhân dân: ");
			cmnd = s.nextLine();
			if(!cmnd.matches(regexCmnd))System.out.print("Không đúng định dạng cmnd, vui lòng nhập lại..\n");
		}while(!cmnd.matches(regexCmnd));
	}
	
}

public class Bai3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		System.out.print("Nhập số lượng sinh viên: ");
		n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.printf("\nNhập thông tin sinh viên thứ %d:\n", i);
			SinhVien sv = new SinhVien();
			sv.nhap();
			ds.add(sv);
		}
	}

}
