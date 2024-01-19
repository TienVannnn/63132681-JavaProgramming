package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Float> ds = new ArrayList<>();
		int n;
		System.out.print("Nhập số lượng số thực: ");
		n = s.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i+1);
			float x = s.nextFloat();
			ds.add(x);
		}
		System.out.print("Danh sách các phần tử vừa nhập: ");
		for (Float i : ds) {
			System.out.print(i + " ");
		}
		
		float t = 0;
		for (Float i : ds) {
			t += i;
		}
		System.out.printf("\nTổng các phần tử: %.2f", t);
		s.close();
	}

}
