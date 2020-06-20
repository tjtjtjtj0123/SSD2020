//package summerpetstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import summerpetstore.service.AuctionService;
//
//@Controller
//public class AuctionController {
//	private AuctionService auctionservice;
//	
//	@Autowired
//	public void setAuctionService(AuctionService auctionservice) {
//		this.auctionservice = auctionservice;
//	}
//	
//	@RequestMapping("/auction/aregister") 
//	public String registerAuction(@RequestParam("userId") String userId) {	
//		auctionservice.registerAuction(userId);
//		return "auction/aRegister"; 	
//	}//��ŵ��
//	
//	@RequestMapping("/auction/search") 
//	public String select(@RequestParam("name") String name, @RequestParam("itemKind") String itemKind) {	
//		auctionservice.searchName(name);
//		auctionservice.filterCategory();
//		auctionservice.filterDate();
//		auctionservice.filterPopular();
//		auctionservice.filterProgress();
//		auctionservice.filterCategory();
//		auctionservice.filterProduct();	//filter������ �����ΰ���??
//		return "auction/aSearch"; 	
//	}//��Ű˻�
//	
//	@RequestMapping("/auction/aupdate") 
//	public String updateAuction(@RequestParam("auctionId") int auctionId, @RequestParam("userId") String userId) {	
//		if(auctionservice.is_sBid_exist())
//			auctionservice.searchAuction();	//��ż����̴ϱ� �̸� �ٲٴ°� �����������?
//		
//		return "auction/aRegister"; 	
//	}//��ż���
//}
