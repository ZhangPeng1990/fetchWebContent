package core.webContent.business;

import java.util.Date;

import core.webContent.enums.IsFetched;

public class DataSource {

	private Long id;

	private String dsTitle;

    private String dsUrl;

    private String localAddress;
    private Integer addressId;//地址id
    private Integer fatherAddressId;
    private Integer addressLevel;//地址级别，比如省为1，市为2
    
    private Date insertTime;

    private Date updateTime;

    private IsFetched isFetched;
    
    private Date fecthedTime;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDsTitle() {
		return dsTitle;
	}

	public void setDsTitle(String dsTitle) {
		this.dsTitle = dsTitle;
	}

	public String getDsUrl() {
		return dsUrl;
	}

	public void setDsUrl(String dsUrl) {
		this.dsUrl = dsUrl;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public IsFetched getIsFetched() {
		return isFetched;
	}

	public void setIsFetched(IsFetched isFetched) {
		this.isFetched = isFetched;
	}

	public Date getFecthedTime() {
		return fecthedTime;
	}

	public void setFecthedTime(Date fecthedTime) {
		this.fecthedTime = fecthedTime;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getFatherAddressId() {
		return fatherAddressId;
	}

	public void setFatherAddressId(Integer fatherAddressId) {
		this.fatherAddressId = fatherAddressId;
	}

	public Integer getAddressLevel() {
		return addressLevel;
	}

	public void setAddressLevel(Integer addressLevel) {
		this.addressLevel = addressLevel;
	}
}
