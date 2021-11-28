public class File
{
    private String name;
    private String content;
    
    File(String name, String content){
        this.name = name;
        this.content = content;
    }
    
    String getName(){
        return name;
    }
    
    String getContent(){
        return content;
    }
    
    void edit(String name, String content){
        this.name = name;
        this.content = content;
    }
}
