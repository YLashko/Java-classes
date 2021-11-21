public class MyArrays
{
    static int max(int array[]){
        int maxim = -2147483648;
        for (int element : array){
            if (element > maxim){
                maxim = element;
            }
        }
        return maxim;
    }
    
    static int odd(int array[]){
        int counter = 0;
        for (int element : array){
            if (element % 2 == 1){
                counter += 1;
            }
        }
        return counter;
    }
    
    public static void main(String[] args){
        int[] array = {9, 7, 5, 32, 8};
        System.out.println(MyArrays.odd(array));
        System.out.println(MyArrays.max(array));
    }
}
