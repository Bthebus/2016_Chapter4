package za.ac.cput.geometricshape.AppConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.geometricshape.GeometricShape;
import za.ac.cput.geometricshape.ShapeImplementation.Circle;
import za.ac.cput.geometricshape.ShapeImplementation.Rectangle;
import za.ac.cput.geometricshape.ShapeImplementation.Square;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
@Configuration
public class AppConfig {

    @Bean(name="circle")
    public Circle getCircle()
    {
        return new Circle(5);
    }

    @Bean(name="rectangle")
    public Rectangle getRectangle()
    {
        return new Rectangle(7,5);
    }

    @Bean(name = "Square")
    public Square getSquare()
    {
        return new Square(5,5);
    }

}
