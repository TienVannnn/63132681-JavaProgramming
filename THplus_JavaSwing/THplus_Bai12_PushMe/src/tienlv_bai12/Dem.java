package tienlv_bai12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel txtKQ;
	private int i = 0;
	/**
	 * Create the frame.
	 */
	public Dem() {
		setTitle("Push Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPush = new JButton("Push me!");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PushCounter();
				
			}
		});
		btnPush.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPush.setBounds(28, 55, 109, 44);
		contentPane.add(btnPush);
		
		JLabel lblNewLabel = new JLabel("Pushes:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(65, 172, 73, 44);
		contentPane.add(lblNewLabel);
		
		txtKQ = new JLabel("");
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setBounds(160, 183, 88, 26);
		contentPane.add(txtKQ);

	}
	
	void PushCounter() {
		txtKQ.setText(String.valueOf(++i)); 
	}
	
	public static void main(String[] args) {
		new Dem().setVisible(true);
	}
}
