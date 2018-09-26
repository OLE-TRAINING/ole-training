package Rovers;

public class FinalDefiance {

    public static void main (String args[]){
        Rover roverA = new Rover(5,5,1,2,'N');
        Controller rover1 = new Controller(roverA);
        rover1.executeSequenceComands("LMLMLMLMM");
        rover1.showPosition();
        System.out.println();
        Rover roverB = new Rover(5,5,3,3,'E');
        Controller rover2= new Controller(roverB);
        rover2.executeSequenceComands("MMRMMRMRRM");
        rover2.showPosition();
    }
}