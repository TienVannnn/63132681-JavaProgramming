package Lab8;

public final class Bai1 {
	
	// bài 1:
	
	public static final double sum(double...ds) {
		double total = 0;
		for(double i : ds) {
			total += i;
		}
		return total;
	}
	
	// bài 2:
	public static final double min(double...x) {
		double m = x[0];
		for(double i : x) {
			if(i < m) {
				m = i;
			}
		}
		return m;
	}
	
	public static final double max(double...x) {
		double m = x[0];
		for(double i : x) {
			if(i > m) {
				m = i;
			}
		}
		return m;
	}
	
	// bài 3
	public static final String toUpperFirstChar(String s) {
		if (s == null || s.isEmpty()) {
            return s;
        }
		
		// tách chuỗi thành mảng các từ
		String words[] = s.split(" ");
		
		// duyệt và chuyển đổi ký tự đầu tiên của mỗi từ
		
		for(int i = 0; i < words.length; i++) {
			char firstChar = words[i].charAt(0);
			String upperFirstChar = String.valueOf(firstChar).toUpperCase();
			words[i] = upperFirstChar + words[i].substring(1);
		}
		// nối các từ lại thành chuỗi
		String ss = String.join(" ", words);
		return ss;

	}

	public static void main(String[] args) {
		double result = sum(1.5, 2.7, 3.1, 4.2);
		System.out.println("Tổng = " + result);
		
		double min = min(12.2,34.2,1.3,4.2);
		double max = max(1.2,34.3,4.2);
		
		System.out.println("Số nhỏ nhất: " + min);
		System.out.println("Số lớn nhất: " + max);
		
		String input = "nguyen van teo";
        String bai3 = toUpperFirstChar(input);
        System.out.println("Chuỗi sau khi chuyển đổi: " + bai3);
	}

}
