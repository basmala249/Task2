import java.util.HashMap; 
import java.util.Map;

public class ShoppingCart {
    Map <NonFreeBooks , Integer> addedBooks ;
    ShoppingCart(){
        addedBooks = new HashMap<>();
    }

    public void addBook(String ISBN , Integer quantity , String Email , String Address ){ 
          if(quantity <= 0){
            System.out.println("Please Enter positive Number");
            return ;
          }
          NonFreeBooks neededBook = null;
          Book book = Main.inv.FindBook(ISBN); 
          if (book != null) {
            if (book instanceof DemoBook) {
                neededBook = ((DemoBook)book).getBook();
            } else {
                neededBook = (NonFreeBooks)book;
            }
        } 
        Integer val = neededBook.getInform();
        if(val < quantity){
            System.out.println("Sorry! Book " + ISBN + " is Out Of Stock");
            return ;
        }
          System.out.println("Book " + ISBN + " added Successfully");
          neededBook.update(quantity);
          addedBooks.put(neededBook, quantity);
          
    }

    public Map<NonFreeBooks , Integer> getCart(){
        return addedBooks;
    }
}
