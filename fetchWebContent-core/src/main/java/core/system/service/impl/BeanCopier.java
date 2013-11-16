package core.system.service.impl;

import core.system.business.SysConfig;
import core.system.enums.SysConfigKey;
import core.system.model.SysConfigDO;


public class BeanCopier {

	public static SysConfig toSysConfig(SysConfigDO sysConfigDO){
		SysConfig sysConfig = new SysConfig();
		sysConfig.setId(sysConfigDO.getId());
		sysConfig.setConfigValue(sysConfigDO.getConfigValue());
		sysConfig.setConfigKey(sysConfigDO.getConfigKey() != null ? 
								SysConfigKey.valueOf(sysConfigDO.getConfigKey()) : null);
		return sysConfig;
	}
	
	public static SysConfigDO toSysConfigDO(SysConfig sysConfig){
		SysConfigDO sysCofigDO = new SysConfigDO();
		sysCofigDO.setId(sysConfig.getId());
		sysCofigDO.setConfigValue(sysConfig.getConfigValue());
		sysCofigDO.setConfigKey(sysConfig.getConfigKey() != null ? sysConfig.getConfigKey().toString() : null);
		return sysCofigDO;
	}
}
