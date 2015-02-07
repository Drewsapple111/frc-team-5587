package org.usfirst.frc.team5587.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Encoder;
import org.usfirst.frc.team5587.robot.RobotMap;

/**
 *
 */
public class LiftMechanism extends Subsystem {
    
	Jaguar lift1;
	Jaguar lift2;
	RobotDrive lift;
    
	public LiftMechanism()
    {
		lift1 = new Jaguar( RobotMap.liftMotor1 );
		lift2 = new Jaguar( RobotMap.liftMotor2 );
		
		lift = new RobotDrive( lift1, lift2 );
    }
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lift()
    {
    	lift.drive( 0.5, 0.0 );
    }
    
    public void stop()
    {
    	lift.drive( 0.5, 0.0 );
    }
    
    public void lower()
    {
    	lift.drive( -0.5, 0.0 );
    }
}

