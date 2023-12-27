import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> inventory;

    public Bookstore(){
        this.inventory =  new ArrayList<>();
    }

    public List<Book> getInventory(){
        return inventory;
    }

    public void setInventory(List<Book> inventory){
        this.inventory = inventory;
    }

    public void addBookToInventory(Book book){
        inventory.add(book);
    }

    public void displayBooks(){

    }

    public List<Book> searchBooks(String searchTerm){

    }
}