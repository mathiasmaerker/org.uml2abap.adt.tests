package org.uml2abap.commons;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.eclipse.core.resources.IProject;
import org.junit.Test;
import org.uml2abap.adt.commons.UmapSessionFactory;

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
		try {
			// @ TODO Dummy Werte ändern
//			IProject[] mockSystems = factory.getAbapProjects();
//			assertArrayEquals(mockSystems, systems);
			
		} catch (Exception e) {
			fail("Exception, but there are AbapProjects available");
		}
	}

}
