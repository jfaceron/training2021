package org.ssglobal.training.codes;

import java.util.Deque;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueueCandies {
	
	private static Logger logger = LogManager.getLogger("collectionLogger");
	
	public void GetCandy(Queue dispenser, int day) {
		logger.info("execute getCandy day = {}", String.valueOf(day));
		Deque<String> queue = dispenser.getDispenser();
		switch (day) {
		case 0:
			System.out.println("Monday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;
					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				System.out.println(dispenser.getDispenser());				
			}
			break;
		case 1:
			System.out.println("Tuesday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());								
			}
			break;
		case 2:
			System.out.println("Wednesday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());
			}
			break;
			
		case 3:
			System.out.println("Thursday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());
			}
			break;
		case 4:
			System.out.println("Friday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());
			}
			break;
		case 5:
			System.out.println("Saturday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());
			}
			break;
		case 6:
			System.out.println("Sunday");
			while(true) {
				if(queue == null || queue.peek() == null) {
					System.out.println();
					break;					
				}
				System.out.print("Pipi ate:");
				System.out.println(queue.peek());
				queue.poll();
				if(queue.peek()!= null) {				
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
					queue.poll();
					queue.addLast(queue.peek());
				}
				queue.poll();
					System.out.println(dispenser.getDispenser());
			}
			break;
		}
	}
}
