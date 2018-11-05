package lt.amikalauskas.screenssupplychain;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import lt.amikalauskas.supplychaingame.Customers;
import lt.amikalauskas.supplychaingame.Prestock;
import lt.amikalauskas.supplychaingame.Production;
import lt.amikalauskas.supplychaingame.Stock;
import lt.amikalauskas.supplychaingame.SupplyChain;
import lt.amikalauskas.supplychaingame.Supplyers;

public class ResultsTable extends JFrame {
	
	public void ResultsTable () {
	    JFrame frame =new JFrame();
        JTable table = new JTable(getModel());
        Dimension d = table.getPreferredSize();
        table.setPreferredScrollableViewportSize(d);
        
        TableColumn col1 = table.getColumnModel().getColumn(0);
        DefaultTableCellRenderer dtcr1 = new DefaultTableCellRenderer();  
        dtcr1.setHorizontalAlignment(SwingConstants.CENTER);
        col1.setCellRenderer(dtcr1);
        
        TableColumn col2 = table.getColumnModel().getColumn(1);
        DefaultTableCellRenderer dtcr2 = new DefaultTableCellRenderer();  
        dtcr2.setHorizontalAlignment(SwingConstants.CENTER);
        col2.setCellRenderer(dtcr2);
        
        TableColumn col3 = table.getColumnModel().getColumn(2);
        DefaultTableCellRenderer dtcr3 = new DefaultTableCellRenderer();  
        dtcr3.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr3.setBackground(new Color(250, 150, 150));
        col3.setCellRenderer(dtcr3);
        
        TableColumn col4 = table.getColumnModel().getColumn(3);
        DefaultTableCellRenderer dtcr4 = new DefaultTableCellRenderer();  
        dtcr4.setHorizontalAlignment(SwingConstants.CENTER);
        col4.setCellRenderer(dtcr4);
        
        TableColumn col5 = table.getColumnModel().getColumn(4);
        DefaultTableCellRenderer dtcr5 = new DefaultTableCellRenderer();  
        dtcr5.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr5.setBackground(new Color(250, 150, 150));
        col5.setCellRenderer(dtcr5);
        
        TableColumn col6 = table.getColumnModel().getColumn(5);
        DefaultTableCellRenderer dtcr6 = new DefaultTableCellRenderer();  
        dtcr6.setHorizontalAlignment(SwingConstants.CENTER);
        col6.setCellRenderer(dtcr6);
        
        TableColumn col7 = table.getColumnModel().getColumn(6);
        DefaultTableCellRenderer dtcr7 = new DefaultTableCellRenderer();  
        dtcr7.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr7.setBackground(new Color(250, 150, 150));
        col7.setCellRenderer(dtcr7);
        
        TableColumn col8 = table.getColumnModel().getColumn(7);
        DefaultTableCellRenderer dtcr8 = new DefaultTableCellRenderer();  
        dtcr8.setHorizontalAlignment(SwingConstants.CENTER);
        col8.setCellRenderer(dtcr8);
        
        TableColumn col9 = table.getColumnModel().getColumn(8);
        DefaultTableCellRenderer dtcr9 = new DefaultTableCellRenderer();  
        dtcr9.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr9.setBackground(new Color(250, 150, 150));
        col9.setCellRenderer(dtcr9);
        
        TableColumn col10 = table.getColumnModel().getColumn(9);
        DefaultTableCellRenderer dtcr10 = new DefaultTableCellRenderer();  
        dtcr10.setHorizontalAlignment(SwingConstants.CENTER);
        col10.setCellRenderer(dtcr10);
        
        TableColumn col11 = table.getColumnModel().getColumn(10);
        DefaultTableCellRenderer dtcr11 = new DefaultTableCellRenderer();  
        dtcr11.setHorizontalAlignment(SwingConstants.CENTER);
        col11.setCellRenderer(dtcr11);
        
        TableColumn col12 = table.getColumnModel().getColumn(11);
        DefaultTableCellRenderer dtcr12 = new DefaultTableCellRenderer();  
        dtcr12.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr12.setBackground(new Color(250, 150, 150));   
        col12.setCellRenderer(dtcr12);
        
        TableColumn col13 = table.getColumnModel().getColumn(12);
        DefaultTableCellRenderer dtcr13 = new DefaultTableCellRenderer();  
        dtcr13.setHorizontalAlignment(SwingConstants.CENTER);
        col13.setCellRenderer(dtcr13);
        
        TableColumn col14 = table.getColumnModel().getColumn(13);
        DefaultTableCellRenderer dtcr14 = new DefaultTableCellRenderer();  
        dtcr14.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr14.setBackground(new Color(0, 200, 100));   
        col14.setCellRenderer(dtcr14);
        
        TableColumn col15 = table.getColumnModel().getColumn(14);
        DefaultTableCellRenderer dtcr15 = new DefaultTableCellRenderer();  
        dtcr15.setHorizontalAlignment(SwingConstants.CENTER);
        col15.setCellRenderer(dtcr15);
        
        TableColumn col16 = table.getColumnModel().getColumn(15);
        DefaultTableCellRenderer dtcr16 = new DefaultTableCellRenderer();  
        dtcr16.setHorizontalAlignment(SwingConstants.CENTER);
        dtcr16.setBackground(new Color(250, 150, 150));   
        col16.setCellRenderer(dtcr16);
        
        TableColumn col17 = table.getColumnModel().getColumn(16);
        DefaultTableCellRenderer dtcr17 = new DefaultTableCellRenderer();  
        dtcr17.setHorizontalAlignment(SwingConstants.CENTER);
        col17.setCellRenderer(dtcr17);
        
        TableColumn col18 = table.getColumnModel().getColumn(17);
        DefaultTableCellRenderer dtcr18 = new DefaultTableCellRenderer();  
        dtcr18.setHorizontalAlignment(SwingConstants.CENTER); 
        col18.setCellRenderer(dtcr18);


	    table.setRowHeight(30);
	    table.getTableHeader().setFont(new Font("Georgia Bold", Font.PLAIN, 14));
		table.setFont(new Font("Georgia", Font.PLAIN, 14));
       
        JTableHeader header = table.getTableHeader();
        header.setPreferredSize(new Dimension(0, 65));
        header.setBackground(Color.black); 
        header.setForeground(Color.WHITE);
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalTextPosition(JLabel.CENTER);

        
	   	frame.add(new JScrollPane(table));
        frame.pack();       
	    frame.setSize(1920,1000);    
	    frame.setVisible(true);
	    
	    MultiLineHeaderRenderer renderer = new MultiLineHeaderRenderer();
	    Enumeration e = table.getColumnModel().getColumns();
	    while (e.hasMoreElements()) {
	      ((TableColumn) e.nextElement()).setHeaderRenderer(renderer);
	    }

	    }

