package cs1302.shapes;

/**
 * An ellipse is a shape comprising of a curve in a plane surrounding two focal points such that 
 * the sum of the distances to the two focal points is constant for every point on the curve. The 
 * line through the focal points is called the major axis, and the line perpendicular to it through
 * the center is called the minor axis. If you halve each of these lengths, then are known as the 
 * semi-major axis and semi-minor axis, respectively.
 * 
 * @see https://en.wikipedia.org/wiki/Ellipse
 * @see http://mathworld.wolfram.com/Ellipse.html
 */
public class Ellipse extends Shape {

    /** Length of the semi-major axis. */
    private double a;

    /** Length of the semi-minor axis. */
    private double b;

    public double getSemiMajorAxisLength() {
	return a;
    } // getSemiMajorAxisLength

    public double getSemiMinorAxisLength() {
	return b;
    } // getSemiMinorAxisLength
    
    @Override
    public double getArea() {
	return Math.PI * a * b;
    } // getArea()

    /**
     * Return an approximation of the perimeter, computed using a Ramanujan approximation.
     */
    @Override
    public double getPerimeter() {
	double h = ((a - b) * (a - b)) / ((a + b) * (a + b));
	double p = Math.PI * (a + b) * (1.0 + ((3.0 * h) / (10 + Math.sqrt(4.0 - 3.0 * h))));
	return p;
    } // getPerimeter

    
} // Ellipse

