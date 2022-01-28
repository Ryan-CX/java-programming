/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int distance = 0;
            int steps = 0;
            while (distance <= r) {

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
            totalSteps += steps;
        }

        System.out.println("average number of steps = " + (totalSteps / trials));
    }
}
