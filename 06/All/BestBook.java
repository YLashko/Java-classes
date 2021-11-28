public class BestBook
{
    String[] genres = {"crime", "drama", "fantasy", "science fiction"};
    String author;
    String name;
    String genre;
    boolean thickCover;
    float price;
    
    BestBook(String author, String name, String genre, boolean thickCover, float price){
        this.author = author;
        this.name = name;
        if (contains(genres, genre)){
            this.genre = genre;
        }
        this.thickCover = thickCover;
        this.price = price;
    }
    
    private boolean contains(String[] arr, String str){
        for (String el: arr){
            if (el == str){return true;}
        }
        return false;
    }
}
