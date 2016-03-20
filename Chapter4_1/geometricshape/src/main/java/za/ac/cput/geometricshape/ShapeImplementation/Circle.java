package za.ac.cput.geometricshape.ShapeImplementation;

import za.ac.cput.geometricshape.GeometricShape;

import static java.lang.Math.pow;
import static java.lang.Math.round;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class Circle extends Geometric implements GeometricShape {

    private final double PI = 3.14;
    private final String NAME="Circle";
    private final double RADIUS;

    public Circle(double radius) {
        super();
        this.RADIUS = radius;
    }

    public double getDiamter() {
        return RADIUS*RADIUS;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return PI*pow(RADIUS, 2);
    }

    @Override
    public double getPerimeter() {
        double x = PI*RADIUS;
        return x;

    }
}
