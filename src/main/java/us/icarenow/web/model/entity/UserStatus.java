package us.icarenow.web.model.entity;

public enum UserStatus {
    INACTIVE(0),
    ACTIVE(1),
    EXPIRED(2),
    LOCKED(3);

    private int value;

    UserStatus(int value) {
        this.value = value;
    }

    public byte value() {
        return (byte) value;
    }
}
