package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Cuc-cu, cuc-cu";
    }

    @Override
    public String howToEat() {
        return "Rice please!";
    }
}
