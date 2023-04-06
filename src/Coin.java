/**
 * Coin machine project
 * @author 24levinson
 * @version 3/30/2023
 */
public abstract class Coin {
    public abstract double getValue();
    public abstract String getName();
    public String getPluralName()   {
        return getName().equals("penny") ? "pennies" : getName() + "s";
    }

    public boolean equals(Object other) {
        if(other instanceof Coin)   {
            return this.getValue() == ((Coin)other).getValue();
        }
        return false;
    }
}
