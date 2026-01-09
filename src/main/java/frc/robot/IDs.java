package frc.robot;

public enum IDs {
    // CAN IDs

    // IDs 0-9 Reserved for drivetrain
    ARM_ELEVATOR_MAIN(10, "canivore1"),
    ARM_ELEVATOR_FOLLOWER(11, "canivore1"),
    ARM_WRIST(12, "canivore1"),
    ARM_END_EFFECTOR(13, "canivore1"),
    CLIMBER_MAIN(20, "canivore1"),
    CLIMBER_FOLLOWER(21, "canivore1"),
    INTAKE_PIVOT(31, "canivore1"),
    INTAKE_ROLLERS(32, "canivore1"),
    SHOOTER_HOOD(1, "canivore1"),
    SHOOTER_FLYWHEEL_MAIN(0, "canivore1"),
    SHOOTER_FLYWHEEL_FOLLOWER(2, "canivore1"),
    SHOOTER_FEEDER(10, "canivore1"),
    
    // Rio Digital Ports
    INTAKE_BEAM_BREAK(0, "RIO_DIGITAL_IN"),
    SHOOTER_FEEDER_BEAM_BREAK(0, "RIO_DIGITAL_IN");

    public final int id;
    public final String bus;

    private IDs(int id, String bus) {
        this.id = id;
        this.bus = bus;
    }
}
