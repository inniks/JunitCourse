package com.nik.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nik.helper.StringHelper;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinTwoPos() {
		// AACD ==CD ACD==>CD CDEF==CDEF

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AnotInTwoPos() {
		// AACD ==CD ACD==>CD CDEF==CDEF
		assertEquals("CE", helper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD ==>false ABAB==>True AB ==>true A==>false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_failureCase() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
