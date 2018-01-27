<<<<<<< HEAD
package org.usfirst.frc.team293.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {

    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

=======
package org.usfirst.frc.team293.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;





public class Winch extends Subsystem {
	VictorSP theActualWinch = new VictorSP(1);
	
	public void winchOn(){
		theActualWinch.set(1);
	}
	
	public void winchOff(){
		theActualWinch.set(0);
	}

	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

>>>>>>> origin/master
