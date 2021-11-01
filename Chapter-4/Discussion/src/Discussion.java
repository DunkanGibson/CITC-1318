public class Discussion {

        public static void main(String[] args) {

            int a = 5, b = 10, c = 11;

            System.out.println("This program works with operators.");

            if (a < 10 ^ b == 10)

                System.out.println("Java ");

            if (divisible(b, a) | divisible(c, a))

                System.out.println("Programming ");

            if (a + b - (++c) == c - (b--) + 1)

                System.out.println("CITC ");

            if (divisible(c, a) && divisible(++b, a))

                System.out.println("OCA");

        }

        public static boolean divisible(int a, int b) {

            if (a % b == 0) {

                System.out.println(a + " is evenly divisible by " + b);

                return true;

            }

            else {

                System.out.println(a + " is not evenly divisible by " + b);

                return false;

            }

        }

    }

