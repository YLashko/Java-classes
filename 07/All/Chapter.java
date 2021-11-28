public class Chapter
{
    private String name;
    private int numberOfPages;
    private int startingPage;
    
    Chapter(String name, int numberOfPages, int startingPage){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.startingPage = startingPage;
    }
    
    String getName(){
        return name;
    }
    
    int getNumberOfPages(){
        return numberOfPages;
    }
    
    int getStartingPage(){
        return startingPage;
    }
}
