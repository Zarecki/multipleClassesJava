import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("The Joy of Hex", "Baron Mercedi", "Lifestyle");
    }


    @Test
    public void getNumberOfBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void addBook() {
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }
}
