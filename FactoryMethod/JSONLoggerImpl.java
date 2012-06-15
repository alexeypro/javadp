// product
public class JSONLoggerImpl implements Logger {
    public JSONLoggerImpl() {
        System.out.println("New JSONLogger just got created!");
    }
    @Override
    public void log(String message) {
        System.out.println("{ message: '" + message + "' }");
    }
}
