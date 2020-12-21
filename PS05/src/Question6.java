public class Question6 {

    public static void main (String[] args) {
        for (int i = 99; i > 2; i--) {
            System.out.println(i + " bottles of Pepsi on the wall, " + i + " bottles of Pepsi.");
            System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of Pepsi on the wall.");
        }
        System.out.println("2 bottles of Pepsi on the wall, 2 bottles of Pepsi.\n" +
                "Take one down, pass it around, 1 bottle of Pepsi on the wall.\n" +
                "1 bottle of Pepsi on the wall, 1 bottle of Pepsi.\n" +
                "Take one down, pass it around, 0 bottles of Pepsi on the wall.");
    }

}
