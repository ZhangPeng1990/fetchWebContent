package core.webContent.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

import junit.base.BaseTest;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import core.system.enums.SysConfigKey;
import core.system.service.SysConfigService;
import core.utils.GlobalUtils;
import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;

public class FetchTest extends BaseTest{
	
	private final static String CRLF = System.getProperty("line.separator");
	
	@Autowired
	private SysConfigService sysConfigService;
	
	@Autowired
	private FetchedContentService fetchedContentService;

	public String FetchAndWrite(DataSource dataSource){
			BufferedWriter out = null;
			BufferedReader in = null;
			String newdbFilename = null;
			try {
				URL url = new URL(dataSource.getDsUrl());
				InputStream instr = url.openStream();
				String s, str;
				in = new BufferedReader(new InputStreamReader(instr));
				StringBuffer sb = new StringBuffer();
				
				String newFilename = UUID.randomUUID().toString().replace("-", "") + ".html";
				String datedir = GlobalUtils.dateDir(new Date());
				String newfilePath = sysConfigService.getSysConfig(SysConfigKey.Static_Html_Save_Path).getConfigValue() + datedir;
				if (!new File(newfilePath).exists())
				{
					new File(newfilePath).mkdirs();
				}
				String newFullFilepath = newfilePath + newFilename;
				newdbFilename = datedir + newFilename;
				
				out = new BufferedWriter(new FileWriter(newFullFilepath));
				while ((s = in.readLine()) != null) {
					sb.append(s + CRLF);
				}
				System.out.println(sb);
				str = new String(sb);
				out.write(str);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(out != null){
						out.close();
					}
					
					if(in != null){
						in.close();
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			return newdbFilename;
	}
	
	public static FetchedContent fetchByDataSource(DataSource dataSource){
		String webUrl = dataSource.getDsUrl();
		FetchedContent fetchedContent = null;
		try {
			Parser parser = new Parser(webUrl);
			// 得到名称为div的标签
			NodeFilter filter = new TagNameFilter("title");
			//得到nodes
			NodeList nodes = parser.extractAllNodesThatMatch(filter);
			//对parser进行重置，以便于下次的filter操作
			parser.reset();
			
			if(nodes != null && nodes.size() == 1){
				System.out.println(nodes.toHtml());
				System.out.println(nodes.toString());
				Node node = nodes.elementAt(0);
				System.out.println(node.getText());
			}
		} catch (ParserException e) {
			e.printStackTrace();
		}
		return fetchedContent;
	}
	
	@Test
	public void start() {
		DataSource dataSource = new DataSource();
		dataSource.setDsUrl("http://www.landchina.com/");
		
		FetchedContent fetchedContent = fetchByDataSource(dataSource);
		
		String dbSavePath = this.FetchAndWrite(dataSource);
		fetchedContent.setHtmlFile(dbSavePath);
		
//		fetchedContentService.addFetchedContent(fetchedContent);
	}
}
