public class rectangle3_4
{
    int width = 3;
    int length = 4;
    
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