public class Book extends Product{
    private String author;

    public Book(){
        super();
        author="";
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //10% discount
    public double getDiscount() {
        double discount = super.getPrice() - (super.getPrice()*0.1);
        setPrice(discount);
        return discount;
    }
}