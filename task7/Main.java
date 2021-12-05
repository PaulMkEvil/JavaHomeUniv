package task7;

public class Main {

    public static void main(String[] args)
    {
        Bowl bowl = new Bowl(500, "Ceramic");
        System.out.println(bowl.toString());
        Glass glass = new Glass(1000, "Glass");
        System.out.println(glass.toString());

        SmallDog smallDog = new SmallDog("bbb", 10);
        System.out.println(smallDog.toString());
        smallDog.Voice();

        BigDog bigDog = new BigDog("ccc", 12);
        System.out.println(bigDog.toString());
        bigDog.Voice();

        FurnitureShop furnitureShop = new FurnitureShop();
        Divan divan1 = new Divan("Mayami", 1000);
        Divan divan2 = new Divan("Mayami", 2000);
        Shkaf shkaf1 = new Shkaf("ZZZ", 200);
        Shkaf shkaf2 = new Shkaf("YYY", 400);

        furnitureShop.Add(divan1);
        furnitureShop.Add(divan2);
        furnitureShop.Add(shkaf1);
        furnitureShop.Add(shkaf2);

        furnitureShop.PrintShop();
    }
}
