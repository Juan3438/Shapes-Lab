import java.awt.Shape;

import static javafx.scene.input.KeyCode.R;

public abstract class Circle extends Shape {
    private double radius;
    private double pi = Math.PI;

    public Circle(int radius){
        super(Circle);
        this.radius = radius;

    }
    public double getArea(){
        return (radius*radius*pi);
    }
    public double getPerimeter(){
        return(2*pi*radius);
    }
}
