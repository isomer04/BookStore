public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private double price;
    private int quantityOnHand;

    public Book(String title, String author, String ISBN, double price, int quantityOnHand) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

 
    public void setAuthor(String author) {
        this.author = author;
    }


    public String getISBN() {
        return ISBN;
    }


    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantityOnHand() {
        return quantityOnHand;
    }


    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


}