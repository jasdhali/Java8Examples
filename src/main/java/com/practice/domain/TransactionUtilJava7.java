package com.practice.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionUtilJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Currency, List<Transaction>> transByCurr=new HashMap<>();
		TransactionDB transactionDB = new TransactionDB();
		List<Transaction> lstTrans = transactionDB.getTransactions();
		for (Transaction trans : lstTrans) {
			if( trans.getPrice()>1000.0 ){
				Currency currency = trans.getCurrency();
				List<Transaction> transForCurr = transByCurr.get(currency);
				if( transForCurr==null){
					transForCurr = new ArrayList<>();
					transByCurr.put(currency, transForCurr);
				}
				transForCurr.add(trans);
			}
		}
		System.out.println( transByCurr );
	}
	

}
