package lt.amikalauskas.supplychaingame;

import java.io.IOException;
import java.util.Random;
import javafx.stage.Stage;

import javafx.stage.Stage;
import lt.amikalauskas.screenssupplychain.Intro;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Supplyers supplyers = new Supplyers();
	supplyers.priskirtiReiksmeRMaterialSupplyers(60, 40);
	supplyers.papildytiListaMaterialSupplyers(supplyers.getMaterialSupplyer1(), supplyers.getMaterialSupplyer2());
	
	Prestock prestock = new Prestock();
	prestock.priskirtiReiksmeRawMaterialPrestock(80);
	prestock.papildytiListaRawMaterialPrestock(prestock.getRawMaterialPrestock());
	prestock.priskirtiReiksmePackagingMaterialPrestock(70);
	prestock.papildytiListaPackagingMaterialPrestock(prestock.getPackagingMaterialPrestock());
	
	Stock stock = new Stock();
	stock.priskirtiReiksmeFinishedGoodsStock(90);
	stock.papildytiListaFinishedGoddsStock(stock.getFinishedGoodsStock());
	
	Customers customers = new Customers();
	customers.sugeneruotiOrderCustomer1(new Random().nextInt(50-0), new Random().nextInt(50-0));
	customers.papildytiListaOrdersCustomer1(customers.getOrderCustomer1(), customers.getOrderCustomer2());
		
	SupplyChain supplyChain = new SupplyChain();
	supplyChain.papildytaCustomerOrdersLista();
	supplyChain.papildytiDeliveredOrdersLista();
	supplyChain.priskirtiPirmineReiksmeCountMovement(0);
	supplyChain.priskirtiPirmineReiksmeMoney(500);
	

	
	Intro video = new Intro();
	video.Pradeti(args);
	


	
		
	}

}
