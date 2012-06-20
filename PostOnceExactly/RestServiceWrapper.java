import java.util.HashMap;

public interface RestServiceWrapper {
    public static enum RequestStatus { UNKNOWN, WAITING_FOR_REQUEST, IN_PROCESS, FINISHED }
    public String getRequestId();
    public RequestStatus postRequest(String requestId, HashMap<String, String> postData);
    public RequestStatus getStatus(String requestId);
}
