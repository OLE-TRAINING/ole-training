package Rovers;

public class Controller implements RemoteControl {
    private Rover rover;

    public Controller(Rover rover) {
        this.rover = rover;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public char[] readComands(String instructions) {
        return instructions.toCharArray();
    }

    @Override
    public void executeSequenceComands(String instructions) {
        char vet[] = readComands(instructions);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == 'M') {
                rover.move();
                rover.defineLimits();
            }         else if (vet[i] == 'L' || vet[i] == 'R') {
                if (vet[i]=='L'){
                    rover.turn(vet[i]);
                } else {
                    rover.turn((int) vet[i]);
                }
            }
        }
    }


    @Override
    public void takeStep() {
        rover.move();
    }

    @Override
    public void turnLeft() {
        rover.turn('L');
    }

    @Override
    public void turnRight() {
        rover.turn((int)'N');
    }

    @Override
    public void showPosition() {
        System.out.println(rover.getX());
        System.out.println(rover.getY());
        System.out.println(rover.getDirection());
    }
}