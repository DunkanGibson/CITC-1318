package package1;

public abstract class Beverage {

      private int ounces;

      private double price;
//This constructor needs to have the protected access control level so that the subclass in the other package can access it.
     protected Beverage(int ounces, double price) {

            this.ounces = ounces;

            this.price = price;

      }

      public int getOunces() { return ounces; }

      public double getPrice() { return price; }

      public abstract String drink();

}