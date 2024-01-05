import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String sep = "==========================";
        List<String> animals = new LinkedList<String>();
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Hippo");
        animals.add("Cheetah");
        // animals.add("Elephant");
        // for (int i = 0; i < animals.size(); i++) {
        //     System.out.println(animals.get(i));
        // }
        // for (String value : animals) {
        //     System.out.println(value + " ##");
        // }
        System.out.println(sep);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(new Vehicle("Toyoda", "Cemrey", 15000, false));
        Vehicle vehicle2 = new Vehicle("Ford", "F-250", 22000, true);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 2500, true));

        vehicles.add(vehicle2);
        // for (Vehicle car : vehicles) {
        //     System.out.println(car);

        // }
        printList(vehicles);
        printList(animals);
    }

    public static void printList(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    };
}
