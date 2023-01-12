import java.util.HashMap;
import java.util.Map;

public class TrianglesTest {

    // map of test triangles and their correct description
    private static final HashMap<Triangle, String> testTriangles = new HashMap<>() {{
        put(new Triangle(1, 1, 1), "a valid acute equilateral");
        put(new Triangle(3, 4, 5), "a valid right scalene");
        put(new Triangle(3, 4, 6), "a valid obtuse scalene");
        put(new Triangle(8, 8, 6.5), "a valid acute isosceles");
        put(new Triangle(1, 2, 3), "an invalid");
    }};

    // test all the test triangles
    public void run() {
        boolean testsPassed = true;

        int index = 0;

        // iterate through all test triangles
        for (Map.Entry<Triangle, String> testTriangle: testTriangles.entrySet()) {

            Triangle triangle = testTriangle.getKey();
            String correctDescription = testTriangle.getValue();

            // print out error message if triangles description is incorrect
            if (!triangle.getDescription().equals(correctDescription)) {

                System.out.println("Test failed!");
                System.out.println("testTriangles index: " + index);
                triangle.printInfo();
                System.out.println();
                System.out.println("Correct description: " + correctDescription);
                System.out.println("Calculated description: " + triangle.getDescription());

                testsPassed = false;
            }
            index++;
        }

        // print out success message if all triangle tests pass
        if (testsPassed) {
            System.out.println("All tests passed!");
        }
    }
}
