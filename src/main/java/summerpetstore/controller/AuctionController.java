package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.model.AuctionModel;
import summerpetstore.service.AuctionService;

@Controller
public class AuctionController {
	private AuctionService auctionservice;
	
	@Autowired
	public void setAuctionService(AuctionService auctionservice) {
		this.auctionservice = auctionservice;
	}
	
	@RequestMapping("/auction/aregister") 
	public String registerAuction(@RequestParam("userId") String userId, @ModelAttribute("Auction")AuctionModel am) {	
		auctionservice.registerAuction(am);
		return "auction/aRegister"; 	
	}//��ŵ��
	
	@RequestMapping("/auction/search") 
	public String select(@RequestParam("name") String name, @RequestParam("itemKind") String itemKind, @ModelAttribute("Auction")AuctionModel am) {	
		//auctionservice.searchAuction(am);
		//auctionservice.filterCategory();
		auctionservice.searchAuctionByDday(am); //��¥ �˹��Ѽ�
		auctionservice.searchAuctionByCon(am); //�α��
		//auctionservice.filterProgress();
		//auctionservice.filterCategory();
		//auctionservice.filterProduct();
		//�����ּ�ó���� �޼ҵ���� searchAuction�ӽñⰡ �Ѳ����� �˻����༭ �ּ�ó���� ������� ���ٰ� �����ϴ��� �𸣰ڴ�...
		return "auction/aSearch"; 	
	}//��Ű˻�
	
	@RequestMapping("/auction/aupdate") 
	public String updateAuction(@RequestParam("auctionId") int auctionId, @RequestParam("userId") String userId, @ModelAttribute("Auction")AuctionModel am) {	
		if(auctionservice.is_sBid_exist())
			auctionservice.updateAuction(am);
		
		return "auction/aRegister"; 	
	}//��ż���
}
