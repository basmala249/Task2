public class PaperBook extends NonFreeBooks {
    private Integer quantity;
    
    public PaperBook(String iSBN, String bookTitle,  Integer publishedYear, Integer price , Integer quantity) {
        super(iSBN, bookTitle, publishedYear , price , new ShippingService());
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void showContent(){
        super.showContent();
        System.out.println("Quantity : " + quantity);
    }

    

    @Override
    public Integer getInform() {
         return quantity ; 
    }

    @Override
    public void update(Integer val) {
        quantity -= val;
    }

    @Override
    public void send(String email, String address) {
         Services services = getServe();
         services.serve(this , email , address);
    }

     
}
