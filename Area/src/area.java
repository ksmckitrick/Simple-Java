
public class area {

	public static void main(String[] args) {
		
	}

    double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getArea(int length, int width) {
        return length * width;
    }

    public static double getArea(double radius, double height) {
        return Math.PI * radius * radius * height;
	}
}