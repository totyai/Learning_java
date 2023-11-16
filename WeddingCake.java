package Challanges.linkedinLearning.inheritance;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(){
        super();
        setFlavor("Almond");
    }

    public WeddingCake(int tiers){
        setTiers(tiers);
    }

    public int getTier(){
        return tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }

}
