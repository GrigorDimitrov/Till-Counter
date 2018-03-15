import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI extends JFrame implements ActionListener {
	private JTextArea ta = new JTextArea();
	private JButton totalBtn;
	public GUI() {
		
		setVisible(true);
		setSize(1200,800);
	}
	public void actionPerformed(ActionEvent e) {
		

	}

	public static void main(String[] args) {
		
		new GUI();
	}

}
