class Car {
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tata", "Nexon", 950000);
        Car c2 = new Car("Hyundai", "Creta", 1200000);
        Car c3 = new Car("Maruti", "Swift", 800000);

        System.out.println("=== Car Details ===");
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}