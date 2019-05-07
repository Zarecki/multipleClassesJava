import java.util.ArrayList;

public class Mouse {

    private ArrayList<Book> nest;


    public Mouse(){
        this.nest = new ArrayList<>();
    }

    public void stealBook(Library library){
        Book stolenBook = library.removeBook();
        this.nest.add(stolenBook);
    }

    public int getNestLength(){
        return nest.size();
    }


}


