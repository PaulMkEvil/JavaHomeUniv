package task7;

public class Divan extends Furniture{
    public Divan(String name, double price) {
        super(name, price);
    }

    public void Razlozhit(){
        System.out.println(name + "was razlozhit");
    }

    public void Slozhit(){
        System.out.println(name + "was slozhit");
    }
}
