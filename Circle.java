import java.awt.Color;

/**
 * This class's purpose is to provide a circle class that allows for creation and information gathering of circles.
 * 
 * @author Nikita Desyatnikov
 */

public class Circle {  
    /**
     * Initialize private instance variables
     */ 
    private double radius;
    private Color color;
    private double area;

    /**
     * Constructor: construct circle with default parameters
     * @param NONE
     * @return NONE
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }

    /**
     * Constructor: construct cricle with given parameters of radius, color
     * @param double RADIUS, color COLOR
     * @return NONE
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /**
     * Method: get radius
     * @param NONE
     * @return double RADIUS
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method: get COLOR
     * @param NONE
     * @return Color COLOR
    */
    public Color getColor() {
        return color;
    }

    /**
     * Method: Get Area, references calculateArea
     * @param NONE
     * @return double AREA
     */
    public double getArea() {
        calculateArea();
        return area;
    }
    /**
     * Method: calculate area
     * @param NONE
     * @return void
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
