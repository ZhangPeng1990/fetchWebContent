package core.webContent.service;

import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;

public interface FetchedContentService {
	
	public FetchedContent addFetchedContent(FetchedContent fetchedContent);
	
	public FetchedContent fetch(DataSource dataSource);
}
