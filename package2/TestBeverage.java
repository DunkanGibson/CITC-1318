package package2;
//Did not import package 2 so we cannot use IceWater 
import package1.*;
//You have to use import static, not static import
import java.lang.System.out;

public class TestBeverage {

      public static void main(String[] myListOfArgs) {

            IceWater drink1 = new IceWater(16, 1.00);

            HotTea drink2 = new HotTea(10, 2.99);

            out.print("The water is " + drink1.getOunces() + " ounces ");

            out.println("and costs $" + drink1.getPrice() + ".");

            out.println(drink1.drink());

            out.print("The tea is " + drink2.getOunces() + " ounces ");

            out.println("and costs $" + drink2.getPrice() + ".");

            out.println(drink2.drink());

      }

}

// For the first class Beverage the error is is at line 9. The constructor needs to have the protected access control level so that the subclass in the other package can access it.

// Secondly, in the IceWater class at line 3 needs to extend the superclass Beverage and not implement it otherwise you could not use the super keyword to access the superclass constructor.

// Thirdly, the HotTea class has the same issues as IceWater in that at line 5 the class needs to extend the superclass Beverage and not implement it otherwise you could not use the super keyword to access the superclass constructor.

// Issues four and five are in the TestBeverage class. Four is at line 2 you need to import the first package so that you can access all the superclass and subclass within. The fifth issues is at line 3 because the wrong syntax is used. You have to use import static, not static import when using static imports.