package mk.post.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mk.post.model.PostVo;
import mk.post.repository.IPostDao;

@Service
public class PostService implements IPostService {

	@Resource(name = "postDao")
	private IPostDao PostDao;
	
	@Override
	public List<PostVo> getPostAll() {
	   
		List<PostVo> postList = PostDao.getPostAll();
		
		return postList;
	}

}
