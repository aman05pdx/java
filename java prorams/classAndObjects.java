class brawlers{
    String name;
    int damage;
    int speed;
    String gears;
    String Starpower;
    public void display(){
        System.out.println("Brawler name:"+name);
        System.out.println("Brawler damage:"+damage);
        System.out.println("Brawler speed:"+speed);
        System.out.println("Brawler gears:"+gears);
        System.out.println("Brawler starpower:"+Starpower);
        System.out.println("*************************************************");
    }
    public String getname(){
        return name;
    }
}

public class classAndObjects {
    public static void main(String[] args) {
        System.out.println("Creating custom classes!");
        //creating objects for brawlers class
        brawlers colt= new brawlers();
        colt.name="Damage dealer colt";
        colt.damage=560;
        colt.speed=2;
        colt.gears="double magnum";
        colt.Starpower="sneaky boots";
        colt.display();

        brawlers amber= new brawlers();
        amber.name="fire breather amber";
        amber.damage=600;
        amber.speed=3;
        amber.gears="scorching fire";
        amber.Starpower="double puddle";
        amber.display();

        System.out.println(amber.getname());
        System.out.println(colt.getname());
    }
}
