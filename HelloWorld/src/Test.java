import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();//Tạo một thể hiện đối tượng của lớp
		f.setTitle("Ví dụ JFrame");//Tiêu đề cửa số
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 300);//kích thước cửa sổ
		//Qui định lại bố cục layout
		f.setLayout(new FlowLayout());
		
		//Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnOK1 = new JButton("Nhấn em đi");
		//Gắn lên form
		f.add(btnOK);
		f.add(btnOK1);
		//Chạy thử thì em đã đè lên tôi
		//hiện form/frame
		f.show();//hiện cửa sổ
	}
	//Tạo bộ lắng nghe hữu danh và xử lí nút ok
	
	

}
