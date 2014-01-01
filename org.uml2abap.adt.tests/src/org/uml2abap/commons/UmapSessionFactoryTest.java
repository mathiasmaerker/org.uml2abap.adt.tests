package org.uml2abap.commons;

import org.junit.Test;
import org.uml2abap.adt.commons.UmapSessionFactory;

import static org.junit.Assert.*;

public class UmapSessionFactoryTest {
	
	@Test
	public void instanceTest() {
		UmapSessionFactory factory = UmapSessionFactory.getInstance();
		UmapSessionFactory factory2 = UmapSessionFactory.getInstance();
		assertEquals(factory, factory2);
	}
	
	@Test
	public void connectionTestSuccess() {
		UmapSessionFactory factory = UmapSessionFactory.getInstance();
		String[] systems = new String[3];
		systems[0] = "R6T CuserXY";
		systems[1] = "R6T Cuser12";
		systems[2] = "R6T Cuser34";
		try {
			// @ TODO Dummy Werte ändern
			String[] mockSystems = factory.getAbapProjects();
			assertArrayEquals(mockSystems, systems);
			
		} catch (Exception e) {
			fail("Exception, but there are AbapProjects available");
		}
	}

}
