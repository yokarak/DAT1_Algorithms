import static org.junit.jupiter.api.Assertions.*;

class MyTimerTest {



    @org.junit.jupiter.api.Test
    void currentTimestampTest() {

        long x = MyTimer.currentTimestamp();
        System.out.println(x);
        assertTrue(x > 0);

    }

    @org.junit.jupiter.api.Test
    void timeElapsedTest() {

        String x = MyTimer.timeElapsed(10, 11);
        assertEquals("The algorithm took 1 milliseconds to execute.", x);
    }
}