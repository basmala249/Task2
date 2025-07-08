import java.util.ArrayList;
import java.util.List;

public class DemoBook extends Book{
    private String contnet = "This DemoBook is Not For Sale. it is like a summary or draft to help you if you will buy it or not. If you choose to buy it you can see if it is available yet to access it.\n\n ";
    private String feautres;
    private NonFreeBooks book; // reference to book
    private boolean isBookAvailableYet ;
    private List<String> feedback = new ArrayList<>();
    public DemoBook(String iSBN, String bookTitle, Integer publishedYear, String contnet, String feautres,
            boolean isBookAvailableYet ) {
        super(iSBN, bookTitle, publishedYear);
        this.contnet += contnet;
        this.feautres = feautres;
        this.isBookAvailableYet = isBookAvailableYet;
    }
    public String getContnet() {
        return contnet;
    }
    public void setContnet(String contnet) {
        this.contnet = contnet;
    }
    public String getFeautres() {
        return feautres;
    }
    public void setFeautres(String feautres) {
        this.feautres = feautres;
    }
    public NonFreeBooks getBook() {
      if(isBookAvailableYet())
         return book;
      else {
        System.out.println("Sorry! Book is not available yet.");
        return null;
      }
    }
    public void setBook(NonFreeBooks book) {
        this.book = book;
    }
    public boolean isBookAvailableYet() {
        return isBookAvailableYet;
    }
    public void setBookAvailable(NonFreeBooks book) {
        if(book == null){
            System.out.println("you entered nothing.");
            return ;
        }
        this.isBookAvailableYet = true;
        setBook(book);
    }
    public void getFeedbacks() {
        Integer count = 0;
        for(String feed : feedback){
           System.out.println("Feedback " + (++count) + " : " + feed);
        }
    }
    public void addFeedback(String feedback) {
        if(feedback != "" || feedback != null)
           this.feedback.add(feedback);
    }

    public void showContent(){
        super.showContent();
        System.out.println("DemoBook Content : " + contnet);
        System.out.println("Features : " + feautres);
        System.out.println("feedbacks() : " );
        getFeedbacks();
    }
    
}
