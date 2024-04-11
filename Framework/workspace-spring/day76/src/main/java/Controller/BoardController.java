package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Model.vo.BoardVO;
import Service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService bs;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("list", bs.getBoards());
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public ModelAndView add(BoardVO input) {
		ModelAndView mav=new ModelAndView();
		
		int row = bs.insert(input);
		String msg = row == 0 ? "추가 실패" : "추가 성공";

		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");

		return mav;
		}
}


