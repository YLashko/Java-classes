public class Book
{
    private String title;
    private String author;
    
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public String getTitle(){ return title; }
    
    public String getAuthor(){ return author; }
    
    public void setTitle(String title){ this.title = title; }
    
    public void setAuthor(String author){ this.author = author; }
    
    public void display(){
        System.out.println("Book " + title + " by " + author);
    }
    
    public static void main(String[] args){
        Book a = new Book("t1", "a1");
        Book b = new Book("t2", "a2");
        a.display();
        b.display();
    }
}
