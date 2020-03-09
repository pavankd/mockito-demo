package com.in28minutes.mockito.mockitodemo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// for junit4 use @RunWith(MockitoJunitRunner.class)
@ExtendWith(MockitoExtension.class)
public class SimpleBusinessMockitoTest {
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SimpleBusinessImpl simpleBusinessImpl;
	
	

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,6});
		assertEquals(24, simpleBusinessImpl.findTheGreatestFromAllData());
	}
	@Test
	public void testFindTheGreatestFromAOneData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(24, simpleBusinessImpl.findTheGreatestFromAllData());
	}

}



