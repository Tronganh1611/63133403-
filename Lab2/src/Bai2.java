import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập biến c: ");
		int c = scanner.nextInt();
		if (a==0) {
			if(b == 0){
				if(c == 0){
				System.out.print("Phương trình có vô số nghiệm");
				}
				else{ System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				double x=-c/b;
				System.out.printf("nghiệm của phương trình là x = %.2f", x);
				
			}
		}else {
			double Delta = Math.pow(b, 2) - 4 * a * c ;
			if (Delta <0) System.out.print("Phương trình vô nghiệm");
			else if (Delta == 0) System.out.printf("phương trình có nghiệm kép là x = %.2f", -b/(2*a));
			else if (Delta > 0) System.out.printf("phương trình có 2 nghiệm là x1 = %.2f, x2 = %.2f", (-b+Math.sqrt(Delta))/(2*a),(-b-Math.sqrt(Delta))/(2*a));
			
		}

	}

}
