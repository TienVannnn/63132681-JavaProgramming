package BTTH;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        //bai1(s);
        //bai2(s);
    	//bai3(s);
    	bai4(s);
    }

    //  Bài 1
    public static void bai1(Scanner s) {
        String hoTen;
        float dtb;

        System.out.print("Nhập họ tên: ");
        hoTen = s.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        dtb = s.nextFloat();

        System.out.print(hoTen + " " + dtb + " điểm\n");
        System.out.println(hoTen + " " + dtb + " điểm");
        System.out.printf("%s %.2f điểm", hoTen, dtb);
        s.close();
    }

    // Bài 2
    public static void bai2(Scanner s) {
        int chieuDai, chieuRong;
        System.out.print("Nhập chiều dài: ");
        chieuDai = s.nextInt();

        do {
            System.out.print("Nhập chiều rộng: ");
            chieuRong = s.nextInt();
            if (chieuRong >= chieuDai) {
                System.out.print("Chiều rộng phải bé hơn chiều dài\n");
            }
        } while (chieuRong >= chieuDai);

        int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        int canhMin = Math.min(chieuDai, chieuRong);
        System.out.print("Chu vi: " + chuVi);
        System.out.println("\nDiện tích: " + dienTich);
        System.out.printf("Cạnh nhỏ nhất: %d", canhMin);
        s.close();
    }
    
    // Bài 3
    public static void bai3(Scanner s) {
    	float canh;
    	do {
    		System.out.print("Nhập cạnh của khối lập phương ( cạnh > 0): ");
        	canh = s.nextFloat();
    	}while(canh <= 0);
    	double theTich = Math.pow(canh, 3);
    	System.out.print("Thể tích khối lập phương: " + theTich);
    	
    }
    
    // Bài 4
    public static void bai4(Scanner s) {
    	System.out.print("Nhập vào 3 cạnh của phương trình bậc 2:\n");
    	int a,b,c;
    	System.out.print("Nhập a: ");
    	a = s.nextInt();
    	
    	System.out.print("Nhập b: ");
    	b = s.nextInt();
    	
    	System.out.print("Nhập c: ");
    	c = s.nextInt();
    	
    	float denTa = b * b - 4 * a * c;
    	if(denTa < 0) System.out.print("Chương trình vô nghiệm vì denTa < 0");
    	else System.out.printf("Căn denta = %.2f", Math.sqrt(denTa));
    }
    
    // bài 5
}
