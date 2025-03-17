public class Gun {
    String color;
    String type; 
    boolean isAutomatic;
    int capacity; 
    String brand;

    // Constructor 1: No-argument constructor
    public Gun() {
        this("Black", "Pistol", false, 10, "Generic"); 
    }

    // Constructor 2: With one parameter
    public Gun(String color) {
        this(color, "Pistol", false, 10, "Generic");
    }

    // Constructor 3:  With two parameters
    public Gun(String color, String type) {
        this(color, type, false, 10, "Generic");
    }

    // Constructor 4: With three parameters
    public Gun(String color, String type, boolean isAutomatic) {
        this(color, type, isAutomatic, 10, "Generic");
    }

    // Constructor 5: With four parameters
    public Gun(String color, String type, boolean isAutomatic, int capacity) {
        this(color, type, isAutomatic, capacity, "Generic");
    }

    // Constructor 6: With all parameters 
    public Gun(String color, String type, boolean isAutomatic, int capacity, String brand) {
        this.color = color;
        this.type = type;
        this.isAutomatic = isAutomatic;
        this.capacity = capacity;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Is Automatic: " + (isAutomatic ? "Yes" : "No"));
        System.out.println("Capacity: " + capacity + " shots");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}