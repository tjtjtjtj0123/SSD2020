package summerpetstore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.model.ItemModel;
import summerpetstore.service.CartService;
import summerpetstore.service.MarketService;

@Controller
public class MarketController {
	
	@Autowired
	private MarketService marketService;	
	
	public void setMarketService(MarketService marketService) {
		this.marketService = marketService;
	}
	
	@RequestMapping("/market/register") 
	public String registerMarket(@ModelAttribute("itemmodel")ItemModel itemmodel) {
		marketService.registerItem(itemmodel);
		return "market/mSearach"; 
	}
	
	@RequestMapping("/market/delete") 
	public String deleteMarket(@RequestParam("marketId") int marketId) {
		marketService.deleteItem(marketId);
		return "market/mSearach"; 
		
	}//�뜝�룞�삕�뜝�떢諭꾩삕�뭹�뜝�룞�삕�뜝�룞�삕
	
	@RequestMapping("/market/mitemView") 
	public String updateMarket(@RequestParam("userId") String userId) {
		marketService.updateItem(userId);
		return "market/mListDetail"; 
		
	}//�뜝�룞�삕�뜝�떢諭꾩삕�뭹�뜝�룞�삕�뜝�룞�삕
	
	@RequestMapping("/market/search") 
	public String select(@RequestParam("name") String name, @RequestParam("itemKind")String itemKind) {
		marketService.searchItem(name, itemKind);
		return "market/mListDetail"; 
		
	}//장터검색
}