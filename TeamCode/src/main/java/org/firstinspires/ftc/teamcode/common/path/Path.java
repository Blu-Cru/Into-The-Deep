package org.firstinspires.ftc.teamcode.common.path;

public interface Path {
    // interface for both PID path following and RoadRunner path following
    Path start();

    void run();

    void breakPath();

    boolean isDone();
}
