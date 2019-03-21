package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    BOB("Hey, my name is BOB!"),
    ALICE("Hey, my name is ALICE!");
private String catchPhrase;

    AliceBobEnum(String catchPhrase) {
        this.catchPhrase = catchPhrase;

    }

    public boolean isBob() {
     return this.name().equals("BOB");
    }

    public boolean isAlice() {
    return this.name().equals("ALICE");

    }

    public String getCatchPhrase() {
        return this.catchPhrase;
    }
}
