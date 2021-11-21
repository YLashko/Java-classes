public class Statistics
{
    static int NumItems(int rangeMin, int rangeMax){
        return rangeMax - rangeMin - 1;
    }
    
    static int Sum(int rangeMin, int rangeMax){
        return (rangeMax + rangeMin) / 2 * NumItems(rangeMin, rangeMax);
    }
    
    static int Mean(int rangeMin, int rangeMax){
        return (rangeMax + rangeMin) / 2;
    }
}
