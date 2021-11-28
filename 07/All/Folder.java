import java.util.Arrays;
public class Folder
{
    private File[] files = {};
    private String name;
    
    Folder(String name) {
        this.name = name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    void addFile(File file){
        files = Arrays.copyOf(files, files.length + 1);
        files[files.length - 1] = file;
    }
    
    void removeFileByName(String name){
        for (File el : files){
            if (el.getName() == name){
                removeFile(el);
            }
        }
    }
    
    void removeFile(File file){
        boolean deleted = false;
        File[] newFiles = {};
        for (File el : files){
            if (el != file || deleted){
                newFiles = Arrays.copyOf(newFiles, newFiles.length + 1);
                newFiles[newFiles.length - 1] = el;
            } else {
                deleted = true;
            }
        }
        files = newFiles;
    }
    
    void displayContent(){
        String display = "\n";
        display += "Folder " + name + ":";
        for (File el : files){
            display += "\nFile " + el.getName() + ": " + el.getContent() + ";";
        }
        System.out.println(display);
    }
    
    public static void main(String[] args){
        Folder f = new Folder("Files");
        f.addFile(new File("file1", "qwertyuiopladfmkvlnzhudfioj"));
        f.addFile(new File("file2", "sfhdsgfhd"));
        f.displayContent();
        f.addFile(new File("file3", ";kmsrnhogrsklgmsrkgmsrlmgkrsqqqqqqqq"));
        f.displayContent();
        f.removeFileByName("file2");
        f.displayContent();
    }
}
