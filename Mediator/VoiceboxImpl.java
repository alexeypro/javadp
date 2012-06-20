import java.util.HashMap;
import java.util.Map;

public class VoiceboxImpl implements Voicebox {
    private Map<String, String> messages = new HashMap<String, String>();

    @Override
    public void leaveMessage(String to, String message) {
        this.messages.put(to, message);
    }

    @Override
    public String getMessage(String to) {
        return this.messages.get(to);
    }
}
