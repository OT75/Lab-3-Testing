public class DigitalWatch extends  Alert
{
    public String currentState = "Time";

    public Boolean key(char x)
    {
        switch (currentState)
        {
            case "Time":
                if (x == 't')
                {
                    return true;
                }
                else if (x == 'l')
                {
                    currentState = "Let";
                    return true;
                }
                else if (x == 'a')
                {
                    currentState = "Alert";
                    return true;
                }
                break;
            case "Let":
                if (x == 'l')
                {
                    return true;
                }
                else if (x == 'm')
                {
                    return true;
                }
                else if (x == 'h')
                {
                    return true;
                }
                else if (x == 'D')
                {
                    return true;
                }
                else if (x == 'M')
                {
                    return true;
                }
                else if (x == 'Y')
                {
                    return true;
                }
                else if (x == 't')
                {
                    currentState = "Time";
                    return true;
                }
                break;
            case "Alert":
                if (x == 'l')
                {
                    return let();
                }
                else if (x == 'n')
                {
                    return notLet();
                }
                else if (x == 'i')
                {
                    return inspect();
                } else if (x == 't')
                {
                    currentState = "Time";
                    return true;
                }
                break;
        }
        return false;
    }
}
