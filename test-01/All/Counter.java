public class Counter
{
    int counter = 0;
    
    void increase(){
        counter += 1;
    }
    
    void decrease(){
        counter -= 1;
    }
    
    void increase(int n){
        counter += n;
    }
    
    void decrease(int n){
        counter -= n;
    }
    
    int value(){
        return counter;
    }
}
