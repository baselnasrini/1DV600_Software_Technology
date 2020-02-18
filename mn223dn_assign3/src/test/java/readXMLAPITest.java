import lnu.resources.*;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;
import java.util.*;
import lnu.models.*;
import java.lang.*;
import java.io.*;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import static org.fest.assertions.Assertions.assertThat;

// Look at this to find out how to create an api test.
// Info on how to test with dropwizard: http://www.dropwizard.io/0.8.0/docs/manual/testing.html
public class readXMLAPITest {


try {
	 @ClassRule
	 public static final ResourceTestRule resources = ResourceTestRule.builder()
	 		.addResource(new GetBooksResource())
	 		.build();


			booksDAO bd = new booksDAO();
			BookList books = bd.xmlToBook();
			ObjectMapper mapper = new ObjectMapper();

			String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(books.getBooks());
		} catch (JsonGenerationException a){
			a.printStackTrace();
		} catch (JsonMappingException b){
			b.printStackTrace();
		} catch (IOException c){
			c.printStackTrace();
		} catch (JAXBException d){
			d.printStackTrace();
		}

	@Test
	public void testGetPing() {
	assertThat(resources.client().target("/books").request().get(String.class)).isEqualTo(jsonInString);

	}
}
