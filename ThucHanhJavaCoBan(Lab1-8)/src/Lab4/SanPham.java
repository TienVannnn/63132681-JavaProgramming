package Lab4;

import java.util.Scanner;

// bài 1
public class SanPham {
	private String tenSP;
	private float donGia, giamGia;
	
	
	// bài 4
	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}

	public SanPham() {
		tenSP = "";
		donGia = 0;
		giamGia = 0;
	}
	
	// bài 3
	public SanPham(String tenSP, float donGia, float giamGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham(String ten, float donGia) {
//		this.tenSP = ten;
//		this.donGia = donGia;
//		giamGia = 0;
		this(ten,donGia,0);
	}

	public void nhap() {
		Scanner s= new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSP = s.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = s.nextFloat();
		System.out.print("Nhập mức giảm giá: ");
		giamGia = s.nextFloat();
	}
	
	private float getThueNhapKhau() {
		return 0.1f * donGia;
	}
	
	public void xuat() {
		System.out.println("\nTên sản phẩm: " + tenSP);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế: " + getThueNhapKhau());
		
		
	}
}


// bài 2
class DsSP {
		SanPham ds[];
		public void nhap() {
			Scanner s = new Scanner(System.in);
	        System.out.print("Nhập số lượng sản phẩm: ");
	        int n = s.nextInt();
	        ds = new SanPham[n];
	        for (int i = 0; i < n; i++) {
	            ds[i] = new SanPham();
	            System.out.printf("\nNhập sản phẩm thứ %d\n", i + 1);
	            ds[i].nhap();
	        }
	        s.close();
		}
		
		public void xuat() {
			System.out.println("Danh sách sản phẩm:");
	        for (int i = 0; i < ds.length; i++) {
	            ds[i].xuat();
	        }
		}
}
