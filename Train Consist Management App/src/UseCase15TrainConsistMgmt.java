import java.util.*;

public class UseCase15TrainConsistMgmt {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");
    }
}