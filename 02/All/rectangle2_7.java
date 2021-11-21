public class rectangle2_7
{
    int width = 2;
    int length = 7;
    
    int CalculatePerimeter() {
        return (width + length) * 2;
    }
    
    int CalculateSquare() {
        return width * length;
    }
    
    void DisplayDimensions() {
        System.out.println(width + "X" + length);
    }
    
}
