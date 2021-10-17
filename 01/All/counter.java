public class counter
{
    int value = 0;
    
    void ChangeByTen(boolean increase){
        if (increase) {
            value += 10;
        } else {
            value -= 10;
        }
    }
    
    void ChangeByOne(boolean increase){
        if (increase) {
            value += 1;
        } else {
            value -= 1;
        }
    }
    
    void SetValue(int get_value){
        value = get_value;
    }
    
    int GetValue(){
        return value;
    }
}
