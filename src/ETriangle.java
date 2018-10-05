public class ETriangle extends Shape
{


    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    public double getArea()
    {
        return ((3 * (side * side))/16);
    }
    public double getPerimeter()
    {
        return (3 * side);
    }
}
