package core.system.model;

public class SysConfigDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.id
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.config_key
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    private String configKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.config_value
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    private String configValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.id
     *
     * @return the value of sys_config.id
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.id
     *
     * @param id the value for sys_config.id
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.config_key
     *
     * @return the value of sys_config.config_key
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.config_key
     *
     * @param configKey the value for sys_config.config_key
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.config_value
     *
     * @return the value of sys_config.config_value
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.config_value
     *
     * @param configValue the value for sys_config.config_value
     *
     * @mbggenerated Sat Nov 16 22:02:23 CST 2013
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }
}