/**
* The Math Operators program calculates and displays various operations.
*
* @author Noah Smith
* @version 1.0
* @since 2025-02-07
*/
final class MathOperators {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("12 + 18 = " + (12 + 18));
        // Subtraction
        System.out.println("3 - 7 = " + (3 - 7));
        // Multiplication
        System.out.println("3 X 14 = " + (3 * 14));
        // Division with integers
        System.out.println("6 / 3 = " + (6 / 3));
        // Division with floats
        System.out.println("2 / 3 = " + (2f / 3f));
        // Division with doubles
        System.out.println("2 / 3 = " + (2d / 3d));
        // Exponent to the power of 2
        System.out.println("4^2 = " + (Math.pow(4, 2)));
        // Exponent to the power of 3
        System.out.println("3^3 = " + (Math.pow(3, 3)));
        // Square root
        System.out.println("√16 = " + (Math.sqrt(16)));

    }
}
