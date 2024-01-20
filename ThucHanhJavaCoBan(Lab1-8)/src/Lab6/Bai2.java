package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

class SanPham{
	public SanPham() {
	}
	Scanner s = new Scanner(System.in);
	String tenSP, hang;
	double donGia;
	
	public SanPham(String tenSP, String hang, double donGia) {
		super();
		this.tenSP = tenSP;
		this.hang = hang;
		this.donGia = donGia;
	}
	
	public void nhap() {
		System.out.print("Nhập tên sản phẩm: ");
		tenSP = s.nextLine();
		System.out.print("Nhập hãng: ");
		hang = s.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = s.nextDouble();
		s.nextLine();
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm: " + tenSP + " || Tên hãng: " + hang + " || Đơn giá: " + donGia);
	}
}

public class Bai2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<SanPham> sp = new ArrayList<SanPham>();;
		int n;
		System.out.print("Nhập số sản phẩm: ");
		n = s.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.printf("\nNhập sản phẩm thứ %d:\n", i + 1);
			SanPham sa = new SanPham();
			sa.nhap();
			sp.add(sa);
		}
		int check = 0;
		System.out.println("\nDanh sách các sản phẩm:");
		for (SanPham sanPham : sp) {
			if(sanPham.hang.equalsIgnoreCase("Nokia")) {
				sanPham.xuat();
				check = 1;
			}
		}
		if(check == 0) System.out.print("Không có sản phẩm nào có hãng Nokia");
		s.close();
	}
}
