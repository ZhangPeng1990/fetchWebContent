package fetchWebContent.admin.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import core.webContent.business.FetchedContent;
import core.webContent.service.FetchedContentService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private FetchedContentService fetchedContentService;
	
	@RequestMapping("index")
	public String index(HttpServletRequest request){
		FetchedContent fc = new FetchedContent();
		fc.setWebContent("cadsca");
		fc.setWebTitle("title");
		fc = fetchedContentService.addFetchedContent(fc);
		System.out.println(fc.getId());
		return "";
	}
}
