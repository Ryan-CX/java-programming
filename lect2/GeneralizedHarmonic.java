package lect2;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double res = 0;
        for (int i = 0, j = 1; j <= n && i < n; i++,
                j++) {
            res += (1 / Math.pow(j, r));
        }
        System.out.println(res);
    }
}
