package tienlv_bai24;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import java.awt.Insets;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.Component;

public class FormJList {

	private JFrame frmDsaf;
	private JTextField txtData;
	private JCheckBox checkSoAm;
	private JList<String> list;
	private JTextField txtTong;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormJList window = new FormJList();
					window.frmDsaf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Create the application.
	 */
	public FormJList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDsaf = new JFrame();
		frmDsaf.setTitle("Thao tác trên JList");
		frmDsaf.setBounds(100, 100, 738, 585);
		frmDsaf.setResizable(false);
		frmDsaf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDsaf.getContentPane().setLayout(new BorderLayout(0, 0));
		frmDsaf.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmDsaf.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{263, 452, 0};
		gbl_panel.rowHeights = new int[]{65, 408, 75, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Thao tác trên JList - Checkbox");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_2.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.CENTER_BASELINE, 15), new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.ipady = 2;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JButton btnToDenSoChan = new JButton("Tô đen số chẵn");
		btnToDenSoChan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setCellRenderer(new ToDenSoChan());
				list.repaint();
			}
		});
		btnToDenSoChan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnToDenSoChan);
		
		JButton btnToDenSoLe = new JButton("Tô đen số lẻ");
		btnToDenSoLe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setCellRenderer(new ToDenSoLe());
				list.repaint();
			}
		});
		btnToDenSoLe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnToDenSoLe);
		
		JButton btnTDSNT = new JButton("Tô đen số nguyên tố");
		btnTDSNT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setCellRenderer(new ToDenSoNT());
				list.repaint();
			}
		});
		btnTDSNT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnTDSNT);
		
		JButton btnBoTD = new JButton("Bỏ tô đen");
		btnBoTD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setCellRenderer(new BoToDen());
				list.repaint();
			}
		});
		btnBoTD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnBoTD);
		
		JButton btnXoaGTTD = new JButton("Xóa các giá trị đang tô đen");
		btnXoaGTTD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> newModel = new DefaultListModel<>();
				ListModel<String> model = list.getModel();

		        // Duyệt qua từng phần tử trong ListModel hiện tại
		        for (int i = 0; i < model.getSize(); i++) {
		            String value = model.getElementAt(i);
		            // Kiểm tra nếu phần tử không có font đậm, thêm vào newModel
		            if (!list.getCellRenderer().getListCellRendererComponent(list, value, i, false, false).getFont().isBold()) {
		                newModel.addElement(value);
		            }
		        }

		        // Gán newModel cho JList để cập nhật dữ liệu
		        list.setModel(newModel);	
			}
		});
		btnXoaGTTD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnXoaGTTD);
		
		JButton btnTongGT = new JButton("Tổng giá trị trong List");
		btnTongGT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListModel<String> model = list.getModel();
				int n = model.getSize();
				float t = 0;
				for(int i = 0; i < n; i++) {
					t += Float.parseFloat(model.getElementAt(i));
				}
				txtTong.setText("Tổng giá trị trong JList là: " + String.valueOf(t));
			}
		});
		btnTongGT.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnTongGT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnTongGT);
		
		txtTong = new JTextField();
		txtTong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTong.setEditable(false);
		panel_1.add(txtTong);
		txtTong.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 128), 2), "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahome", Font.CENTER_BASELINE, 15), new Color(0, 0, 0)));
		panel_4.setLayout(null);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 1;
		panel.add(panel_4, gbc_panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 432, 269);
		panel_4.add(scrollPane);
		
		
		// Khởi tạo DefaultListModel
		DefaultListModel<String> model = new DefaultListModel<>();
		// Thêm dữ liệu vào model tại đây nếu cần

		// Khởi tạo JList với DefaultListModel
		list = new JList<>(model);
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(list);
		
		JButton btnAddItem = new JButton("Nhập");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    // Lấy dữ liệu từ JTextField
			    String item = txtData.getText();
			    
			    // Kiểm tra xem item có rỗng không
			    if (!item.isEmpty()) {
			        try {
			            // Ép kiểu ListModel của JList về DefaultListModel để có thể thêm dữ liệu
			            DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
			            
			            // Kiểm tra xem dữ liệu nhập vào có phải là chữ số hay không
			            float number = Float.parseFloat(item);
			            if(checkSoAm.isSelected()) {
			            	model.addElement(item);
			            }
			            else {
			            	if (number > 0) {
			                    model.addElement(item);
			                } else {
			                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			                }
			            }
			            
			            
			            // Xóa nội dung trong JTextField sau khi thêm
			            txtData.setText("");
			            txtData.requestFocus();
			        } catch (NumberFormatException ex) {
			            // Nếu không phải là số, thông báo lỗi
			            JOptionPane.showMessageDialog(null, "Vui lòng nhập vào chỉ các chữ số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			            txtData.setText("");
			            txtData.requestFocus();
			        }
			    }
			}
		});
		btnAddItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddItem.setBounds(10, 39, 98, 45);
		panel_4.add(btnAddItem);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtData.setBounds(126, 46, 108, 30);
		panel_4.add(txtData);
		txtData.setColumns(10);
		
		checkSoAm = new JCheckBox("Cho nhập số âm");
		checkSoAm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkSoAm.setBounds(260, 39, 173, 33);
		panel_4.add(checkSoAm);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 128, 0), 2));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		
		JButton btnExit = new JButton("Đóng chương trình");
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame f = new Frame();
				if(JOptionPane.showConfirmDialog(f, "Bạn có chắc chắn muốn thoát?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(btnExit);
	}
	
	
	
}

class ToDenSoChan extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Kiểm tra nếu value là số chẵn thì tô đen
        if (Float.parseFloat(value.toString()) % 2 == 0) {
            c.setFont(new Font("Tahoma", Font.BOLD, 18));
        } else {
            c.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }
        
        return c;
    }
}

class ToDenSoLe extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Kiểm tra nếu value là số lẻ thì tô đen
        if (Float.parseFloat(value.toString()) % 2 != 0) {
            c.setFont(new Font("Tahoma", Font.BOLD, 18));
        } else {
            c.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }
        
        return c;
    }
}

class BoToDen extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        
            c.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        
        return c;
    }
}

class ToDenSoNT extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        // Chuyển đổi giá trị sang kiểu long
        double number = (Double.parseDouble(value.toString()));

        // Kiểm tra nếu value là số số nguyên tố thì tô đen
        if (laSoNT(number)) {
            c.setFont(new Font("Tahoma", Font.BOLD, 18));
        } else {
            c.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }

        return c;
    }

    boolean laSoNT(double n) {
        if (n < 2) return false;
        
        int intPart = (int) n; // Lấy phần nguyên của n

        if (n != intPart) {
            // Nếu n không phải là số nguyên, nó không phải là số nguyên tố
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


class XoaGiaTriToDen extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Kiểm tra nếu value là số lẻ thì tô đen
        if (c.getFont().isBold()) {
        }
        return c;
    }
}