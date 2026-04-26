// A class that represents a vehicle
public class vehicle {
    // Vehicle brand name (e.g., "Toyota", "Ford")
    private String brand;
    // Vehicle color (e.g., "Red", "Blue")
    private String color;
    // Constructor - sets the brand and color when creating a vehicle
    public vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    // Starts the vehicle and shows its details
    public void start() {
        System.out.println("Vehicle brand: " + brand);  // print brand
        System.out.println("Vehicle color: " + color);  // print color
        System.out.println("Vehicle is starting....");  // print status
    }
}