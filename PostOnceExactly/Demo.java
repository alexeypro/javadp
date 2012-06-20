import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        RestServiceWrapper svc = new RestServiceWrapperImpl();

        String reqId = svc.getRequestId();

        System.out.println("Got Request ID                    = " + reqId);
        System.out.println("Current status of it is           = " + svc.getStatus(reqId));
        System.out.println("And again Current status of it is = " + svc.getStatus(reqId));

        System.out.println("Now let's make a call with        = " + reqId);
        RestServiceWrapper.RequestStatus reqStatus = svc.postRequest(reqId, new HashMap<String, String>());
        System.out.println("Returned status of it is          = " + reqStatus);
        System.out.println("Updated status of it is           = " + svc.getStatus(reqId));

        System.out.println("Now let's make a dup call with    = " + reqId);
        reqStatus = svc.postRequest(reqId, new HashMap<String, String>());
        System.out.println("Returned status of it is          = " + reqStatus);
        System.out.println("Updated status of it is           = " + svc.getStatus(reqId));

        System.out.println("Assuming here status of our request changes...");
        ((RestServiceWrapperImpl)svc).updateStatus(reqId, RestServiceWrapper.RequestStatus.FINISHED);
        System.out.println("Checking status of it is          = " + svc.getStatus(reqId));

        System.out.println("And another dup call with         = " + reqId);
        reqStatus = svc.postRequest(reqId, new HashMap<String, String>());
        System.out.println("Returned status of it is          = " + reqStatus);
        System.out.println("Updated status of it is           = " + svc.getStatus(reqId));
    }
}
