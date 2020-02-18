package lnu.models;

import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "catalog")
@XmlAccessorType (XmlAccessType.FIELD)
public class BookList {



   @XmlElement(name = "book")
	 private List<book> books = null;



    public List<book> getBooks() {
        return books;
    }

    public void setBooks(List<book> books) {
        this.books = books;
    }

}
