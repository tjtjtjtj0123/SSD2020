package dongduk.cs.ssd.summerpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoveToMRegisterController {
	@RequestMapping("/market/update") 
	public String moveToMarketUpdate(@RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {	

		return "market/iRegister"; 	
	}//���͹�ǰ���������̵�
	
	
	
	
	@RequestMapping("/spetstore/market/mSearch/mRegister.do") 
	public String moveToMarketRegister() {	
//@RequestParam("userId") String userId
		System.out.println("################movetoMarketRegister");
		return "/market/mRegister"; 	
	}//���͹�ǰ���������̵�
}
