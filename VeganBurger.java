public class VeganBurger extends Burger{

    private String veganExtra1Name;
    private double veganExtra1Price;

    private String veganExtra2Name;
    private double veganExtra2Price;

    public VeganBurger(String meat, double price)
    {
        super("Vegan",meat,price,"Vegan");
    }

    public void addVeganAddition1(String name, double price)
    {
        this.veganExtra1Name = name;
        this.veganExtra1Price = price;
    }
    public void addVeganAddition2(String name, double price)
    {
        this.veganExtra2Name = name;
        this.veganExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();
        if(this.veganExtra1Name != null)
        {
            burgerPrice += this.veganExtra1Price;
            System.out.println("Added " + veganExtra1Name + " for an extra " + this.veganExtra1Price);
        }
        if(this.veganExtra2Name != null)
        {
            burgerPrice += this.veganExtra2Price;
            System.out.println("Added " + veganExtra2Name + " for an extra " + this.veganExtra2Price);
        }

        return burgerPrice;
    }
}