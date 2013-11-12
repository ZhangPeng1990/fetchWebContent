package core.webContent.service;

import java.util.List;

import core.webContent.business.DataSource;

public interface DataSourceService {
	
	public DataSource addDataSource(DataSource dataSource);
	
	public DataSource updateDataSource(DataSource dataSource);
	
	public List<DataSource> getAll();
}
