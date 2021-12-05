package task7;

public class BigDog extends Dog{
    public BigDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Voice() {
        System.out.println("Bolshoy Gav");
    }
}
