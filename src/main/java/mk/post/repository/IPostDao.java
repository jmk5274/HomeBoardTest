package mk.post.repository;

import java.util.List;

import mk.post.model.PostVo;

public interface IPostDao {

	public List<PostVo> getPostAll();
	
}
