package cs1302.shapes;

/**
 * A circle is 
 */
public class Circle extends Ellipse {

    public Circle(int radius) {

    } // Circle
    
    @Override
    public double getPerimeter() {
	return getCircumference();
    } // getPerimeter

    public double getCircumference() {
	return Math.PI * getDiameter();
    } // getCircumference

    public double getDiameter() {
	return 2.0 * getRadius();
    } // getDiameter
    
    public double getRadius() {
	return getSemiMajorAxisLength();
    } // getRadius
    
} // Circle

