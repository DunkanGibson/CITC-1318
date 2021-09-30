public class Car {

    private String make, color;
  
      static int numOwned = 0;
  
      protected Car() { this("Acme", "Brown"); }
  
      protected Car(String make, String color) {
  
        this.make = make;
  
        this.color = color;
  
        numOwned++; }
  
      public String getMake() { return make; }
  
     public String getColor() { return color; }
  
     public void drive(int speed) {
  
       System.out.println(color + " " + make + " driving "
  
           + speed + " MPH."); } }