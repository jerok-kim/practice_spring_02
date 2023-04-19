package submit.homework_01;

import submit.homework_01.model.Player;
import submit.homework_01.model.Position;
import submit.homework_01.util.JsonParser;
import submit.homework_01.util.ObjectParser;

public class Test {

    public static void main(String[] args) {
        Player player_kbh = new Player("강백호", Position.POWER_FORWARD);
        JsonParser jsonParser = new JsonParser(player_kbh);
        
        String json_sts = "{\"name\":\"송태섭\",\"position\":\"POINT_GUARD\"}";
        ObjectParser objectParser = new ObjectParser(json_sts);
    }
    
}
