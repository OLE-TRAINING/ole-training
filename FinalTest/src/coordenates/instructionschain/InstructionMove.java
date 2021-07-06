package coordenates.instructionschain;

import coordenates.Rover;

public class InstructionMove extends InstructionHandler {

	@Override
	public void handlesInstruction(Rover rover, char positionHeaded) {
		if (positionHeaded == 'M') {
			switch (rover.getCardinalCompassPoint()) {
			case 1:
				// doesn't exceed the plateau's coordinates
				if (rover.getyCoordinate() < rover.getPlateau().getyCoordinate()) {
					rover.setyCoordinate(rover.getyCoordinate() + 1);
				}
				break;
			case 2:
				// doesn't exceed 0
				if (rover.getxCoordinate() > 0) { 
					rover.setxCoordinate(rover.getxCoordinate() - 1);
				}
				break;
			case 3:
				if (rover.getyCoordinate() > 0) {
					rover.setyCoordinate(rover.getyCoordinate() - 1);
				}
				break;
			case 4:
				if (rover.getxCoordinate() < rover.getPlateau().getxCoordinate()) {
					rover.setxCoordinate(rover.getxCoordinate() + 1);
				}
			}
		} else {
			// As I know this class is the end of my chain...
			System.out.println("Can't resolve " + positionHeaded + " instruction!");
		}
	}
}
