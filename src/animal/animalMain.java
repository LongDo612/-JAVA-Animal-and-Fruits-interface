package animal;

import edible.Edible;

public class animalMain {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal a:animal) {
            System.out.println(a.makeSound());

        if (a instanceof Chicken){
            Edible edible = (Chicken) a;
            System.out.println(edible.howToEat());
        }
        else if (a instanceof Tiger){
            Edible edible = (Tiger) a;
            System.out.println(edible.howToEat());
        }
        }
    }
}
