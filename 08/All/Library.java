import java.util.Arrays;
public class Library
{
    private String name;
    private Book[] books;
    
    Library(String name){
        this.name = name;
    }
    
    Library(String name, Book[] books){
        this.name = name;
        this.books = books;
    }
    
    public void addBook(Book book){
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
    
    public void displayAllBooks(){
        System.out.println("Library " + name + ":");
        for (Book el : books){ el.display(); }
    }
    
    public static void main(String[] args){
        Book[] books = {new Book("Book1", "Author1"), new EBook("EBook2", "Author2", "FileName2"), new EBook("EBook3", "Author3", "FileName3")};
        Library lib = new Library("Library1", books);
        lib.addBook(new AudioBook("AudioBook4", "Author4", 55, 54));
        lib.addBook(new AudioBook("AudioBook5", "Author5", 53, 1));
        lib.displayAllBooks();
    }
}
