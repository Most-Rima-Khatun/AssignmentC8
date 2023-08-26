package Problem7;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class GeometryRunner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();

        System.out.println("Enter a height:");
        double height = input.nextDouble();

        //sphere
        Sphere  sphere = new Sphere(radius);
        Cone cone = new Cone(radius,height);
        Cube cube = new Cube(height);
        Cylinder cylinder = new Cylinder(height,radius);
        //cube 20.2,14.2
        System.out.printf("Volume of Cube: %20.2f\n",cube.getVolume());
        System.out.printf("SurfaceArea of Cube: %14.2f\n",cube.getSurfaceArea());

        //sphere 18.2,12.2
        System.out.printf("Volume of Sphere: %18.2f\n",sphere.getVolume());
        System.out.printf("SurfaceArea of Sphere: %12.2f\n",sphere.getSurfaceArea());

        //cylinder 16.2,10.2
        System.out.printf("Volume of Cylinder: %16.2f\n",cylinder.getVolume());
        System.out.printf("SurfaceArea of Cylinder: %10.2f\n",cylinder.getSurfaceArea());

        //cone 20.2,14.2
    }
}