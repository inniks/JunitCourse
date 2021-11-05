package com.nik.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTest {
	@Before
	public void setup() {
		System.out.println("Before setup executed");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}


}
