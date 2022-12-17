package carpetCalculator;

public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "RoomDimension [length=" + length + ", width=" + width + "]";
    }

}

