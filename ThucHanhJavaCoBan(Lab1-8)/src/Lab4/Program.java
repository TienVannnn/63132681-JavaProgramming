package Lab4;

public class Program {
	
	static void bai1() {
		SanPham sa = new SanPham();
		sa.nhap();
		sa.xuat();
	}
	
	static void bai2() {
        DsSP ds = new DsSP();
        ds.nhap();
        ds.xuat();
	}
	
	static void bai3() {
		SanPham s = new SanPham("Bánh ngọt", 55);
		SanPham s2 = new SanPham("Trái cây", 123.3f, 10);
		s.xuat();
		s2.xuat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bai1();
		bai2();
		//bai3();
	}

}
