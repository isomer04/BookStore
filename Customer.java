import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<Book> cart;

    public void addToCart(Book book){
        cart.add(book);
    }

    public void completePurchase(){
        
    }
}
