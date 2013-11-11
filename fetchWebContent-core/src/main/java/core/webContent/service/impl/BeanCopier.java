package core.webContent.service.impl;

import core.webContent.business.FetchedContent;
import core.webContent.model.FetchedContentDO;

public class BeanCopier {

	public static FetchedContent toFetchedContent(FetchedContentDO fetchedContentDO){
		FetchedContent fetchedContent = new FetchedContent();
		fetchedContent.setFecthedTime(fetchedContentDO.getFecthedTime());
		fetchedContent.setId(fetchedContentDO.getId());
		fetchedContent.setUpdateTime(fetchedContentDO.getUpdateTime());
		fetchedContent.setWebContent(fetchedContentDO.getWebContent());
		fetchedContent.setWebTitle(fetchedContentDO.getWebTitle());
		fetchedContent.setWebUrl(fetchedContentDO.getWebUrl());
		return fetchedContent;
	}
	
	public static FetchedContentDO toFetchedContentDO(FetchedContent fetchedContent){
		FetchedContentDO fetchedContentDO = new FetchedContentDO();
		fetchedContentDO.setFecthedTime(fetchedContent.getFecthedTime());
		fetchedContentDO.setId(fetchedContent.getId());
		fetchedContentDO.setUpdateTime(fetchedContent.getUpdateTime());
		fetchedContentDO.setWebContent(fetchedContent.getWebContent());
		fetchedContentDO.setWebTitle(fetchedContent.getWebTitle());
		fetchedContentDO.setWebUrl(fetchedContent.getWebUrl());
		return fetchedContentDO;
	}
}
