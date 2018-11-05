package lt.amikalauskas.screenssupplychain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

import lt.amikalauskas.supplychaingame.Customers;
import lt.amikalauskas.supplychaingame.Prestock;
import lt.amikalauskas.supplychaingame.Production;
import lt.amikalauskas.supplychaingame.Stock;
import lt.amikalauskas.supplychaingame.SupplyChain;
import lt.amikalauskas.supplychaingame.Supplyers;

	
	public class ScreenMain extends JFrame {
		
		private static String productionOrder;
		public static int time;
		private static int day;
		

		public static String getProductionOrder() {
			return productionOrder;
		}

		public static void setProductionOrder(String productionOrder) {
			ScreenMain.productionOrder = productionOrder;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public static int getDay() {
			return day;
		}

		public static void setDay(int day) {
			ScreenMain.day = day;
		}

		JButton buttonExit, buttonNextDay, buttonResultsTable;
		
		JLabel labelGameName, labelProductionName, labelSupplyer1Name, labelSupplyer2Name, labelCustomer1Name, labelCustomer2Name, labelMail1Name, labelMail2Name, labelMail3Name, labelMail4Name, labelMail5Name, labelSupplyer1RawName, labelSupplyer2PackName, labelPrestockRawName, labelPrestockPackName;
		JLabel labelProduction, labelSupplyer1, labelSupplyer2, labelCustomer1, labelCustomer2;
		JLabel labelMail1, labelMail2, labelMail3, labelMail4, labelMail5;
		JLabel labelTruck1, labelTruck2, labelTruck3, labelTruck4, labelTruck5, labelTruck6;
		JLabel labelArrow1, labelArrow2, labelArrow3, labelArrow4, labelArrow5, labelArrow6, labelArrow7, labelArrow8;
		JLabel labelProductionOrderName, labelProductionOrder, labelProductionInProcess, labelProductionStock;
		JLabel labelOrderRawInfo, labelOrderPackInfo, labelPrestock1Info, labelPrestock2Info, labelInProcess1Info, labelInProcess2Info, labelStockInfo, labelPriceInfo, labelFineInfo;
		JLabel labelDays, labelMoney;
		JLabel labelTime;
		
		JTextField textFieldMail1, textFieldMail2, textFieldMail3, textFieldMail4, textFieldMail5;
		JTextField textFieldTruck1, textFieldTruck2, textFieldTruck3, textFieldTruck4, textFieldTruck5, textFieldTruck6;
		JTextField textFieldSupplyer1Raw, textFieldSupplyer2Pack;
		JTextField textFieldPrestockRaw, textFieldPrestockPack;
		JTextField textFieldProductionOrder, textFieldProductionInProcess, textFieldProductionStock;
		

		eHandler handler = new eHandler();
		Customers customers = new Customers();
		Supplyers supplyers = new Supplyers();
		Prestock prestock = new Prestock();
		Stock stock = new Stock();
		SupplyChain supplyChain = new SupplyChain();
		Production production = new Production();

		public ScreenMain(String s) {

			super(s);
			

		}

		public void ScreenMain() {
			
			JPanel p = new JPanel();
			labelGameName = new JLabel();
			
			
			
			labelProductionName = new JLabel("PRODUCTION");
			labelCustomer1Name = new JLabel("CUSTOMER 1");
			labelCustomer2Name = new JLabel("CUSTOMER 2");
			labelSupplyer1Name = new JLabel("SUPPLYER 1");
			labelSupplyer2Name = new JLabel("SUPPLYER 2");
			labelMail1Name = new JLabel("ORDER");
			labelMail2Name = new JLabel("ORDER");
			labelMail3Name = new JLabel("ORDER");
			labelMail4Name = new JLabel("ORDER");
			labelMail5Name = new JLabel("TOTAL ORDER");
			
			labelProduction = new JLabel();
			labelCustomer1 = new JLabel();
			labelCustomer2 = new JLabel();
			labelSupplyer1 = new JLabel();
			labelSupplyer2 = new JLabel();
			
			textFieldMail1 = new JTextField();
			textFieldMail2 = new JTextField();
			textFieldMail3 = new JTextField();	
			textFieldMail4 = new JTextField();	
			textFieldMail5 = new JTextField();
			
			labelMail1 = new JLabel();
			labelMail2 = new JLabel();
			labelMail3 = new JLabel();
			labelMail4 = new JLabel();
			labelMail5 = new JLabel();
			
			textFieldTruck1 = new JTextField();
			textFieldTruck2 = new JTextField();
			textFieldTruck3 = new JTextField();
			textFieldTruck4 = new JTextField();
			textFieldTruck5 = new JTextField();
			textFieldTruck6 = new JTextField();
			
			labelTruck1 = new JLabel();
			labelTruck2 = new JLabel();
			labelTruck3 = new JLabel();
			labelTruck4 = new JLabel();
			labelTruck5 = new JLabel();
			labelTruck6 = new JLabel();
			
			textFieldSupplyer1Raw = new JTextField();
			textFieldSupplyer2Pack = new JTextField();
			
			labelSupplyer1RawName = new JLabel("ROW");
			labelSupplyer2PackName = new JLabel("PACK");
			
			textFieldPrestockRaw = new JTextField();
			textFieldPrestockPack = new JTextField();
			
			labelPrestockRawName = new JLabel("ROW");
			labelPrestockPackName = new JLabel("PACK");
			
			textFieldProductionOrder = new JTextField();
			labelProductionOrderName = new JLabel("PRODUCTION ORDER");
			labelProductionOrder = new JLabel();
			
			textFieldProductionInProcess = new JTextField();
			labelProductionInProcess = new JLabel("IN PROCESS");
			
			textFieldProductionStock = new JTextField();
			labelProductionStock = new JLabel("STOCK");
			
			labelOrderRawInfo = new JLabel("PRICE - 3 EUR/PC");
			labelOrderPackInfo = new JLabel("PRICE - 3 EUR/PC");
			labelPrestock1Info = new JLabel("STOCK COST - 1 EUR/PC");
			labelPrestock2Info = new JLabel("STOCK COST - 1 EUR/PC");
			labelInProcess1Info = new JLabel("RAW 1 PC ->");
			labelInProcess2Info = new JLabel("PACK 1 PC ->");
			labelStockInfo = new JLabel("STOCK COST - 2 EUR/PC");
			labelPriceInfo = new JLabel("SALE PRICE - 10 EUR/PC");
			labelFineInfo = new JLabel("FINE FOR UNDELIVERED GOOD - 5 EUR/PC");
			
			labelArrow1 = new JLabel();
			labelArrow2 = new JLabel();
			labelArrow3 = new JLabel();
			labelArrow4 = new JLabel();
			labelArrow5 = new JLabel();
			labelArrow6 = new JLabel();
			labelArrow7 = new JLabel();
			labelArrow8 = new JLabel();
			
			labelDays = new JLabel();
			labelMoney = new JLabel();
			labelTime = new JLabel();
			
			buttonExit = new JButton("EXIT");
			buttonNextDay = new JButton("NEXT DAY");
			buttonResultsTable = new JButton("RESULTS TABLE");

			
			add(labelGameName);
			add(labelProductionName);
			add(labelCustomer1Name);
			add(labelCustomer2Name);
			add(labelSupplyer1Name);
			add(labelSupplyer2Name);
			add(labelMail1Name);
			add(labelMail2Name);
			add(labelMail3Name);
			add(labelMail4Name);
			add(labelMail5Name);
			
			add(labelProduction);
			add(labelCustomer1);
			add(labelCustomer2);
			add(labelSupplyer1);
			add(labelSupplyer2);
			
			add(textFieldMail1);
			add(textFieldMail2);
			add(textFieldMail3);
			add(textFieldMail4);
			add(textFieldMail5);
						
			add(labelMail1);
			add(labelMail2);
			add(labelMail3);
			add(labelMail4);
			add(labelMail5);
						
			add(textFieldTruck1);
			add(textFieldTruck2);
			add(textFieldTruck3);
			add(textFieldTruck4);
			add(textFieldTruck5);
			add(textFieldTruck6);

			add(labelTruck1);
			add(labelTruck2);			
			add(labelTruck3);
			add(labelTruck4);
			add(labelTruck5);	
			add(labelTruck6);
			
			add(textFieldSupplyer1Raw);
			add(textFieldSupplyer2Pack);
			
			add(labelSupplyer1RawName);
			add(labelSupplyer2PackName);
			
			add(textFieldPrestockRaw);
			add(textFieldPrestockPack);
			
			add(labelPrestockRawName);
			add(labelPrestockPackName);
			
			add(textFieldProductionOrder);
			add(labelProductionOrderName);
			add(labelProductionOrder);
			
			add(textFieldProductionInProcess);
			add(labelProductionInProcess);
			
			add(textFieldProductionStock);
			add(labelProductionStock);
			
			add(labelOrderRawInfo);
			add(labelOrderPackInfo);
			add(labelPrestock1Info);
			add(labelPrestock2Info);
			add(labelInProcess1Info);
			add(labelInProcess2Info);
			add(labelStockInfo);
			add(labelPriceInfo);
			add(labelFineInfo);

			add(labelArrow1);
			add(labelArrow2);	
			add(labelArrow3);
			add(labelArrow4);
			add(labelArrow5);
			add(labelArrow6);	
			add(labelArrow7);
			add(labelArrow8);
			
			add(labelDays);
			add(labelMoney);
			add(labelTime);
			
			add(buttonNextDay);
			add(buttonExit);
			add(buttonResultsTable);
			add(p);


			
		    setResizable(false);
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			setUndecorated(true);
			setVisible(true);
			setAlwaysOnTop(true);
			setSize(Toolkit.getDefaultToolkit().getScreenSize());
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Fonas2.jpg"));
			add(background);
			background.setLayout(new FlowLayout());
			
			labelGameName.setText("SUPPLY CHAIN MANAGEMENT GAME");
			labelGameName.setBounds(350, 50, 1200, 100);
			labelGameName.setFont(new Font("Algerian", Font.BOLD, 50));
			labelGameName.setHorizontalAlignment(SwingConstants.CENTER);
			labelGameName.setOpaque(false);
			
			labelProductionName.setBounds(820, 400, 300, 50);
			labelProductionName.setFont(new Font("Aharoni", Font.BOLD, 40));
			labelProductionName.setHorizontalAlignment(SwingConstants.CENTER);
			labelProductionName.setOpaque(false);
			
			labelCustomer1Name.setBounds(1610, 350, 200, 50);
			labelCustomer1Name.setFont(new Font("Aharoni", Font.BOLD, 20));
			labelCustomer1Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelCustomer1Name.setOpaque(false);
			
			labelCustomer2Name.setBounds(1610, 810, 200, 50);
			labelCustomer2Name.setFont(new Font("Aharoni", Font.BOLD, 20));
			labelCustomer2Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelCustomer2Name.setOpaque(false);
			
			labelSupplyer1Name.setBounds(50, 360, 200, 50);
			labelSupplyer1Name.setFont(new Font("Aharoni", Font.BOLD, 20));
			labelSupplyer1Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelSupplyer1Name.setOpaque(false);
			
			labelSupplyer2Name.setBounds(50, 790, 200, 50);
			labelSupplyer2Name.setFont(new Font("Aharoni", Font.BOLD, 20));
			labelSupplyer2Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelSupplyer2Name.setOpaque(false);
			
			labelMail1Name.setBounds(1429, 405, 55, 25);
			labelMail1Name.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelMail1Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelMail1Name.setOpaque(false);
			
			labelMail2Name.setBounds(1429, 685, 55, 25);
			labelMail2Name.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelMail2Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelMail2Name.setOpaque(false);
			
			labelMail3Name.setBounds(460, 565, 120, 25);
			labelMail3Name.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelMail3Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelMail3Name.setOpaque(false);
			
			labelMail4Name.setBounds(460, 835, 120, 25);
			labelMail4Name.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelMail4Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelMail4Name.setOpaque(false);
			
			labelMail5Name.setBounds(1180, 530, 100, 25);
			labelMail5Name.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelMail5Name.setHorizontalAlignment(SwingConstants.CENTER);
			labelMail5Name.setOpaque(false);
			
			ImageIcon iconFactory = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Factory.png");
			labelProduction.setIcon(iconFactory);
			labelProduction.setBounds(790, 400, 500, 500);
			labelProduction.setOpaque(false);
						
			ImageIcon iconCustomer1 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Customer1.png");
			labelCustomer1.setIcon(iconCustomer1);
			labelCustomer1.setBounds(1600, 350, 200, 200);
			labelCustomer1.setOpaque(false);
						
			ImageIcon iconCustomer2 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Customer2.png");
			labelCustomer2.setIcon(iconCustomer2);
			labelCustomer2.setBounds(1550, 780, 350, 250);
			labelCustomer2.setOpaque(false);
												
			ImageIcon iconSupplyer1 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Supplyer1.png");
			labelSupplyer1.setIcon(iconSupplyer1);
			labelSupplyer1.setBounds(20, 350, 350, 250);
			labelSupplyer1.setOpaque(false);
						
			ImageIcon iconSupplyer2 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Supplyer2.png");
			labelSupplyer2.setIcon(iconSupplyer2);
			labelSupplyer2.setBounds(20, 780, 350, 250);
			labelSupplyer2.setOpaque(false);
			
			textFieldMail1.setBounds(1429, 460, 55, 25);
			textFieldMail1.setBackground(Color.lightGray);
			textFieldMail1.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldMail1.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldMail1.setForeground(Color.RED);
			textFieldMail1.setText(Integer.toString(customers.getOrdersCustomer1ValueList().get(0)));
			textFieldMail1.setEditable(false);
			
			textFieldMail2.setBounds(1429, 742, 55, 25);
			textFieldMail2.setBackground(Color.lightGray);
			textFieldMail2.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldMail2.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldMail2.setForeground(Color.RED);
			textFieldMail2.setText(Integer.toString(customers.getOrdersCustomer2ValueList().get(0)));
			textFieldMail2.setEditable(false);
			
			textFieldMail3.setBounds(490, 620, 55, 35);
			textFieldMail3.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldMail3.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldMail3.setForeground(Color.RED);
			
			textFieldMail4.setBounds(490, 890, 55, 35);
			textFieldMail4.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldMail4.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldMail4.setForeground(Color.RED);
			
			textFieldMail5.setBounds(1200, 585, 55, 35);
			textFieldMail5.setBackground(Color.lightGray);
			textFieldMail5.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldMail5.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldMail5.setForeground(Color.RED);
			textFieldMail5.setText(Integer.toString((customers.getOrdersCustomer1ValueList().get(0))+(customers.getOrdersCustomer2ValueList().get(0))));
			textFieldMail5.setEditable(false);
			
			ImageIcon iconMail1 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\mail.png");
			labelMail1.setIcon(iconMail1);
			labelMail1.setBounds(1400, 390, 100, 100);
			labelMail1.setOpaque(false);
			
			labelMail2.setIcon(iconMail1);
			labelMail2.setBounds(1400, 670, 100, 100);
			labelMail2.setOpaque(false);
			
			labelMail3.setIcon(iconMail1);
			labelMail3.setBounds(461, 550, 100, 100);
			labelMail3.setOpaque(false);
			
			labelMail4.setIcon(iconMail1);
			labelMail4.setBounds(461, 820, 100, 100);
			labelMail4.setOpaque(false);
			
			labelMail5.setIcon(iconMail1);
			labelMail5.setBounds(1171, 515, 100, 100);
			labelMail5.setOpaque(false);
			
			textFieldTruck1.setBounds(1430, 615, 48, 25);
			textFieldTruck1.setBackground(Color.lightGray);
			textFieldTruck1.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldTruck1.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck1.setForeground(Color.BLUE);
			textFieldTruck1.setText("0");
			textFieldTruck1.setEditable(false);
			
			
			textFieldTruck2.setBounds(1430, 865, 48, 25);
			textFieldTruck2.setBackground(Color.lightGray);
			textFieldTruck2.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldTruck2.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck2.setForeground(Color.BLUE);
			textFieldTruck2.setText("0");
			textFieldTruck2.setEditable(false);
			
			textFieldTruck3.setBounds(493, 700, 48, 25);
			textFieldTruck3.setBackground(Color.lightGray);
			textFieldTruck3.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldTruck3.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck3.setForeground(Color.BLUE);
			textFieldTruck3.setText("0");
			textFieldTruck3.setEditable(false);
			
			textFieldTruck4.setBounds(440, 435, 48, 25);
			textFieldTruck4.setBackground(Color.lightGray);
			textFieldTruck4.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldTruck4.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck4.setForeground(Color.BLUE);
			textFieldTruck4.setText("0");
			textFieldTruck4.setEditable(false);
			
			textFieldTruck5.setBounds(540, 495, 48, 25);
			textFieldTruck5.setBackground(Color.lightGray);
			textFieldTruck5.setFont(new Font("TimesRoman", Font.BOLD, 20));
			textFieldTruck5.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck5.setForeground(Color.BLUE);
			textFieldTruck5.setText("0");
			textFieldTruck5.setEditable(false);
			
			textFieldTruck6.setBounds(1200, 685, 48, 35);
			textFieldTruck6.setBackground(Color.lightGray);
			textFieldTruck6.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldTruck6.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldTruck6.setForeground(Color.BLUE);
			textFieldTruck6.setText("0");
			textFieldTruck6.setEditable(false);
			
			ImageIcon iconTruck1 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Truck.png");
			labelTruck1.setIcon(iconTruck1);
			labelTruck1.setBounds(1410, 580, 100, 100);
			labelTruck1.setOpaque(false);
			
			labelTruck2.setIcon(iconTruck1);
			labelTruck2.setBounds(1410, 830, 100, 100);
			labelTruck2.setOpaque(false);
			
			labelTruck3.setIcon(iconTruck1);
			labelTruck3.setBounds(473, 665, 100, 100);
			labelTruck3.setOpaque(false);
			
			labelTruck4.setIcon(iconTruck1);
			labelTruck4.setBounds(420, 400, 100, 100);
			labelTruck4.setOpaque(false);
			
			labelTruck5.setIcon(iconTruck1);
			labelTruck5.setBounds(520, 460, 100, 100);
			labelTruck5.setOpaque(false);
			
			labelTruck6.setIcon(iconTruck1);
			labelTruck6.setBounds(1180, 660, 100, 100);
			labelTruck6.setOpaque(false);
			
			textFieldSupplyer1Raw.setBounds(280, 440, 60, 35);
			textFieldSupplyer1Raw.setBackground(Color.lightGray);
			textFieldSupplyer1Raw.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldSupplyer1Raw.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldSupplyer1Raw.setText(Integer.toString(supplyers.getMaterialSupplyer1ValueList().get(0)));
			textFieldSupplyer1Raw.setEditable(false);
			
			textFieldSupplyer2Pack.setBounds(280, 880, 60, 35);
			textFieldSupplyer2Pack.setBackground(Color.lightGray);
			textFieldSupplyer2Pack.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldSupplyer2Pack.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldSupplyer2Pack.setText(Integer.toString(supplyers.getMaterialSupplyer2ValueList().get(0)));
			textFieldSupplyer2Pack.setEditable(false);
			
			labelSupplyer1RawName.setBounds(280, 415, 60, 25);
			labelSupplyer1RawName.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelSupplyer1RawName.setHorizontalAlignment(SwingConstants.CENTER);
			labelSupplyer1RawName.setForeground(Color.GRAY);
			labelSupplyer1RawName.setOpaque(false);
			
			labelSupplyer2PackName.setBounds(280, 855, 60, 25);
			labelSupplyer2PackName.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelSupplyer2PackName.setHorizontalAlignment(SwingConstants.CENTER);
			labelSupplyer2PackName.setForeground(Color.GRAY);
			labelSupplyer2PackName.setOpaque(false);
			
			textFieldPrestockRaw.setBounds(710, 585, 60, 35);
			textFieldPrestockRaw.setBackground(Color.lightGray);
			textFieldPrestockRaw.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldPrestockRaw.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldPrestockRaw.setForeground(new Color(0, 120, 0));
			textFieldPrestockRaw.setText(Integer.toString(prestock.getRawMaterialPrestockValueList().get(0)));
			textFieldPrestockRaw.setEditable(false);
			
			textFieldPrestockPack.setBounds(710, 685, 60, 35);
			textFieldPrestockPack.setBackground(Color.lightGray);
			textFieldPrestockPack.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldPrestockPack.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldPrestockPack.setForeground(new Color(0, 120, 0));
			textFieldPrestockPack.setText(Integer.toString(prestock.getPackagingMaterialPrestockValueList().get(0)));
			textFieldPrestockPack.setEditable(false);
			
			labelPrestockRawName.setBounds(710, 560, 60, 25);
			labelPrestockRawName.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelPrestockRawName.setHorizontalAlignment(SwingConstants.CENTER);
			labelPrestockRawName.setForeground(Color.GRAY);
			labelPrestockRawName.setOpaque(false);
			
			labelPrestockPackName.setBounds(710, 660, 60, 25);
			labelPrestockPackName.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelPrestockPackName.setHorizontalAlignment(SwingConstants.CENTER);
			labelPrestockPackName.setForeground(Color.GRAY);
			labelPrestockPackName.setOpaque(false);
			
			textFieldProductionOrder.setBounds(810, 856, 55, 35);
			textFieldProductionOrder.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldProductionOrder.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldProductionOrder.setForeground(Color.RED);

			labelProductionOrderName.setBounds(780, 800, 120, 25);
			labelProductionOrderName.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelProductionOrderName.setHorizontalAlignment(SwingConstants.CENTER);
			labelProductionOrderName.setOpaque(false);
			
			labelProductionOrder.setIcon(iconMail1);
			labelProductionOrder.setBounds(781, 785, 120, 100);
			labelProductionOrder.setOpaque(false);
			
			textFieldProductionInProcess.setBounds(960, 856, 55, 35);
			textFieldProductionInProcess.setBackground(Color.lightGray);
			textFieldProductionInProcess.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldProductionInProcess.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldProductionInProcess.setEditable(false);
			
			labelProductionInProcess.setBounds(930, 830, 120, 25);
			labelProductionInProcess.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelProductionInProcess.setHorizontalAlignment(SwingConstants.CENTER);
			labelProductionInProcess.setOpaque(false);
			
			textFieldProductionStock.setBounds(1110, 856, 55, 35);
			textFieldProductionStock.setBackground(Color.lightGray);
			textFieldProductionStock.setFont(new Font("TimesRoman", Font.BOLD, 30));
			textFieldProductionStock.setHorizontalAlignment(SwingConstants.CENTER);
			textFieldProductionStock.setForeground(new Color(0, 120, 0));
			textFieldProductionStock.setText(Integer.toString(stock.getFinishedGoodsStockValueList().get(0)));
			textFieldProductionStock.setEditable(false);
			
			labelProductionStock.setBounds(1080, 830, 120, 25);
			labelProductionStock.setFont(new Font("Aharoni", Font.BOLD, 12));
			labelProductionStock.setHorizontalAlignment(SwingConstants.CENTER);
			labelProductionStock.setOpaque(false);
			
			labelOrderRawInfo.setBounds(460, 650, 120, 25);
			labelOrderRawInfo.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelOrderRawInfo.setHorizontalAlignment(SwingConstants.CENTER);
			labelOrderRawInfo.setForeground(Color.MAGENTA);
			labelOrderRawInfo.setOpaque(false);
			
			labelOrderPackInfo.setBounds(460, 920, 120, 25);
			labelOrderPackInfo.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelOrderPackInfo.setHorizontalAlignment(SwingConstants.CENTER);
			labelOrderPackInfo.setForeground(Color.MAGENTA);
			labelOrderPackInfo.setOpaque(false);
			
			labelPrestock1Info.setBounds(685, 615, 120, 25);
			labelPrestock1Info.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelPrestock1Info.setHorizontalAlignment(SwingConstants.CENTER);
			labelPrestock1Info.setForeground(Color.MAGENTA);
			labelPrestock1Info.setOpaque(false);
			
			labelPrestock2Info.setBounds(685, 715, 120, 25);
			labelPrestock2Info.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelPrestock2Info.setHorizontalAlignment(SwingConstants.CENTER);
			labelPrestock2Info.setForeground(Color.MAGENTA);
			labelPrestock2Info.setOpaque(false);
			
			labelInProcess1Info.setBounds(830, 860, 120, 12);
			labelInProcess1Info.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelInProcess1Info.setHorizontalAlignment(SwingConstants.RIGHT);
			labelInProcess1Info.setForeground(new Color(0, 150, 100));
			labelInProcess1Info.setOpaque(false);
			
			labelInProcess2Info.setBounds(830, 875, 120, 12);
			labelInProcess2Info.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelInProcess2Info.setHorizontalAlignment(SwingConstants.RIGHT);
			labelInProcess2Info.setForeground(new Color(0, 150, 100));
			labelInProcess2Info.setOpaque(false);
			
			labelStockInfo.setBounds(1080, 891, 120, 12);
			labelStockInfo.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelStockInfo.setHorizontalAlignment(SwingConstants.RIGHT);
			labelStockInfo.setForeground(Color.MAGENTA);
			labelStockInfo.setOpaque(false);
			
			labelPriceInfo.setBounds(1150, 740, 140, 12);
			labelPriceInfo.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelPriceInfo.setHorizontalAlignment(SwingConstants.RIGHT);
			labelPriceInfo.setForeground(new Color(0, 150, 100));
			labelPriceInfo.setOpaque(false);
			
			labelFineInfo.setBounds(1120, 755, 220, 12);
			labelFineInfo.setFont(new Font("Aharoni", Font.BOLD, 10));
			labelFineInfo.setHorizontalAlignment(SwingConstants.RIGHT);
			labelFineInfo.setForeground(Color.MAGENTA);
			labelFineInfo.setOpaque(false);
			
			ImageIcon iconArrow1 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow1.png");
			labelArrow1.setIcon(iconArrow1);
			labelArrow1.setBounds(1200, 250, 500, 500);
			labelArrow1.setOpaque(false);

			ImageIcon iconArrow2 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow2.png");
			labelArrow2.setIcon(iconArrow2);
			labelArrow2.setBounds(1250, 350, 500, 500);
			labelArrow2.setOpaque(false);			
						
			ImageIcon iconArrow3 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow3.png");
			labelArrow3.setIcon(iconArrow3);
			labelArrow3.setBounds(1220, 500, 500, 500);
			labelArrow3.setOpaque(false);
			
			ImageIcon iconArrow4 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow4.png");
			labelArrow4.setIcon(iconArrow4);
			labelArrow4.setBounds(1150, 600, 500, 500);
			labelArrow4.setOpaque(false);
					
			ImageIcon iconArrow5 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow5.png");
			labelArrow5.setIcon(iconArrow5);
			labelArrow5.setBounds(300, 250, 500, 500);
			labelArrow5.setOpaque(false);
			
			ImageIcon iconArrow6 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow6.png");
			labelArrow6.setIcon(iconArrow6);
			labelArrow6.setBounds(250, 330, 500, 500);
			labelArrow6.setOpaque(false);
			
			ImageIcon iconArrow7 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow7.png");
			labelArrow7.setIcon(iconArrow7);
			labelArrow7.setBounds(220, 500, 500, 500);
			labelArrow7.setOpaque(false);
			
			ImageIcon iconArrow8 = new ImageIcon("C:\\Users\\Aurimo PC\\Java\\eclipse-workspace\\SupplyChainGame\\src\\lt\\amikalauskas\\Images\\Arrow8.png");
			labelArrow8.setIcon(iconArrow8);
			labelArrow8.setBounds(300, 600, 500, 500);
			labelArrow8.setOpaque(false);
			
			labelDays.setBounds(50, 80, 200, 50);
			labelDays.setFont(new Font("Georgia Bold", Font.BOLD, 40));
			labelDays.setHorizontalAlignment(SwingConstants.LEFT);
			labelDays.setForeground(new Color(200, 100, 50));
			labelDays.setText("DAY "+supplyChain.getCountMovements());
			labelDays.setOpaque(false);
			
			labelMoney.setBounds(50, 150, 500, 50);
			labelMoney.setFont(new Font("Georgia Bold", Font.BOLD, 40));
			labelMoney.setHorizontalAlignment(SwingConstants.LEFT);
			labelMoney.setForeground(new Color(50, 150, 0));
			labelMoney.setText("MONEY "+supplyChain.getMoney()+" EUR");
			labelMoney.setOpaque(false);
			
			labelTime.setBounds(50, 230, 500, 50);
			labelTime.setFont(new Font("Georgia Bold", Font.BOLD, 40));
			labelTime.setHorizontalAlignment(SwingConstants.LEFT);
			labelTime.setForeground(Color.BLUE);
			labelTime.setText("TIME "+time+" s");
			labelTime.setOpaque(false);
			
			buttonExit.setBounds(1600, 80, 200, 50);
			buttonExit.setFont(new Font("TimesRoman", Font.BOLD, 24));
			buttonExit.addActionListener(handler);
			
			buttonNextDay.setBounds(810, 950, 350, 50);
			buttonNextDay.setFont(new Font("TimesRoman", Font.BOLD, 24));
			buttonNextDay.addActionListener(handler);
			
			buttonResultsTable.setBounds(1600, 150, 200, 50);
			buttonResultsTable.setFont(new Font("TimesRoman", Font.BOLD, 14));
			buttonResultsTable.addActionListener(handler);
			
			setTime(100);
			Looper looper = new Looper();
			looper.run();

		}
		
		public class Looper implements Runnable {

		    private AtomicBoolean keepRunning;

		    public Looper() {
		        keepRunning = new AtomicBoolean(true);
		    }

		    public void stop() {
		        keepRunning.set(false);
		    }

		    @Override
		    public void run() {
		    	
		        while (keepRunning.get()) {
		        	SupplyChain supplyChain = new SupplyChain();
		        	setDay(supplyChain.getCountMovements());
					for (int i = getTime(); i>=0 && getDay()==supplyChain.getCountMovements(); i--) {
						try{
		                Thread.sleep(1000);
		                labelTime.setText("TIME "+i+" s");
		       	    }
		                catch(Exception e){	
						}						
					}
					if(getDay()==supplyChain.getCountMovements()) {
					buttonNextDay.doClick();
					}
		        }		       
		    }

		}
		
		public class eHandler implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == buttonExit) {
					System.exit(0);
				}

				if (e.getSource() == buttonNextDay) {
					ScreenMain screenMain = new ScreenMain("");
					screenMain.setTime(100);
					
					// tikrinam paduodamas reiksmens
					
					if (textFieldProductionOrder.getText().equals("")) {
						textFieldProductionOrder.setText("0");
					}
					try{
						  int num = Integer.parseInt(textFieldProductionOrder.getText());
						  // is an integer!
						} catch (NumberFormatException e1) {
							MessageBoxWrongData wrongData = new MessageBoxWrongData("Message Box");
							wrongData.MBWrongData();
						}
					
					
					if (textFieldMail3.getText().equals("")) {
						textFieldMail3.setText("0");
					}
					try{
						  int num = Integer.parseInt(textFieldMail3.getText());
						  // is an integer!
						} catch (NumberFormatException e1) {
							MessageBoxWrongData wrongData = new MessageBoxWrongData("Message Box");
							wrongData.MBWrongData();
						}
					
					if (textFieldMail4.getText().equals("")) {
						textFieldMail4.setText("0");
					}
					try{
						  int num = Integer.parseInt(textFieldMail4.getText());
						  // is an integer!
						} catch (NumberFormatException e2) {
							MessageBoxWrongData wrongData = new MessageBoxWrongData("Message Box");
							wrongData.MBWrongData();
						}
					

					if (Integer.parseInt(textFieldMail3.getText())>=0 && Integer.parseInt(textFieldMail4.getText())>=0 && Integer.parseInt(textFieldProductionOrder.getText())>=0) {
						
					if (prestock.getRawMaterialPrestock()>=Integer.parseInt(textFieldProductionOrder.getText())) {
					
					if (prestock.getPackagingMaterialPrestock()>=Integer.parseInt(textFieldProductionOrder.getText())) {
						
					supplyChain.skaiciuotiCountMovement();
					labelDays.setText("DAY "+supplyChain.getCountMovements());
					
					// Production
					
					production.papildytiProductionLista(Integer.parseInt(textFieldProductionOrder.getText()));
					textFieldProductionOrder.setText(null);
					
					
					//Supplyer1
					
					supplyers.priskirtiNaujaUzsakymaMaterialSupplyers1(Integer.parseInt(textFieldMail3.getText()));
					textFieldSupplyer1Raw.setText(Integer.toString(supplyers.getMaterialSupplyer1ValueList().get(supplyChain.getCountMovements())));
					textFieldMail3.setText(null);


					if (supplyChain.getCountMovements()-1 < 0) {
						textFieldTruck4.setText(Integer.toString(0));
					}
					else {
						textFieldTruck4.setText(Integer.toString(supplyers.getMaterialSupplyer1ValueList().get(supplyChain.getCountMovements()-1)));
					}
					
					if (supplyChain.getCountMovements()-2 < 0) {
						textFieldTruck5.setText(Integer.toString(0));
					}
					else {
						textFieldTruck5.setText(Integer.toString(supplyers.getMaterialSupplyer1ValueList().get(supplyChain.getCountMovements()-2)));
					}

					//Supplyer2
					

					supplyers.priskirtiNaujaUzsakymaMaterialSupplyers2(Integer.parseInt(textFieldMail4.getText()));
					textFieldSupplyer2Pack.setText(Integer.toString(supplyers.getMaterialSupplyer2ValueList().get(supplyChain.getCountMovements())));
					textFieldMail4.setText(null);


					if (supplyChain.getCountMovements()-1 < 0) {
						textFieldTruck3.setText(Integer.toString(0));
					}
					else {
						textFieldTruck3.setText(Integer.toString(supplyers.getMaterialSupplyer2ValueList().get(supplyChain.getCountMovements()-1)));
					}
					
					//Prestock Raw Material

					textFieldPrestockRaw.setText(Integer.toString(prestock.perskaiciuotiRawPrestockLikuti()));
					
					//Prestock Pack Material
					
					textFieldPrestockPack.setText(Integer.toString(prestock.perskaiciuotiPackPrestockLikuti()));
					
				
					// In Process
					
					if (supplyChain.getCountMovements()-1 < 0) {
						textFieldProductionInProcess.setText(Integer.toString(0));
					}
					else {
						textFieldProductionInProcess.setText(Integer.toString(production.getProductionValueList().get(supplyChain.getCountMovements()-1)));
					}
					
			
					// Customer1
					
					customers.priskirtiNaujaUzsakymaCustomers();
					textFieldMail1.setText(Integer.toString(customers.getOrdersCustomer1ValueList().get(supplyChain.getCountMovements())));
					
					// Customer2
					
					customers.priskirtiNaujaUzsakymaCustomers();
					textFieldMail2.setText(Integer.toString(customers.getOrdersCustomer2ValueList().get(supplyChain.getCountMovements())));
					
					// Customer order total
					
					supplyChain.papildytaCustomerOrdersLista();	
					textFieldMail5.setText(Integer.toString((customers.getOrdersCustomer1ValueList().get(supplyChain.getCountMovements()))+(customers.getOrdersCustomer2ValueList().get(supplyChain.getCountMovements()))));
					

					// Stock
					stock.perskaiciuotiFinishedGoodsLista();
					textFieldProductionStock.setText(Integer.toString(stock.getFinishedGoodsStockValueList().get(supplyChain.getCountMovements())));
					
					// Truck total
					
					supplyChain.papildytiDeliveredOrdersLista();
					textFieldTruck6.setText(Integer.toString(supplyChain.getDeliveredOrdersList().get(supplyChain.getCountMovements()-1)));
					supplyChain.skaiciuotiProporcijaTarpOrderiu();
					
					// Truck Customer1
					double delivery1 = Math.round((supplyChain.getDeliveredOrdersList().get(supplyChain.getCountMovements()-1))*supplyChain.getProportion()/100);
					int delivery2 = (int) delivery1;
					
					textFieldTruck1.setText(Integer.toString(delivery2));
					
					// Truck Customer2
					
					textFieldTruck2.setText(Integer.toString((supplyChain.getDeliveredOrdersList().get(supplyChain.getCountMovements()-1))-delivery2));
					
					// Money
					supplyChain.skaiciuotiNeedMoney();
					
					
					if(supplyChain.getMoney()<(supplyChain.getNeedMoney()*-1)) {
					MessageBoxGameOver gameOver = new MessageBoxGameOver("MessageBox");
					gameOver.GameOverScreen();
					supplyChain.papildytiMoney();
					labelMoney.setText("MONEY "+supplyChain.getMoney()+" EUR");
					buttonNextDay.setEnabled(false);
					textFieldMail3.setEnabled(false);
					textFieldMail4.setEnabled(false);
					textFieldProductionOrder.setEnabled(false);
					
					screenMain.setTime(0);
					
					//Time

					
					}
					else {

					supplyChain.papildytiMoney();
					labelMoney.setText("MONEY "+supplyChain.getMoney()+" EUR");
					}
					}
					else {
						setProductionOrder(textFieldProductionOrder.getText());
						MessageBoxPackMaterial packMaterials = new MessageBoxPackMaterial("Message Box");
						packMaterials.MBPackMaterialsScreen();
					}
					}
					else {
						setProductionOrder(textFieldProductionOrder.getText());
						MessageBoxRawMaterial rawMaterials = new MessageBoxRawMaterial("Message Box");
						rawMaterials.MBRawMaterialsScreen();
					}

				}
				else {
					MessageBoxWrongData wrongData = new MessageBoxWrongData("Message Box");
					wrongData.MBWrongData();
					
				}
				}
				
				if (e.getSource() == buttonResultsTable) {
					ResultsTable resultsTable = new ResultsTable();
					resultsTable.ResultsTable();
				}

			}
		}
	}

