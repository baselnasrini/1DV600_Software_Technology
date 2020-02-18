package lnu.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import lnu.dao.booksDAO;
import lnu.models.*;
import java.util.*;
import java.io.*;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.*;
import org.w3c.dom.*;


// Response will be JSON
@Produces(MediaType.APPLICATION_JSON)

// This is the class that will be called when "localhost:9090/api/books" get called by the browser.
// method that perform view a book list function 
@Path("/books")
public class GetBooksResource{


		@GET
		public String getBooks() throws JsonGenerationException, JsonMappingException , IOException , JAXBException{

					booksDAO bd = new booksDAO();
					BookList books = bd.xmlToBook();
					ObjectMapper mapper = new ObjectMapper();
					String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(books.getBooks());


  	return jsonInString;
	  }

}
