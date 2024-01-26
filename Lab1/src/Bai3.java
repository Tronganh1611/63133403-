import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double tt = Math.pow(canh, 3);
		System.out.printf("Thể tích: %.2f ",tt);
	}

}
