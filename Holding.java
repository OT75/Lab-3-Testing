public class Holding
{
        public int storage = 0;
        public boolean withdraw()
        {
            if(storage <= 0)
            {
                return false;
            }
            storage--;
            return true;
        }
        public void load(int x)
        {
           storage += x;
        }



}
