package org.simplicityftc.commandbase;


import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Usage:
 * Waits a certain amount of time before returning true
 */
public class SleepCommand extends Command {
    private ElapsedTime timer;
    private final double timeoutSeconds;

    /**
     * Waits a certain amount of time before returning true
     * @param commandName The name of the command
     * @param timeoutSeconds The amount of time to wait
     */
    public SleepCommand(String commandName, double timeoutSeconds) {
        super(commandName);
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Waits a certain amount of time before returning true
     * @param timeoutSeconds The amount of time to wait
     */
    public SleepCommand(double timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public boolean run() {
        if(timer == null)
            timer = new ElapsedTime();

        //TODO: test if this works
        return timer.seconds() >= timeoutSeconds;
    }
}