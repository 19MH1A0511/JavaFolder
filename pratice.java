package rotimarker;

public class pratice {
	static String AddBinary(String x, String y) {
		int num = Integer.parseInt(x, 2);
		int num2 = Integer.parseInt(y, 2);
		int sum = num + num2;
		String result = Integer.toBinaryString(sum);
		return result;
	}
	

	public static void main(String[] args) {
		String x = "1011001", y = "01101110"; 
		System.out.println(AddBinary(x,y));

	}

}
