import java.util.Arrays;
public class Scores
{
    public static float midMean(int[] scores){
        scores = deleteElement(scores, min(scores));
        scores = deleteElement(scores, max(scores));
        return mean(scores);    
    }
    
    private static float mean(int[] array){
        float sum = 0;
        for (int el : array){
            sum += el;
        }
        return sum / array.length;
    }
    
    private static int[] deleteElement(int[] array, int el){
        int[] output = {};
        boolean deleted = false;
        
        for (int arrEl: array){
            if (!(arrEl == el && !deleted)){
                output = Arrays.copyOf(output, output.length + 1);
                output[output.length - 1] = arrEl;
            } else {deleted = true;}
        }
        
        return output;
    }
    
    private static int max(int[] array){
        int max = array[0];
        for (int el : array){
            if (el > max){
                max = el;
            }
        }
        return max;
    }
    
    private static int min(int[] array){
        int min = array[0];
        for (int el : array){
            if (el < min){
                min = el;
            }
        }
        return min;
    }
}
