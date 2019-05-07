import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;
    private int capacity;

    public Library(int capacity){
        this.bookList = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumberOfBooks(){
        return this.bookList.size();
    }

    public void addBook(Book book){
        if (this.capacity > this.getNumberOfBooks()){
            this.bookList.add(book);
        }
        else {
            System.out.print("Nae room");
        }
    }

    public Book removeBook(){
        return this.bookList.remove(0);
    }


}
