import lnu.resources.*;
import lnu.models.*;
import lnu.dao.*;
import org.junit.Test;
import java.util.*;
import javax.xml.bind.JAXBException;
import static org.junit.Assert.*;
import junit.framework.Assert;


// Test fetch book from XML file
public class readXMLTest{

    @Test
    public void readXMLTest() throws JAXBException {

        booksDAO bookdao = new booksDAO();
        
        BookList bookli = bookdao.xmlToBook();
        Assert.assertNotNull(bookli);

        List<book> books =  bookli.getBooks();

        //Check the size to test if all the books have been read
        assertEquals(10,books.size());


        book b1 = books.get(0);
        assertEquals("Foundation",b1.getTitle());
        assertEquals("Science Ficition",b1.getGenre());
        assertEquals("1951-08-21",b1.getpublish_date());
    }

}
