package frc.robot.subsystems.drive.io;

import org.littletonrobotics.junction.AutoLog;

public interface DriveIO {
    @AutoLog
    public static class DriveIOInputs {
        /* 
        TODO: Put any sensor inputs here (aka "getters")
        That includes things like motor speeds, motor voltage/current, and encoder positions
        */ 
        public double _leftVelocity;
        public double _rightVelocity;
        public double _leftTemperature; 
        public double _rightTemperature;
        public double _leftPosition;
        public double _rightPosition;
        public double _leftVoltage;
        public double _rightVoltage;
        public double _leftCurrent;
        public double _rightCurrent;
        public double _heading;
    }

    public default void updateInputs(DriveIOInputs inputs){}

    /*
     * TODO: Put any "setters" here
     * Basically any interaction you need to have with your motors or sensors where you tell it to do something goes here
     * ie setting motor speeds, setting configurations, etc
     */
    public default void setLeftSpeed(double speed){}
    public default void setRightSpeed(double speed){}
    public default void setOffset(double offset){}
    public default void setRightVoltage(double voltage){}
    public default void resetEncoders(){}
}
