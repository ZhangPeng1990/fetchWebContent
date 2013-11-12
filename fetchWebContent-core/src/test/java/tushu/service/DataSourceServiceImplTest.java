package tushu.service;

import static org.junit.Assert.fail;
import junit.base.BaseTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import core.webContent.business.DataSource;
import core.webContent.service.DataSourceService;

public class DataSourceServiceImplTest extends BaseTest {
	
	@Autowired
	private DataSourceService dataSourceService;

	@Test
	public void testAddDataSource() {
 		DataSource d = new DataSource();
		dataSourceService.addDataSource(d);
	}

	@Test
	public void testUpdateDataSource() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

}
