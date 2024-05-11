import java.util.Scanner;

public class ElectronicStoreTester {
    public static void main(String[] args) {

        //Creating instance of ElectronicStore
        ElectronicStore store = new ElectronicStore();

        //Calling the printStock() method from the ElectronicStore class to print the stock of the store
        store.printStock();

        //Creating scanner in object to intake inputs from the user regarding searches
        Scanner input = new Scanner(System.in);

        //While loop to loop until user enters "quit" to terminate the program
        while (true) {
            System.out.print("Enter item to search for (quit to end): ");
            String searchTerm = input.nextLine();
            //If user inputs "quit" break loop
            if (searchTerm.equals("quit")) {
                break;
            }
            //Call the searchStock method to search for the item
            String result = String.valueOf(store.searchStock(searchTerm));

            //If item not found, print "false"
            if (result.equals("Item not found")) {
                System.out.println(result);
            } else {
                //If item found, print "true"
                System.out.println("Item found: " + result);
            }
        }
        //Closing Scanner object
        input.close();
    }
}
