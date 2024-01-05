import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String sep = "==========================";
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Hippo");
        animals.add("Cheetah");
        animals.add("Elephant");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        for(String value : animals) {
            System.out.println(value + " ##");
        }
        System.out.println(sep);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(new Vehicle("Toyoda", "Cemrey", 15000, false));
    }
}
