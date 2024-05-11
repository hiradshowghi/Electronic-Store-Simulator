public class ElectronicStore {

    //Declaring Instance variables:
    // Name of store
    // An array of Desktop objects representing the desktop products in the store.
    // An array of Laptop objects representing the laptop products in the store.
    // An array of Fridge objects representing the fridge products in the store.
    private String name;
    private Desktop[] desktops = new Desktop[3];
    private Laptop[] laptops = new Laptop[3];
    private Fridge[] fridges = new Fridge[3];

    //Constructor for ElectronicStore class
    //Initializes the private instance variables
    // Initialize the elements of the desktops, laptops, and fridges arrays
    public ElectronicStore() {
        this.name = name;
        desktops[0] = new Desktop(3.5, 8, 500, false);
        desktops[1] = new Desktop(3.0, 16, 250, true);
        desktops[2] = new Desktop(4.3, 32, 500, true);
        laptops[0] = new Laptop(3.1, 32, 500, true, 15);
        laptops[1] = new Laptop(2.5, 8, 250, false, 13);
        laptops[2] = new Laptop(3.0, 16, 250, true, 15);
        fridges[0] = new Fridge(15.6, true, "Gray");
        fridges[1] = new Fridge(10.5, false, "White");
        fridges[2] = new Fridge(16.5, true, "Black");
    }

    //printStock() method which prints the stock of the store
    public void printStock() {
        System.out.println("The store stock includes:");
        for (Desktop d : desktops) {
            System.out.println(d);
        }
        for (Laptop l : laptops) {
            System.out.println(l);
        }
        for (Fridge f : fridges) {
            System.out.println(f);
        }
    }

    //searchStock() method uses toLowerCase() to change case sensitivity to insensitive and checks if term is in our stock (true), otherwise if not in stock (false)
    public boolean searchStock(String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        for (Desktop d : desktops) {
            if (d.toString().toLowerCase().contains(searchTerm)) {
                return true;
            }
        }
        for (Laptop l : laptops) {
            if (l.toString().toLowerCase().contains(searchTerm)) {
                return true;
            }
        }
        for (Fridge f : fridges) {
            if (f.toString().toLowerCase().contains(searchTerm)) {
                return true;
            }
        }
        return false;
    }
}