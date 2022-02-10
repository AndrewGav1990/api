import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumPositive() {
        assertEquals(5,new Calculator().sum(3,2),"операция не прошла");
    }
    @Test
    void sumNegative() {
        assertNotEquals(2,new Calculator().sum(3,2),"негативный сценарий не пройден");
    }
    @Test
    void sumPositiveErr() {
        assertEquals(1,new Calculator().sum(3,2),"операция не прошла");
    }
    @Test
    void sumNegativeErr() {
        assertNotEquals(5,new Calculator().sum(3,2),"негативный сценарий не пройден");
    }
}