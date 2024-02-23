import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] ten = new String[n];
        double[] d = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            ten[i] = scanner.nextLine();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
        	System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            d[i] = scanner.nextDouble();
        }
        

        // Sắp xếp sinh viên theo điểm tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (d[i] > d[j]) {
                    // Hoán đổi điểm
                    double tam = d[i];
                    d[i] = d[j];
                    d[j] = tam;

                    // Hoán đổi họ tên
                    String tam1 = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tam1;
                }
            }
        }

        // Xuất thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + ten[i]);
            System.out.println("Điểm: " + d[i]);
            if (d[i] < 5) {
                System.out.println("Học lực: yếu ");
            } else if (d[i] < 6.5) {
            	System.out.println("Học lực: trung bình ");
            } else if (d[i] < 7.5) {
            	System.out.println("Học lực: khá ");
            } else if (d[i]< 9) {
            	System.out.println("Học lực: giỏi ");
            } else {
            	System.out.println("Học lực: xuất sắc ");
            }
        }
    }

}
