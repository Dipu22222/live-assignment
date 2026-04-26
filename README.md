# live-assignment
<br> Name : Dipu Mondol<br>
ID: IT24040<br><br>
# Vehicle Java Program

A simple Java program that creates vehicles from command-line arguments and prints their details.

---

## Files

- `vehicle.java` — The vehicle class
- `IT24040.java` — The main class

---

## Code

### vehicle.java

```java
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
```

### IT24040.java

```java
// Main class
public class IT24040 {
    // Main method - program starts here
    public static void main(String[] args) {
        // Loop through args two at a time (brand, color pairs)
        for (int i = 0; i < args.length; i += 2) {
            // Create a vehicle with brand and color from arguments
            vehicle v = new vehicle(args[i], args[i + 1]);
            // Start the vehicle
            v.start();
        }
    }
}
```

---

## How to Run

### Step 1 - Compile
```
javac vehicle.java IT24040.java
```

### Step 2 - Run
```
java IT24040 ferari red bhugati blue
```

---

## Output

```
Vehicle brand: ferari
Vehicle color: red
Vehicle is starting....
Vehicle brand: bhugati
Vehicle color: blue
Vehicle is starting....
```

---

## How it works

- You pass brand and color pairs as arguments
- Every two arguments = one vehicle
- The program creates each vehicle and prints its details
