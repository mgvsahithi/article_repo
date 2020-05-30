package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.bo.Article;
import api.bo.User;
import api.repository.ArticleRepository;
import api.repository.UserRepository;
import api.request.ArticleRequest;
import api.request.LoginRequest;
import api.response.StandardResponse;
import api.service.ArticleService;

//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)

@RestController
@RequestMapping(path = "/users")
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private ArticleRepository articleRepository;

	
	@GetMapping
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

	@PostMapping(path="/create", consumes = "application/json")
    public StandardResponse create(@RequestBody User user) {
        return articleService.registerUser(user);
    }
	
	@PostMapping(path = "/login",consumes = "application/json")
    public StandardResponse login(@RequestBody LoginRequest loginRequest) {
        return articleService.loginUser(loginRequest);
    }
	
	@PostMapping(path = "/article", consumes = "application/json")
    public StandardResponse addArticle(@RequestBody ArticleRequest article) {
       return articleService.addArticle(article);
    }
	
}
