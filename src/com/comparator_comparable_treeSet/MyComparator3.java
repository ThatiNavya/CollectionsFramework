package com.comparator_comparable_treeSet;

import java.util.Comparator;

public class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	String s1 = o1.toString();
	String s2 = o2.toString();
		return s1.compareTo(s2);
		//return -s1.compareTo(s2);
	}

}
