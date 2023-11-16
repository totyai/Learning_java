package Challanges.linkedinLearning.inheritance;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(){
        //A super azért kell, hogy a cake constructor-ja legyen behívva, mivel ott van a Flavor setter method
        super();
        setFlavor("Chocolate");
    }
    
    public BirthdayCake(int candles){
        setCandles(candles);
    }

    public int getCandles(){
        return candles;
    }

    public void setCandles(int candles){
        this.candles = candles;
    }
}
