package submit.homework_01.util;

import com.google.gson.Gson;
import submit.homework_01.model.Player;

public class JsonParser {

    public JsonParser(Player player) {
        Gson gson = new Gson();
        String json = gson.toJson(player);
        System.out.println(json);
    }
    
}
