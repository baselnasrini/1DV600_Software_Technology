package lnu.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import lnu.models.*;
import lnu.dao.*;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.*;
import java.io.*;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;




@Produces(MediaType.APPLICATION_JSON)

@Path("/books")
public class AddBookResource {

  // method that perform add a book function 
  @PUT
  public String addBook(String book ) throws JAXBException , JsonGenerationException ,JsonMappingException , IOException  {



    booksDAO bd = new booksDAO();
    BookList boo = bd.xmlToBook();

    List<book> booksList = boo.getBooks();
    System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssss");
    System.out.println(book);

    ObjectMapper mapper = new ObjectMapper();

    book newBook = mapper.readValue(book, book.class);

      booksList.add(newBook);

      boo.setBooks(booksList);
      bd.bookToXml(boo);

      return "";
  }

}
