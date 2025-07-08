import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Inventory {
    Map<String , Book> Books;
    Inventory(){
        Books = new HashMap<>();
    }
    
    public void addBook(Book book){
       Books.put(book.getISBN(), book);
    }
 
    public void showBooks(){
        for(Book book : Books.values()){
             book.showContent();
             System.out.println("\n--------------------------------\n");
        }
    }

    public List<Book> remove(Integer countYear){ 
        Iterator<Book> iterator = Books.values().iterator();
        List<Book> OutDatedBooks = new ArrayList<>();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            Integer publishedYear = book.getPublishedYear();;
             Integer currentYear = Year.now().getValue();
            if(currentYear - publishedYear >= countYear) {
                iterator.remove();   
                OutDatedBooks.add(book);
            }
        }
        return OutDatedBooks ;
    }

    public Book FindBook(String ISBN){
        if(Books.get(ISBN) != null){
            return Books.get(ISBN);
        }
        System.out.println("Book is not available");
        return null;
    }



}
