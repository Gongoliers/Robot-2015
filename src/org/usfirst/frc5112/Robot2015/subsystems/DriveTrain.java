package org.usfirst.frc5112.Robot2015.subsystems;

import org.usfirst.frc5112.Robot2015.RobotMap;
import org.usfirst.frc5112.Robot2015.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	private final SpeedController frontLeftDriveMotor = RobotMap.driveTrainFrontLeftDriveMotor;
	private final SpeedController frontRightDriveMotor = RobotMap.driveTrainFrontRightDriveMotor;
	private final SpeedController rearLeftDriveMotor = RobotMap.driveTrainRearLeftDriveMotor;
	private final SpeedController rearRightDriveMotor = RobotMap.driveTrainRearRightDriveMotor;
	private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

	public void initDefaultCommand() {
		setDefaultCommand(new OperateDriveTrain());
	}

	public void operate(Joystick stick) {
		double y = stick.getY();
		double x = stick.getX();
		double rotation = stick.getZ();
		double throttle = stick.getThrottle();
		if (throttle <= 0) {
			throttle = 0.6;
		}
		rotation = square(rotation);
		y = square(y);
		x = square(x);
		robotDrive.mecanumDrive_Cartesian(x * throttle, y * throttle, rotation, 0);
	}

	private double square(double input) {
		return Math.copySign(Math.pow(input, 2), input);
	}

	public void stop() {
		robotDrive.drive(0, 0);
	}

	public void forward(double speed) {
		robotDrive.drive(-speed, 0);
	}

	public void reverse(double speed) {
		robotDrive.drive(speed, 0);
	}

	public void rotateCW(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, 0, speed, 0);
	}

	public void rotateCCW(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, 0, -speed, 0);
	}

	public void left(double speed) {
		robotDrive.mecanumDrive_Cartesian(-speed, 0.05, 0, 0);
	}

	public void right(double speed) {
		robotDrive.mecanumDrive_Cartesian(speed, -0.05, 0, 0);
	}
}
