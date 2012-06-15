// product
public class JSONLoggerImpl implements Logger {
    @Override
    public void log(String message) {
        System.out.println("{ message: '" + message + "' }");
    }
}
