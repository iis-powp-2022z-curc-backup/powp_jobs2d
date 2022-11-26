package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> ListOfOperations;

    private ComplexCommand() {
        this.ListOfOperations = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> list) {
        this();
        this.addCommands(list);
    }

    public void addCommands(List<DriverCommand> list) {
        list.stream().filter(Objects::nonNull).forEach(ListOfOperations::add);
    }

    public void execute(Job2dDriver driver) {
        ListOfOperations.forEach(x -> x.execute(driver));
    }
}
