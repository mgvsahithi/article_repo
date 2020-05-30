package api.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ARTICLE_ID", columnDefinition = "BIGINT(20)")
	private Long id;

	@Column(name = "TITLE", columnDefinition = "VARCHAR(50)")
	private String title;
	
	@Column(name = "BODY", columnDefinition = "TEXT")
	private String body;
	
	@Column(name = "AUTHOR", columnDefinition = "VARCHAR(50)")
	private String author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
