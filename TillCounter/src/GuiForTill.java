
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GuiForTill extends JFrame implements ActionListener {

		JPanel panelMain = new JPanel();
		JButton subTotal = new JButton("Sub Total");

		JButton reports = new JButton("Report");
		
		JButton backReports = new JButton("Back");
		
		JButton subBack = new JButton("Back");

		
	public GuiForTill() {


		//main panel
		JPanel home = new JPanel();

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
		JLabel vectorOfItems = new JLabel("The items you click go here");
		
		JPanel panel3 = new JPanel();
		//panel3.setLayout(new GridLayout(2, 2, 20, 20));
		panel3.add(item1);
		panel3.add(item2);
		panel3.add(item3);
		panel3.add(item4);
		panel3.add(item5);
		panel3.add(item6);
		panel3.add(item7);
		panel3.add(item8);
		panel3.add(item9);
		panel3.add(item10);
		panel3.add(vectorOfItems);
		
		home.add(panel3, BorderLayout.EAST);
		
		home.add(subTotal);
		home.add(reports);

		
		//sub total page
		JPanel subTotalPage = new JPanel();
		JLabel subtotalLabel = new JLabel("I am sub totals");
		JButton fifty = new JButton("fifty");
		JButton twenty = new JButton("twenty");
		JButton ten = new JButton("ten");
		JButton five = new JButton("five");
		JButton two = new JButton("two");
		JButton one = new JButton("one");
		JButton fiftyCent = new JButton("fifty Cent");
		JButton twentyCent = new JButton("twenty Cent");
		JButton tenCent = new JButton("ten Cent");
		JButton FiveCent = new JButton("Five Cent");
		JButton Twocent = new JButton("Two cent");
		JButton OneCent = new JButton("One Cent");
		
		subTotalPage.add(fifty);
		subTotalPage.add(twenty);
		subTotalPage.add(ten);
		subTotalPage.add(five);
		subTotalPage.add(two);
		subTotalPage.add(one);
		subTotalPage.add(fiftyCent);
		subTotalPage.add(tenCent);
		subTotalPage.add(FiveCent);
		subTotalPage.add(Twocent);
		subTotalPage.add(OneCent);


		subTotalPage.add(subtotalLabel);
		subTotalPage.add(subBack);
		
		
		//reports page
		JPanel ReportsPage = new JPanel();
		JLabel reportsLabel = new JLabel("I am the reports");
		ReportsPage.add(reportsLabel);
		ReportsPage.add(backReports);

		panelMain.setLayout(new CardLayout());

		panelMain.add(home);
		panelMain.add(subTotalPage);
		panelMain.add(ReportsPage);

		subBack.addActionListener(this);
		subTotal.addActionListener(this);
		reports.addActionListener(this);
		backReports.addActionListener(this);

		getContentPane().add(panelMain);




		setSize(900, 900);
		setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		//Get the card layout from the main panel
		CardLayout card = (CardLayout)panelMain.getLayout();

			if(e.getSource() == subTotal)
			{
					card.next(panelMain);
			}

			if(e.getSource() == reports)
			{
			card.previous(panelMain);
			}

			if(e.getSource() == backReports)
			{
				card.next(panelMain);
			}
			
			if(e.getSource() == subBack)
			{
				card.previous(panelMain);
			}







	}

	public static void main(String[] args) {

		new GuiForTill();

	}

}