package Lab7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
	Scanner s = new Scanner(System.in);
	Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	String hoTen;
	float diem;
	int namSinh;
	public SinhVien() {
	}
	
	public void nhap() {
		System.out.print("Nhập họ tên: ");
		hoTen = s.nextLine();
		System.out.print("Nhập điểm: ");
		diem = s.nextFloat();
		System.out.print("Nhập năm sinh: ");;
		namSinh = s.nextInt();
		s.nextLine();
	}
	
	public String getHocLuc() {
		if(diem < 5) return "Yếu";
		else if(diem < 6.5) return "Trung bình";
		else if(diem < 8) return "Khá";
		else if(diem < 9) return "Giỏi";
		return "Xuất sắc";
	}
	
	public void xuat() {
		System.out.printf("\nHọ tên: %s\n Điểm: %.2f\n Tuổi: %d\n Học lực: %s", hoTen, diem, year - namSinh, getHocLuc());
	}
}

public class Bai4 {
	ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
	Scanner s = new Scanner(System.in);
	int n;
	public void nhap() {
		System.out.print("Nhập số lượng sinh viên: ");
		n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.printf("\nNhập thông tin sinh viên thứ %d:\n", i);
			SinhVien sv = new SinhVien();
			sv.nhap();
			ds.add(sv);
		}
		System.out.println("Đã nhập xong thông tin các sinh viên");
	}
	
	public void xuat() {
		if(ds.isEmpty()) System.out.print("Danh sách sinh viên trống");
		else {
			System.out.println("Danh sách sinh viên:");
			for (SinhVien sv : ds) {
				sv.xuat();
				System.out.println("\n+------------------+");
			}
		}
	}
	
	public void xuatSVGioi() {
		if(ds.isEmpty()) System.out.print("Danh sách sinh viên trống");
		else {
			int check = 0;
			System.out.println("\nDanh sách các sinh viên có học lực giỏi là:");
			for (SinhVien sv : ds) {
				if(sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
					sv.xuat();
					check = 1;
					System.out.println("\n+------------------+");
				}
			}
			if(check == 0) System.out.println("Không có sinh viên học lực giỏi");
		}
	}
	
	public void sapXep() {
		Comparator<SinhVien> co = new Comparator<SinhVien>() {
			
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return Float.compare(o1.diem, o2.diem);
			}
		};
		if(ds.isEmpty()) System.out.print("Danh sách sinh viên trống");
		else
		{
			Collections.sort(ds, co);
			System.out.print("Danh sách sinh viên sau khi sắp xếp giảm dần theo điểm: ");
			xuat();
		}
	}
	

	public static void main(String[] args) {
		Bai4 b = new Bai4();
		Scanner s = new Scanner(System.in);
		System.out.print("+------------------+\n");
		System.out.println("+ Danh sách lựa chọn +");
		System.out.println("1. Nhập danh sách sinh viên");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
		System.out.println("4. Sắp xếp danh sách theo điểm");
		System.out.println("5. Kết thúc");
		System.out.println("+------------------+");
		int choice;
		do {
			System.out.print("\nNhập lựa chọn: ");
			choice = s.nextInt();
			switch(choice) {
			case 1:{
				b.nhap();
				break;
			}
			case 2:{
				b.xuat();
				break;
			}
			case 3:{
				b.xuatSVGioi();
				break;
			}
			case 4:{
				b.sapXep();
				break;
			}
			case 5:{
				System.exit(0);
				System.out.print("Chương trình kết thúc!");
			}
			default:{
				System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại");
			}
			}
		}while(choice != 0);
	}

}
