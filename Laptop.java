public class Laptop {

    //Declaring private instance variables to store cpu speed, ram (GB), storage (GB), Whether SSD or HHD, screen size of laptop in inches
    private double cpuSpeed;
    private int ram;
    private int storage;
    private boolean isSSD;
    private int screenSize;

    //Constructor to initialize instance variables of Desktop Class
    public Laptop(double cpuSpeed, int ram, int storage, boolean isSSD, int screenSize) {
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.isSSD = isSSD;
        this.screenSize = screenSize;
    }
    //toString to format string output to meet our requirements & returns a string with specifications of laptop object
    public String toString() {
        return screenSize + "\" Laptop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + (isSSD ? "SSD" : "HDD") + " drive.";
    }
}
