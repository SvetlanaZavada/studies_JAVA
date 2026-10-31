package lesson_2;

public class Products {
    static Product[] productsArray = new Product[5];
    public static void main(String[] args) {
        productsArray[0] = new Product("Apple Watch Series 10", "12.09.2024",
                "Apple Inc.", "USA", 4490, true);

        productsArray[1] = new Product("Samsung Galaxy Watch 7", "10.07.2024",
                "Samsung Corp.", "Korea", 3290, false);

        productsArray[2] = new Product("Garmin Forerunner 265", "15.03.2024",
                "Garmin Ltd.", "Switzerland", 4490, true);

        productsArray[3] = new Product("Xiaomi Smart Band 9 Pro", "20.10.2024",
                "Xiaomi Corp.", "China", 890, false);

        productsArray[4] = new Product("Huawei Watch GT 5", "19.09.2024",
                "Huawei Technologies", "China", 2490, true);

        for (Product product : productsArray) {
            product.printInfo();
        }

       }

}
