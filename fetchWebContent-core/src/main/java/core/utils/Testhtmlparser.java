package core.utils;

//import org.htmlparser.NodeFilter;
//import org.htmlparser.Parser;
//import org.htmlparser.filters.TagNameFilter;
//import org.htmlparser.tags.LinkTag;
//import org.htmlparser.util.NodeList;
//import org.htmlparser.util.ParserException;
//import org.htmlparser.visitors.HtmlPage;

/**
 * htmlparser取得一段html代码里面所有的链接地址和链接名称
 * 
 * @author chenguoyong
 * 
 */
public class Testhtmlparser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String htmlcode = "<HTML><HEAD><TITLE>AAA</TITLE></HEAD><BODY>"
//				+ "<a href='http://topic.csdn.net/u/20080522/14/0ff402ef-c382-499a-8213-ba6b2f550425.html'>连接1</a>"
//				+ "<a href='http://topic.csdn.net'>连接2</a></BODY></HTML>";
//		// 创建Parser对象根据传给字符串和指定的编码
//		Parser parser = Parser.createParser(htmlcode, "GBK");
//		// 创建HtmlPage对象HtmlPage(Parser parser)
//		HtmlPage page = new HtmlPage(parser);
//		try {
//			// HtmlPage extends visitor,Apply the given visitor to the current
//			// page.
//			parser.visitAllNodesWith(page);
//		} catch (ParserException e1) {
//			e1 = null;
//		}
//		// 所有的节点
//		NodeList nodelist = page.getBody();
//		// 建立一个节点filter用于过滤节点
//		NodeFilter filter = new TagNameFilter("A");
//		// 得到所有过滤后，想要的节点
//		nodelist = nodelist.extractAllNodesThatMatch(filter, true);
//		for (int i = 0; i < nodelist.size(); i++) {
//			LinkTag link = (LinkTag) nodelist.elementAt(i);
//			// 链接地址
//			System.out.println(link.getAttribute("href") + "\n");
//			// 链接名称
//			System.out.println(link.getStringText());
//		}

	}

}