package dongduk.cs.ssd.summerpetstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dongduk.cs.ssd.summerpetstore.model.AuctionModel;
import dongduk.cs.ssd.summerpetstore.model.ItemModel;
import dongduk.cs.ssd.summerpetstore.service.AuctionService;

@Controller
public class AuctionController {
	private AuctionService auctionservice;
	//�ּ� �ް� Ǫ�� 
	@Autowired
	public void setAuctionService(AuctionService auctionservice) {
		this.auctionservice = auctionservice;
	}
	
	@RequestMapping("/auction/aregister") 
	public String registerAuction(@RequestParam("userId") String userId, @ModelAttribute("Auction")AuctionModel am) {	
		auctionservice.registerAuction(am);
		return "auction/aRegister"; 	
	}//��ŵ��
	
	
    @RequestMapping(value="/spetstore/auction/aSearch/aSearch.do") 
    public ModelAndView submit(HttpServletRequest request, 
          @RequestParam("cname") String name, 
          @RequestParam("itemKind") String itemKind, 
          @RequestParam("keyword") String keyword) throws Exception{
        System.out.println("#####################Controller");
        List<AuctionModel> aList = auctionservice.searchAuction(name, itemKind, keyword); 
        return new ModelAndView("/auction/aSearch", "aList", aList);
    }//��� �˻�
	
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
