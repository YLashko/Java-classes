public class Book
{
    private String name;
    private int numberOfPages;
    private Writer writer;
    private Chapter[] chapters = {};
    
    Book(String name, Writer writer, int numberOfPages){
        this.name = name;
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }
    
    String getName(){
        return name;
    }
    
    String getWriterName(){
        return writer.getName();
    }
    
    Writer getWriter(){
        return writer;
    }
    
    void setChapters(Chapter[] chapters){
        this.chapters = chapters;
    }
    
    String getInfo(){
        String info = "Book " + name + ":";
        for (Chapter el : chapters){
            info += "\n" + "Chapter " + el.getName() + ": " + el.getStartingPage() + " - " + (el.getStartingPage() + el.getNumberOfPages() - 1);
        }
        return info;
    }
}