package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueCandies {
	private QueueCandies qc;
	private Queue q;
	
	@BeforeEach
	public void setup() {
		qc = new QueueCandies();
		q = new Queue();
	}
	@Test
	public void testGetCandy() {
		q.addCandy("Chocolate");
		q.addCandy("Cola");
		q.addCandy("Peppermint");
		q.addCandy("BlueRaspberry");
		qc.GetCandy(q, 3);
	}
	
	
	@AfterEach
	public void teardown() {
		
	}
}
