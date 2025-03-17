public class Tomato {
    String color;
    String size; 
    boolean isRotten;
    double weight; 
    String brand;

    // Constructor 1: No-argument constructor
    public Tomato() {
        this("Red", "Medium", false, 100.0, "Generic"); 
    }

    // Constructor 2: With one parameter
    public Tomato(String color) {
        this(color, "Medium", false, 100.0, "Generic");
    }

    // Constructor 3:  With two parameters
    public Tomato(String color, String size) {
        this(color, size, false, 100.0, "Generic");
    }

    // Constructor 4: With three parameters
    public Tomato(String color, String size, boolean isRotten) {
        this(color, size, isRotten, 100.0, "Generic");
    }

    // Constructor 5: With four parameters
    public Tomato(String color, String size, boolean isRotten, double weight) {
        this(color, size, isRotten, weight, "Generic");
    }

    // Constructor 6: With all parameters 
    public Tomato(String color, String size, boolean isRotten, double weight, String brand) {
        this.color = color;
        this.size = size;
        this.isRotten = isRotten;
        this.weight = weight;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Is Rotten: " + (isRotten ? "Yes" : "No"));
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}