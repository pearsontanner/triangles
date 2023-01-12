public class Triangle {

    private final Sides sides;
    private final Angles angles;

    public Triangle(double sideA, double sideB, double sideC) {
        sides = new Sides(sideA, sideB, sideC);
        angles = new Angles(sides);
    }

    // checks if the triangle has valid sides and angles
    private boolean isValid() {
        return sides.isValid() && angles.isValid();
    }

    // gets the classification of the triangles sides and angles
    private String getClassification() {
        return angles.getClassification() + " " + sides.getClassification();
    }

    // prints the info of the triangle
    public void printInfo() {
        System.out.println();
        System.out.println("Triangle Info:");
        System.out.println(sides);
        if (isValid()) {
            System.out.println(angles);
        }
        System.out.println(getResults());
    }

    // gets the description of the triangles sides and angles
    public String getDescription() {
        if (isValid()) {
            return "a valid " + getClassification();
        } else {
            return "an invalid";
        }
    }

    // gets the results of the triangle
    public String getResults() {
        return "These side lengths produce " + getDescription() + " triangle";
    }
}
