package model;

import java.util.ArrayList;

public class ArticleList {
	
	
	private Article article;

	private ArrayList<Article> articlelist;
	
	public ArticleList()
	{
		articlelist= new ArrayList<Article>();
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticleList other = (ArticleList) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (articlelist == null) {
			if (other.articlelist != null)
				return false;
		} else if (!articlelist.equals(other.articlelist))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "ArticleList [article=" + article + ", articlelist="
				+ articlelist + "]";
	}

	

	

	
	

	
}
	

	