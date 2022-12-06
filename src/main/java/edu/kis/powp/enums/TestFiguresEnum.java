package edu.kis.powp.enums;

public enum TestFiguresEnum {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    RECTANGLE("Rectangle"),
    TRAPEZE("Trapeze"),
    TRIANGLE("Triangle"),
    CIRCLE("Circle");

    private final String name;

    TestFiguresEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static TestFiguresEnum getFromString(String name) {
        for(TestFiguresEnum value : values()) {
            if(value.toString().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return null;
    }
}
