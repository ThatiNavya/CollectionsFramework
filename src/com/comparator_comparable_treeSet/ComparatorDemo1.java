package com.comparator_comparable_treeSet;

import java.util.TreeSet;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
