public class ParsingUtils {

    public static void changeLetter(StringBuilder sb, char letter) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == letter) {
                sb.setCharAt(i, Character.toUpperCase(letter));
            }
        }
    }

    public static void changeLetter(StringBuilder sb, String letters) {
        for (int i = 0; i < letters.length(); i++) {
            changeLetter(sb, letters.charAt(i));
        }
    }

}
