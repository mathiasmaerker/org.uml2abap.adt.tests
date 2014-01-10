package org.uml2abap.adt.views.commands;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IContributionItem;
import org.junit.Test;
import org.uml2abap.adt.commons.UmapSessionFactory;

public class DynamicContributionItemTest extends DynamicContributionItem{
	
	
	public DynamicContributionItemTest() {
		super();

	}
	@Test
	public void instanceTest() {
		DynamicContributionItem item = new DynamicContributionItem();
		assertNotNull(item);
	}
	@Test
	public void getContributionItem() {
		DynamicContributionItem item = new DynamicContributionItem();
		IContributionItem[] items = item.getContributionItems();
		try {
//			IProject[] projects = UmapSessionFactory.getInstance().getAbapProjects();
			for (int i = 0; i < items.length; i++) {
//				assertTrue(projects[i].equals(items[i].g));
			}
		} catch (Exception e) {
			fail("Exception thrown");
		}

	}

}
