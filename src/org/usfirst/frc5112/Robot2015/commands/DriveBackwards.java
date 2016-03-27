package org.usfirst.frc5112.Robot2015.commands;

import org.usfirst.frc5112.Robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveBackwards extends Command {
	
	private double speed;
	
	public DriveBackwards(double speed) {
		requires(Robot.driveTrain);
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		Robot.driveTrain.reverse(speed);
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
