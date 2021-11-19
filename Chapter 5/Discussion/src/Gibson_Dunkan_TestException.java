import java.util.*;


public class Gibson_Dunkan_TestException {

    public static void main(String[] args) {

        try {
            addCars();
        } catch (CarException e) {
            System.out.println("Invalid entry: " + e.toString() + " Please enter a valid entry");
        }



    }

    private static void addCars() throws CarException {
        Scanner scanner = new Scanner(System.in);  
        
        ArrayList<Car> carArrayList = new ArrayList<Car>();
        
        for(int i = 0; i < 10; i++) {
        
        System.out.println("Car Choice: " + (i+1));
        System.out.println("a. Aston Martin");
        System.out.println("b. BMW");
        System.out.println("c. Maserati");
        System.out.println("d. Porsche");
        
        System.out.print("Please enter your choice: ");
        String input = scanner.nextLine();
        
        switch (input)
          {
            case "a":
            carArrayList.add(new AstonMartin());
                break;
            case "b":
            carArrayList.add(new BMW());
                break;
            case "c":
            carArrayList.add(new Maserati());
                break;
            case "d":
            carArrayList.add(new Porsche());
                break;
            default:
                throw new CarException();
          }
        }
        
        
        System.out.println("The cars that you picked are: ");

        for(int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i).toString());
        }           
    }

}


    public class CarException extends Exception{

    }

    class Car { }
    class AstonMartin extends Car { public String toString() { return "Aston Martin"; } }
    class BMW extends Car { public String toString() { return "BMW"; } }
    class Maserati extends Car { public String toString() { return "Maserati"; } }
    class Porsche extends Car { public String toString() { return "Porsche"; } }
