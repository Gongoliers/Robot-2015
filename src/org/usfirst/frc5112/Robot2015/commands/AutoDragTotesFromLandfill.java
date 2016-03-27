package org.usfirst.frc5112.Robot2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoDragTotesFromLandfill extends CommandGroup {
	public AutoDragTotesFromLandfill() {
		addParallel(new CloseGripper());
		addSequential(new DriveForward(0.2), 1.1);
		addSequential(new ElevatorDown(0.4), 0.5);
		addSequential(new DriveBackwards(0.4), 1.74);
		addSequential(new ElevatorUp(0.4), 0.5);
		addSequential(new OpenGripper());
	}
}
