import java.util.*;

public class TrainAppUC6 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================\n");


        Map<String, Integer> capacityMap = new HashMap<>();


        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);


        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}