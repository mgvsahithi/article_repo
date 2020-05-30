package api.service;

import java.util.List;

import api.bo.Article;
import api.bo.User;
import api.request.ArticleRequest;
import api.request.LoginRequest;
import api.response.ArticleResponse;
import api.response.StandardResponse;

public interface ArticleService {

	StandardResponse registerUser(User userRegisterationRequest);
	
	StandardResponse loginUser(LoginRequest loginRequest);
	
	List<Article> fetchArticles();
	
	StandardResponse addArticle(ArticleRequest articleRequest);
}
