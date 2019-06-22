import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EquationSolverTest {
    @DataProvider(name = "Arguments")
    public static Object[][] arguments() {

        Object[][] objects = {{2, 5, 1,new double[]{-0.21922359359558485,-2.2807764064044154} }, {2, 4, 5, new double[]{}}};
        return objects;

    }

    @Test(dataProvider="Arguments")
    public void QuadraticTest(double a, double b, double c, double [] expected) {

        double [] res;
        res = EquationSolver.solveQuadratic(a, b, c);

        Assert.assertEquals(res,expected);
    }
}
