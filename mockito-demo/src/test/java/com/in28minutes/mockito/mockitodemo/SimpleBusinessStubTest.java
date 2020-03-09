package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SimpleBusinessImpl simpleBusinessImpl = new SimpleBusinessImpl(new DataServiceStub());
		int result = simpleBusinessImpl.findTheGreatestFromAllData();
		 assertEquals(24, result);
	}

}


class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {24,6,15};
	}
	
}
