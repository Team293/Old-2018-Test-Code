package org.usfirst.frc.team293.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Afterburner extends Subsystem {
	VictorSP theGodWinch = new VictorSP(10);

	public void winchOn(){
		theGodWinch.set(1);
	}
	
	public void winchOff(){
		theGodWinch.set(0);
	}

    public void initDefaultCommand() {
    	winchOff();
    }
}

