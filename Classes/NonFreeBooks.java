public abstract class NonFreeBooks extends Book{
    private Integer price;

    private Services services ;
    public NonFreeBooks(String iSBN, String bookTitle, Integer publishedYear , Integer price , Services services) {
        super(iSBN, bookTitle, publishedYear);
         this.price = price;
         this.services = services;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public void showContent(){
        super.showContent();
        System.out.println("Price : " +  price);
    }
    
    public abstract void send(String email , String address);
    
    public abstract Integer getInform();
    
    public abstract void update(Integer val);

    public Services getServe(){
        return services;
    }
}
