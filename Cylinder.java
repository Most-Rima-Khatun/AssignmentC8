package Problem7;

public class Cylinder
{
    private  double height , radius ;

    public Cylinder(double height,double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    public double getValume()
    {
        double volume = Math.PI * height * Math.pow(radius,2);
        return volume;
    }
    public double getSurfaceArea()
    {
        double surfaceArea = (2 * Math.PI * radius * height) + ( 2 * Math.PI * Math.pow(radius,2));
        return surfaceArea;
    }
}
