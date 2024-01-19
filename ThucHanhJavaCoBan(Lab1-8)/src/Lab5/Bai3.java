package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
	String tenSP; float gia;

	public SanPham(String tenSP, float gia) {
		this.tenSP = tenSP;
		this.gia = gia;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}
	
	
}

public class Bai3 {
	static ArrayList<SanPham> ds = new ArrayList<>();
	public static void nhap(Scanner s) {
		int n;
		System.out.print("Nhập số lượng sản phẩm: ");
		n = s.nextInt();
		s.nextLine();
		for(int i = 1; i <= n; i++) {
			System.out.printf("\nNhập thông tin sản phẩm thứ %d:\n", i);
			System.out.print("Nhập tên sản phẩm: ");
			String ten = s.nextLine();
			System.out.print("Nhập đơn giá: ");
			float donGia = s.nextFloat();
			s.nextLine();
			SanPham sa = new SanPham(ten, donGia);
			ds.add(sa); 	
		}
	}
	
	public static void xuat() {
		if(ds.isEmpty()) {
			System.out.print("Danh sách sản phẩm trống");
			return;
		}
		for (SanPham i : ds) {
			System.out.printf("\nTên sản phẩm: %s", i.getTenSP());
			System.out.printf("\nĐơn giá: %.2f", i.getGia());
			System.out.print("\n+------------------------+");
		}
	}
	
	public static void sapXepGiamDanTheoGia() {
		if(ds.isEmpty()) {
			System.out.print("Danh sách sản phẩm trống");
			return;
		}
		Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Float.compare(o2.getGia(), o1.getGia());
            }
        };
        Collections.sort(ds, comp);
        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        xuat();
	}
	
	public static void xoaSanPhamTheoTen(Scanner s) {
		if(ds.isEmpty()) {
			System.out.print("Danh sách sản phẩm trống");
			return;
		}
		String spCanXoa;
		s.nextLine();
		System.out.print("Nhập tên sản phẩm cần xóa: ");
		spCanXoa = s.nextLine();
		int check = 0;
		for (SanPham sp : ds) {
			if(sp.getTenSP().equalsIgnoreCase(spCanXoa)) {
				ds.remove(sp);
				check = 1;
				break;
			}
		}
		if(check == 0) System.out.printf("Không có sản phẩm %s", spCanXoa);
		else {
			System.out.printf("Đã xóa sản phẩm %s", spCanXoa);
		}
	}
	
	public static void xuatGiaTrungBinh() {
		if(ds.isEmpty()) {
			System.out.print("Danh sách sản phẩm trống");
			return;
		}
		float t = 0;
		for (SanPham sp : ds) {
			t += sp.getGia();
		}
		
		float tb = t / ds.size();
		System.out.printf("Giá trị trung bình của các sản phẩm là: %.2f", tb);
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice;
		System.out.println("1. Nhập danh sách sản phẩm");
		System.out.println("2. Xuất danh sách sản phẩm");
        System.out.println("3. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("4. Tìm và xóa sản phẩm theo tên");
        System.out.println("5. Xuất giá trung bình của các sản phẩm");
        System.out.println("0. Thoát");
        do {
            
            System.out.print("\nNhập lựa chọn: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    nhap(s);
                    break;
                case 2:
                	xuat();
                    break;
                case 3:
                    sapXepGiamDanTheoGia();
                    break;
                case 4:
                    xoaSanPhamTheoTen(s);
                    break;
                case 5:
                    xuatGiaTrungBinh();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 0);
	}
}
