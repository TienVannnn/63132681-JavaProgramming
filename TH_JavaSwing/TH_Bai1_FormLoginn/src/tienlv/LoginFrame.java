package tienlv;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTen;
	private JPasswordField pass;
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(78, 68, 116, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMtKhu.setBounds(78, 171, 116, 37);
		contentPane.add(lblMtKhu);
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTen.setBounds(225, 68, 262, 37);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnLogin.setBackground(new Color(0, 255, 64));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(215, 246, 123, 37);
		contentPane.add(btnLogin);
		
		pass = new JPasswordField();
		pass.setBounds(225, 164, 262, 37);
		contentPane.add(pass);
	}
	void XuLyDangNhap() {
		String strTenDN = txtTen.getText();
		String strPass = pass.getText();
		if(strTenDN.equals("63CNTT") && strPass.equals("123")) {
			new HomeFrame().setVisible(true);
			this.setVisible(false);
		}
		else {
		    txtTen.setText("");
		    pass.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
