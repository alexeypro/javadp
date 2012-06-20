import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RestServiceWrapperImpl implements RestServiceWrapper {
    private Map<String, RequestStatus> pendingRequests = new HashMap<String, RequestStatus>();

    @Override
    public String getRequestId() {
        String result = UUID.randomUUID().toString();
        System.out.println("Making REST POST request to /somewhere/new-request to get new request ID");
        this.pendingRequests.put(result, RequestStatus.WAITING_FOR_REQUEST);
        return result;
    }

    @Override
    public RequestStatus postRequest(String requestId, HashMap<String, String> postData) {
        RequestStatus currentStatus = getStatus(requestId);
        if (currentStatus == RequestStatus.UNKNOWN || currentStatus == RequestStatus.WAITING_FOR_REQUEST) {
            System.out.println("Making REST POST request to /somewhere/make-request to post data");
            currentStatus = RequestStatus.IN_PROCESS;
            this.pendingRequests.put(requestId, currentStatus);
            return currentStatus;
        } else {
            System.out.println("Ignoring REST POST request to /somewhere/make-request to post data: request was already made");
            return currentStatus;
        }
    }

    @Override
    public RequestStatus getStatus(String requestId) {
        System.out.println("Making REST GET request to /somewhere/check-request to check status of request ID");
        return this.pendingRequests.containsKey(requestId) ? this.pendingRequests.get(requestId) : RequestStatus.UNKNOWN;
    }

    // hacky method to update status; in the real world this (status update) is caused by external events
    // on the backend
    public void updateStatus(String requestId, RequestStatus newStatus) {
        this.pendingRequests.put(requestId, newStatus);
    }
}
