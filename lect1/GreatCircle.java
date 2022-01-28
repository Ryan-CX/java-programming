/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {

    public static void main(String[] args) {
        double r = 6371.0;
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double xDistance = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double yDistance = Math.pow(Math.sin((y2 - y1) / 2), 2) * Math.cos(x2) * Math.cos(x1);
        double plus = Math.sqrt(xDistance + yDistance);
        double res = 2 * r * Math.asin(plus);
        System.out.printf("%.12f kilometers", res);

    }
}
