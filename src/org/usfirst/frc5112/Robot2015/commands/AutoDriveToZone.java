package org.usfirst.frc5112.Robot2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoDriveToZone extends CommandGroup {
	public AutoDriveToZone(boolean step) {
		if (step)
			addSequential(new DriveBackwards(0.8), 1.66);
		else
			addSequential(new DriveBackwards(0.5), 1.5);
	}
}
