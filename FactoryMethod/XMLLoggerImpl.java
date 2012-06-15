// product
public class XMLLoggerImpl implements Logger {
    @Override
    public void log(String message) {
        System.out.println("<message>" + message + "</message>");
    }
}
