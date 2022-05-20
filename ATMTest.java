import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class ATMTest {
    public ATM newAtm;
    public Holding atmHolding;

    @Nested

        @Test
        public void testL() {
            ATM atm = new ATM();
            assertTrue(atm.getKey('l'));
        }

        @Test
        public void testW() {
            ATM atm = new ATM();
            assertFalse(atm.getKey('w'));
        }

        @Test
        public void testD() {
            ATM atm = new ATM();
            assertTrue(atm.getKey('d'));
        }

        @Test
        public void testO() {
            ATM atm = new ATM();
            assertTrue(atm.getKey('o'));
        }

        @Test
        public void testU() {
            ATM atm = new ATM();
            assertTrue(atm.getKey('u'));
        }

        @Test
        public void testF() {
            ATM atm = new ATM();
            assertTrue(atm.getKey('f'));
        }


        @Test
        public void testAtmHolding()
        {
            atmHolding = new Holding();
            assertFalse(atmHolding.withdraw());
            atmHolding.load(1);
            assertTrue(atmHolding.withdraw());
            assertFalse(atmHolding.withdraw());
            atmHolding.load(3);
            assertTrue(atmHolding.withdraw());
            assertTrue(atmHolding.withdraw());
            assertTrue(atmHolding.withdraw());
        }

    }



