package BTTH;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        //bai1();
        bai2();
    }

    //  Bài 1
    public static void bai1() {
        Scanner s = new Scanner(System.in);
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
    public static void bai2() {
        Scanner s = new Scanner(System.in);
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
}
