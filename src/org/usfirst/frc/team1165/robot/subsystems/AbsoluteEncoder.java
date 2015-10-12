package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportAbsoluteEncoder;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AbsoluteEncoder extends Subsystem {
    
   private AnalogInput absoluteEncoder = new AnalogInput(0); //0 analog input port on the roboRio

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ReportAbsoluteEncoder());
    }
    public double getVoltage() {
    	return absoluteEncoder.getVoltage();
    }
    public double getADC() {
    	return absoluteEncoder.getVoltage() * 204.6; //5V * 204.6 = 1023 in ADC
    }
    public double getEncoderShaftPosition() {
    	return absoluteEncoder.getVoltage() * 72; //5V * 72 = 360 degrees
    }
    public void report() {
    	SmartDashboard.putNumber("Voltage = ", getVoltage());
    	SmartDashboard.putNumber("ADC Value = ", getADC());
    	SmartDashboard.putNumber("Position of Encoder Shaft (Degrees) = " , getEncoderShaftPosition());
    }
}

