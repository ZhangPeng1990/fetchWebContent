package core.webContent.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.webContent.business.DataSource;
import core.webContent.mapper.DataSourceDOMapper;
import core.webContent.model.DataSourceDO;
import core.webContent.service.DataSourceService;

@Service("dataSourceService")
public class DataSourceServiceImpl implements DataSourceService {

	@Autowired
	private DataSourceDOMapper dataSourceDOMapper;
	
	public DataSource addDataSource(DataSource dataSource){
		dataSource.setInsertTime(new Date());
		dataSource.setUpdateTime(new Date());
		DataSourceDO dataSourceDO = BeanCopier.toDataSourceDO(dataSource);
		this.dataSourceDOMapper.insert(dataSourceDO);
		dataSource.setId(dataSourceDO.getId());
		return dataSource;
	}
	
	public DataSource updateDataSource(DataSource dataSource){
		dataSource.setUpdateTime(new Date());
		DataSourceDO dataSourceDO = BeanCopier.toDataSourceDO(dataSource);
		this.dataSourceDOMapper.updateByPrimaryKey(dataSourceDO);
		return dataSource;
	}
	
	public List<DataSource> getAll(){
		return null;
	}
}
