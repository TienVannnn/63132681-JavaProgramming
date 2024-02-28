package tienlv_bai14;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormTemperature extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDoF;
	private JLabel lbKQ;

	/**
	 * Create the frame.
	 */
	public FormTemperature() {
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
		lblC.setBounds(53, 185, 56, 31);
		contentPane.add(lblC);
		
		lbKQ = new JLabel("");
		lbKQ.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbKQ.setBounds(171, 185, 139, 31);
		contentPane.add(lbKQ);
		
		JButton btnChuyen = new JButton("Chuyển");
		btnChuyen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChuyenDoF();
			}
		});
		btnChuyen.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnChuyen.setBounds(63, 112, 95, 31);
		contentPane.add(btnChuyen);
	}
	
	void ChuyenDoF() {
		double doF = Double.parseDouble(txtDoF.getText());
		double doC = (doF - 32) * 5 / 9;
		lbKQ.setText(String.format("%.2f", doC));
	}
	public static void main(String[] args) {
		new FormTemperature().setVisible(true);
	}
}
