package primenumbers;

public class PrimeChecker {

    public boolean isValidNumber(String input) throws IllegalArgumentException {
        long number;

        try {
            number = Long.parseLong(input);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a natural number");
        }

        if (number < 2 || number > 1_000_000_000_000L) {
            throw new IllegalArgumentException("Number must be positive and in (2 - 10^12) range");
        }

        return isPrimeNumber(number);
    }

    public boolean isPrimeNumber(long number) {
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}