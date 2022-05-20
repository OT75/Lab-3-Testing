import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DigitalWatchTest
{
    @Nested
    class TopDownTest{

        @Test
        public void testT()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('t'));
        }

        @Test
        public void testA()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('a'));
        }

        @Test
        public void testN()
        {
            DigitalWatch x = new DigitalWatch();
            assertFalse(x.key('n'));
        }

        @Test
        public void testL()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('l'));
        }

        @Test
        public void testI()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('i'));
        }

        @Test
        public void testT2()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('t'));
        }

        @Test
        public void testT3()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('t'));
        }

        @Test
        public void testL2()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('l'));
        }

        @Test
        public void testm()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('m'));
        }

        @Test
        public void testD()
        {
            DigitalWatch x = new DigitalWatch();
            assertFalse(x.key('D'));
        }

        @Test
        public void testM()
        {
            DigitalWatch x = new DigitalWatch();
            assertFalse(x.key('M'));
        }

        @Test
        public void testB()
        {
            DigitalWatch x = new DigitalWatch();
            assertFalse(x.key('b'));
        }

        @Test
        public void testT4()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.key('t'));
        }

        @Test
        public void test()
        {
            DigitalWatch x = new DigitalWatch();
            assertTrue(x.let());
            assertFalse(x.let());
            assertTrue(x.notLet());
            assertTrue(x.inspect());
            assertFalse(x.inspect());
            assertFalse(x.notLet());
            assertTrue(x.let());

        }

    }

}