	private TableModel getModel() {
	    SupplyChain supplyChain = new SupplyChain();
		 DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(new Object[] {
	        		"Days","Orders\nCustomer-1,\nPC","Pay\nCustomer-1,\nEUR", "Orders\nCustomer-2,\nPC", "Pay\nCustomer-2,\nEUR", "Raw\nMaterial\nPrestock, PC", "RM\nPrestock\nCost, EUR", "Pack\nMaterial\nPrestock, PC", "PM\nPrestock\nCost, EUR",
	        		"Production,\nPC", "FG Stock,\nPC", "FG Stock\nCost, EUR", "Delivered\ngoods,\nPC", "Earn\nMoney,\nEUR" , "Undelivered\ngodds,\nPC", "Fine,\nEUR", "Order\nCustomer-1,\nPC", "Order\nCustomer-2,\nPC" });
	        
	        JTable table = new JTable(model);
	        for (int count = 1; count-1 < supplyChain.getCountMovements(); count++){
	            model.insertRow(count-1, new Object[] { count, Supplyers.getMaterialSupplyer1ValueList().get(count), (Supplyers.getMaterialSupplyer1ValueList().get(count))*-3, Supplyers.getMaterialSupplyer2ValueList().get(count),
	            		(Supplyers.getMaterialSupplyer2ValueList().get(count))*-3, Prestock.getRawMaterialPrestockValueList().get(count), (Prestock.getRawMaterialPrestockValueList().get(count))*-1, Prestock.getPackagingMaterialPrestockValueList().get(count),
	            		(Prestock.getPackagingMaterialPrestockValueList().get(count))*-1, Production.getProductionValueList().get(count-1), Stock.getFinishedGoodsStockValueList().get(count), (Stock.getFinishedGoodsStockValueList().get(count))*-2,
	            		supplyChain.getDeliveredOrdersList().get(count-1), (supplyChain.getDeliveredOrdersList().get(count-1))*10,((supplyChain.getCustomerOrdersList().get(count-1))-(supplyChain.getDeliveredOrdersList().get(count-1)))*-1,
	            		((supplyChain.getCustomerOrdersList().get(count-1))-(supplyChain.getDeliveredOrdersList().get(count-1)))*-5, Customers.getOrdersCustomer1ValueList().get(count-1), Customers.getOrdersCustomer2ValueList().get(count-1)});
	        }
		return model;
	}
}
	
	class MultiLineHeaderRenderer extends JList implements TableCellRenderer {
		  public MultiLineHeaderRenderer() {
		    setOpaque(true);
		    setForeground(UIManager.getColor(Color.WHITE));
		    setBackground(UIManager.getColor(Color.BLACK));
		    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		    ListCellRenderer renderer = getCellRenderer();
		    ((JLabel) renderer).setHorizontalAlignment(JLabel.CENTER);
		    setCellRenderer(renderer);
		  }

		  public Component getTableCellRendererComponent(JTable table, Object value,
		      boolean isSelected, boolean hasFocus, int row, int column) {
		    setFont(table.getFont());
		    String str = (value == null) ? "" : value.toString();
		    BufferedReader br = new BufferedReader(new StringReader(str));
		    String line;
		    Vector v = new Vector();
		    try {
		      while ((line = br.readLine()) != null) {
		        v.addElement(line);
		      }
		    } catch (IOException ex) {
		      ex.printStackTrace();
		    }
		    setListData(v);
		    return this;
		  }
}

	
	