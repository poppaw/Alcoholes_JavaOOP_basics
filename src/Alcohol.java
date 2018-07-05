public abstract class Alcohol{
    protected String brandName;
    protected String level;
    protected String hangoverDescription;

    public Alcohol(String name){
        this.brandName = name;
    }

    public String getHangoverDescription(){
        return hangoverDescription;
    }

    public String getbrandName(){
        return brandName;
    }

    public String getLevel(){
        return level;
    }

    public String toString(){
        return String.format("%s: %s\n\t%s\n",brandName, level,hangoverDescription);
    }

    public static void main(String[] args) {
        Alcohol[] barek = {new PureWodka("Żytnia"),
                new RedWine("Kadarka"),
                new WhiteWine("Białe"),
                new Lager("Zlaty Bazant -Lager"),
                new Porter("Żywiec porter")};
        for (Alcohol niepij : barek) System.out.println(niepij);
            
        }
}