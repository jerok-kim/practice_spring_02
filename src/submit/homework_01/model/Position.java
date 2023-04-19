package submit.homework_01.model;

public enum Position {
    CENTER("C"),
    POWER_FORWARD("PF"),
    SMALL_FORWARD("SF"),
    SHOOTING_GUARD("SG"),
    POINT_GUARD("PG");

    private final String positionName;

    Position(String position) {
        positionName = position;
    }

    @Override
    public String toString() {
        return positionName;
    }
}
