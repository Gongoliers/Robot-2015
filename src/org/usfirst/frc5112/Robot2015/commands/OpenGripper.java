package org.usfirst.frc5112.Robot2015.commands;

import org.usfirst.frc5112.Robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenGripper extends Command{
	
	public OpenGripper() {
		requires(Robot.gripper);
	}

	@Override
	protected void initialize() {
		Robot.gripper.open();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
