package api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.bo.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	List<Article> findAll();
	
}
