public class TestCars {

      public static void main(String[] args) {
  
        Coupe coupe = new Coupe("BMW", "Blue");
  
        Sedan sedan = new Sedan();
  
        System.out.println("You have " + Car.numOwned + " cars.");
  
        coupe.drive(55);
  
       sedan.drive(35);
  
        System.out.println("Coupe is a " + coupe.getColor()
  
           + " " + coupe.getMake() + ".");
  
        System.out.println("Sedan is a " + sedan.getColor()
  
           + " " + sedan.getMake() + ".");
  
       sedan.heat(); } }
