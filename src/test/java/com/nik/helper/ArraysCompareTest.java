package com.nik.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
		assertArrayEquals(new int[] { 1, 3, 4, 12 }, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullPointerException() {
		int[] numbers = null;
		Arrays.sort(numbers);
		assertArrayEquals(new int[] { 1, 3, 4, 12 }, numbers);
	}
	
	@Test(timeout = 10)
	public void testArraySort_Performance() {
		int[] numbers = {12,23,4};
		for(int i=0;i<1000000;i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
	}


}
