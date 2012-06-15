// product
public class XMLLoggerImpl implements Logger {
    public XMLLoggerImpl() {
        System.out.println("New XMLLogger just got created!");
    }

    @Override
    public void log(String message) {
        System.out.println("<message>" + message + "</message>");
    }
}
