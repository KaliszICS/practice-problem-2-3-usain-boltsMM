import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testExample() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
    @Test
    void testCircleAreaZero() {
        assertEquals(0.0, PracticeProblem.circleArea(0.0), 0.0001);
    }

    @Test
    void testCircleAreaSmallNumber() {
        assertEquals(0.7853981633974483, PracticeProblem.circleArea(0.5), 0.0001);
    }

    @Test
    void testCircleAreaLargeNumber() {
        assertEquals(31415.926535897932, PracticeProblem.circleArea(100.0), 0.0001);
    }

    @Test
    void testCircleAreaDecimal() {
        assertEquals(19.634954084936208, PracticeProblem.circleArea(2.5), 0.0001);
    }

   

    @Test
    void testMinutesToHoursPositive() {
        assertEquals("1 hours and 40 minutes", PracticeProblem.minutesToHours(100));
    }

    @Test
    void testMinutesToHoursZero() {
        assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
    }

    @Test
    void testMinutesToHoursSmallNumber() {
        assertEquals("0 hours and 5 minutes", PracticeProblem.minutesToHours(5));
    }

    @Test
    void testMinutesToHoursEven() {
        assertEquals("2 hours and 0 minutes", PracticeProblem.minutesToHours(120));
    }

    @Test
    void testMinutesToHoursOdd() {
        assertEquals("2 hours and 15 minutes", PracticeProblem.minutesToHours(135));
    }

  

    @Test
    void testSimpleInterestPositive() {
        assertEquals(160.0, PracticeProblem.simpleInterest(200.0, 10.0, 8), 0.0001);
    }

    @Test
    void testSimpleInterestZeroPrincipal() {
        assertEquals(0.0, PracticeProblem.simpleInterest(0.0, 5.0, 2), 0.0001);
    }

    @Test
    void testSimpleInterestSmallNumbers() {
        assertEquals(0.1, PracticeProblem.simpleInterest(10.0, 1.0, 1), 0.0001);
    }

    @Test
    void testSimpleInterestLargeNumbers() {
        assertEquals(120000.0, PracticeProblem.simpleInterest(100000.0, 12.0, 10), 0.0001);
    }

    @Test
    void testSimpleInterestDecimalRate() {
        assertEquals(70.0, PracticeProblem.simpleInterest(500.0, 3.5, 4), 0.0001);
    }

  

    @Test
    void testHypotenusePositive() {
        assertEquals(5.0, PracticeProblem.hypotenuse(3.0, 4.0), 0.0001);
    }

    @Test
    void testHypotenuseZero() {
        assertEquals(7.0, PracticeProblem.hypotenuse(0.0, 7.0), 0.0001);
    }

    @Test
    void testHypotenuseSmallNumbers() {
        assertEquals(Math.sqrt(2), PracticeProblem.hypotenuse(1.0, 1.0), 0.0001);
    }

    @Test
    void testHypotenuseLargeNumbers() {
        assertEquals(500.0, PracticeProblem.hypotenuse(300.0, 400.0), 0.0001);
    }

    @Test
    void testHypotenuseDecimal() {
        assertEquals(Math.sqrt(8.5), PracticeProblem.hypotenuse(1.5, 2.5), 0.0001);
    }
}
