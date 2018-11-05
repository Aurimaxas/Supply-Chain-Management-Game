package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;

import lt.amikalauskas.screenssupplychain.ScreenMain;

public class SupplyChain {
	
	private static int countMovements;
	private static int money;
	private static int needMoney;
	private static double proportion;
	private static List<Integer> customerOrdersList = new ArrayList<Integer>();
	private static List<Integer> deliveredOrdersList = new ArrayList<Integer>();

	public int getCountMovements() {
		return countMovements;
	}

	public void setCountMovements(int countMovements) {
		this.countMovements = countMovements;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static int getNeedMoney() {
		return needMoney;
	}

	public static void setNeedMoney(int needMoney) {
		SupplyChain.needMoney = needMoney;
	}

	public static List<Integer> getCustomerOrdersList() {
		return customerOrdersList;
	}

	public static void setCustomerOrdersList(List<Integer> customerOrdersList) {
		SupplyChain.customerOrdersList = customerOrdersList;
	}

	public static List<Integer> getDeliveredOrdersList() {
		return deliveredOrdersList;
	}

	public static void setDeliveredOrdersList(List<Integer> deliveredOrdersList) {
		SupplyChain.deliveredOrdersList = deliveredOrdersList;
	}

	public static double getProportion() {
		return proportion;
	}

	public static void setProportion(double proportion) {
		SupplyChain.proportion = proportion;
	}

	public void priskirtiPirmineReiksmeCountMovement (int countMovement) {
		setCountMovements(countMovement);
	}
	
	public void priskirtiPirmineReiksmeMoney (int money) {
		setMoney(money);
	}
	
	public int skaiciuotiCountMovement () {
		setCountMovements(getCountMovements()+1);
		return countMovements;
	}
	
	public void papildytaCustomerOrdersLista() {
		customerOrdersList.add(Customers.getOrdersCustomer1ValueList().get(countMovements)+(Customers.getOrdersCustomer2ValueList().get(countMovements)));
	}
	
	public void papildytiDeliveredOrdersLista() {
		Stock stock = new Stock();
		if (stock.getFinishedGoodsStock()<(Customers.getOrdersCustomer1ValueList().get(countMovements))+(Customers.getOrdersCustomer2ValueList().get(countMovements))) {
			deliveredOrdersList.add(stock.getFinishedGoodsStockValueList().get(countMovements));
		}
		else {
		deliveredOrdersList.add((Customers.getOrdersCustomer1ValueList().get(countMovements))+(Customers.getOrdersCustomer2ValueList().get(countMovements)));
		}
	}
	
	public void skaiciuotiProporcijaTarpOrderiu() {
		Customers customers = new Customers();
		setProportion((customers.getOrdersCustomer1ValueList().get(countMovements-1))*100/customerOrdersList.get(countMovements-1));
	}
	
	public void skaiciuotiNeedMoney() {
		this.needMoney -= ((Supplyers.getMaterialSupplyer1ValueList().get(countMovements))*3);
		this.needMoney -= ((Supplyers.getMaterialSupplyer2ValueList().get(countMovements))*3);
		Prestock prestock = new Prestock();
		this.needMoney -= prestock.getRawMaterialPrestock();
		this.needMoney -= prestock.getPackagingMaterialPrestock();
		Stock stock = new Stock();
		this.needMoney -= stock.getFinishedGoodsStock()*2;
		this.needMoney += ((deliveredOrdersList.get(countMovements-1)*10));
		int undeliveredOrder = 0;
		if ((deliveredOrdersList.get(countMovements-1)-customerOrdersList.get(countMovements-1))<0) {
			undeliveredOrder = ((deliveredOrdersList.get(countMovements-1)-customerOrdersList.get(countMovements-1))*-1);
		}
		this.needMoney -= (undeliveredOrder*5);
	}
	
	public void papildytiMoney() {
		this.money += getNeedMoney();
	}
	
	
	


}
