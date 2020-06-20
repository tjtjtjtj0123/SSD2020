package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.service.AuctionService;

@Controller
public class MoveToSucController {
	
	private AuctionService auctionservice;
	
	@Autowired
	public void setAuctionService(AuctionService auctionservice) {
		this.auctionservice = auctionservice;
	}
	
	@RequestMapping("/auction/apsuc") 
	public String sucBid(@RequestParam("userId") String userId) {	
		auctionservice.getBid();	//���� �����ΰ���?
		auctionservice.setBid();	
		auctionservice.printPriceRank();
		
		return "auction/aPriceRegisterSuc"; 	
	}//�����������
	
	@RequestMapping("/auction/asuc") 
	public String succseRegister(@RequestParam("auctionId") int auctionId) {	
		auctionservice.updateAuction();
		
		return "auction/aRegisterSuc"; 	
	}//��ŵ�ϼ���
	
	@RequestMapping("/myPage") 
	public String successUpdate(@RequestParam("auctionId") int auctionId) {	
		auctionservice.popUpdateSuc();	//���� �����ΰ���?	
		
		return "auction/myPage"; 	
	}//��ż�������
	
	@RequestMapping("/auction/ausuc") 
	public String successUpdateBid(@RequestParam("auctionId") int auctionId) {	
		auctionservice.getBid();	//���� �����ΰ���?
		auctionservice.setBid();	
		auctionservice.printPriceRank();
		
		return "auction/aPriceRegisterSuc"; 	
	}//���������������
}
