package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.model.AuctionJPModel;
import summerpetstore.model.AuctionModel;
import summerpetstore.model.CartModel;
import summerpetstore.model.ItemModel;
import summerpetstore.service.AuctionService;
import summerpetstore.service.CartService;

@Controller
public class BidController {
	private AuctionService auctionservice;
	
	@Autowired
	public void setAuctionService(AuctionService auctionservice) {
		this.auctionservice = auctionservice;
	}
	
	@RequestMapping("/auction/priceregister") 
	public String bid(@RequestParam("myPrice") int myPrice, @RequestParam("userId") String userId,
			@RequestParam("auctionId") int auctionId, @ModelAttribute("AuctionJP")AuctionJPModel jpm, @ModelAttribute("Auction")AuctionModel am) {	
		auctionservice.showJPList(auctionId);
		auctionservice.isNewPrice(myPrice, auctionId); //�ְ� �̸� true�� ��ȯ�ϰ� �� �ְ��� �ƴϸ� ����� ���ϰ� �ؾ���
		auctionservice.bid(jpm, am); 
		//�̷��� �� �ΰ����ʿ��ؼ� �� �ΰ��� �Ķ���Ϳ� �߰��ϰ� �־����!
		//�׷��� ��� jp���ִ� �Ķ���͸�ζ� jp�� �Ѵ� �Ķ���ͷ� ���۵Ǳ⶧���� �����ϳ��� ���ֵ� �ɰͰ���
		//���� ������ �Ķ���� ������ ������ ������ �ݹ��ϴϱ� ������ ���Ѱɷ���
		//�ؿ� ������Ʈ bid�� ����������
		return "auction/aPriceRegister"; 	
	}//����
	
	@RequestMapping("/auction/priceupdate") 
	public String updateBid(@RequestParam("myPrice") int myPrice, @RequestParam("userId") String userId, 
			@RequestParam("auctionId") int auctionId, @ModelAttribute("AuctionJP")AuctionJPModel jpm) {	
		auctionservice.showJPList(auctionId);
		auctionservice.isNewPrice(myPrice, auctionId); //�ְ� �̸� true�� ��ȯ�ϰ� �� �ְ��� �����Ѱ� �ƴϸ� ����� ���ϰ� �ؾ���
		auctionservice.updateBid(jpm);	
		return "auction/aPriceRegister"; 
		
	}//��������
	
	
}
