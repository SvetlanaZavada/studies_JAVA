package lesson_2_4;

public class Dog extends Animal{
    String name;
    int distanceRun;
    int distSwim;
    private static int dogCount = 0;
    public Dog (String name, int distanceRun, int distSwim){
        super();
        this.name = name;
        this.distanceRun = distanceRun;
        this.distSwim = distSwim;
        dogCount++;
    }
    public static int getDogCount() { return dogCount; }

    @Override
    public void run(){
      if (distanceRun <= 500 && distanceRun > 0){
          System.out.println("собака " + name + "пробежала " + distanceRun + " метров");
      } else {
          System.out.println("собака  не может столько пробежать" );
      }
    }
    @Override
    public void swim(){
        if(distSwim <=10 && distSwim >0){
            System.out.println("собака " + name + " проплыла " + distSwim + " метров");
        } else {
            System.out.println("собака  не может столько проплыть" );
        }
    }
}
