package task7;

public class SmallDog extends Dog{
    public SmallDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Voice() {
        System.out.println("Gav");
    }
}
