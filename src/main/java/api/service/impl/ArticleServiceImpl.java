package api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.bo.Article;
import api.bo.User;
//import api.mapper.UserMapper;
import api.repository.ArticleRepository;
import api.repository.UserRepository;
import api.request.ArticleRequest;
import api.request.LoginRequest;
import api.response.StandardResponse;
import api.service.ArticleService;

@Service("articleServiceImpl")
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepo;
	
	@Autowired
	UserRepository userRepo;
	
	/*@Autowired
	UserMapper userMapper;*/

	@Override
	public StandardResponse registerUser(User userRegisterationRequest) {
		// TODO Auto-generated method stub
//		User user = userMapper.userRegisterationRequestToUser(userRegisterationRequest);
		userRepo.save(userRegisterationRequest);
		return new StandardResponse().withMsg("success").withCode(200l);
	}

	@Override
	public StandardResponse loginUser(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
		User user = userRepo.findByUserNameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
		if(user!=null) {
			user.setAccessToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9");
			userRepo.save(user);
		return new StandardResponse().withMsg("success").withCode(200l);
		}
		else
			return new StandardResponse().withMsg("user not found").withCode(200l).withAccessToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9");
	}

	@Override
	public List<Article> fetchArticles() {
		// TODO Auto-generated method stub
		return articleRepo.findAll();
	}

	@Override
	public StandardResponse addArticle(ArticleRequest articleRequest) {
		// TODO Auto-generated method stub
		User users = userRepo.findByUserNameAndAccessToken(articleRequest.getAuthor(), articleRequest.getAccess_token());
		if(users==null)
		{
			return new StandardResponse().withMsg("user and access token not found").withCode(400l);
		}
		Article article = new Article();
		article.setAuthor(articleRequest.getAuthor());
		article.setBody(articleRequest.getBody());
		article.setTitle(articleRequest.getTitle());
		articleRepo.save(article);
		return new StandardResponse().withMsg("new article created").withCode(201l);
	}
	
	
}
