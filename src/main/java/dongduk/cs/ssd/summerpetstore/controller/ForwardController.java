package dongduk.cs.ssd.summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dongduk.cs.ssd.summerpetstore.model.UserModel;
import dongduk.cs.ssd.summerpetstore.service.GpService;

@Controller
public class ForwardController {
/*	@Autowired
	ForwardService forwardService;
	
	public void setForwardService(ForwardService forwardService) {
		this.forwardService = forwardService;
	}
	*/
	@RequestMapping("/spetstore/user/myPage.do")
	public String showMyPage() {
		//if(forwardService.is_admin())
			//return "user/summerPage"; 
		//else
			return"user/myPage"; 
	}//������������ �̵�
	
	@RequestMapping("/spetstore/user/signonForm.do")
	public String showLogin() {
		
			return"user/SignonForm"; 
	}//�α��� �̵�
	
	@RequestMapping("/spetstore/user/newAccount.do")
	public String showRegister(Model model) {
		  model.addAttribute("user", new UserModel());

			return"user/register"; 
	}//ȸ������ �̵�
/*
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
	*/	
}
