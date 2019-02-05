/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain {

    //Constants a la conner
    //public static int xAxisConstant = 4;
    //public static int yAxisConstant = 0;
    //Joysticks
    Joystick m_Joystick;

    public void robotInit(Joystick joy){
        m_Joystick = joy;
    }

    public void autonomousInit() {
    }

    public void autonomousPeriodic(){
    }

    
    //Periodic equations and drive a la Conner
    public void teleopPeriodic(){
        double xAxis, yAxis;
		xAxis = m_Joystick.getRawAxis(4);
        yAxis = m_Joystick.getRawAxis(1);
        
        double leftSide, rightSide;
        rightSide = yAxis + xAxis;
        leftSide = xAxis - yAxis;
        SmartDashboard.putNumber("xAxis", xAxis);
        SmartDashboard.putNumber("yAxis", yAxis);
        SmartDashboard.putNumber("leftSide", leftSide);
        SmartDashboard.putNumber("rightSide", rightSide);
    }
    
    public void testPeriodic() {   
    }
}