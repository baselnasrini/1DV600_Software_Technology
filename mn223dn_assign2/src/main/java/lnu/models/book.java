package lnu.models;

import java.util.*;
import javax.xml.bind.annotation.*;


//@XmlRootElement(name = "book")
//@XmlType(propOrder = {"author", "title", "genre","price","publish_date","description"})
public class book {
	
	private String title;
	private String author;
	private String genre;
	private double price;
	private String publish_date;
	private String description;
	private String id;

	public book( String id, String title,String author, String genre, double price, String publish_date, String description ){

		this.price = price;

		this.publish_date = publish_date;

		this.description = description;

		this.title=title;

		this.author=author;

		this.genre=genre;

		this.id =id;

		}

		public book(){}

	public String getTitle() {
		return title;
	}
	//@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	//@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}
	//@XmlElement
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}
	//@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}
	public String getpublish_date() {
		return publish_date;
	}
	//@XmlElement(name = "book")
	public void setpublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}
	//@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	 @XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
