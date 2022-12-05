package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand{
    ArrayList<DriverCommand> list;
    
    public ComplexCommand(ArrayList<DriverCommand> newList) {
    	list = newList;
    }
    
    
	@Override
	public void execute(Job2dDriver driver) {
		for(int i = 0; i<list.size();i++) {
			list.get(i).execute(driver);
		}
		
	}

}
