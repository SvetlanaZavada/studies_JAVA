package lesson_2_6.phone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> data = new HashMap<>();

    public void add(String name, String phone) {
       if (!data.containsKey(name)) {
            data.put(name, new ArrayList<>());
        }
        data.get(name).add(phone);
    }

    public List<String> get(String name) {
        if (!data.containsKey(name)) {
            return new ArrayList<>();
        }
        return data.get(name);
    }
}
