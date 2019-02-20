package cuj.anything.zte.animal;

/**
 * Created by cujamin on 2018/3/24.
 */
public class App {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.eat();
        dog.eat();
        Dog upperCastdog = new Dog();
        Animal animal = (Animal)upperCastdog;
        animal.eat();
    }
}
