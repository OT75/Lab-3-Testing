import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CoffeeVendingMachineTest
{

        @Nested
        class TopDownTest{
            @Test
            public void testC()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertFalse(x.getKey('c'));
            }

            @Test
            public void test2L()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertFalse(x.getKey('l'));
            }

            @Test
            public void testM()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertFalse(x.getKey('m'));
            }

            @Test
            public void testR()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('r'));
            }

            @Test
            public void testC2()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('c'));
            }

            @Test
            public void testM2()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('m'));
            }

            @Test
            public void testW2()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('w'));
            }

            @Test
            public void testB2()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('b'));
            }

            @Test
            public void testV2()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertTrue(x.getKey('v'));
            }

            @Test
            public void testC3()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertFalse(x.getKey('c'));
            }

            @Test
            public void test()
            {
                CoffeVendingMachine x = new CoffeVendingMachine();
                assertFalse(x.getWater());
                assertFalse(x.getBeans());
                assertFalse(x.getMilk());
                x.addWater(1);
                x.addBeans(1);
                x.addMilk(1);
                assertTrue(x.getWater());
                assertTrue(x.getBeans());
                assertTrue(x.getMilk());
            }

        }

    }