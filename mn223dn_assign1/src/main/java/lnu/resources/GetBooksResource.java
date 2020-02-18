package lnu.resources;

import java.util.List;
import java.util.ArrayList;
import lnu.models.book ;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

// Response will be JSON
@Produces(MediaType.APPLICATION_JSON)

// This is the class that will be called when "localhost:9090/api/books" get called by the browser.
// FOR THE CURIOUS: Take a look in the config.yml to find out why "/api" is present in the path.
@Path("/books")
public class GetBooksResource {

	@GET
	public String getBooks() {
		// TODO: Task 1

		book a = new book("Foundation","Isaac Asimov","Science Ficition","1",15.50,"1951-08-21","Foundation is the first novel in Isaac Asimovs ");
		book b = new book("Empire","Basel","Science Ficition","2",30.99,"1952-10-12","Foundation and Empire is a novel written by Isaac Asimov ");


		List<book> arr = new ArrayList<book> ();
		arr.add(a);
		arr.add(b);

		System.out.println(arr);

		ObjectMapper mapper = new ObjectMapper();

			try {
						String jsonInString = mapper.writeValueAsString(arr);
						System.out.println(jsonInString);

						jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arr);
						return jsonInString;

		} catch (JsonGenerationException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		return "";
	}


}
