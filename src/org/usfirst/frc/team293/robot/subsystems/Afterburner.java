package org.usfirst.frc.team293.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Afterburner extends Subsystem {
	VictorSP theGodWinch = new VictorSP(10);
	/* VictorSP number2 = new VictorSP(#);
	   VictorSP number3 = new VictorSP(#);
	   VictorSP number4 = new VictorSP(#);
        */

	public void winchOn(){
		theGodWinch.set(1);
	      /*number2.set(1);
	        number3.set(1);
		number4.set(1);
	      */
	}
	
	public void winchOff(){
		theGodWinch.set(0);
	      /*number2.set(0);
	        number3.set(0);
		number4.set(0);
	      */
	}

    public void initDefaultCommand() {
    	winchOff();
    }
}

