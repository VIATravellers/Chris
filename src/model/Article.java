package model;

public class Article {
	
	private String headline;
	private String category;
	private String text;
	
	
	
	public Article(String headline, String category, String text) {
		super();
		this.headline = headline;
		this.category = category;
		this.text = text;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (headline == null) {
			if (other.headline != null)
				return false;
		} else if (!headline.equals(other.headline))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	public String toString() {
		return "Article [headline=" + headline + ", category=" + category
				+ ", text=" + text + ", getHeadline()=" + getHeadline()
				+ ", getCategory()=" + getCategory() + ", getText()="
				+ getText() + "]";
	}
	
	

}
