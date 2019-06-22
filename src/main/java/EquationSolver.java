public class EquationSolver {
    public static double[] solveQuadratic(double a, double b, double c) {
        double d;
        double x1;
        double x2;
        double[] res;

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);

            res = new double[]{x1, x2};


        }else{
            System.out.print(new double[]{});
            res = new double[]{};
        }
        return res;

    }

    //public static double[] solveQuadratic(int a, int b){

    //}
}
