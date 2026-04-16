import java.util.*;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogies:");
        System.out.println(Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("Sorted Bogies:");
        System.out.println(Arrays.toString(bogies));
    }
}