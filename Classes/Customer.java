public class Customer {
    private Integer nationalID ;
    private String name;
    private String email;
    private String Address ;
    private Integer phone; 
    Customer(Integer ID , String name , String email , String Address , Integer phone ){
        this.nationalID = ID;
        this.name = name;
        this.email = email;
        this.Address = Address;
        this.phone = phone; 
    }
    public Integer getNationalID() {
        return nationalID;
    }
    public void setNationalID(Integer nationalID) {
        this.nationalID = nationalID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    
}
