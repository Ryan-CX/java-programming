package lect2;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;


        int distance = 0;
        int steps = 0;
        while (distance <= r) {
            System.out.println("(" + x + ", " + y + ")");
            double probability = Math.random();
            if (probability <= 0.25) {
                x += 1;
            }
            else if (probability <= 0.5) {
                x -= 1;
            }
            else if (probability <= 0.75) {
                y += 1;
            }
            else {
                y -= 1;
            }


            distance = Math.abs(x) + Math.abs(y);
            steps++;

        }
        System.out.println("Steps = " + steps);
    }
}
