package com.java.util.java8;

import java.util.Comparator;

import com.practice.domain.Apple;

public class AppleSorterJava8 {
	public static void main(String[] args) {
		System.out.println("Printing unsorted list of apples.");
		//System.out.println( new AppleColllectionUtil().getListSortedByWeight().sort(comparing(Apple::getWeight())) );
		Comparator<Apple> byWeight = 
				(Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
				
					
	}
}
