package frc.robot.subsystems.drive;

import frc.robot.subsystems.drive.io.DriveIO;

public class Drive {
    private DriveIO _io;

    public Drive(DriveIO io) {
        _io = io;
    }

    /**
     * Runs the drive motors based on two inputs that typically come from joysticks
     * @param drive The speed for forwards/backwards movement, between -1 and 1
     * @param rotate The speed for rotation, between -1 and 1
     */
    public void arcadeDrive(double drive, double rotate) {
        // TODO: implement
    }
}
