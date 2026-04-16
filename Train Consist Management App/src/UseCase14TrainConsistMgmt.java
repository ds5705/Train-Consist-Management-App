import java.util.*;

public class UseCase14TrainConsistMgmt {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie created with capacity: " + b1.capacity);

            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Bogie created with capacity: " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}