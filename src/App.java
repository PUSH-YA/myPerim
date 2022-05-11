public class App {

    public static double distance(int[] currPt, int[] prevPt) {
        int dx = currPt[0] - prevPt[0];
        int dy = currPt[1] - prevPt[1];
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist;
    }

    public static double Perim(int[][] points) {
        int[] prevPt = points[points.length - 1];
        double totalPerim = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] currPt = points[i];
            double distance = distance(currPt, prevPt);
            totalPerim += distance;
            prevPt = currPt;
        }
        return totalPerim;
    }

    public static void main(String args[]) {
        int[][] PL1 = { { 1, 2 }, { 3, 4 }, { 5, 9 } };
        double length = Perim(PL1);
        System.out.println("total perimeter = " + length);
    }
}
