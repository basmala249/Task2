public class ShippingService implements Services{
    public void serve(NonFreeBooks book , String email , String address){
      send(book, address);
    }

    public void send(NonFreeBooks book , String address){
         // Imp of shipping depend on address
         System.out.println("Shipping Address");
    }
}
