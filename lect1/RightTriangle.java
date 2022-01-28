/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {


    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(
                args[2]);
        boolean isRightTriangle = ((a > 0 && b > 0 && c > 0) || (
                (a * a + b * b) == c * c)
                || ((a * a + c * c) == b * b) || ((b * b + c * c) == a * a));
        System.out.println(isRightTriangle);
    }


}
