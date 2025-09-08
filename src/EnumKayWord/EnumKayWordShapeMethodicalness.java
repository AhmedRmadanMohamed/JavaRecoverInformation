package EnumKayWord;

public enum EnumKayWordShapeMethodicalness {
    ACTIVE(1),
    INACTIVE(0),
    PENDING(-1);

    private final int code;

    EnumKayWordShapeMethodicalness(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
