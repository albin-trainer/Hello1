package com.lnt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {
	static Calculator c=null;// new Calculator();
	
	@BeforeAll
	static void init() {
		System.out.println("Before All");
		c= new Calculator();
	}
	
	@BeforeEach //called before each test cases
	void anyMethodName() {
		 // b logic
		System.out.println("init ...");
		//c= new Calculator();
	}
	
	@AfterEach
	void f1() {
		System.out.println("closing db connections");
	}
	
	@Tag("Testing")
	//@Test
	@ParameterizedTest
	@CsvSource({"5,4,9","6,7,13","8,9,17","10,10,20"})
	@DisplayName("AddingNumbers1")
	void testAdd(int a,int b,int expectedValue) {
		//fail("Not yet implemented");
		System.out.println("testing add ...");
		int result=c.add(a, b);
		assertEquals(expectedValue, result);
	}
	@Tag("PROD")
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	@DisplayName("AddingNumbers2")
	void testAdd2(int a,int b,int expectedValue) {
		//fail("Not yet implemented");
		System.out.println("testing add ...");
		int result=c.add(a, b);
		assertEquals(expectedValue, result);
	}
	
	@Tag("Testing")
	@Test
	@DisplayName("FindingDifference")
	
	void testDiff() {
		System.out.println("testing diff ...");
		//fail("Not yet implemented");
		int result=c.diff(105, 85);
		assertEquals(20, result);
	}
	@Tag("PROD")
	@Test
	@DisplayName("FindingProduct")
	void testProduct() {
		System.out.println("testing product ...");
		//fail("Not yet implemented");
		int result=c.product(5, 5);
		assertEquals(25, result);
	}
	@Tag("Testing")
	@Test
	@DisplayName("FindingDiv")
	void testDiv() {
		System.out.println("testing div ...");
		//fail("Not yet implemented");
	   int result=c.div(50, 5);
		assertEquals(10, result);
	}
}
