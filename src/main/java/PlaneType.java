public enum PlaneType {
    BOEING_737(188),
    BOEING_777(550),
    AIRBUS_A320(180),
    AIRBUS_A330(290);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
