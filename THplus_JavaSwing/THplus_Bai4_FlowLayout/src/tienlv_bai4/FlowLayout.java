package tienlv_bai4;


import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayout extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public FlowLayout() {
		setResizable(false);
		setTitle("Demo FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(new java.awt.FlowLayout());
		for(int i = 1; i <= 20; i++) {
			getContentPane().add(new JButton("Button " + i));
		}

		
	}
	public static void main(String[] args) {
		new FlowLayout().setVisible(true);
	}
}
