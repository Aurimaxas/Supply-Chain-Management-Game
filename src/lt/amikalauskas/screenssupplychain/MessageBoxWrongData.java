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


public class MessageBoxWrongData extends JFrame {
		JButton OK;
		JLabel Message, Notification;
		eHandler handler = new eHandler();

		public MessageBoxWrongData(String s) {

			super(s);
		}


		public void MBWrongData() {
			JPanel p = new JPanel();
			p.setLayout(null);

			Message = new JLabel();
			Notification = new JLabel();
			OK = new JButton("OK");

			add(Message);
			add(Notification);
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
			
			Message.setText("WRONG INPUT DATA");
			Message.setBounds(50, 40, 500, 50);
			Message.setFont(new Font("TimesRoman", Font.BOLD, 40));
			Message.setHorizontalAlignment(SwingConstants.CENTER);
			Message.setForeground(Color.RED);
			Message.setOpaque(false);
			
			Notification.setText("Please input only positive numbers.");
			Notification.setBounds(50, 150, 500, 50);
			Notification.setFont(new Font("TimesRoman", Font.BOLD, 30));
			Notification.setHorizontalAlignment(SwingConstants.CENTER);
			Notification.setOpaque(false);
			
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
	


