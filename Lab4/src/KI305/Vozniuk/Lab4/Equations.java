package KI305.Vozniuk.Lab4;

import java.io.IOException;

/**
 * Class Equations implements calculation algorithm
 *
 *  @version 1.0
 */
class Equations {
    /** Method calculates the (tan(x) expression
     *
     *  @param x
     *  @return
     *  @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = Math.tan(rad);
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || rad % Math.PI == 0 || x % 180 == 0 || x== 90 || x== -90)
                throw new ArithmeticException();

        } catch (ArithmeticException  ex) {
            if (rad % Math.PI == 0 || x==90 || x== -90)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}
