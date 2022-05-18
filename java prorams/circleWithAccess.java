class circle {
    // we can only access private property with the help of the public method that
    // are created inside the same class.
    private double radius;

    // setters
    public void setRadius(float n) {
        radius = n;
    }

    // getters
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class circleWithAccess {
    public static void main(String[] args) {
        // object creation for class circle.
        circle c1 = new circle();
        c1.setRadius(5);
        System.out.println(c1.getArea() + " cm^2");
        System.out.println(c1.getCircumference() + " meter");
        System.out.println(c1.getClass()); // tells you about the class of respective object.
    }
}
