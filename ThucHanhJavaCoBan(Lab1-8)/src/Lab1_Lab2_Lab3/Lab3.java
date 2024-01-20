package Lab1_Lab2_Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//bai1(s);
		//bai2();
		//bai3(s);
		bai4(s);
		   

	}
	   
	// bài 1: Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số nguyên tố hay không
	public static void bai1(Scanner s) {
		int n;  
		boolean check = true;
		System.out.print("Nhập n: ");
		n = s.nextInt();
		if(n < 2) {
			System.out.printf("%d không phải là số nguyên tố", n);
			return; 
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				check = false;
				break;
			}
		}
		if(!check) System.out.printf("%d không phải là số nguyên tố", n);
		else System.out.printf("%d là số nguyên tố", n);
	}
	
	// bài 2: Viết chương trình xuất ra màn hình bảng cửu chương
	public static void bai2() {
		for(int i = 1; i <= 9; i++) {
			System.out.println("Bảng cửu chương: " + i);
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j, i * j);
			}
			System.out.println();
		}
	}
	
	// bài 3:Viết chương trình nhập mảng số nguyên từ bàn phím...

	public static void bai3(Scanner s) {
		int n;
		System.out.print("Nhập mảng gồm n phần tử: ");;
		n = s.nextInt();
		int a[] = new int[n];
		nhapMang(s,a,n);
		xuatMang(a,n);
		ptMin(a,n);
		tbcPTChiaHet3(a,n);
	}
	
	public static void nhapMang(Scanner s, int a[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhập a[%d]: ", i);;
			a[i] = s.nextInt();
		}
	}
	
	public static void xuatMang(int a[], int n) {
		System.out.print("Mảng sau khi sắp xếp: ");
		Arrays.sort(a);
		for(int i = 0 ; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
	
	public static void ptMin(int a[], int n) {
		int min = a[0];
		for(int i = 1 ; i < n; i++) {
//			if(a[i] < min) min = a[i];
			Math.min(min, a[i]);
		}
		System.out.printf("\nPhần từ nhỏ nhất của mảng là: %d", min);
	}
	
	public static void tbcPTChiaHet3(int a[], int n) {
		int t = 0, dem = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] % 3 == 0) {
				t += a[i]; dem++;
			}
		}
		float tbc = (float) t/dem;
		System.out.printf("\nTrung bình cộng các phần tử chia hết cho 3 = %.2f", tbc);
	}
	
	public static String hocLuc(float d) {
		if(d < 5) return "Yếu";
		else if(d < 6.5) return "Trung bình";
		else if(d < 7.5) return "Khá";
		else if(d < 9) return "Giỏi";
		else return "Xuất sắc";
	}
	
	public static void swapDiem(float a[], int i, int j) {
	    float t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}

	public static void swapTen(String a[], int i, int j) {
	    String t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	}

	public static void sxTangTheoDiem(String a[], float b[], int n) {
	    for(int i = 0; i < n - 1; i++) {
	        for(int j = i + 1; j < n; j++) {
	            if(b[i] > b[j]) {
	                swapDiem(b, i, j);
	                swapTen(a, i, j);
	            }
	        }
	    }
	    for(int i = 0; i < n; i++) {
	        System.out.printf("\nTên: %s - Học lực %s", a[i], hocLuc(b[i]));
	    }
	}
	
	// bài 4: Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên...
	public static void bai4(Scanner s) {
		int n;
		do {
			System.out.print("Nhập số lượng sinh viên: ");
			n = s.nextInt();
		}while(n < 1 || n > 10);
		s.nextLine();
		String a[] = new String[n];
		float b[] = new float[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("\nsinh viên thứ %d:\n", i+1);
			System.out.print(" + Nhập họ tên sinh viên: ");
			a[i] = s.nextLine();
			System.out.print(" + Nhập điểm: ");
			b[i] = s.nextFloat();
			s.nextLine();
		}
		System.out.print("\nDanh sách các sinh viên:");
		for(int i = 0; i < n; i++) {
			System.out.printf("\nTên: %s - Học lực %s", a[i], hocLuc(b[i]));
		}
		System.out.print("\n\nDanh sách các sinh viên sắp xếp tăng dần theo điểm: ");
		sxTangTheoDiem(a,b,n);
		
	}

}
