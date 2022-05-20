public class Alert
{
    public boolean let = false;

    public boolean let()
    {
        if(let)
        {
            return false;
        }
        let = true;
        return true;
    }

    public boolean notLet()
    {
        if(!let)
        {
            return false;
        }
        let = false;
        return true;
    }

    public boolean inspect()
    {
        boolean tmp = let;
        let = false;
        return tmp;
    }
}
