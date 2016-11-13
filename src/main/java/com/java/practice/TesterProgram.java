package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesterProgram {
	
	public static void main(String[] args) {
	List<String> ns1 = new ArrayList<String>();
	ns1.add("Kira");ns1.add("Life");ns1.add("Nicholas");ns1.add("Samuel");ns1.add("John");
	
	List<String> ns2 = new ArrayList<String>();
	ns2.add("Kira");ns2.add("Life");ns2.add("Nicholas");ns2.add("Samuel");ns2.add("John");
	
	TesterProgram program = new TesterProgram();
	System.out.println("Sorting collection using Java 7 feature.");
	program.sortUsingJava7(ns1);
	System.out.println( ns1 );
	
	}
	
	private void sortUsingJava7(List<String> ns){
		Collections.sort(ns, new Comparator<String>() {
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
	}
	
	private void sortUsingJava8(List<String> ns){
		Collections.sort(ns, (string1,string2)-> string1.compareTo(string2));
	}	
}
