
package org.usfirst.frc.team1165.robot.subsystems;



import org.usfirst.frc.team1165.robot.commands.ReportMyAccelerometer;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MyAccelerometer extends Subsystem {
    
	private  edu.wpi.first.wpilibj.BuiltInAccelerometer accelerometer;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ReportMyAccelerometer());
    }
    
    /**
     * @return X value of accelerometer
     */
    public double X() {
    	return accelerometer.getX();
    }
    
    /**
     * @return Y value of accelerometer
     */
    private double Y() {
    	return accelerometer.getY();
    }
    
    /**
     * @return Z value of accelerometer
     */
    private double Z() {
    	return accelerometer.getZ();
    }
    
    /**
     * Reports status of X, Y, & Z values of accelerometer to the SmartDashboard.
     */
    public void report(){
    	SmartDashboard.putNumber("X = ", X());
    	SmartDashboard.putNumber("X = ", Y());
    	SmartDashboard.putNumber("X = ", Z());
    	
    }
}

