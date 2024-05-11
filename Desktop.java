public class Desktop {

    //Declaring private instance variables to store cpu speed, ram (GB), storage (GB), Whether SSD or HHD
    private double cpuSpeed;
    private int ram;
    private int storage;
    private boolean isSSD;

    // Constructor to initialize instance variables of Desktop Class
    public Desktop(double cpuSpeed, int ram, int storage, boolean isSSD) {
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.isSSD = isSSD;
    }
    //toString to format string output to meet our requirements & returns a string with specifications of desktop object
    public String toString() {
        return "Desktop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + (isSSD ? "SSD" : "HDD") + " drive.";
    }
}