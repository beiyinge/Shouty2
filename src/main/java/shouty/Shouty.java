package shouty;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shouty {
    private static final int MESSAGE_RANGE = 1000;
    private Map<String, Coordinate> locations = new HashMap<>();
    //private Map<String, String> messages = new HashMap<>();
    private Map<String, ArrayList> messages = new HashMap<>();

    public void setLocation(String person, Coordinate location) {
        locations.put(person, location);
    }

    public void shout(String person, String message) {
    	ArrayList existingMessages = messages.get(person);
    	if (existingMessages!=null)
    		existingMessages.add(message);
    	else {
    		existingMessages = new ArrayList();
    		existingMessages.add(message);
    	}
        messages.put(person, existingMessages);
    }

    public Map<String, ArrayList> getMessagesHeardBy(String listener) {
        HashMap<String, ArrayList> result = new HashMap<>();

        for (Map.Entry<String, ArrayList> entry : messages.entrySet()) {
            String shouter = entry.getKey();
            ArrayList message = entry.getValue();
            int distance = locations.get(listener).distanceFrom(locations.get(shouter));
            if (distance < MESSAGE_RANGE && distance != 0)
                result.put(shouter, message);
        }

        return result;
    }
}
