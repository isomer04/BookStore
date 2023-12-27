public class BookstoreApp {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Customer customer = new Customer();
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add books to inventory
        Book book1 = new Book("Title1", "Author1", "ISBN1", 19.99, 10);
        bookstore.addBookToInventory(book1);


        customer.addToCart(bookstore.searchBooks("title").get(0));
        customer.addToCart(bookstore.searchBooks("title2").get(0));
        customer.completePurchase();
    }
    
}
