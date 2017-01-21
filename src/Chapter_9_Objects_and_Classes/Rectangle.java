package Chapter_9;

public class Rectangle {
    
    private double width, height;
    
    Rectangle() {
        width = 1;
        height = 1;
    }
/* WORKS the same way as the next block ****************************************
    Rectangle(double a, double b) {
        width = a;
        height = b;
    }
*/
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double getArea() {
        return width * height;
    }
    
    double getPerimeter() {
        return 2 * (width + height);
    }
    
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    
}
