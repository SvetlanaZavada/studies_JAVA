package lesson_2_4;

public class Animal {
    private static int animalCount = 0;
    protected Animal() {
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(){
        System.out.println("животное может бежать" );
    }

    public void swim(){
        System.out.println("животное может плавать");
    }

}
