package Challanges.codeWars;
public class oop_Object_Oriented_Piracy_Constructor {
  public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew){
      this.draft = draft;
      this.crew = crew;

      //Your code here
    }

    public double calculateShipWeigth(){
      return draft - crew*1.5;
    }

    public int getCrew(){
      return crew;
    }

    public double getDraft(){
      return draft;
    }

      
  public boolean isWorthIt() {
    
      Ship ship = new Ship(draft, crew);

      boolean worthIt = false;

      double calcShipWeigth = ship.calculateShipWeigth();

      if (calcShipWeigth > 20){
        return worthIt = true;
      } else {
        return worthIt = false;
      }
    }
  }
}
  

  
  
