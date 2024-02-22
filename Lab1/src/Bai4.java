import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập biến b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập biến c: ");
		int c = scanner.nextInt();
		double Delta = Math.pow(b, 2) - 4 * a * c ;
		System.out.printf("Căn delta là %.2f",Math.sqrt(Delta));
	}

}