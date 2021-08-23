package org.ssglobal.training.codes;

import java.util.Arrays;
import java.util.Scanner;

public class TrapArray {
	
	public void arrayTransact() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Fill with what character?");
		int filler = scan.nextInt();
		Arrays.fill(array, filler);
	}
}
