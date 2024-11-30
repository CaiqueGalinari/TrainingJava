import org.w3c.dom.ls.LSOutput;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static String whoLikesIt(String... names) {
        //I already made that in C, so I'll try to use switch case now, since I made with If-else
        switch(names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return (names[0] + " likes this");
            case 2:
                return (names[0] + " and " + names[1] + " like this");
            case 3:
                return (names[0] + ", " + names[1] + " and " + names[2] + " like this");
            default:
                return (names[0] + ", " + names[1] + " and " + (names.length - 2) + " like this");
        }
    } //25/11/24 - "Like System" //// used: switch case


}