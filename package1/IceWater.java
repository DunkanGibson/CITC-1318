package package1;

//Not an interface this is a Abstract class
public class IceWater extends Beverage {

      public IceWater(int ounces, double price) {

            super(ounces, price);

      }

      public String drink() {

            return "This ice water is cool and refreshing.";

      }

}