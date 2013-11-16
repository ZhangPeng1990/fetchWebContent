package core.system.service;

import junit.base.BaseTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import core.system.business.SysConfig;
import core.system.enums.SysConfigKey;

public class SysConfigServiceImplTest extends BaseTest {

	@Autowired
	private SysConfigService service;
	
	@Test
	public void testGetSysConfig() {
		SysConfig sys = this.service.getSysConfig(SysConfigKey.Static_Html_Save_Path);
		System.out.println(sys.getConfigValue());
	}

}
