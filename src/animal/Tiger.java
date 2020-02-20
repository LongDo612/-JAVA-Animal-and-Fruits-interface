package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gru-gru, ahu, ahu";
    }

    @Override
    public String howToEat() {
        return "Fresh meat";
    }
}
