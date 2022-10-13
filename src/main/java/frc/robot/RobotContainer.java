// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public DifferentialDrive drivetrain;
  public static Joystick joystick; 
  public final Talon rightMotor1;
  public final Talon rightMotor2;
  public final Talon leftMotor1;
  public final Talon leftMotor2;
  public final MotorControllerGroup rightControllerGroup;
  public final MotorControllerGroup leftControllerGroup;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    rightMotor1 = new Talon(Constants.rightMotor1_num);
    rightMotor2 = new Talon(Constants.rightMotor2_num);
    leftMotor1 = new Talon(Constants.leftMotor1_num);
    leftMotor2 = new Talon(Constants.leftMotor2_num);

    rightControllerGroup = new MotorControllerGroup(rightMotor1, rightMotor2);
    leftControllerGroup = new MotorControllerGroup(leftMotor1, leftMotor2);

    drivetrain = new DifferentialDrive(rightControllerGroup, leftControllerGroup);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    joystick = new Joystick(Constants.joystick_num);

    new JoystickButton(joystick, 12);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    Command command = new Command() {
      
    };
    return command;
  }
}
