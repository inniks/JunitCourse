package com.nik.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.nik.helper.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParametrisedBooleanTest {

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	StringHelper helper = new StringHelper();

	private String input;

	public StringHelperParametrisedBooleanTest(String input) {
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "ABAB"}, { "ACAC" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_failureCase() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
}
