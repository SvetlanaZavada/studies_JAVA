package lesson_2;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOrigin;
    private int price;
    private boolean reservationStatus;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOrigin, int price, boolean reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("productionDate: " + productionDate);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("country_origin: " + countryOrigin);
        System.out.println("price: " + price);
        System.out.println("reservation_status: " + reservationStatus);
        System.out.println();


    }
}

