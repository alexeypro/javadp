// abstract creator
public abstract class AbstractLoggerCreator {
    // factory method itself
    public abstract Logger createLogger();

    // usual operations on all logger creators
    public Logger getLogger() {
        // should do more than that, like initialize logger once, etc. but not necessary for this example
        return createLogger();
    }
}
