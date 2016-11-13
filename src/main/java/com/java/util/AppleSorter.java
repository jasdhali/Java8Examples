package com.java.util;

import java.util.ArrayList;
import java.util.Collection;

import com.practice.domain.Apple;

public class AppleSorter {
	public static void main(String[] args) {
		//System.out.println("Printing unsorted list of apples.");
		//System.out.println( new AppleColllectionUtil().getListSortedByWeight() );
		AppleSorter as = new AppleSorter();
		as.java8Sorter();
	}
	
	public void java8Sorter(){
		System.out.println("Unsorted ->" + new AppleColllectionUtil().getUnsortedAppleList() );
		Collection<Apple> c = new ArrayList<Apple>();
		System.out.println("Unsorted ->" + c.stream() );
	}
}
