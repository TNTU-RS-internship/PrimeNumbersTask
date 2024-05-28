package primenumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    private PrimeChecker checker;

    @BeforeEach
    void setUp() {
        checker = new PrimeChecker();
    }

    @Test
    void isPrimeNumber_prime() {
        boolean prime = checker.isPrimeNumber(67);
        Assertions.assertTrue(prime);

    }

    @Test
    void isPrimeNumber_not_prime() {
        boolean notPrime = checker.isPrimeNumber(89);
        Assertions.assertTrue(notPrime);
    }




}