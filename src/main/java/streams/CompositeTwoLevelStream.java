package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompositeTwoLevelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( DataGenerator.getData() );
		
	}
	
}

class  DataGenerator{
	//Coupon attribute. sku, id, type, price, amount
	public static List<Map<String,Object>> getData(){
		List<Map<String,Object>> coupons = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> ChoclateCpn = new HashMap<String,Object>();
		Map<String,Object> MeatCpn = new HashMap<String,Object>();
		Map<String,Object> ChkCpn = new HashMap<String,Object>();
		Map<String,Object> FruitCpn = new HashMap<String,Object>();
		Map<String,Object> FishCpnSalmon = new HashMap<String,Object>();
		Map<String,Object> FishCpnCatish = new HashMap<String,Object>();
		
		ChoclateCpn.put("sku" , "SKU001");
		ChoclateCpn.put("id","100");
		ChoclateCpn.put("type","GROC");
		ChoclateCpn.put("price",12);
		ChoclateCpn.put("amount",2);
		
		MeatCpn.put("sku" , "SKU002");
		MeatCpn.put("id","101");
		MeatCpn.put("type","MT");
		MeatCpn.put("price",10);
		MeatCpn.put("amount",2);
		
		ChkCpn.put("sku" , "SKU003");
		ChkCpn.put("id","103");
		ChkCpn.put("type","MT");
		ChkCpn.put("price",6);
		ChkCpn.put("amount",1);
		
		FruitCpn.put("sku" , "SKU004");
		FruitCpn.put("id","104");
		FruitCpn.put("type","FRUT");
		FruitCpn.put("price", 20);
		FruitCpn.put("amount", 4);
		
		FishCpnSalmon.put("sku" , "SKU005");
		FishCpnSalmon.put("id","105");
		FishCpnSalmon.put("type","MT");
		FishCpnSalmon.put("price", 12);
		FishCpnSalmon.put("amount", 2);
		
		FishCpnCatish.put("sku" , "SKU006");
		FishCpnCatish.put("id","106");
		FishCpnCatish.put("type","MT");
		FishCpnCatish.put("price", 5 );
		FishCpnCatish.put("amount", 1.5 );
		
		coupons.add( ChoclateCpn);
		coupons.add( MeatCpn );
		
		coupons.add( ChkCpn );
		coupons.add( FruitCpn );
		
		coupons.add( FishCpnSalmon );
		coupons.add( FishCpnCatish );
		
		return coupons;
	}
}
