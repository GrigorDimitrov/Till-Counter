import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI extends JFrame implements ActionListener {
	private static Date date = new Date();
	private static Employee  myEmployee = new Employee(1);
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
		
		Vector<String> v = new Vector<String>();
		String str = new String();
		readShoes(v);
		displayShoes(v);

		
		//Transaction t1 = new Transaction(1, v.elementAt(1), date, myEmployee);
		
		
		
	}
	
	static void readShoes(Vector v) {
		String s = new String();
		Shoe sh;
		try {
			File f1 = new File("myShoes.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader in = new BufferedReader(fr);
			
			StringTokenizer t;
			s = in.readLine();
			while(s!=null) {
				t = new StringTokenizer(s);
				sh = new Shoe();
				sh.setId(Integer.parseInt(t.nextToken()));
				sh.setName(t.nextToken());
				sh.setPrice(Double.parseDouble(t.nextToken()));
				sh.setColour(t.nextToken());
				
				//add to the Vector
				v.add(sh);
				
				//read the next line
				s = in.readLine();
			}
			in.close();
		} catch (Exception e) {
			System.out.println("File not found");
		}
	}
	
	static void displayShoes(Vector v) {
		Shoe sh = null;
		
		System.out.println("-------List of shoes-----");
		
		for(int i=0; i<v.size(); i++) {
			sh = (String) v.elementAt(i);
		}
		
		sh.display();
		
	}

}
