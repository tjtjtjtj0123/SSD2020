package dongduk.cs.ssd.summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dongduk.cs.ssd.summerpetstore.model.ItemModel;
import dongduk.cs.ssd.summerpetstore.service.SProductService;

@Controller
public class ShowCategoryViewController {
	@Autowired
	private SProductService sproductitemservice;
	
	public void setSProductService(SProductService sproductitemservice) {
		this.sproductitemservice = sproductitemservice;
	}
	
	@RequestMapping("/category")	
	public String showCateView(@RequestParam("productId") int productId, @RequestParam("categoryId") int categoryId) {
		sproductitemservice.viewItem(productId, categoryId);
		return "spetitem/categoryView";
	}//ī�װ�������������
}