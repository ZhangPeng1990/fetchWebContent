package core.webContent.business;

import java.util.Date;

public class FetchedContent {

	private Long id;

    private String webUrl;

    private String webTitle;

    private Date fecthedTime;

    private Date updateTime;

    private String webContent;

    private DataSource dataSource;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getWebTitle() {
		return webTitle;
	}

	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}

	public Date getFecthedTime() {
		return fecthedTime;
	}

	public void setFecthedTime(Date fecthedTime) {
		this.fecthedTime = fecthedTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getWebContent() {
		return webContent;
	}

	public void setWebContent(String webContent) {
		this.webContent = webContent;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
