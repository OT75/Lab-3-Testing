public class CoffeeVendingHolding {
    public int water = 0;
    public int beans = 0;
    public int milk = 0;

    public void addMilk(int x)
    {
        milk += x;
    }

    public void addBeans(int x)
    {
        beans += x;
    }

    public void addWater(int x)
    {
        water += x;
    }


    public boolean getMilk()
    {
        if(milk <= 0)
        {
            return false;
        }
        milk--;
        return true;
    }

    public boolean getBeans()
    {
        if(beans <= 0){
            return false;
        }
        beans--;
        return true;
    }

    public boolean getWater()
    {
        if(water <= 0)
        {
            return false;
        }
        water--;
        return true;
    }

}
