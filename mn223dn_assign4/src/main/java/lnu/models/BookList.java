package lnu.models;

import java.util.List;
import javax.xml.bind.annotation.*;


// a class that contain a list of book
@XmlRootElement(name = "catalog")
@XmlAccessorType (XmlAccessType.FIELD)
public class BookList {


   @XmlElement(name = "book")
	 private List<book> books = null;


   // get the books of the list
   //@return a list of books
    public List<book> getBooks() {
        return books;
    }

    // set a list of books
    //@param books   a list of books
    public void setBooks(List<book> books) {
        this.books = books;
    }

}
