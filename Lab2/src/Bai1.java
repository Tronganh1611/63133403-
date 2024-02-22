import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b: ");
		int b = scanner.nextInt();
		if(a == 0){
			if(b == 0){
			System.out.print("Phương trình có vô số nghiệm");
			}
			else{ System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			double x=-b/a;
			System.out.printf("nghiệm của phương trình là x = %.2f", x);
			
		}
	}

}
