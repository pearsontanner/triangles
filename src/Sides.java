public class Sides {

    private final double a;
    private final double b;
    private final double c;

    private final String EQUILATERAL_CLASSIFICATION = "equilateral";
    private final String ISOSCELES_CLASSIFICATION = "isosceles";
    private final String SCALENE_CLASSIFICATION = "scalene";

    public Sides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // checks if the sides of the triangle are valid
    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // checks if the triangle is an equilateral triangle
    private boolean isEquilateral() {
        return a == b && a == c;
    }

    // checks if the triangle is an isosceles triangle
    private boolean isIsosceles() {
        return a == b || a == c || b == c;
    }

    // gets the classification of the triangles sides
    public String getClassification() {
        if (isEquilateral()) {
            return EQUILATERAL_CLASSIFICATION;
        } else if (isIsosceles()) {
            return ISOSCELES_CLASSIFICATION;
        } else {
            return SCALENE_CLASSIFICATION;
        }
    }

    // to string method for printing out sides
    public String toString() {
        return "Side a length: " + a + "\n" +
               "Side b length: " + b + "\n" +
               "Side c length: " + c + "\n";
    }
}
