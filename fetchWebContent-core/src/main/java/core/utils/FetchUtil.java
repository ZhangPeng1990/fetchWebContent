package core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class FetchUtil {

	private final static String CRLF = System.getProperty("line.separator");
	
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
	
	public static void main(String[] args) {
		FetchAndWrite("http://www.blogjava.net/terryxue/archive/2009/12/17/306329.html");
	}
}
