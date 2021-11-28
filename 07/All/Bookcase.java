import java.util.Arrays;
public class Bookcase
{
    private Book[] books = {};
    private String name;
    
    Bookcase(String name) {
        this.name = name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    void addBook(Book book){
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
    
    void removeFileByName(String name){
        for (Book el : books){
            if (el.getName() == name){
                removeBook(el);
            }
        }
    }
    
    void removeBook(Book book){
        boolean deleted = false;
        Book[] newBooks = {};
        for (Book el : books){
            if (el != book || deleted){
                newBooks = Arrays.copyOf(newBooks, newBooks.length + 1);
                newBooks[newBooks.length - 1] = el;
            } else {
                deleted = true;
            }
        }
        books = newBooks;
    }
    
    void displayContent(){
        String display = "\n";
        display += "Bookcase " + name + ":\n";
        for (Book el : books){
            display += el.getInfo() + ";\n";
        }
        System.out.println(display);
    }
    
    public static void main(String[] args){
        Bookcase b = new Bookcase("Books");
        Writer w = new Writer("Me");
        Chapter[] chapters = {new Chapter("1", 50, 1), new Chapter("2", 50, 51)};
        Book a = new Book("book1", w, 100);
        a.setChapters(chapters);
        b.addBook(a);
        b.addBook(new Book("book2", w, 500));
        b.displayContent();
        b.addBook(new Book("book3", w, 250));
        b.displayContent();
        b.removeFileByName("book2");
        b.displayContent();
    }
}