class cylinder {
    private int radius;
    private int height;

    // constructor for cylinder
    cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void volume() {
        System.out.println(3.14 * radius * radius * height + " cm^3");
    }

    public void surfaceArea() {
        System.out.println(2 * 3.14 * radius * (radius + height));
    }
}

class rectangle {
    private int length;
    private int breadth;

    // constructor for rectangle
    rectangle() {
        this.length = 5;
        this.breadth = 10;
    }

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class practice_set_accessModifiers {
    public static void main(String[] args) {

        cylinder c1 = new cylinder(10, 20);
        System.out.println("the volume of cylinder: ");
        c1.volume();
        System.out.println("the surface area of cylinder:");
        c1.surfaceArea();

        rectangle rec=new rectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());

        rectangle box = new rectangle(10,20);
        System.out.println(box.getLength());
        System.out.println(box.getBreadth());
        // System.out.println("area of rectangle without any measure given");
        // System.out.println(rec.area());                                 //this will call default arguments.
        // System.out.println("area of rectangle after passing the arguments,.");
        // System.out.println(rec.area());                                 //this will call parameterized args

    }
}
