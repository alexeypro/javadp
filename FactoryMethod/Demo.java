
public class Demo {

    public void myMethodWhichDoesSomethingAndLogs(AbstractLoggerCreator logger) {
        // using factory method here
        Logger l = logger.createLogger();
        l.log("Hello World!");
    }

    public static void main(String[] args) {
        AbstractLoggerCreator logCreator = new XMLLoggerCreator();
        new Demo().myMethodWhichDoesSomethingAndLogs(logCreator);

        logCreator = new JSONLoggerCreator();
        new Demo().myMethodWhichDoesSomethingAndLogs(logCreator);
    }
}
