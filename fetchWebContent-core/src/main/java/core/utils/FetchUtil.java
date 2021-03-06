package core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import core.webContent.business.DataSource;
import core.webContent.business.FetchedContent;

public class FetchUtil {

	private final static String CRLF = System.getProperty("line.separator");//文件换行符
	private final static String CFS = System.getProperty("path.separator");//路径分隔符
	
	public static String writeToLocal(String content,String savePath){
		
		File file = new File(savePath);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter(new FileWriter(file));
			out.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	/**
	 * 通过一个url地址抓取一个网页，不做任何处理，只是把一个静态页面写入本地硬盘
	 * @param url
	 */
	public static void FetchAndWrite(String webUrl){
		BufferedWriter out = null;
		BufferedReader in = null;
		try {
			URL url = new URL(webUrl);
			InputStream instr = url.openStream();
			String s, str;
			in = new BufferedReader(new InputStreamReader(instr));
			StringBuffer sb = new StringBuffer();
			out = new BufferedWriter(new FileWriter("D:/outPut.html"));
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
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
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
	
	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		dataSource.setDsUrl("http://www.landchina.com/");
		fetchByDataSource(dataSource);
	}
}
