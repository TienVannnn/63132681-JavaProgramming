package tienlv_bai13;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class Fahrenheit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDoF;
	private JLabel lbKQ;
	/**
	 * Create the frame.
	 */
	public Fahrenheit() {
		setTitle("CHUYỂN ĐỘ F THÀNH ĐỘ C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập độ F:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(53, 50, 108, 31);
		contentPane.add(lblNewLabel);
		
		txtDoF = new JTextField();
		txtDoF.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDoF.setBounds(171, 41, 150, 40);
		contentPane.add(txtDoF);
		txtDoF.setColumns(10);
		
		JLabel lblC = new JLabel("Độ C: ");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblC.setBounds(54, 122, 56, 31);
		contentPane.add(lblC);
		
		lbKQ = new JLabel("");
		lbKQ.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbKQ.setBounds(171, 122, 139, 31);
		contentPane.add(lbKQ);
		
		// Sự kiện Key Released để tự động chuyển đổi khi nhập xong giá trị
		txtDoF.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					double doF = Double.parseDouble(txtDoF.getText());
					double doC = (doF - 32) * 5 / 9;
					lbKQ.setText(String.format("%.2f", doC));
				} catch (NumberFormatException ex) {
					lbKQ.setText("Chưa nhập độ F!");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Fahrenheit().setVisible(true);
	}
}
