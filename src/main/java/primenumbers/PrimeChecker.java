package primenumbers;

public class PrimeChecker {

    public boolean isValidNumber(String input) throws IllegalArgumentException {
        int number;

        try {
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a number");
        }

        return isPrimeNumber(number);
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}