package dongduk.cs.ssd.summerpetstore.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dongduk.cs.ssd.summerpetstore.service.AuctionService;
import dongduk.cs.ssd.summerpetstore.service.MarketService;
import dongduk.cs.ssd.summerpetstore.service.SProductService;
import dongduk.cs.ssd.summerpetstore.service.SproductService;

@Controller
public class ShowMyDetailController {
	@Autowired
	private AuctionService auctionservice;
	@Autowired
	private MarketService marketservice;
	@Autowired
	private SproductService sproductservice;
	
	
	public void setAuctionService(AuctionService auctionservice) {
		this.auctionservice = auctionservice;
	}
	public void setMarketService(MarketService marketservice) {
		this.marketservice = marketservice;
	}
	public void setSproductService(SproductService sproductservice) {
		this.sproductservice = sproductservice;
	}
	
	@RequestMapping("/gspetitem/detail") 
	public String showMyGp(@RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {
		sproductservice.showInfo(itemId);
		return "gspetitem/gListDetail"; 
	}//������ �������� ����
	
//	@RequestMapping("/auction/detail") 
//	public String showMyAuction(@RequestParam("auctionListId") int auctionListId, @RequestParam("userId") String userId) {
//		auctionservice.showInfo(auctionListId, userId);
//		return "auction/aListDetail"; 
//	}//������ ��� ����
	
	@RequestMapping("/market/detail/{itemId}") 
		public String showMyMarket(@PathVariable("itemId") int itemId, @RequestParam("userId") String userId) {
		marketservice.showInfo(itemId, userId);
		return "market/gListDetail"; 
	}//������ ���� ����(����)
	
}
