package org.uml2abap.adt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.uml2abap.adt.wrapper.IUmapObject;
import org.uml2abap.adt.wrapper.UmapObject;

public class UmapParserFactoryTest {

	public UmapParserFactoryTest() {
		super();
	}
	@Test
	public void instanceTest(){
		UmapParserFactory factory = UmapParserFactory.getInstance();
		UmapParserFactory factory2 = UmapParserFactory.getInstance();
		assertEquals(factory, factory2);
	}
	@Test
	public void parseFile (){
		UmapParserFactory factory = UmapParserFactory.getInstance();
		String URI = 		"C:/Users/maerkerma/git/git/org.uml2abap.adt/org.uml2abap.adt/DemoJam 2013.umap";
		try {
			factory.parseFile(URI);
		} catch (IOException e) {
			fail("Exception Occured");
			e.printStackTrace();
		}
	}
	@Test
	public void parseFileFail (){
		UmapParserFactory factory = UmapParserFactory.getInstance();
		String URI = "";	
//				"C:/Users/maerkerma/eclipseJ2EE/luna/luna ws/com.tts.umap.adt/DemoJam 2013.umap";
		try {
			factory.parseFile(URI);
			fail("No Exception Occured");
		} catch (IOException e) {
			
		}
	}	
	@Test
	public void testObjects(){
		UmapParserFactory factory = UmapParserFactory.getInstance();
		this.parseFile();
		ArrayList<IUmapObject> list =  new ArrayList<IUmapObject>();
		list = factory.getObjects();
		assertNotNull("Objects are empty", list);
		for (IUmapObject iUmapObject : list) {
			UmapObject object = (UmapObject) iUmapObject;
			assertTrue("Name contains audience", object.getClassMetaData().getClassName().contains("audience"));
		}
		
	}
	
}
