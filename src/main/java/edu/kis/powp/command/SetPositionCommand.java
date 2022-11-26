package edu.kis.powp.command;

import edu.kis.powp.jobs2d.receivers.DriverReceiver;

public class SetPositionCommand implements DriverCommand {

    private DriverReceiver driverReceiver;

    public SetPositionCommand(DriverReceiver driverReceiver) {
        this.driverReceiver = driverReceiver;
    }

    @Override
    public void execute(int x, int y) {
        this.driverReceiver.setPosition(x, y);
    }

}
