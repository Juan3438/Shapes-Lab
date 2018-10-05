public class Rectangle extends Shape
{
    private int length;
    private int width;
    public Rectangle(int length, int width, String type)
    {
        super(type);
        this.length = length;
        this.width = width;

    }
    public double getArea()
    {
        return length * width;
    }
    public double getPerimeter()
    {
        return (2*length) + (2 * width);
    }
}
