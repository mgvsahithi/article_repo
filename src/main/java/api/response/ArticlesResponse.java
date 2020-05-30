package api.response;

import java.util.List;

public class ArticlesResponse {

	List<ArticleResponse> articles;

	public List<ArticleResponse> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleResponse> articles) {
		this.articles = articles;
	}
	
}
