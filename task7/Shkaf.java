package task7;

public class Shkaf extends Furniture{
    public Shkaf(String name, double price) {
        super(name, price);
    }

    public void Open(){
        System.out.println(name + "was opened");
    }

    public void Close(){
        System.out.println(name + "was closed");
    }
}
