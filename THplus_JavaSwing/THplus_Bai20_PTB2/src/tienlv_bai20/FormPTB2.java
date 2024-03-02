package tienlv_bai20;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class FormPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoa;
	private JTextField txtSob;
	private JTextField txtSoc;
	private JTextField txtKetQua;

	/**
	 * Create the frame.
	 */
	public FormPTB2() {
		setTitle("PHƯƠNG TRÌNH BẬC 2");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{624, 0};
		gbl_panel.rowHeights = new int[]{65, 322, 66, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2");
		lblNewLabel.setBackground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Nh\u1EADp a, b, c", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.CENTER_BASELINE, 15), new Color(0, 0, 0)));
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(133, 48, 45, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(133, 99, 45, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("c:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(133, 151, 45, 13);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("KẾT QUẢ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(200, 200, 164, 38);
		panel_2.add(lblNewLabel_1_3);
		
		txtSoa = new JTextField();
		txtSoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSoa.setBounds(216, 40, 194, 28);
		panel_2.add(txtSoa);
		txtSoa.setColumns(10);
		
		txtSob = new JTextField();
		txtSob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSob.setColumns(10);
		txtSob.setBounds(216, 91, 194, 28);
		panel_2.add(txtSob);
		
		txtSoc = new JTextField();
		txtSoc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSoc.setColumns(10);
		txtSoc.setBounds(216, 143, 194, 28);
		panel_2.add(txtSoc);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(58, 248, 505, 43);
		panel_2.add(txtKetQua);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 255), 2), "CH\u1ECCN THAO T\u00C1C", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.CENTER_BASELINE, 15), new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.SOUTH;
		gbc_panel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giai();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnGiai);
		
		JButton btnXoaTrang = new JButton("XÓA TRẮNG");
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSoa.setText("");
				txtSob.setText("");
				txtSoc.setText("");
				txtKetQua.setText("");
			}
		});
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnXoaTrang);
		
		JButton btnThoat = new JButton("THOÁT");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame f = new Frame();
				if(JOptionPane.showConfirmDialog(f, "Bạn có chắc chắn muốn thoát ??", "Giải phương trình bậc 2", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnThoat);
	}
	
	void Giai() {
	    String strSoA = txtSoa.getText();
	    String strSoB = txtSob.getText();
	    String strSoC = txtSoc.getText();

	    // Kiểm tra nếu có ô nhập liệu rỗng
	    if (strSoA.isEmpty() || strSoB.isEmpty() || strSoC.isEmpty()) {
	        txtKetQua.setText("Vui lòng nhập đầy đủ các hệ số.");
	        return;
	    }

	    // Kiểm tra xem dữ liệu nhập vào có phải là số không
	    try {
	        float soA = Float.parseFloat(strSoA);
	        float soB = Float.parseFloat(strSoB);
	        float soC = Float.parseFloat(strSoC);

	        // Kiểm tra soA khác 0 để tránh lỗi chia cho 0
	        if (soA == 0) {
	            txtKetQua.setText("Phương trình bậc nhất có nghiệm x = " + String.format("%.2f", -soC/ soB));
	            return;
	        }

	        float denta = ((float)soB * soB - 4 * soA * soC);
	        if (denta == 0) {
	            txtKetQua.setText("Chương trình có 1 nghiệm kép: x = " + String.format("%.2f", -soB / (2 * soA)));
	        } else if (denta < 0) {
	            txtKetQua.setText("Chương trình vô nghiệm");
	        } else {
	            float x1 = (float)((-soB - Math.sqrt(denta)) / (2 * soA));
	            float x2 = (float)((-soB + Math.sqrt(denta)) / (2 * soA));
	            txtKetQua.setText("Chương trình có 2 nghiệm phân biệt: x1 = " + String.format("%.2f", x1) + " | x2 = " + String.format("%.2f", x2));
	        }
	    } catch (NumberFormatException e) {
	        // Xử lý khi nhập không phải số
	        txtKetQua.setText("Vui lòng nhập số hợp lệ.");
	    }
	}

	
	public static void main(String[] args) {
		new FormPTB2().setVisible(true);
	}
}
