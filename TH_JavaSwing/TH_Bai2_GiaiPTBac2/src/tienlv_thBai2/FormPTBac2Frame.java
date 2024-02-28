package tienlv_thBai2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPTBac2Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	/**
	 * Create the frame.
	 */
	public FormPTBac2Frame() {
		setTitle("GIAO DIỆN TÍNH TOÁN PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHƯƠNG TRÌNH BẬC 2 ( ax^2 + bx + c)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(68, 31, 386, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(73, 111, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(252, 111, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("c:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(464, 114, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtA.setBounds(101, 97, 109, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtB.setColumns(10);
		txtB.setBounds(279, 97, 109, 33);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtC.setColumns(10);
		txtC.setBounds(497, 97, 109, 33);
		contentPane.add(txtC);
		
		JLabel lblNewLabel_2 = new JLabel("KQ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(69, 214, 99, 38);
		contentPane.add(lblNewLabel_2);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(178, 202, 428, 50);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Các lựa chọn");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(277, 330, 127, 38);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giai();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGiai.setBounds(148, 402, 127, 38);
		contentPane.add(btnGiai);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyReSet();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(401, 402, 127, 38);
		contentPane.add(btnReset);
	}
	void Giai() {
	    String strSoA = txtA.getText();
	    String strSoB = txtB.getText();
	    String strSoC = txtC.getText();

	    float soA = Float.parseFloat(strSoA);
	    float soB = Float.parseFloat(strSoB);
	    float soC = Float.parseFloat(strSoC);

	    // Kiểm tra soA khác 0 để tránh lỗi chia cho 0
	    if (soA == 0) {
	        txtKQ.setText("Phương trình bậc nhất có nghiệm x = " + String.valueOf(-soC/ soB));
	        return;
	    }

	    float denta = ((float)soB * soB - 4 * soA * soC);
	    if (denta == 0) {
	        txtKQ.setText("Chương trình có 1 nghiệm kép: x = " + String.valueOf(-soB / (2 * soA)));
	    } else if (denta < 0) {
	        txtKQ.setText("Chương trình vô nghiệm");
	    } else {
	        float x1 = (float)((-soB - Math.sqrt(denta)) / (2 * soA));
	        float x2 = (float)((-soB + Math.sqrt(denta)) / (2 * soA));
	        String strx1 = String.valueOf(x1);
	        String strx2 = String.valueOf(x2);
	        txtKQ.setText("Chương trình có 2 nghiệm phân biệt: x1 = " + strx1 + " | x2 = " + strx2);
	    }
	}
	
	void XuLyReSet() {
		txtA.setText("");
		txtB.setText("");
		txtC.setText("");
		txtKQ.setText("");
	}

}
