import java.util.*;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================\n");


        Set<String> bogies = new HashSet<>();


        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");


        bogies.add("BG101");
        bogies.add("BG102");


        System.out.println("Bogie IDs (duplicates removed automatically):");
        System.out.println(bogies);
    }
}