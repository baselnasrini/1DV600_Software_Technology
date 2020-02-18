// Use this file to write and read the xml file.
// http://www.journaldev.com/1234/jaxb-tutorial-example-to-convert-object-to-xml-and-xml-to-object
// javax.xml.bind is added as a part of the sdk from java7 and forward.
package lnu.dao;

import javax.xml.bind.*;
import javax.ws.rs.*;
import lnu.models.*;
import java.util.*;
import java.io.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.*;


public class booksDAO  {

    public static BookList xmlToBook() throws JAXBException {

          BookList books =null;

          JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
          Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

          books = (BookList)jaxbUnmarshaller.unmarshal( new File("books.xml") );

    return books;
    }

    public static void bookToXml(BookList books) throws JAXBException{

          JAXBContext context = JAXBContext.newInstance(BookList.class);

          Marshaller m = context.createMarshaller();
          m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
          m.marshal(books, new File("books.xml"));
    }


}
