import Travis_Triangle.ETriangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public abstract class Shape
{
    private String type;
    public Shape(String type)
    {
        this.type = type;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString()
    {
        return "I am a " + type + ".";
    };
}
public class runner
{
    public static void main (String[] args)
    {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape[] shapes = {shape1, shape2, shape3};

        for (Shape cur: shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My perimeter is: " + cur.getPerimeter());
        }
    }
}
