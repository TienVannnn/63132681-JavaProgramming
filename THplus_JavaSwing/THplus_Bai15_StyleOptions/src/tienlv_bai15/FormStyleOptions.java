package tienlv_bai15;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JCheckBox;
import java.awt.Color;

public class FormStyleOptions extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbContent;
	private JCheckBox checkBold;
	private JCheckBox checkItalic;

	/**
	 * Create the frame.
	 */
	public FormStyleOptions() {
		setTitle("Style Options");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbContent = new JLabel("Hello, I'm Lê Văn Tiến");
		lbContent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbContent.setBounds(98, 47, 247, 35);
		contentPane.add(lbContent);
		
		checkBold = new JCheckBox("Bold");
		checkBold.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBold.setBounds(72, 124, 93, 21);
		contentPane.add(checkBold);
		
		checkItalic = new JCheckBox("Italic");
		checkItalic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkItalic.setBounds(234, 124, 93, 21);
		contentPane.add(checkItalic);
		
		checkBold.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				updateFontStyle();
			}
		});
		
		checkItalic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				updateFontStyle();
			}
		});
	}
	void updateFontStyle() {
		int style = Font.PLAIN;
		if (checkBold.isSelected()) {
			style |= Font.BOLD;
		}
		if (checkItalic.isSelected()) {
			style |= Font.ITALIC;
		}
		lbContent.setFont(lbContent.getFont().deriveFont(style));
	}
	
	
	public static void main(String[] args) {
		new FormStyleOptions().setVisible(true);
	}
}
