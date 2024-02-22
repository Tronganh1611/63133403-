
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ma;
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            ma = scanner.nextInt();
            switch (ma) {
            case 1:
                giaiPTB1();
                break;
            case 2:
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Kết thúc chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }
}

public static void giaiPTB1() {
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

public static void giaiPTB2() {
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

public static void tinhTienDien() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện sử dụng: ");
    int soDien = scanner.nextInt();
    int tien = 0 ;
    if (soDien <= 50) tien = soDien*1000;
    else if (soDien > 50) tien = 50*1000 + (soDien-50)*1200;
    System.out.printf("Số tiền điện sử dụng trong tháng này là %d", tien);
}

}
