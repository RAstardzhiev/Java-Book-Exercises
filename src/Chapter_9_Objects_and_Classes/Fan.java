package Chapter_9;

public class Fan {
    
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    
    Fan() {
    }
    
    int getSpead() {
        return speed;
    }
    boolean getON_or_OFF() {
        return on;
    }
    double getRadius() {
        return radius;
    }
    String getColor() {
        return color;
    }
    
    void setSpeed(int speed) {
        this.speed = speed;
    }
    void setON(boolean isOn) {
        on = isOn;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        if (on) return "\n\t- Speed: " + getSpead() + "\n\t- Color: " + getColor() + "\n\t- Radius: " + getRadius() + "\n";
        else return "\n\t- Color: " + getColor() + "\n\t- Radius: " + getRadius() + "\n\t- Fan is Off\n";
    }
    
}
