import java.util.Random;

public class Die {

    private int currentValue;
    private int sides;

    static private Random random = new Random();

    public Die(int currentValue, int sides){
        this.currentValue = currentValue;
        this.sides = sides;

    }

    public void roll(){
        this.currentValue = random.nextInt(this.sides) + 1;
    }

    public int getCurrentValue(){
        return this.currentValue;
    }
    public int getSides(){
        return this.sides;
    }
    public void setCurrentValue(int currentValue){
        this.currentValue = currentValue;
    }
    public void setSides(int sides){
        this.sides = sides;
    }
    public String toString(){
        return "Value: " + this.currentValue + "\nSides: " + this.sides;
    }

}