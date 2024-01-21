package Lab7;

class ChuNhat {
    double chieuDai, chieuRong;

    public ChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai < chieuRong) {
        	System.out.println("Lỗi: Chiều dài phải lớn hơn chiều rộng.");
        } else {
        	this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    public double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double getDienTich() {
        return chieuDai * chieuRong;
    }

    public void xuat() {
        System.out.printf(" Chiều dài: %.1f\n Chiều rộng: %.1f\n Chu vi: %.1f\n Diện tích: %.1f", chieuDai, chieuRong,
                getChuVi(), getDienTich());
    }
}

class Vuong extends ChuNhat {
    int canh;

    public Vuong(int canh) {
        super(canh, canh);
        this.canh = canh;
    }

    @Override
    public void xuat() {
        super.xuat();
    }
}

public class Bai1 {

    public static void main(String[] args) {
    	System.out.print("Hình chữ nhật:\n");
        ChuNhat cn = new ChuNhat(7, 6);
        Vuong v = new Vuong(5);
        
        if(cn.chieuDai > cn.chieuRong) {
            cn.xuat();
        }
        
        System.out.print("\nHình vuông:\n");
        v.xuat();
    }
}
