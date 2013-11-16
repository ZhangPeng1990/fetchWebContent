package core.system.service;

import core.system.business.SysConfig;
import core.system.enums.SysConfigKey;

public interface SysConfigService {

	public SysConfig getSysConfig(SysConfigKey key);
}
