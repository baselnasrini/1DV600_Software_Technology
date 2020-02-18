package lnu.resources;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.*;
import lnu.models.*;
import lnu.dao.booksDAO;
import javax.xml.bind.*;

@Produces(MediaType.APPLICATION_JSON)

@Path("/books/{id}")

public class RemoveBookResource {

    @DELETE
    public String deleteBook(@PathParam("id") String id) throws JAXBException{

          booksDAO bd = new booksDAO();
          BookList boo = bd.xmlToBook();

          List<book> booksList = boo.getBooks();

          for(book i: booksList){

                if(i.getId().equals(id)){
                    int index = booksList.indexOf(i);

                    booksList.remove(index);
                    boo.setBooks(booksList);
                    bd.bookToXml(boo);
                    return id;

                }
          }

    return id;
    }






}
