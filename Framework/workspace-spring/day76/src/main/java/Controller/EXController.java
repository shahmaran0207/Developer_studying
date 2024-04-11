package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import Service.BoardService;

@Controller
public class EXController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/EX02")
	public ModelAndView EX02() {
		//mav에 viewName을 지정하지 않으면 void와 동일한 효과
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("ver", bs.test());
		return mav;
	}
	
}
