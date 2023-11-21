package KI305.Vozniuk.Lab4;

import java.io.FileNotFoundException;

/**
 * Class CalcException implements calculation exceptions
 *
 *  @version 1.0
 */
class CalcException extends ArithmeticException {
    /**
     *  Constructor
     *
     *  @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}
class WrongPathFileException extends ArithmeticException {
    public WrongPathFileException(String message) {
        super(message);
    }
}
