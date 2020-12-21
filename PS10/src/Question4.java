public class Question4 {

    public static void main (String[] args) {
       if (args.length == 0) {
           System.out.println("Nothing to say?");
       } else {
           for (int i = 0; i < args.length; i++) {
               args[i] = args[i].toLowerCase();
           }

           int favorite = -1;
           boolean are = false;
           boolean feeling = false;

           for (int i = 0; i < args.length; i++) {
               if (are && args[i].contains("you")) {
                   feeling = true;
               }

               if (args[i].contains("favorite")) {
                   favorite = i;
               }
               if (args[i].contains("are")) {
                   are = true;
               }
           }

           if (favorite >= 0) {
               System.out.println(args[favorite + 1] + " I'm only interested in transistors.");
           } else if (feeling) {
               System.out.println("Fine, but could use some more power.");
           } else {
               System.out.println("I didn't understand that.");
           }

       }
    }

}
