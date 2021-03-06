package org.usfirst.frc5112.Robot2015.commands;

import org.usfirst.frc5112.Robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {
	
	private double speed;
	
	public DriveForward(double speed) {
		requires(Robot.driveTrain);
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		Robot.driveTrain.forward(speed);
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.driveTrain.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
