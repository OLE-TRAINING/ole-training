package Rovers;

public interface RemoteControl {
    void executeSequenceComands(String instructions);
    void takeStep();
    void turnLeft();
    void turnRight();
    void showPosition();
}
