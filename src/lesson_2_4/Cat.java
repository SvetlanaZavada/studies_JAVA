package lesson_2_4;

public class Cat extends Animal {
    String name;
    int distanceRun;
    private static int catCount;
    private boolean satiety = false;
    public Cat (String name, int distanceRun){
        super();
        this.name = name;
        this.distanceRun = distanceRun;
        catCount++;
    }
    public static int getCatCount() { return catCount; }

    @Override
    public void run(){
        if (distanceRun <= 200 && distanceRun > 0){
            System.out.println("кот " + name + " пробежал " + distanceRun + " метров");
        } else {
            System.out.println("кот не может столько пробежать" );
        }
    }
    @Override
    public void swim(){
        System.out.println("кот не умеет плавать" );
        }

    public void eat(Bowl bowl, int amount) {
        if (!satiety) {
            if (bowl.takeFood(amount)) {
                satiety = true;
                System.out.println(name + " поел " + amount + " ед. и насытился.");
            } else {
                System.out.println(name + " хотел " + amount +
                        " ед., но в миске только " + bowl.getFood() + " — остался голодным.");
            }
        } else {
            System.out.println(name + " уже сыт.");
        }
    }
}
