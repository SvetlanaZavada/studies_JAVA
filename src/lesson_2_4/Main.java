package lesson_2_4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog1 = new Dog("Шарик", 300, 50);
        Dog dog2 = new Dog("Матроскин", 800, 5);
        Cat[] cats = {
                new Cat("Барсик", 30),
                new Cat("Мурзик", 100),
                new Cat("Рыжик", 200),
                new Cat("Снежок", 300)
        };

        int animalCount = Animal.getAnimalCount();
        System.out.println("Животных создано " + animalCount);
        int catCount = Cat.getCatCount();
        System.out.println("Котов создано: " + catCount);
        int dogCount = Dog.getDogCount();
        System.out.println("Собак создано: " + dogCount);

        animal.run();
        dog2.run();
        cats[0].run();
        cats[2].run();
        cats[3].run();
        animal.swim();
        dog1.swim();
        cats[1].swim();

        Bowl bowl = new Bowl(10);

        cats[0].eat(bowl, 3);
        cats[1].eat(bowl, 5);
        cats[2].eat(bowl, 4);
        cats[3].eat(bowl, 1);
    }
}