package lnu.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import lnu.models.*;
import lnu.dao.*;
import javax.xml.bind.*;
import javax.xml.parsers.*;
import java.io.*;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;

@Produces(MediaType.APPLICATION_JSON)
@Path("/books/{id}")
public class EditBookResource {

  // method that perform edit a book function 

    @POST
    public String editBook(@PathParam("id") String id, String book)throws JAXBException , JsonGenerationException ,JsonMappingException , IOException{

      booksDAO bd = new booksDAO();
      BookList boo = bd.xmlToBook();

      List<book> booksList = boo.getBooks();

      for(book i: booksList){

            if(i.getId().equals(id)){
                int index = booksList.indexOf(i);

          ObjectMapper mapper = new ObjectMapper();

          book newBook = mapper.readValue(book, book.class);

          booksList.set(index,newBook);
                boo.setBooks(booksList);
                bd.bookToXml(boo);
                return id;
            }
      }

      return id;

}

}
