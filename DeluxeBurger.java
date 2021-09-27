public class DeluxeBurger extends Burger{
    public DeluxeBurger()
    {
        super("Deluxe","Double Patty & Bacon",12.99,"Brioche");
        super.addAddition("Fries",2.99);
        super.addAddition2("Drink",1.99);
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items.");
    }
}