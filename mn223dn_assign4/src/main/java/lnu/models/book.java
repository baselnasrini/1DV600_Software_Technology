package lnu.models;

import java.util.*;
import javax.xml.bind.annotation.*;


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

		public book(){
		}

		//@retun a string of the book title
		public String getTitle() {
			return title;
		}

		//@param title add title to the book
		public void setTitle(String title) {
			this.title = title;
		}

		//@retun a string of the book author
		public String getAuthor() {
			return author;
		}

		//@param author add author to the book
		public void setAuthor(String author) {
			this.author = author;
		}

		//@retun a string of the book genre
		public String getGenre() {
			return genre;
		}

		//@param genre add genre to the book
		public void setGenre(String genre) {
			this.genre = genre;
		}

		//@retun a double of the book price
		public double getPrice() {
			return price;
		}

		//@param price add price to the book
		public void setPrice(double price) {
			this.price = price;
		}

		//@retun a string of the book publish date
		public String getpublish_date() {
			return publish_date;
		}

		//@param publish_date add publish date to the book
		public void setpublish_date(String publish_date) {
			this.publish_date = publish_date;
		}

		//@retun a string of the book description
		public String getDescription() {
			return description;
		}

		//@param description add description to the book
		public void setDescription(String description) {
			this.description = description;
		}

		//@retun a string of the book id
		 @XmlAttribute
		public String getId() {
			return id;
		}

		//@param id add id to the book
		public void setId(String id) {
			this.id = id;
		}

}
