package org.usfirst.frc5112.Robot2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveBackHumanPlayerStation extends CommandGroup {
	public DriveBackHumanPlayerStation() {
		addSequential(new DriveBackwards(0.2), 0.5);
	}
}
