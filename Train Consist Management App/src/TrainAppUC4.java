import java.util.*;

public class TrainAppUC4 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");


        List<String> trainConsist = new LinkedList<>();


        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);


        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry at position 2:");
        System.out.println(trainConsist);


        trainConsist.remove(0); // remove first
        trainConsist.remove(trainConsist.size() - 1); // remove last

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}