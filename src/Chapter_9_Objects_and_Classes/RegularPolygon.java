package Chapter_9;

public class RegularPolygon {
    
    private int numberOfSides = 3;
    private double side = 1;
    private double x = 0, y = 0;
    
    RegularPolygon() {
    }
    RegularPolygon(int numberOfSides, double side) {
        this.numberOfSides = numberOfSides;
        this.side = side;
    }
    RegularPolygon(int numberOfSides, double side, double x, double y) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    // Accessor methods
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    // Mutator methods
    void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    void setSide(double side) {
        this.side = side;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter() {
        return numberOfSides * side;
    }
    public double getArea() {
        return numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}
