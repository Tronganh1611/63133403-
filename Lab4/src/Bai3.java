import java.util.Scanner;

public class Bai3 {
    private static String tenSp;
    private static double donGia;
    private static double giamGia;

    public Bai3(String TenSp, double DonGia, double GiamGia ) {
    	TenSp = tenSp;
    	DonGia =donGia;
    	GiamGia = giamGia;
    	
    }
    

    public Bai3(String TenSp, double DonGia) {
    	TenSp = tenSp;
    	DonGia =donGia;
    	
    }

	public static void nhapgia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
	public static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
    }

    private static  double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public static void xuatgia() {
        System.out.println("\nTên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
        System.out.println();
    }
    public static void xuat() {
        System.out.println("\nTên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
        System.out.println();
    }
    public static void main(String[] args) {
		Bai3 sp1 = new Bai3(tenSp,donGia);
		Bai3 sp2 = new Bai3(tenSp, donGia, giamGia);
		sp1.nhap();
		sp1.xuat();
		
		sp2.nhapgia();
		sp2.xuatgia();
	}

}
