public class MailService implements Services{
    public void serve(NonFreeBooks book , String email , String address){
        send(book , email); 
    }
     public void send(NonFreeBooks book, String email){
        // Imp of Sending Book by Email 

        System.out.println("Shipping by Email");
     }
}
