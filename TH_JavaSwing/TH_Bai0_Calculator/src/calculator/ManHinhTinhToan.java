package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 15));
		setTitle("Chương Trình Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(72, 43, 121, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(71, 99, 109, 61);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtA.setBounds(289, 41, 238, 39);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtB.setColumns(10);
		txtB.setBounds(289, 103, 238, 39);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code xử lý cộng ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCong.setBounds(59, 223, 85, 39);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code xử lý trừ ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTru.setBounds(188, 224, 85, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code xử lý nhân ở đây
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNhan.setBounds(310, 224, 85, 37);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code xử lý chia ở đây
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChia.setBounds(442, 224, 85, 37);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kết quả");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(72, 299, 90, 39);
		contentPane.add(lblNewLabel_1_1);
		
		txtResult = new JTextField();
		txtResult.setEnabled(false);
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtResult.setColumns(10);
		txtResult.setBounds(188, 299, 339, 39);
		contentPane.add(txtResult);
	}
	
	void HamXuLyCong() {
		String strSoA = txtA.getText();
		String strSoB = txtB.getText();
		
		float soA = Float.parseFloat(strSoA);
		float soB = Float.parseFloat(strSoB);
		float kq = soA + soB;
		String result = String.valueOf(kq);
		txtResult.setText(result);
	}
	
	void HamXuLyTru() {
		String strSoA = txtA.getText();
		String strSoB = txtB.getText();
		
		float soA = Float.parseFloat(strSoA);
		float soB = Float.parseFloat(strSoB);
		float kq = soA - soB;
		String result = String.valueOf(kq);
		txtResult.setText(result);
	}
	
	void HamXuLyNhan() {
		String strSoA = txtA.getText();
		String strSoB = txtB.getText();
		
		float soA = Float.parseFloat(strSoA);
		float soB = Float.parseFloat(strSoB);
		float kq = soA * soB;
		String result = String.valueOf(kq);
		txtResult.setText(result);
	}
	
	void HamXuLyChia() {
		String strSoA = txtA.getText();
		String strSoB = txtB.getText();
		
		float soA = Float.parseFloat(strSoA);
		float soB = Float.parseFloat(strSoB);
		float kq = soA / soB;
		String result = String.valueOf(kq);
		txtResult.setText(result);
	}
}
