package core.webContent.service;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.InputStream;

import junit.base.BaseTest;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import core.webContent.business.DataSource;
import core.webContent.service.DataSourceService;

public class DataSourceServiceImplTest extends BaseTest {
	
	@Autowired
	private DataSourceService dataSourceService;

	@Test
	public void testAddDataSource() {
		Workbook rwb = null;
        try
        {
            InputStream is=new FileInputStream("F:/1.xls");
            //声名一个工作薄
             rwb= Workbook.getWorkbook(is);
            //获得工作薄的个数
            rwb.getNumberOfSheets();
            //在Excel文档中，第一张工作表的缺省索引是0
            Sheet st = rwb.getSheet("Sheet1");
            int rows=st.getRows();
            int cols=st.getColumns();
            System.out.println("当前工作表的名字:"+st.getName());
            System.out.println("总行数:"+rows);
            System.out.println("总列数:"+cols);
          
          for(int i=1;i<rows;i++){
        	  DataSource d = new DataSource();
      			
        	 for(int a = 0; a < 5; a++){
        		 Cell c1=st.getCell(a,i);
        		 String content = c1.getContents().trim();
        		 if(a == 0){
        			 d.setLocalAddress(content);
        		 }else if(a == 1){
        			 d.setAddressId(content.equals("") ? null : Integer.parseInt(content));
        		 }else if(a == 2){
        			 d.setFatherAddressId(content.equals("") ? null : Integer.parseInt(content));
        		 }else if(a ==3){
        			 d.setAddressLevel(content.equals("") ? null : Integer.parseInt(content));
        		 }else{
        			 d.setDsUrl(content);
        		 }
        	 }
        	 dataSourceService.addDataSource(d);
          }
        }
        catch(Exception e)
        {
            e.printStackTrace();
             System.out.println("出错了");
        }finally{
          rwb.close();
        }
	}

	@Test
	public void testUpdateDataSource() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

}
