package org.usfirst.frc5112.Robot2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class AutoBringBinOrTote extends CommandGroup {
	public AutoBringBinOrTote(boolean step) {
		addSequential(new CloseGripper());
		addSequential(new WaitCommand(0.3));
		addSequential(new ElevatorUp(0.4), 0.9);
		if (step)
			addSequential(new DriveBackwards(0.8), 1.66);
		else
			addSequential(new DriveBackwards(0.5), 1.5);
		addSequential(new ElevatorDown(0.4), 0.9);
		addSequential(new OpenGripper());
		addSequential(new DriveBackwards(0.2), 0.2);
	}
}
