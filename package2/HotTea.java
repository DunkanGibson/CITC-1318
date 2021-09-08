package package2;

import package1.*;

//Not an interface this is a Abstract class
public class HotTea extends Beverage {

      public HotTea(int ounces, double price) {

            super(ounces, price);

      }

      public String drink() {

            return "This tea is hot and soothing.";

      }

}