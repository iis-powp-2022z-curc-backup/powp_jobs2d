package edu.kis.powp.command;

import edu.kis.powp.jobs2d.receivers.DriverReceiver;

public class OperateToCommand implements DriverCommand {

    private DriverReceiver driverReceiver;

    public OperateToCommand(DriverReceiver driverReceiver) {
        this.driverReceiver = driverReceiver;
    }

    @Override
    public void execute(int x, int y) {
        this.driverReceiver.operateTo(x, y);
    }

}
