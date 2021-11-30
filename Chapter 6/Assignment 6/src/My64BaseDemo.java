import java.util.*;
import java.util.Base64;

public class My64BaseDemo {
    public static void main(String[] args){


        My64Base mc1 = new My64Base();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the message: ");

        String en = scanner.nextLine();

        en = en.toLowerCase();

        en = en.replaceAll("\\s", "");

        String s1 = mc1.doEncoding(en);

        System.out.println("The encoded string is: " + s1);

        String s2 = mc1.doDecoding(s1);

        System.out.println("The decoded string is: " + s2);
    }
}
