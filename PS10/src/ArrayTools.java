public class ArrayTools {

    public static int printAll (String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
        return array.length;
    }

    public static void copy (String[] arr1, String[] arr2) {
        if (arr1.length > arr2.length) {
            System.out.println("Error: Second array isn't big enough." +
                    "\nFirst array size: " + arr1.length +
                    "\nSecond array size: " + arr2.length);
        } else {
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
        }
    }

    public static void filter (String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5) {
                array[i] = array[i].toUpperCase() + " <-- Longer than five letters";
            }
        }
    }

}
