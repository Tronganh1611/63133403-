import java.util.Scanner;

public class Bai1 {
    private static String tenSp;
    private static double donGia;
    private static double giamGia;

    public Bai1(String TenSp, double DonGia, double GiamGia ) {
    	TenSp = tenSp;
    	DonGia =donGia;
    	GiamGia = giamGia;
    	
    }

	public static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    public static double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public static void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public static void main(String[] args) {
		nhap();
		xuat();
	}

}
