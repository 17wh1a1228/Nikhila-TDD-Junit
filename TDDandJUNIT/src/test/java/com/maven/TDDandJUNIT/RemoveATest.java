package com.maven.TDDandJUNIT;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * ABCD => BCD
 * AACD => CD
 * BACD => BCD
 * BBAA => BBAA
 * AABAA => BAA
 * AA => NULL
 * BC => BC
 * NULL => NULL
*/

public class RemoveATest {
	RemoveA remove = new RemoveA();
	@Test
	public void test1() {
		assertEquals("BCD",remove.removeA("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",remove.removeA("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",remove.removeA("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",remove.removeA("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",remove.removeA("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",remove.removeA("AA"));
	}
	@Test
	public void test7() {
		assertEquals("BC",remove.removeA("BC"));
	}@Test
	public void test8() {
		assertEquals("",remove.removeA(""));
	}



}
