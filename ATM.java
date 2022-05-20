public class ATM  extends  Holding{
    public String currentState = "Logout";

    public Boolean getKey(char key)
    {
        switch (currentState)
        {
            case "Logout":
                if (key == 'l')
                {
                    currentState = "Login";
                    return true;
                }
                else if (key == 'u')
                {
                    currentState = "Unlocked";
                    return true;
                }
                break;
            case "Login":
                if (key == 'w')
                {
                    return this.withdraw();
                }
                else if (key == 'd')
                {
                    load(1);
                    return true;
                }
                else if (key == 'o')
                {
                    this.currentState = "Logout";
                    return true;
                }
                break;
            case "Unlocked":
                if (key == 'f')
                {
                    load(1);
                    return true;
                }
                else if (key == 'l')
                {
                    currentState = "Logout";
                    return true;
                }
                break;
        }
        return false;
    }
}
