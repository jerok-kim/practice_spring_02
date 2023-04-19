package submit.homework_01.util;

import com.google.gson.Gson;
import submit.homework_01.model.Player;

public class ObjectParser {

    public ObjectParser(String json) {
        Gson gson = new Gson();
        Player player = gson.fromJson(json, Player.class);
        System.out.println(player.toString());
    }
}
