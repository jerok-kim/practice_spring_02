package submit.homework_01.model;

public class Player {

    private final String name;
    private final Position position;

    public Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return name + "(" + position.toString() + ")";
    }
}
