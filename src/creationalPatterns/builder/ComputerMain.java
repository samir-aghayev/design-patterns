package creationalPatterns.builder;

public class ComputerMain {


     static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .cpu("Intel i9")

                .gpu("RTX 4090")
                .ram("32GB")
                .hdd("1TB SSD")
                .monitor("Dell")
                .keyboard("Logitech")
                .mouse("Razer")
                .os("Windows 11")
                .build();

        Computer computer2 = new Computer.Builder()
                .cpu("Intel i5")
                .ram("16GB")
                .hdd("512GB SSD")
                .build();

        Computer computer3=new Computer.Builder()
                .cpu("AMD Ryzen 7")
                .gpu("RX 7800 XT")
                .ram("16GB")
                .hdd("1TB HDD")
                .monitor("ASUS")
                .keyboard("Corsair")
                .mouse("SteelSeries")
                .os("Linux")
                .build();
        System.out.println("Computer 1: " + computer1);
        System.out.println("Computer 2: " + computer2);
        System.out.println("Computer 3: " + computer3);
    }
}
