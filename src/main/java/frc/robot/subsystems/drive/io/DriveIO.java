package frc.robot.subsystems.drive.io;

import org.littletonrobotics.junction.AutoLog;

public interface DriveIO {
    @AutoLog
    public static class DriveIOInputs {
        /* 
        TODO: Put any sensor inputs here (aka "getters")
        That includes things like motor speeds, motor voltage/current, and encoder positions
        */ 
    }

    public default void updateInputs(DriveIOInputs inputs){}

    /*
     * TODO: Put any "setters" here
     * Basically any interaction you need to have with your motors or sensors where you tell it to do something goes here
     * ie setting motor speeds, setting configurations, etc
     */
}
