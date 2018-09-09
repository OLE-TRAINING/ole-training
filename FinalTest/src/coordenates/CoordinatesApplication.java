package coordenates;

import java.util.Scanner;

import coordenates.instructionschain.*;

public class CoordinatesApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Plateau plateau = new Plateau(scanner.nextInt(), scanner.nextInt());
		Rover rover;
		String instructions;
	
		scanner = new Scanner(System.in); // clears the buffer
		
		// since the exercise didn't specify how many rover there would be, entering a blank space on the next
		// rover breaks the while loop
		
		char nextRover = 'y';
		while (nextRover == 'y') {
			rover = new Rover(scanner.nextInt(), scanner.nextInt(), Compass.valueOf(scanner.next()), plateau);
			defineInstructionHandler(rover);
			instructions = scanner.next();
			executeInstructions(instructions, rover);
			rover.printInfo();
			System.out.print("To insert another rover, enter with 'y': ");
			nextRover = scanner.next().charAt(0);
		}
	}
	
	public static void executeInstructions(String instructions, Rover rover) {
		for (int i = 0; i < instructions.length(); i++) {
			rover.move(instructions.charAt(i));
		}
	}
	
	public static void defineInstructionHandler(Rover rover) {
		InstructionHandler i1 = new InstructionLeft();
		InstructionHandler i2 = new InstructionRight();
		InstructionHandler i3 = new InstructionMove();
		i1.setSuccessor(i2);
		i2.setSuccessor(i3);
		rover.setInstructionHandler(i1);
	}
}

