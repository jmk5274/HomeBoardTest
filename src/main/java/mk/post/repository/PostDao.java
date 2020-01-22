package mk.post.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import mk.post.model.PostVo;

@Repository
public class PostDao implements IPostDao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<PostVo> getPostAll() {
		List<PostVo> postList = sqlSession.selectList("post.getPostAll");
		return postList;
	}

}
