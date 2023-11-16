package Challanges.linkedinLearning.inheritance;

public class Cake {
    private String flavor;
    private double price;

    public Cake(){
        flavor = "vanilla";
        price = 9.99;
    }

    public Cake(String flavor, double price){
        setFlavor(flavor);
        setPrice(price);
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}