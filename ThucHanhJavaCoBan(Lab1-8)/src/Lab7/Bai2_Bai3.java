package Lab7;

abstract class SinhVienPoly{
	String hoTen, nganh;
	public SinhVienPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	abstract float getDiem();
	public String getHocLuc() {
		if(getDiem() < 5) return "Yếu";
		else if(getDiem() < 6.5) return "Trung bình";
		else if(getDiem() < 7.5) return "Khá";
		else if(getDiem() < 9) return "Giỏi";
		return "Xuất sắc";
	}
	public void xuat() {
		System.out.printf("\n Họ tên: %s\n Ngành: %s\n Điểm: %.2f\n Học lực: %s\n", hoTen, nganh, getDiem(), getHocLuc());
	}
}

class SinhVienIT extends SinhVienPoly{
	float diemJava, diemCss, diemHtml;
	public SinhVienIT(String hoTen, float diemJava, float diemCss, float diemHtml) {
		super(hoTen, "CNTT");
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	
	@Override public float getDiem() {
		return (2 * diemJava + diemHtml + diemCss)/4;
	}
}

class SinhVienBiz extends SinhVienPoly{
	float diemMa, diemSale;
	public SinhVienBiz(String hoTen, float diemMa, float diemSale) {
		super(hoTen, "Marketing");
		this.diemMa = diemMa;
		this.diemSale = diemSale;
	}
	
	@Override public float getDiem() {
		return (2 * diemMa + diemSale)/3;
	}
}

public class Bai2_Bai3 {
	public static void main(String argc[]) {
		SinhVienIT svIt = new SinhVienIT("Lê Văn Tiến", 8.2f, 9, 8.8f);
		SinhVienBiz svBiz = new SinhVienBiz("Lê Văn Linh", 7.2f, 6);
		svBiz.xuat();
		svIt.xuat();
	}
}
