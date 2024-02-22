import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng: ");
		int soDien = scanner.nextInt();
		int tien = 0 ;
		if (soDien <= 50) tien = soDien*1000;
		else if (soDien > 50) tien = 50*1000 + (soDien-50)*1200;
		System.out.printf("Số tiền điện sử dụng trong tháng này là %d", tien);
	}

}
