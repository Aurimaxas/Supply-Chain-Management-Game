package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;

public class Prestock {
	
	private static int rawMaterialPrestock;
	private static int packagingMaterialPrestock;
	private static List<Integer> rawMaterialPrestockValueList = new ArrayList<Integer>();
	private static List<Integer> packagingMaterialPrestockValueList = new ArrayList<Integer>();
		
	public int getRawMaterialPrestock() {
		return rawMaterialPrestock;
	}
	public void setRawMaterialPrestock(int rawMaterialPrestock) {
		this.rawMaterialPrestock = rawMaterialPrestock;
	}
	public int getPackagingMaterialPrestock() {
		return packagingMaterialPrestock;
	}
	public void setPackagingMaterialPrestock(int packagingMaterialPrestock) {
		this.packagingMaterialPrestock = packagingMaterialPrestock;
	}
	public static List<Integer> getRawMaterialPrestockValueList() {
		return rawMaterialPrestockValueList;
	}
	public static void setRawMaterialPrestockValueList(List<Integer> rawMaterialPrestockValueList) {
		Prestock.rawMaterialPrestockValueList = rawMaterialPrestockValueList;
	}
	public static List<Integer> getPackagingMaterialPrestockValueList() {
		return packagingMaterialPrestockValueList;
	}
	public static void setPackagingMaterialPrestockValueList(List<Integer> packagingMaterialPrestockValueList) {
		Prestock.packagingMaterialPrestockValueList = packagingMaterialPrestockValueList;
	}
	
	public void priskirtiReiksmeRawMaterialPrestock (int rawMaterialPrestock) {
		this.setRawMaterialPrestock(rawMaterialPrestock);
	}
	
	public void priskirtiReiksmePackagingMaterialPrestock (int packagingMaterialPrestock) {
		this.setPackagingMaterialPrestock(packagingMaterialPrestock);;
	}
	
	public void papildytiListaRawMaterialPrestock (int rawMaterialPrestock) {
		rawMaterialPrestockValueList.add(rawMaterialPrestock);
	}
	
	public void papildytiListaPackagingMaterialPrestock (int packagingMaterialPrestock) {
		packagingMaterialPrestockValueList.add(packagingMaterialPrestock);
	}
	
	public int perskaiciuotiRawPrestockLikuti () {
		SupplyChain supplyChain = new SupplyChain();
		Supplyers supplyers = new Supplyers();
		if(supplyChain.getCountMovements()-3<0) {
		setRawMaterialPrestock(getRawMaterialPrestock()-(Production.getProductionValueList().get(supplyChain.getCountMovements()-1)));	
		}
		else {
		setRawMaterialPrestock(getRawMaterialPrestock()+(supplyers.getMaterialSupplyer1ValueList().get(supplyChain.getCountMovements()-3))-(Production.getProductionValueList().get(supplyChain.getCountMovements()-1)));
		}
		rawMaterialPrestockValueList.add(rawMaterialPrestock);
		return rawMaterialPrestock;
		
	}
	
	public int perskaiciuotiPackPrestockLikuti () {
		SupplyChain supplyChain = new SupplyChain();
		Supplyers supplyers = new Supplyers();
		if(supplyChain.getCountMovements()-2<0) {
			setPackagingMaterialPrestock(getPackagingMaterialPrestock()-(Production.getProductionValueList().get(supplyChain.getCountMovements()-1)));	
		}
		else {
		setPackagingMaterialPrestock(getPackagingMaterialPrestock()+(supplyers.getMaterialSupplyer2ValueList().get(supplyChain.getCountMovements()-2))-(Production.getProductionValueList().get(supplyChain.getCountMovements()-1)));
		}
		packagingMaterialPrestockValueList.add(packagingMaterialPrestock);
		return packagingMaterialPrestock;
		
	}
	
}
