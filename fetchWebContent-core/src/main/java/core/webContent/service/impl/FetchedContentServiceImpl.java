package core.webContent.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;
import core.webContent.mapper.FetchedContentDOMapper;
import core.webContent.model.FetchedContentDO;
import core.webContent.service.FetchedContentService;

@Service("fetchedContentService")
public class FetchedContentServiceImpl implements FetchedContentService {

	@Autowired(required=true)
	private FetchedContentDOMapper fetchedContentMapper;
	
	@Override
	public FetchedContent addFetchedContent(FetchedContent fetchedContent) {
		fetchedContent.setUpdateTime(new Date());
		fetchedContent.setFecthedTime(new Date());
		FetchedContentDO fetchedContentDO = BeanCopier.toFetchedContentDO(fetchedContent);
		this.fetchedContentMapper.insert(fetchedContentDO);
		fetchedContent.setId(fetchedContentDO.getId());
		return fetchedContent;
	}

	@Override
	public FetchedContent fetch(DataSource dataSource) {
		//DOTO
		return null;
	}

}
