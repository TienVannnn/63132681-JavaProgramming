package Lab4;

import java.util.Scanner;

// bài 1
public class SanPham {
	String tenSP;
	float donGia, giamGia;
	
	public SanPham() {
		tenSP = "";
		donGia = 0;
		giamGia = 0;
	}
	public SanPham(String tenSP, float donGia, float giamGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public void nhap() {
		Scanner s= new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSP = s.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = s.nextFloat();
		System.out.print("Nhập mức giảm giá: ");
		giamGia = s.nextFloat();
		s.close();
	}
	
	public float getThueNhapKhau() {
		return 0.1f * donGia;
	}
	
	public void xuat() {
		System.out.println("\nTên sản phẩm: " + tenSP);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế: " + getThueNhapKhau());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sa = new SanPham();
		sa.nhap();
		sa.xuat();
	}

}
