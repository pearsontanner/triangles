import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in); // scanner to get user input

    // gets valid user input for given triangle side
    private static double getValidTriangleSideLengthInput(String side) {

        double sideLength = -1.0;

        // make sure that the user enters a positive number
        do {
            System.out.print("Enter side " + side + " length:");
            if (scanner.hasNextDouble()) {
                sideLength = scanner.nextDouble();
                if (sideLength <= 0) {
                    System.out.println("Invalid value, please enter a positive number");
                }
            } else {
                System.out.println("Invalid value, please enter a positive number");
                scanner.next();
            }
        } while (sideLength <= 0);

        return sideLength;
    }

    public static void main(String[] args) {

        // change this variable whether you want to run testMode or not
        boolean testMode = false;

        if (testMode) {
            TrianglesTest trianglesTest = new TrianglesTest();
            trianglesTest.run();
        } else {
            double sideA = getValidTriangleSideLengthInput("a");
            double sideB = getValidTriangleSideLengthInput("b");
            double sideC = getValidTriangleSideLengthInput("c");

            Triangle triangle = new Triangle(sideA, sideB, sideC);

            triangle.printInfo();
        }
    }
}