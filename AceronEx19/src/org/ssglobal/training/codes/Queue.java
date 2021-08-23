package org.ssglobal.training.codes;

import java.util.ArrayDeque;
import java.util.Deque;


public class Queue {
	private Deque<String> dispenser = new ArrayDeque<>();

	public Deque<String> getDispenser() {
		return dispenser;
	}

	public void addCandy(String candy) {
		this.dispenser.add(candy);
	}
	
}
