/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo(Object otherObj){

      Point other = (Point) otherObj;
      double squareDistance1 = (Math.pow(xcor, 2) + Math.pow(ycor , 2));
      double squareDistance2 = (Math.pow(other.xcor , 2) + Math.pow(other.ycor , 2));
      return Double.compare(squareDistance1,squareDistance2);
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher   is bigger"
           and change the tests accordingly */
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
