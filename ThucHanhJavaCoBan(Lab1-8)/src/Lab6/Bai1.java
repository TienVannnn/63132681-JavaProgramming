package Lab6;

import java.util.Scanner;

public class Bai1 {
	
	public static String layHo(String h) {
		int tuDau = h.indexOf(" ");
		return h.substring(0, tuDau);
	}
	
	public static String layTuDem(String h) {
		int viTriDau = h.indexOf(" ");
		int viTriCuoi = h.lastIndexOf(" ");
		return h.substring(viTriDau + 1, viTriCuoi);
	}
	
	public static String layTen(String h) {
		int viTriCuoi = h.lastIndexOf(" ");
		return h.substring(viTriCuoi + 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String hoTen;
		System.out.print("Nhập họ tên: ");
		hoTen = s.nextLine();
		String ho = layHo(hoTen);
		String dem = layTuDem(hoTen);
		String ten = layTen(hoTen);
		System.out.print("Họ và tên sau khi in hoa họ và tên: " + ho.toUpperCase() + " " + dem + " " +  ten.toUpperCase());
		s.close();
	}

}
