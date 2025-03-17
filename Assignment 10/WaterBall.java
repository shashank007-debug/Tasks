public class WaterBall {
    String color;
    String size; 
    boolean isFilled;
    double capacity; 
    String brand;

    // Constructor 1: No-argument constructor
    public WaterBall() {
        this("Blue", "Medium", false, 200.0, "Generic"); 
    }

    // Constructor 2: With one parameter
    public WaterBall(String color) {
        this(color, "Medium", false, 200.0, "Generic");
    }

    // Constructor 3:  With two parameters
    public WaterBall(String color, String size) {
        this(color, size, false, 200.0, "Generic");
    }

    // Constructor 4: With three parameters
    public WaterBall(String color, String size, boolean isFilled) {
        this(color, size, isFilled, 200.0, "Generic");
    }

    // Constructor 5: With four parameters
    public WaterBall(String color, String size, boolean isFilled, double capacity) {
        this(color, size, isFilled, capacity, "Generic");
    }

    // Constructor 6: With all parameters 
    public WaterBall(String color, String size, boolean isFilled, double capacity, String brand) {
        this.color = color;
        this.size = size;
        this.isFilled = isFilled;
        this.capacity = capacity;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Is Filled: " + (isFilled ? "Yes" : "No"));
        System.out.println("Capacity: " + capacity + " ml");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}