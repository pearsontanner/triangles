public class Angles {

    private double a;
    private double b;
    private double c;

    private final double RIGHT_ANGLE = 90.0;
    private final double SUM_OF_ANGLES = 180.0;

    private final String ACUTE_CLASSIFICATION = "acute";
    private final String RIGHT_CLASSIFICATION = "right";
    private final String OBTUSE_CLASSIFICATION = "obtuse";

    // gets the square of a given number
    private double getSquare(double num) {
        return num * num;
    }

    // gets the angle in radians given the three sides of the triangle
    private double getAngleInRadians(double side1, double side2, double side3) {
        return Math.acos(
                (getSquare(side2) + getSquare(side3) - getSquare(side1))
                        / (float) (2 * side2 * side3));
    }

    // gets the angle in degrees given an angle in radians
    private double getAngleInDegrees(double angleInRadians) {
        return Math.toDegrees(angleInRadians);
    }

    // gets the angle rounded given an angle in degrees
    private double getAngleRounded(double angleInDegrees) {
        return Math.round(angleInDegrees * 100.00) / 100.00;
    }

    // gets one angle of the triangle, given three sides
    // side1 corresponds to the angle you are trying to get from the triangle,
    //   (the side that is across from the angle you want)
    // side2 and side 3 correspond to the other two sides of the triangle
    private double getAngle(double side1, double side2, double side3) {
        double angleInRadians = getAngleInRadians(side1, side2, side3);
        double angleInDegrees = getAngleInDegrees(angleInRadians);
        return getAngleRounded(angleInDegrees);
    }

    // gets the triangles three angles given the sides of the triangle
    private void getAngles(Sides sides) {
        a = getAngle(sides.getA(), sides.getB(), sides.getC());
        b = getAngle(sides.getB(), sides.getA(), sides.getC());
        c = getAngle(sides.getC(), sides.getA(), sides.getB());
    }

    public Angles(Sides sides) {
        getAngles(sides);
    }

    // checks if the triangles angles are valid
    public boolean isValid() {
        return a + b + c == SUM_OF_ANGLES;
    }

    // checks if the triangle is an acute triangle
    private boolean isAcute() {
        return a < RIGHT_ANGLE && b < RIGHT_ANGLE && c < RIGHT_ANGLE;
    }

    // checks if the triangle is a right triangle
    private boolean isRight() {
        return a == RIGHT_ANGLE || b == RIGHT_ANGLE || c == RIGHT_ANGLE;
    }

    // gets the classification of the triangles angles
    public String getClassification() {
        if (isAcute()) {
            return ACUTE_CLASSIFICATION;
        } else if (isRight()) {
            return RIGHT_CLASSIFICATION;
        } else {
            return OBTUSE_CLASSIFICATION;
        }
    }

    // to string method for printing out angles
    public String toString() {
        return "Angle a (degrees): " + a + "\n" +
               "Angle b (degrees): " + b + "\n" +
               "Angle c (degrees): " + c + "\n";
    }
}
