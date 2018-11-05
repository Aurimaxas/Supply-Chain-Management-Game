package lt.amikalauskas.supplychaingame;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private static int finishedGoodsStock;
	private static List<Integer> finishedGoodsStockValueList = new ArrayList<Integer>();
	
	
	public int getFinishedGoodsStock() {
		return finishedGoodsStock;
	}
	public void setFinishedGoodsStock(int finishedGoodsStock) {
		this.finishedGoodsStock = finishedGoodsStock;
	}
	public static List<Integer> getFinishedGoodsStockValueList() {
		return finishedGoodsStockValueList;
	}
	public static void setFinishedGoodsStockValueList(List<Integer> finishedGoodsStockValueList) {
		Stock.finishedGoodsStockValueList = finishedGoodsStockValueList;
	}
	
	public void priskirtiReiksmeFinishedGoodsStock (int finishedGoodsStock) {
		this.setFinishedGoodsStock(finishedGoodsStock);
	}
	
	public void papildytiListaFinishedGoddsStock (int finishedGoodsStock) {
		finishedGoodsStockValueList.add(finishedGoodsStock);
	}
	
	public void perskaiciuotiFinishedGoodsLista () {
		SupplyChain supplyChain = new SupplyChain();
		Production production = new Production();
		if (supplyChain.getCountMovements()-2 < 0) {
			
		}
		else {
			setFinishedGoodsStock(getFinishedGoodsStock()+(production.getProductionValueList().get(supplyChain.getCountMovements()-2)));

		}
			setFinishedGoodsStock(getFinishedGoodsStock()-(supplyChain.getDeliveredOrdersList().get(supplyChain.getCountMovements()-1)));
			if (getFinishedGoodsStock()<0) {
			setFinishedGoodsStock(0);
			finishedGoodsStockValueList.add(getFinishedGoodsStock());
			}
			finishedGoodsStockValueList.add(getFinishedGoodsStock());
		
	}
}
