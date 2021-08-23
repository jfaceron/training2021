package org.ssglobal.training.codes;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMixTransaction {
	private MixTransaction mt;
	
	@BeforeEach
	public void setup() {
		mt = new MixTransaction();
	}
	@Test
	public void testFileExists() {
		try {
			mt.fileExists("java.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsInt() {
		try {
			mt.isInt("500a");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsDouble(){
		try {
			mt.isDouble("a");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConvertMatrix(){
		try {
			mt.convertMatrix("data.txt");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterEach
	public void teardown() {
		mt = null;
	}
	
}