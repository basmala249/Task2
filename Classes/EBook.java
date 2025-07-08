public class EBook extends NonFreeBooks{
    private String filePath ;
    private boolean isAvailable ;
    public EBook(String iSBN, String bookTitle, Integer publishedYear ,Integer price,  boolean bool , String file) {
        super(iSBN, bookTitle, publishedYear , price , new MailService());
        isAvailable = bool;
        filePath = file;

    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
     

     public void showContent(){
        super.showContent();
        System.out.println("File Path : " + filePath);
        
        System.out.println("Available : " + isAvailable);
    }
    
     @Override
     public Integer getInform() {
        if(isAvailable()){
            return 1;
        }
        return -1;
     }
     @Override
     public void update(Integer val) {
         isAvailable = true;
     }
     @Override
     public void send(String email, String address) {
        Services services = getServe() ;
        services.serve(this , email , address);
     }

    
    
}
