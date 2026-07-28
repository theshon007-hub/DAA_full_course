import java.util.*;
public class Experiment15_ClosestPair {

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static double distance(Point p1, Point p2) {

        return Math.sqrt(Math.pow(p1.x - p2.x, 2)
                + Math.pow(p1.y - p2.y, 2));
    }

    public static void main(String[] args) {

        Point points[] = {
                new Point(1, 2),
                new Point(4, 5),
                new Point(7, 8),
                new Point(3, 1)
        };

        double min = Double.MAX_VALUE;
        Point p1 = null, p2 = null;

        for (int i = 0; i < points.length; i++) {

            for (int j = i + 1; j < points.length; j++) {

                double d = distance(points[i], points[j]);

                if (d < min) {
                    min = d;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }

        System.out.println("Closest Pair: (" + p1.x + "," + p1.y + ") and (" +
                p2.x + "," + p2.y + ")");

        System.out.println("Distance = " + min);
    }
}