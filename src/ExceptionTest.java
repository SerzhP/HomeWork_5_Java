public class ExceptionTest {
    void checkValue(int value) throws MyException {
        if (value < 0) {
            throw new MyException("Value cannot be negative");
        }
        System.out.println("Value is: " + value);
    }
}
