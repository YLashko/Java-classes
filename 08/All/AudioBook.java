
public class AudioBook extends Book
{
    private int min;
    private int sec;
    
    AudioBook(String title, String author, int min, int sec){
        super(title, author);
        this.min = min;
        this.sec = sec;
    }
    
    public int getMin(){ return min; }
    
    public int getSec(){ return sec; }
    
    public void setSec(int sec){ this.sec = sec; }
    
    public void setMin(int min){ this.min = min; }
    
    public void display(){
        System.out.println("AudioBook " + getTitle() + " by " + getAuthor() + " duration: " + min + "m " + sec + "s");

    }
    
    public static void main(String[] args){
        Book a = new AudioBook("t1", "a1", 70, 43);
        Book b = new AudioBook("t2", "a2", 50, 56);
        Book c = new Book("t3", "a3");
        a.display();
        b.display();
        c.display();
    }
}
