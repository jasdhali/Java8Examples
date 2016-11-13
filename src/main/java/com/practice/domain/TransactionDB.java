package com.practice.domain;

import java.util.ArrayList;
import java.util.List;

public class TransactionDB {
	//public static Map<Currency,List<Transaction>> transactionDb = new HashMap<Currency,List<Transaction>>();
	public List<Transaction> getTransactions(){
		List<Transaction> list1 = new ArrayList<Transaction>();
		Transaction transaction800 = new Transaction(new Currency("USD"),new Float(800));
		Transaction transaction1000 = new Transaction(new Currency("USD"),new Float(1000));
		Transaction transaction1200 = new Transaction(new Currency("USD"),new Float(1200));
		Transaction transaction1300 = new Transaction(new Currency("USD"),new Float(1200));
		Transaction transaction1400 = new Transaction(new Currency("USD"),new Float(1400));
		list1.add(transaction800);list1.add(transaction1000);list1.add(transaction1200);
		list1.add(transaction1300);list1.add(transaction1400);
		return list1;
		
	}
}
