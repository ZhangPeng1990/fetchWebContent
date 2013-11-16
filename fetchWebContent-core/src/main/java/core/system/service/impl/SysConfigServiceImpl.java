package core.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.system.business.SysConfig;
import core.system.enums.SysConfigKey;
import core.system.mapper.SysConfigDOMapper;
import core.system.model.SysConfigDO;
import core.system.service.SysConfigService;

@Service("sysConfigService")
public class SysConfigServiceImpl implements SysConfigService {

	@Autowired
	private SysConfigDOMapper sysConfigDOMapper;
	
	@Override
	public SysConfig getSysConfig(SysConfigKey key) {
		SysConfig sysConfig = null;
		SysConfigDO sysConfigDO = this.sysConfigDOMapper.selectByConfigKey(key.toString());
		sysConfig = (sysConfigDO != null ? sysConfig = BeanCopier.toSysConfig(sysConfigDO) : null);
		return sysConfig;
	}

}
