package edu.kis.powp.jobs2d.enums;

public enum TestFigureEnum {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    FIGURE_RECTANGLE("Figure rectangle"),
    FIGURE_TRIANGLE("Figure triangle"),
    FIGURE_JOE_1_WITH_COMPLEX_COMMAND("Figure Joe 1 with complex command"),
    FIGURE_JOE_2_WITH_COMPLEX_COMMAND("Figure Joe 2 with complex command"),
    MIX_OF_FIGURES_WITH_COMPLEX_COMMAND("Mix of figures with complex command");

    private final String name;

    TestFigureEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static TestFigureEnum fromString(String name) throws IllegalArgumentException {
        for (TestFigureEnum value : values()) {
            if (value.toString().equalsIgnoreCase(name)) {
                return value;
            }
        }

        throw new IllegalArgumentException("There is no test with name: " + name);
    }
}
