package za.ac.cput.geometricshape.ShapeImplementation;

import za.ac.cput.geometricshape.GeometricShape;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class Square implements GeometricShape {

    private final String NAME = "Square";
    private final double WIDTH;
    private final double HEIGHT;



    public Square(double width, double height) {
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    public double getWIDTH()
    {
        return WIDTH;
    }

    public double getHEIGHT()
    {
        return HEIGHT;
    }
    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public double getArea() {
        return WIDTH*HEIGHT;
    }

    @Override
    public double getPerimeter() {
        return WIDTH+HEIGHT;
    }

}

