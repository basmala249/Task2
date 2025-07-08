import java.util.List;
import java.util.Map;

public class Main {
    public static Inventory inv = new Inventory();
    public static void main(String[] args) {
         Customer cusm1 = new Customer(123, "basmala", "ibas@gml.com", "faisel", 0101250);
         NonFreeBooks book1 = new EBook("122-25",  "Hello A", 2025, 66, true, "File.pdf");
         // Test For Add Book

         System.out.println("********* lets Add *********");

         inv.addBook(new PaperBook("134-24" , "Playing With Sun" , 2022 , 100 , 3));
         inv.addBook(new PaperBook("124-20" , "Running Before" , 2020 , 40 , 1));
         inv.addBook(new EBook("120-19",  "Good Morn", 2019, 170, true, "Ch.pdf"));
         inv.addBook(new DemoBook("111-25", "Make Fun", 2013, "A hilarious guide to turning everyday life into playful adventures, packed with quirky activities and unexpected humor.", "Includes 50+ interactive 'fun challenges' to spark creativity!", false));
         DemoBook book2 = new DemoBook("122-25", "Hello A", 2025, "Welcome to My AA's", "Includes Exciting Articles for any ages ", true);
         book2.setBook(book1);
         inv.addBook(book2);
         
         inv.showBooks();

         // remove and return OutDatedBooks 

         System.out.println("********* lets Remove *********");

         List <Book> OutDatedBooks = inv.remove(7);

         for(Book book : OutDatedBooks){
             book.showContent();
         }
         
         inv.showBooks();

         // Buy Part 

         System.out.println("********* lets Buy *********");


         ShoppingCart cart1 = new ShoppingCart();
         cart1.addBook("134-24" , 2 , cusm1.getEmail() , cusm1.getAddress());
         cart1.addBook("120-19" , 1 , cusm1.getEmail() , cusm1.getAddress() );
         cart1.addBook("122-25" ,1 , cusm1.getEmail(),cusm1.getAddress() );

         Integer val = Checkout(cart1, cusm1);
         System.out.println("Paid Ammount : " + val);
    
    }
    public static Integer Checkout(ShoppingCart cart , Customer cus){
        Integer tot = 0 ;
        Map<NonFreeBooks, Integer> books = cart.getCart();
        if(books.size() <= 0){
            System.out.println("Cart is Empty!.");
            return 0;
        }
        for(NonFreeBooks book : books.keySet()){
            tot += (book.getPrice() * books.get(book));
            book.send(cus.getEmail(), cus.getAddress());
            System.out.println(book.getISBN());
        }
        return tot;
        
    }

}
