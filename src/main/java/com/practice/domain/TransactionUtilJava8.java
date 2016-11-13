package com.practice.domain;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

public class TransactionUtilJava8 {

	public static void main(String[] args) {
		Map<Currency, List<Transaction>> transByCurr
		= (new TransactionDB()).getTransactions().stream().filter(
				(Transaction t) -> t.getPrice()>1000).collect( groupingBy(Transaction::getCurrency) )
				;
		
		System.out.println( transByCurr );
	}
	

}
