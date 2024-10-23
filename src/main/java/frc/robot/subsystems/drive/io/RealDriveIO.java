package frc.robot.subsystems.drive.io;

public class RealDriveIO implements DriveIO {
    // TODO: instantiate motors here
    private TalonFX LeftPrimaryMotor;
    private TalonFX RightPrimaryMotor;
    private TalonFX LeftSecondaryMotor;
    private TalonFX RightSecondaryMotor;
    private AHRS _gyro;

    public RealDriveIO() {
        // TODO: construct motors here
    }

    public void updateInputs(DriveIOInputs inputs) {
        // TODO: for every "getter", give it a value from the motors
        // ie for a variable that holds the value of the motor's speed, set it equal to motor.get()
    }

    // TODO: implement all the "setters" declared in DriveIO.java
}
