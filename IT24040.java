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