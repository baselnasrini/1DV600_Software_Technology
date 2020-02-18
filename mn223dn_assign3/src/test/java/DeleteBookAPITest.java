import lnu.resources.*;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import lnu.models.book;

import static org.fest.assertions.Assertions.assertThat;

// Look at this to find out how to create an api test.
// Info on how to test with dropwizard: http://www.dropwizard.io/0.8.0/docs/manual/testing.html
public class DeleteBookAPITest {

	@ClassRule
	public static final ResourceTestRule resources = ResourceTestRule.builder()
			.addResource(new book())
			.build();

	@Test
	public void testGetPing() {
		assertThat(resources.client().target("/book/2").request().delete(String.class))
				.isEqualTo("{\"Isaac Asimov\": \"Foundation and Empire\":\"Science Ficition\":\"79\":\"1952-10-12\":\"Foundation and Empire is a novel written by Isaac Asimov that was published by Gnome Press in 1952. It is the second book published in the Foundation Series, and the fourth in the in-universe chronology. It takes place in two halves, originally published as separate novellas. The second part, The Mule, won a Hugo Award.\"}");

	}
}
