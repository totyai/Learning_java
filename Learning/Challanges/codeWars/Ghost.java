package Challanges.codeWars;

public class Ghost {
    private String color = "white";

    public Ghost(String color){
        setColor(color);
    }
    

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String color_Ghost(){
        Ghost ghost = new Ghost(color);
        String Gcolor = ghost.getColor();
        return Gcolor;
    }
}
