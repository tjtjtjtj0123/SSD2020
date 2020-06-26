package dongduk.cs.ssd.summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dongduk.cs.ssd.summerpetstore.service.GpService;

@Controller
public class ForwardController {
/*	@Autowired
	ForwardService forwardService;
	
	public void setForwardService(ForwardService forwardService) {
		this.forwardService = forwardService;
	}
	
	@RequestMapping("/mypage")
	public String showMyPage(@RequestParam("userId") String userId) {
		if(forwardService.is_admin())
			return "user/summerPage"; 
		else
			return"user/myPage"; 
	}//������������ �̵�
*/	
	@RequestMapping("/market") 
	public String moveMarketSearch() {
		return"market/mSearch"; 
	}//���Ͱ˻����� �̵�
	
	@RequestMapping("/market/register") 
	public String moveMarketRegister(@RequestParam("userId") String userId) {
			return"market/iRegister"; 
	}//���͹�ǰ���â���� �̵�
	
	@RequestMapping(value = "/auction",  method = RequestMethod.GET) 
	public String moveAuctionSearch(@RequestParam("userId") String userId) {
		System.out.println("���â�� ���Դ�!!!");
			return"auction/aSearch"; 
	}//��Ű˻�â���� �̵�

	@RequestMapping("/gp") 
	public String moveGPSearch() {
			return""; 
	}//�������� �˻�â�����̵�
}
