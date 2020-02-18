
package lnu.models ;

public class book {

	public  String title ;
	public String id ;
	public String author ;
	public String genre ;
	public String publishDate ;
	public String description ;
	public double price ;

	public book(String inTitle,String inAuthor, String inGenre, String inId, double inPrice , String inPublishDate , String inDescription ){
		title = inTitle ;
		author = inAuthor ;
		genre = inGenre ;
		id = inId ;
		price = inPrice ;
		publishDate = inPublishDate ;
		description = inDescription ;
	}

	public book(){
	}

	public void addTitle(String input){
		title = input;
	}
	 public String getTitle(){
		 return title;
	 }

	 public void addPrice(double input){
 		price = input;
 	}

 	 public double getPrice(){
 		 return price;
 	 }

	 public void addId (String input){
		 id = input;
	 }

	 public String getId(){
		 return id;
	 }

	 public void addAuthor(String input){
		 author = input ;
	 }

	 public String getAuthor(){
		 return author;
	 }

	 public void addGenre(String input){
		 genre = input ;
	 }

	 public String getGenre(){
		 return genre ;
	 }

	 public void addPublishDate(String input){
		 publishDate = input ;
	 }

	 public String getPublishDate(){
		 return publishDate ;
	 }

	public void addDescription (String input){
		description = input;
	}

	 public String getDescription (){
		 return description;
	 }

	 public String toString (){
		 return title ;
	 }

}
