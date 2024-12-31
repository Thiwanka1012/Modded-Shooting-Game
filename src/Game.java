class Soldier {
    private int id;
    private String name;


    public Soldier() {
    }

    public Soldier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Gun{
    public void fire(){
        System.out.println("Gun");
    }

}

class Ak47 extends Gun implements Reload{
    public void fire(){
        System.out.println("AK47");
    }

    public void shoot(Gun gun,Soldier soldier){
        gun.fire();
        System.out.println("Soldier ID:"+soldier.getId());
        System.out.println("Soldier Name:"+soldier.getName());

    }

    @Override
    public void gunReload() {
        System.out.println("Reloaded.......");;
    }
}

class MG3 extends Gun implements Reload{
    public void fire(){
        System.out.println("MG3");
    }
    public void shoot(Gun gun,Soldier soldier){
        gun.fire();
        System.out.println("Soldier ID:"+soldier.getId());
        System.out.println("Soldier Name:"+soldier.getName());

    }

    @Override
    public void gunReload() {
        System.out.println("Realoaded........");
    }
}

interface Reload{
    public void gunReload();

}

public class Game {
    public static void main(String[] args) {
        Soldier s1=new Soldier(1,"Soap");
        Soldier s2=new Soldier(2,"Ghost");

        Ak47 ak47=new Ak47();
        MG3 mg3=new MG3();

        ak47.shoot(ak47,s1);
        ak47.gunReload();
        System.out.println("=========================================");
        mg3.shoot(mg3,s2);
        mg3.gunReload();
    }
}
