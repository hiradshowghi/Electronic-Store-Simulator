public class Fridge {

    //Declaring private instance variables to store size of fridge (cubic feet), whether it has a freezer or not, and the colour of fridge
    private double size;
    private boolean hasFreezer;
    private String color;

    //Constructor to initialize instance variables of Fridge Class
    public Fridge(double size, boolean hasFreezer, String color) {
        this.size = size;
        this.hasFreezer = hasFreezer;
        this.color = color;
    }

    //toString to format string output to meet our requirements & returns a string with specifications of fridge object
    public String toString() {
        return size + " cubic foot Fridge" + (hasFreezer ? " with Freezer" : "") + " (" + color + ")";
    }
}