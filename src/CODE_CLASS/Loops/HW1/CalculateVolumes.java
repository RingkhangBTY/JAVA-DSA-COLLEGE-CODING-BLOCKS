package CODE_CLASS.Loops.HW1;

// Calculate the volume of - cone, sphere, cylinder, hemisphere.
public class CalculateVolumes {
    public static void main(String[] args) {
        double r = 7;
        double h = 9;

        System.out.println("Volume of Cone: " + volumeOfCone(r, h));
        System.out.println("Volume of Sphere: " + volumeOfSphere(r));
        System.out.println("Volume of Cylinder: " + volumeOfCylinder(r, h));
        System.out.println("Volume of Hemisphere: " + volumeOfHemisphere(r));
    }

    // Volume of Cone
    public static double volumeOfCone(double radius, double height) {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    // Volume of Sphere
    public static double volumeOfSphere(double radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    // Volume of Cylinder
    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Volume of Hemisphere
    public static double volumeOfHemisphere(double radius) {
        return (2.0 / 3) * Math.PI * radius * radius * radius;
    }
}
