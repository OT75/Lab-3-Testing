public class CoffeVendingMachine extends  CoffeeVendingHolding
{
    public String state = "Vending";

    public Boolean getKey(char input)
    {
        switch (this.state)
        {
            case "Vending":
                if (input == 'c')
                {
                    return (getWater() && getBeans());
                }
                else if (input == 'r')
                {
                    this.state = "Refill";
                    return true;
                }
                break;
            case "Refill":
                if (input == 'b')
                {
                    this.addBeans(1);
                    return true;
                }
                else if (input == 'w')
                {
                    this.addWater(1);
                    return true;
                }
                else if (input == 'm')
                {
                    this.addMilk(1);
                    return true;
                }
                break;
        }
        return false;
    }
}
