public class Area {
    double length;
    double breadth;
    double radius;
    double area;
    public double Square(double length)
    {
        this.length = length;
        this.area = length * length;
        return(area);

    }
    public double Circle(double radius)
    {
        this.radius= radius;
        this.area = Math.PI*(radius*radius);
        return(area);
    }
    public double Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
        this.area=  length * breadth;
        return (area);
    }
}
