package circle_cylinder;

public class Cylinder extends Circlee{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric() {
        return height * Math.pow(super.getRadius(), 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Lop Cylinder co height la`: " + height + " co radius la`: " + super.getRadius() + " va` co color la`: " + super.getColor();
    }
}
