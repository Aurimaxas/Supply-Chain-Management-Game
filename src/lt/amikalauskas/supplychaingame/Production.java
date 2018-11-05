package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;

public class Production {
	
	private int productionVolume;
	private static List<Integer> productionValueList = new ArrayList<Integer>();
	
	public int getProductionVolume() {
		return productionVolume;
	}
	public void setProductionVolume(int productionVolume) {
		this.productionVolume = productionVolume;
	}
	public static List<Integer> getProductionValueList() {
		return productionValueList;
	}
	public static void setProductionValueList(List<Integer> productionValueList) {
		Production.productionValueList = productionValueList;
	}
	
		
	public void papildytiProductionLista (int productionVolume) {
		productionValueList.add(productionVolume);
	}
	

		
	}

