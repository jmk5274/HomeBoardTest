package mk.main.web;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mk.post.model.PostVo;
import mk.post.service.IPostService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name = "postService")
	private IPostService postService;
	
	@GetMapping("postView")
	public String postView(Model model) {
		
		List<PostVo> postList = postService.getPostAll();
		
		logger.debug("postList : {}", postList);
		model.addAttribute("postList", postList);
		
		return "post/postView";
	}
	
}
