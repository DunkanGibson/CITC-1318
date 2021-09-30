public class Sedan extends Car implements Heated {

      public Sedan() { }
  
      public Sedan(String make, String color) {
  
        super(make, color); }
  
      public void heat() {
  
        System.out.println("The " + this.getMake()
  
           + "'s heated seats are comfortable."); } }