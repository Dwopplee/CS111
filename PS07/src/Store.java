public class Store {

    public static double calculateRetail(double wholesale, double markup) {
        return wholesale * (1.0 + markup / 100.0);
    }

}
