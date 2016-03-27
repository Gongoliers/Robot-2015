package org.usfirst.frc5112.Robot2015.commands;

import org.usfirst.frc5112.Robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CloseGripper extends Command{
	
	public CloseGripper() {
		requires(Robot.gripper);
	}

	@Override
	protected void initialize() {
		Robot.gripper.close();
	}

	@Override
	protected void execute() {		
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
