package summerpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoveToUdInfoController {
	@RequestMapping("/mypage/goupdate") 
	public String showMyPageUpdate(@RequestParam("userId") String userId) {
		
		return "user/myPage/updateInfo"; 
		
	}//ȸ���������������̵�
}
