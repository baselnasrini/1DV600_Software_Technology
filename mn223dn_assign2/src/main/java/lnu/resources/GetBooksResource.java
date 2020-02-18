package lnu.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;

import lnu.dao.booksDAO;
import lnu.models.*;
import java.util.ArrayList;
import java.io.*;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


// Response will be JSON
@Produces(MediaType.APPLICATION_JSON)

// This is the class that will be called when "localhost:9090/api/books" get called by the browser.
// FOR THE CURIOUS: Take a look in the config.yml to find out why "/api" is present in the path.
@Path("/books")
public class GetBooksResource{


		@GET
		public String getBooks() throws JsonGenerationException, JsonMappingException , IOException , JAXBException{

					booksDAO bd = new booksDAO();
					BookList books = bd.unMarshaling();

					ObjectMapper mapper = new ObjectMapper();

					String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(books.getBooks());


  	return jsonInString;
	  }

}
