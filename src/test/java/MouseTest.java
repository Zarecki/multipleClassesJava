import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {
    Mouse mouse;
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("The Joy of Hex", "Baron Mercedi", "Lifestyle");
        mouse = new Mouse();
    }

    @Test
    public void getStolenBookIntoNest(){
        library.addBook(book);
        mouse.stealBook(library);
        assertEquals(1, mouse.getNestLength());
    }
}
