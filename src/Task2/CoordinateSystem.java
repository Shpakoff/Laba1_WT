package Task2;

public class CoordinateSystem {
    public static boolean isIncludeInArea(double x, double y){
        double XIfMinY = 12;
        double XIfMaxY = 4;
        double maxY = 5;
        double minY = -5;

        return (y<maxY && y>minY)
                && (XIfMinY - Math.abs(x) < 0 && y <= 0)
                || (XIfMaxY - Math.abs(x) < 0 && y >= 0);
    }
}
