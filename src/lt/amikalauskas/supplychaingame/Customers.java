package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customers {
	
	public int orderCustomer1;
	public int orderCustomer2;
	private static List<Integer> ordersCustomer1ValueList = new ArrayList<Integer>();
	private static List<Integer> ordersCustomer2ValueList = new ArrayList<Integer>();

	public int getOrderCustomer1() {
		return orderCustomer1;
	}

	public void setOrderCustomer1(int orderCustomer1) {
		this.orderCustomer1 = orderCustomer1;
	}
	
	public int getOrderCustomer2() {
		return orderCustomer2;
	}

	public void setOrderCustomer2(int orderCustomer2) {
		this.orderCustomer2 = orderCustomer2;
	}

	public static List<Integer> getOrdersCustomer1ValueList() {
		return ordersCustomer1ValueList;
	}

	public static void setOrdersCustomer1ValueList(List<Integer> ordersCustomer1ValueList) {
		Customers.ordersCustomer1ValueList = ordersCustomer1ValueList;
	}

	public static List<Integer> getOrdersCustomer2ValueList() {
		return ordersCustomer2ValueList;
	}

	public static void setOrdersCustomer2ValueList(List<Integer> ordersCustomer2ValueList) {
		Customers.ordersCustomer2ValueList = ordersCustomer2ValueList;
	}

	public void sugeneruotiOrderCustomer1(int orderCustomer1, int orderCustomer2) {
		this.setOrderCustomer1(orderCustomer1);
		this.setOrderCustomer2(orderCustomer2);
	}
	
	public void papildytiListaOrdersCustomer1 (int orderCustomer1, int orderCustomer2) {
		ordersCustomer1ValueList.add(orderCustomer1);
		ordersCustomer2ValueList.add(orderCustomer2);
	}
	
	public void priskirtiNaujaUzsakymaCustomers() {
		ordersCustomer1ValueList.add(new Random().nextInt(50-0));
		ordersCustomer2ValueList.add(new Random().nextInt(50-0));
	}
}
