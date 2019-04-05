/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo(Object otherDate) {
      Date other = (Date) otherDate;
      int DaysSinceEpich = 365 * y + 30 * m + d ;
      int OtherDaysSinceEpich = 365 * other.y + 30 * other.m + other.d ;
      return Integer.compare(DaysSinceEpich, OtherDaysSinceEpich);
    }

}
