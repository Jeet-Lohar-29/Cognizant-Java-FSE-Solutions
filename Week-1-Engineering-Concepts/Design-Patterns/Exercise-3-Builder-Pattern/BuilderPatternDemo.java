/**
 * Demonstrates the Builder Pattern.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard("NVIDIA RTX 4060")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8 GB")
                .setStorage("512 GB SSD")
                .build();

        System.out.println("Gaming PC");
        gamingPC.showConfiguration();

        System.out.println();

        System.out.println("Office PC");
        officePC.showConfiguration();
    }
}