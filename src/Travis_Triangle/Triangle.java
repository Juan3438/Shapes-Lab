package Travis_Triangle;


import javafx.scene.shape.Shape;

public class ETriangle extends Shape
{


    private int side;
    public ETriangle(int side)
    {
        super(ETriangle);
        this.side = side;
    }
    public double getArea()
    {
        return ((3 * (side * side))/16);
    }
    public double perimeter()
    {
        return (3 * side);
    }
}
