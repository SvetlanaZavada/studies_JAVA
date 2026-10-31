package lesson_2;

public class Park {

    static class Attraction {
       private String name;
       private String workingTime;
       private int price;

       public Attraction (String name, String workingTime, int price){
           this.name = name;
           this.workingTime = workingTime;
           this.price = price;
       }
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("workingTime: " + workingTime);
            System.out.println("price: " + price);
            System.out.println();
       }
    }
    public static void main(String[] args){
        Attraction[] attractions = new Attraction[3];

        attractions[0] = new Attraction("Колесо обозрения", "10:00–22:00", 350);
        attractions[1] = new Attraction("Американские горки", "11:00–21:00", 500);
        attractions[2] = new Attraction("Комната страха", "12:00–20:00", 250);

        for (Attraction attraction : attractions) {
            attraction.printInfo();
    }
    }
}

//Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.