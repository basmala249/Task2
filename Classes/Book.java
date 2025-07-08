public abstract class Book {
    private String ISBN;
    private String bookTitle;
    private Integer publishedYear;
    public Book(String iSBN, String bookTitle, Integer publishedYear) {
        ISBN = iSBN;
        this.bookTitle = bookTitle;
        this.publishedYear = publishedYear;
    }
    
    

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public Integer getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }
    
    public void showContent(){
        System.out.println("Title : " + bookTitle);
        System.out.println("ISBN : " + ISBN);
        System.out.println("Year : " + publishedYear);
    }
    
}
