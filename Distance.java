class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d) {
        int mm = this.mm + d.mm;
        int cm = this.cm + d.cm + mm / 10;
        int m = this.m + d.m + cm / 100;

        cm = cm % 100;
        mm = mm % 10;

        System.out.println("Result = " + m + "m " + cm + "cm " + mm + "mm");
    }
}

public class DistanceMain {
    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50, 5);
        Distance d2 = new Distance(3, 60, 8);
        d1.add(d2);
    }
}
