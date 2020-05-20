package models;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class Dictionary {
    public static Map<String,String> dict = new HashMap<>();
    static {
        dict.put("house","Nhà");
        dict.put("cat","Mèo");
        dict.put("dog","Chó");
    }

    public Dictionary() {
    }
    public String translate(String search){
        return dict.get(search);
    }
}
