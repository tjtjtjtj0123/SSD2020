package summerpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MoveToMRegisterController {
	@RequestMapping("/market/update") 
	public String moveToMarketUpdate(@RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {	

		return "market/iRegister"; 	
	}//���͹�ǰ���������̵�
}
