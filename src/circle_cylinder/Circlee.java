package circle_cylinder;

public class Circlee {
    private double radius;
    private String color;

    public Circlee(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Lop Circle co radius la` " + radius + " va` co color la`: " + color;
    }
}
