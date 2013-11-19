package core.webContent.service.impl;

import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;
import core.webContent.enums.IsFetched;
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
		fetchedContent.setHtmlFile(fetchedContentDO.getHtmlFile());
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
		fetchedContentDO.setHtmlFile(fetchedContent.getHtmlFile());
		return fetchedContentDO;
	}
	
	public static DataSource toDataSource(DataSourceDO dataSourceDO){
		DataSource dataSource = new DataSource();
		dataSource.setDsTitle(dataSourceDO.getDsTitle());
		dataSource.setDsUrl(dataSourceDO.getDsUrl());
		dataSource.setId(dataSourceDO.getId());
		dataSource.setInsertTime(dataSourceDO.getInsertTime());
		dataSource.setUpdateTime(dataSourceDO.getUpdateTime());
		dataSource.setIsFetched(dataSourceDO.getIsFetched() != null ? IsFetched.valueOf(dataSourceDO.getIsFetched()) : null);
		dataSource.setFecthedTime(dataSourceDO.getFecthedTime());
		dataSource.setAddressId(dataSourceDO.getAddressId());
		dataSource.setAddressLevel(dataSourceDO.getAddressLevel());
		dataSource.setFatherAddressId(dataSourceDO.getFatherAddressId());
		dataSource.setLocalAddress(dataSourceDO.getLocalAddress());
		return dataSource;
	}
	
	public static DataSourceDO toDataSourceDO(DataSource dataSource){
		DataSourceDO dataSourceDO = new DataSourceDO();
		dataSourceDO.setDsTitle(dataSource.getDsTitle());
		dataSourceDO.setDsUrl(dataSource.getDsUrl());
		dataSourceDO.setId(dataSource.getId());
		dataSourceDO.setInsertTime(dataSource.getInsertTime());
		dataSourceDO.setUpdateTime(dataSource.getUpdateTime());
		dataSourceDO.setIsFetched(dataSource.getIsFetched() != null ? dataSource.getIsFetched().toString() : null);
		dataSourceDO.setFecthedTime(dataSource.getFecthedTime());
		dataSourceDO.setAddressId(dataSource.getAddressId());
		dataSourceDO.setAddressLevel(dataSource.getAddressLevel());
		dataSourceDO.setFatherAddressId(dataSource.getFatherAddressId());
		dataSourceDO.setLocalAddress(dataSource.getLocalAddress());
		return dataSourceDO;
	}
}
