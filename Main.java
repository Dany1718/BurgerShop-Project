import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int option;
        int secondaryOption;
        Scanner scan = new Scanner(System.in);
        double total = 0;
        Burger[] check = new Burger[30];
        int index = 0;
        System.out.println("Hello welcome to Daniel's burger shop!\n");
        do{
            System.out.println("MENU:");
            System.out.println("1: Classic Burger");
            System.out.println("2: Vegan Burger");
            System.out.println("3: Deluxe Burger");
            System.out.println("4: Check your bill");
            System.out.println("5: Cash out");
            option = scan.nextInt();

            switch(option)
            {
                case 1:
                    Burger burger = new Burger("Classic","Regular Patty",5.99,"Brioche");
                    check[index] = burger;
                    index++;
                    System.out.println("A " + burger.getName() + " burger!");
                    System.out.println("Would you like to add any additional items?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    secondaryOption = scan.nextInt();
                    if(secondaryOption == 1)
                    {
                        int limit = 0;
                        boolean done = false;
                        String name;
                        while(!done)
                        {
                            System.out.println("What is the name of the add-on?");
                            name = scan.next();
                            burger.addAddition(name,1.99);
                            System.out.println("Additions added");
                            limit++;
                            System.out.println("Would you like to add more additional items?");
                            System.out.println("1: Yes");
                            System.out.println("2: No");
                            secondaryOption = scan.nextInt();
                            if(secondaryOption == 2 || limit == 4)
                                done = true;
                        }
                    }
                    System.out.println("Your " + burger.getName() + " burger will be added to the check.");
                    break;
                case 2:
                    Burger veganBurger = new VeganBurger("Black Bean",5.99);
                    System.out.println("A " + veganBurger.getName() + " burger!");
                    check[index] = veganBurger;
                    index++;
                    System.out.println("Would you like to add any additional items?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    secondaryOption = scan.nextInt();
                    if(secondaryOption == 1)
                    {
                        int limit = 0;
                        boolean done = false;
                        String name;
                        while(!done)
                        {
                            System.out.println("What is the name of the add-on?");
                            name = scan.next();
                            veganBurger.addAddition(name,1.99);
                            System.out.println("Additions added");
                            limit++;
                            System.out.println("Would you like to add more additional items?");
                            System.out.println("1: Yes");
                            System.out.println("2: No");
                            secondaryOption = scan.nextInt();
                            if(secondaryOption == 2 || limit == 2)
                                done = true;
                        }
                    }
                    System.out.println("Your " + veganBurger.getName() + " burger will be added to the check.");
                    break;
                case 3:
                    Burger deluxeBurger = new DeluxeBurger();
                    check[index] = deluxeBurger;
                    index++;
                    System.out.println("Your " + deluxeBurger.getName() + " burger will be added to the check.");
                    break;
                case 4:
                    System.out.println("Check:");
                    for (int i = 0;i < index;i++)
                        total += check[i].itemizeBurger();
                    System.out.println("TOTAL:");
                    System.out.println(total);
                    break;
                case 5:
                    System.out.println("Check:");
                    for (int i = 0;i < index;i++)
                        total += check[i].itemizeBurger();
                    System.out.println("TOTAL:");
                    System.out.println(total);
                    System.out.println("Thank you for dining with use today!");
                    break;
            }
        }while(option != 5);
    scan.close();
    }
}
