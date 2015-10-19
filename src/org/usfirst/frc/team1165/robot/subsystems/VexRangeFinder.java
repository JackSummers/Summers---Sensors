package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.Reporter;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Provides access to the VEX Ultrasonic Range Finder
 */
public class VexRangeFinder extends ReportableSubsystem
{
	private Ultrasonic rangeFinder;
	
	/**
	 * Construct given the ping (output) and echo (input) channels.
	 */
	public VexRangeFinder(int pingChannel, int echoChannel)
	{
		rangeFinder = new Ultrasonic(pingChannel, echoChannel);
		rangeFinder.setAutomaticMode(true);
	}
	
	/**
	 * Returns the current range in inches.
	 */
	public double getRangeInches()
	{
		return rangeFinder.getRangeInches();
	}
	
	/**
	 * Returns the current range in millimeters.
	 */
	public double getRangeMillimeters()
	{
		return rangeFinder.getRangeMM();
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new Reporter(this));
	}
	
	/**
	 * Reports current values on the SmartDashboard
	 */
	public void report()
	{
		SmartDashboard.putNumber("VEX Range (in)", getRangeInches());
		SmartDashboard.putNumber("VEX Range (mm)", getRangeMillimeters());
	}
}
