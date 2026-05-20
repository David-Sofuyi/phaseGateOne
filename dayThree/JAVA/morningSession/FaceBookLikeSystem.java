import java.util.ArrayList;

public class FaceBookLikeSystem {

    public static void main(String[] args) {
        System.out.println(getLikes(new String[] {}));
        System.out.println(getLikes(new String[] {"Peter"}));
        System.out.println(getLikes(new String[] {"Jacob", "Alex"}));
        System.out.println(getLikes(new String[] {"Max", "John", "Mark"}));
        System.out.println(getLikes(new String[] {"Alex", "Jacob", "Mark", "Max"}));
    }

    public static String getLikes(String[] names) {
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}
