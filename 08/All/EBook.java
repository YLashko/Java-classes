public class EBook extends Book
{
    private String fileName;
    
    EBook(String title, String author, String fileName){
        super(title, author);
        this.fileName = fileName;
    }
    
    public String getFileName(){ return fileName; }
    
    public void setFileName(String fileName){ this.fileName = fileName; }
    
    public void display(){
        System.out.println("EBook " + getTitle() + " by " + getAuthor() + " in " + fileName);
    }
    
    public static void main(String[] args){
        Book a = new EBook("t1", "a1", "f1");
        Book b = new EBook("t2", "a2", "f2");
        Book c = new Book("t3", "a3");
        a.display();
        b.display();
        c.display();
    }
}
