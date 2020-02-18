import lnu.resources.*;
import lnu.models.*;
import lnu.dao.*;
import org.junit.Test;
import java.util.*;
import javax.xml.bind.JAXBException;
import static org.junit.Assert.*;


public class DeleteBookTest {

  // Test the delete fuction
    @Test
    public void DeleteBookTest() throws JAXBException {
        RemoveBookResource rs = new RemoveBookResource();
        booksDAO bookdao = new booksDAO();


        BookList booklistbefore = bookdao.xmlToBook();
        List<book> booksbefore =  booklistbefore.getBooks();

        rs.deleteBook("1");

        BookList booklistafter = bookdao.xmlToBook();
        List<book> booksafter =  booklistafter.getBooks();

        // Compare the size of the two lists and make sure that the book has been deleted by the size difference
        assertNotEquals(booksbefore.size(), booksafter.size());


        // Check if the first book has been deleted and the first book now is the second one.
        book boo = booksafter.get(0);
        assertEquals("2",boo.getId());
        assertEquals("Foundation and Empire",boo.getTitle());
        assertEquals("Science Ficition",boo.getGenre());
        assertEquals("Isaac Asimov",boo.getAuthor());

    }

}
