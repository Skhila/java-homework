package ge.tbc.testautomation.annotationsAndComparators;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        double r1Area = r1.getArea();
        double r2Area = r2.getArea();

        return - Double.compare(r1Area, r2Area);
    }
}
