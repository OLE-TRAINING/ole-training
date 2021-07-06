package coordenates.instructionschain;

import coordenates.Rover;

public class InstructionLeft extends InstructionHandler {

	@Override
	public void handlesInstruction(Rover rover, char positionHeaded) {
		if (positionHeaded == 'L') {
			rover.setCardinalCompassPoint(rover.getCardinalCompassPoint() + 1);
			if (rover.getCardinalCompassPoint() == 5) {
				rover.setCardinalCompassPoint(1);
			}
		} else {
			this.getSuccessor().handlesInstruction(rover, positionHeaded);
		}
	}
}
