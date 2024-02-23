import java.util.Scanner;

public class Bai2 {
    private static String tenSp;
    private static double donGia;
    private static double giamGia;

    public Bai2(String TenSp, double DonGia, double GiamGia ) {
    	TenSp = tenSp;
    	DonGia =donGia;
    	GiamGia = giamGia;
    	
    }
    

	public Bai2() {
		// TODO Auto-generated constructor stub
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
        System.out.println("\nTên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
        System.out.println();
    }
    public static void main(String[] args) {
		Bai2 sp1 = new Bai2();
		Bai2 sp2 = new Bai2(tenSp, donGia, giamGia);
		sp1.nhap();
		sp1.xuat();
		
		sp2.nhap();
		sp2.xuat();
	}

}
