package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;

public class Supplyers {
	
	private int MaterialSupplyer1;
	private int MaterialSupplyer2;	
	private static List<Integer> MaterialSupplyer1ValueList = new ArrayList<Integer>();
	private static List<Integer> MaterialSupplyer2ValueList = new ArrayList<Integer>();

	public int getMaterialSupplyer1() {
		return MaterialSupplyer1;
	}

	public void setMaterialSupplyer1(int MaterialSupplyer1) {
		this.MaterialSupplyer1 = MaterialSupplyer1;
	}
	
	public int getMaterialSupplyer2() {
		return MaterialSupplyer2;
	}

	public void setMaterialSupplyer2(int materialSupplyer2) {
		MaterialSupplyer2 = materialSupplyer2;
	}

	public static List<Integer> getMaterialSupplyer1ValueList() {
		return MaterialSupplyer1ValueList;
	}

	public static void setMaterialValueList(List<Integer> MaterialSupplyer1ValueList) {
		Supplyers.MaterialSupplyer1ValueList = MaterialSupplyer1ValueList;
	}

	public static List<Integer> getMaterialSupplyer2ValueList() {
		return MaterialSupplyer2ValueList;
	}

	public static void setMaterialSupplyer2ValueList(List<Integer> materialSupplyer2ValueList) {
		MaterialSupplyer2ValueList = materialSupplyer2ValueList;
	}

	public void priskirtiReiksmeRMaterialSupplyers (int MaterialSupplyer1, int MaterialSupplyer2) {
		this.setMaterialSupplyer1(MaterialSupplyer1);
		this.setMaterialSupplyer2(MaterialSupplyer2);
	}
	
	public void papildytiListaMaterialSupplyers (int MaterialSupplyer1, int MaterialSupplyer2) {
		MaterialSupplyer1ValueList.add(MaterialSupplyer1);
		MaterialSupplyer2ValueList.add(MaterialSupplyer2);
	}
	
	public void priskirtiNaujaUzsakymaMaterialSupplyers1(int naujasUzsakymas1) {
		this.setMaterialSupplyer1(naujasUzsakymas1);
		MaterialSupplyer1ValueList.add(naujasUzsakymas1);

	}
	
	public void priskirtiNaujaUzsakymaMaterialSupplyers2(int naujasUzsakymas2) {
		this.setMaterialSupplyer2(naujasUzsakymas2);
		MaterialSupplyer2ValueList.add(naujasUzsakymas2);
	}


}
