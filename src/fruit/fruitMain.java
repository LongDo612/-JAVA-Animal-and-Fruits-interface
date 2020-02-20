package fruit;

public class fruitMain {
    public static void main(String[] args) {
        Fruit[] f = new Fruit[2];
        f[0] = new Apple();
        f[1] = new Orange();

        for (Fruit fruit:f) {
            System.out.println(fruit.howToEat());
        }
    }
}
