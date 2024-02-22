import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập só nguyên N = ");
		int N = scanner.nextInt();
		boolean ok = true;
		if (N<2) System.out.printf("%d không phải số nguyên tố",N);
		else {
		for(int i=2; i < N; i++){ // N là số nhập từ bàn phím
		if(N % i == 0){
		ok = false;
		break;
		}
		}
		if (ok == true) System.out.printf("%d là số nguyên tố",N);
		else System.out.printf("%d không phải số nguyên tố",N);
	}
	}

}
