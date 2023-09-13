package com.mapPrograms;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		System.out.println(p.peek()); // null
		//System.out.println(p.element()); //NoSuchElementException
		
		System.out.println(p.poll());
	    //System.out.println(p.remove()); //NoSuchElementException
		for(int i=0;i<=10;i++) {
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}

}
