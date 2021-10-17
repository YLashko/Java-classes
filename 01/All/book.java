public class book
{
    String name = "Harry potter";
    int pages_count = 200;
    boolean thick_cover = false;
    int reading_page = 0;
    
    void TurnPage(boolean backwards) {
        if (backwards) {
            reading_page = reading_page - 1;
        } else {
            reading_page = reading_page + 1;
        }
        
        if (reading_page > pages_count) {
            reading_page = pages_count;
        }
        
        if (reading_page < 0) {
            reading_page = 0;
        }
    }
    
    void ChangeName(String get_name) {
        name = get_name;
    }
    
    void DisplayInfo() {
        System.out.println("Name: " + name + "\nPages: "+ pages_count + "\nThick cover: " + thick_cover);
    }
}
