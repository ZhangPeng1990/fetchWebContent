package core.webContent.service.impl;

import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;
import core.webContent.model.DataSourceDO;
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
		fetchedContentDO.setDsId(fetchedContent.getDataSource() != null ? fetchedContent.getDataSource().getId() : null);
		return fetchedContentDO;
	}
	
	public static DataSource toDataSource(DataSourceDO dataSourceDO){
		DataSource dataSource = new DataSource();
		dataSource.setDsTitle(dataSourceDO.getDsTitle());
		dataSource.setDsUrl(dataSourceDO.getDsUrl());
		dataSource.setId(dataSourceDO.getId());
		dataSource.setInsertTime(dataSourceDO.getInsertTime());
		dataSource.setUpdateTime(dataSourceDO.getUpdateTime());
		return dataSource;
	}
	
	public static DataSourceDO toDataSourceDO(DataSource dataSource){
		DataSourceDO dataSourceDO = new DataSourceDO();
		dataSourceDO.setDsTitle(dataSource.getDsTitle());
		dataSourceDO.setDsUrl(dataSource.getDsUrl());
		dataSourceDO.setId(dataSource.getId());
		dataSourceDO.setInsertTime(dataSource.getInsertTime());
		dataSourceDO.setUpdateTime(dataSource.getUpdateTime());
		return dataSourceDO;
	}
}
