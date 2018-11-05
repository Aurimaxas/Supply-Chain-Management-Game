package lt.amikalauskas.screenssupplychain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import lt.amikalauskas.supplychaingame.Prestock;


public class MessageBoxRawMaterial extends JFrame {
		JButton OK;
		JLabel Message, Notification1, Notification2;
		eHandler handler = new eHandler();
		
		Prestock prestock = new Prestock();
		ScreenMain screenMain = new ScreenMain("");

		public MessageBoxRawMaterial(String s) {

			super(s);
		}


		public void MBRawMaterialsScreen() {
			JPanel p = new JPanel();
			p.setLayout(null);

			Message = new JLabel();
			Notification1 = new JLabel();
			Notification2 = new JLabel();
			OK = new JButton("OK");

			add(Message);
			add(Notification1);
			add(Notification2);
			add(OK);
			add(p);

			OK.addActionListener(handler);
		
			setVisible(true);
			setSize(600, 400);
			setResizable(false);
			setLocationRelativeTo(null);
			setLayout(new BorderLayout());
			
			JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Fonas2.jpg"));
			add(background);
			background.setLayout(new FlowLayout());
			
			Message.setText("WRONG PRODUCTION ORDER");
			Message.setBounds(0, 40, 580, 50);
			Message.setFont(new Font("TimesRoman", Font.BOLD, 36));
			Message.setHorizontalAlignment(SwingConstants.CENTER);
			Message.setForeground(Color.RED);
			Message.setOpaque(false);
			
			Notification1.setText("Not enough Raw Materials.");
			Notification1.setBounds(50, 120, 500, 30);
			Notification1.setFont(new Font("TimesRoman", Font.BOLD, 24));
			Notification1.setHorizontalAlignment(SwingConstants.CENTER);
			Notification1.setOpaque(false);
			
			Notification2.setText("Raw material stock - "+prestock.getRawMaterialPrestock()+" PC, Your Order - "+screenMain.getProductionOrder()+" PC");
			Notification2.setBounds(10, 170, 580, 30);
			Notification2.setFont(new Font("TimesRoman", Font.BOLD, 24));
			Notification2.setHorizontalAlignment(SwingConstants.CENTER);
			Notification2.setOpaque(false);
			
			OK.setBounds(250, 250, 100, 50);
			OK.setFont(new Font("TimesRoman", Font.PLAIN, 30));


		}

		public class eHandler implements ActionListener {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == OK) {

					setVisible(false);
				}

			}
		}
}
	


