class cylinder{
    private int radius;
    private int height;

    cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height=h;
    }

    public void volume(){
        System.out.println(3.14*radius*radius*height +" cm^3");
    }
}
public class practice_set_accessModifiers {
    public static void main(String[] args) {
        cylinder c1= new cylinder(10, 20);
        c1.volume();
    }
}
