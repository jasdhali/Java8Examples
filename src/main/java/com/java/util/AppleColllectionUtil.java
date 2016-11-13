package com.java.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.practice.domain.Apple;

public class AppleColllectionUtil {
	public List<Apple> getUnsortedAppleList() {
		List<Apple> unsortedApplList = new ArrayList<Apple>();
		for (int i = 1; i <= 6; i++) {
			Apple a = null;
			if (i % 2 == 0) {
				a = new Apple("EVEN", new Float(i));
			} else {
				a = new Apple("ODD", new Float(i));
			}
			unsortedApplList.add(a);
		}
		return unsortedApplList;
	}
	public List<Apple> getListSortedByWeight() {
		List<Apple> unsortedApplList = getUnsortedAppleList();
		unsortedApplList.sort(new Comparator<Apple>() {
			public int compare(Apple a1, Apple a2) {
				return a1.getCategory().compareTo(a2.getCategory());
			}

		});
		return unsortedApplList;
	}
}
