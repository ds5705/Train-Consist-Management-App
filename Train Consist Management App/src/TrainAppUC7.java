import java.util.*;

public class TrainAppUC7 {


    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("====================================\n");


        List<Bogie> list = new ArrayList<>();


        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));


        System.out.println("Before Sorting:");
        for (Bogie b : list) {
            System.out.println(b);
        }


        list.sort(Comparator.comparingInt(b -> b.capacity));


        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : list) {
            System.out.println(b);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}
