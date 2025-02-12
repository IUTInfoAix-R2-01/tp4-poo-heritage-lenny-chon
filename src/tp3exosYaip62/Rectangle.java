package tp3exosYaip62;

public abstract class Rectangle extends GeometricObject {
	private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle[width=" + width + "length=" + length + "]";
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
