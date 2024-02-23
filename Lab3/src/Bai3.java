import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("Mảng sau khi sắp xếp :");
        for (int i = 0; i < n; i++){
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        int min = a[0];
        for (int i = 1; i < n; i++) min = Math.min(min, a[i]);
        System.out.print("Phần tử nhỏ nhất của mảng là "+min);
        System.out.println();
        int d = 0, tong =0;
        float tbc=0;
        for (int i = 0; i < n; i++){
        	if (a[i] % 3 == 0) {
        		d++;
        		tong=tong+a[i];
        	}
        }
        tbc = tong/d;
        System.out.printf("Trung bình cộng các phần tử chia hết cho 3 là %.2f",tbc);
    }
}
