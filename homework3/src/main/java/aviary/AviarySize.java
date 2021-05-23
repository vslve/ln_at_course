package aviary;

public enum AviarySize {
    LITTLE(1),
    AVERAGE(2),
    LARGE(3),
    GIANT(4);

    private final int size;

    AviarySize(int size) {
        this.size = size;
    };

    public int getSize() {
        return size;
    }
}
