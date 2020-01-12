package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    static public void main (String... args) {
        ejemploBasico();
        System.out.println("----------------------------------------------");
        ejemploApiClass();
    }
    private static void ejemploApiClass (){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);

    }
    private static void ejemploBasico() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals, a -> ! a.isCanSwim());
        System.out.println();
        print(animals, (Animal a) ->  a.isCanSwim());
        System.out.println();
        print(animals, (Animal a) -> { return a.isCanSwim(); });
        System.out.println();
        print(animals, Animal::isCanSwim);
        System.out.println();
    }

    static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hooper, boolean swimmer) {
        species = speciesName;
        this.canSwim = swimmer;
        this.canHop = hooper;
    }

    public String toString() {
        return species;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
}
//
interface CheckTrait {
    boolean test(Animal a);
}
class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}