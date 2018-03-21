
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Icon;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class TillCounterGUI extends JFrame implements ActionListener {

	JLabel vege = new JLabel(" ");
	JLabel fruit = new JLabel(" ");
	JLabel drink = new JLabel(" ");



	//Set up panels for card switching, uses two methods to build and return panels
	JPanel text1=MainPage(), text2=question2(), text4=finalOne(), displayPanel=new JPanel();
    JButton next = new JButton("subTotal");     JButton endOfDay = new JButton("Report"); JButton back = new JButton("Back");

    JPanel button = new JPanel();





	public TillCounterGUI() {

		displayPanel.setLayout(new CardLayout());
		displayPanel.add(text1);
		displayPanel.add(text2);
		displayPanel.add(text4);


		getContentPane().add(displayPanel, BorderLayout.NORTH);
		//button.add(endOfDay);
    	//button.add(next);
    	//button.add(back);
    	next.addActionListener(this);
    	endOfDay.addActionListener(this);
    	back.addActionListener(this);
		getContentPane().add(button, BorderLayout.SOUTH);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 

		setVisible(true);

	}

	//Build first panel to be added to the card
	public JPanel MainPage() {

		JPanel panel = null;
		button = null;
		
		panel = new JPanel();

		
		JButton item1 = new JButton("1");
		JButton item2 = new JButton("2");
		JButton item3 = new JButton("3");
		JButton item4 = new JButton("4");
		JButton item5 = new JButton("5");
		JButton item6 = new JButton("6");
		JButton item7 = new JButton("7");
		JButton item8 = new JButton("8");
		JButton item9 = new JButton("9");
		JButton item10 = new JButton("10");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 2, 20, 20));
		buttonPanel.add(item1, BorderLayout.EAST);
		buttonPanel.add(item2);
		buttonPanel.add(item3);
		buttonPanel.add(item4);
		buttonPanel.add(item5);
		buttonPanel.add(item6);
		buttonPanel.add(item7);
		buttonPanel.add(item8);
		buttonPanel.add(item9);
		buttonPanel.add(item10);
		
		
		


		JLabel card1Label = new JLabel();
		card1Label.setText("Vector of Items here...");
		
		
		button.add(endOfDay);
    	button.add(next);
		
		
		panel.add(buttonPanel, BorderLayout.EAST);
		panel.add(card1Label, BorderLayout.CENTER);


		return panel;

	}

	//Builds second car for the panel
	public JPanel question2() {



		JPanel panel = null;

		panel = new JPanel();

		JLabel card2Label = new JLabel("subtotal page");
		panel.add(card2Label);

		return panel;
	}



	public JPanel finalOne() {

			JPanel panel = null;

			panel = new JPanel();


			JLabel Label1 = new JLabel("End of day report ");


			

			panel.add(Label1);



				//return the completed panel
				return panel;
	}

	public void actionPerformed(ActionEvent e) {
		//Get the card layout from the main panel
		CardLayout card = (CardLayout)displayPanel.getLayout();

		if(e.getSource() == next)
			{
					card.next(displayPanel);
			}
		
			if(e.getSource() == endOfDay)
			{
			card.last(displayPanel);
			}
			
			if(e.getSource() == back)
			{
				card.previous(displayPanel);
			}
		






	}

	public static void main(String[] args) {

		new TillCounterGUI();

	}

}