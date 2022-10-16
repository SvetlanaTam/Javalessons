package base;

public class Exceptions {

    public static void main(String[] args) {

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        divide(10, 0);
        divideB(10, 0);

    }

    public static void divide(int a, int b) {
        try {
            System.out.println("Result is: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");
        }
    }

    public static void divideB(int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");

            } else {
                System.out.println("Result is: " + a / b);

            }



    }

}
