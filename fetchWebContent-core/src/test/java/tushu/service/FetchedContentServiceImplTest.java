package tushu.service;

import junit.base.BaseTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import core.webContent.business.FetchedContent;
import core.webContent.service.FetchedContentService;

public class FetchedContentServiceImplTest extends BaseTest {
	
	@Autowired
	private FetchedContentService fecthedContentService;

	@Test
	public void testAddFetchedContent() {
		FetchedContent fc = new FetchedContent();
		fc.setWebContent("cadsca");
		fc.setWebTitle("title");
		fc = fecthedContentService.addFetchedContent(fc);
		System.out.println(fc.getId());
	}

}
