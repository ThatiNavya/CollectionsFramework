package com.teaching;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 =(Integer)o1;
		Integer I2 =(Integer)o2;
		if(I1<I2) {
			return 100;    // reverse = I2, I1 = Larger, Smaller
		}else if(I1>I2) {
			return -100;   // As it is = I1, I2 = Larger, Smaller
		}else
				
		return 0;
	}

}
