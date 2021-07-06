package coordenates.instructionschain;

import coordenates.Rover;

public class InstructionRight extends InstructionHandler {

	@Override
	public void handlesInstruction(Rover rover, char positionHeaded) {
		if (positionHeaded == 'R') {
			rover.setCardinalCompassPoint(rover.getCardinalCompassPoint() - 1);
			if (rover.getCardinalCompassPoint() == 0) {
				rover.setCardinalCompassPoint(4);
			}
		} else {
			this.getSuccessor().handlesInstruction(rover, positionHeaded);
		}
	}
}
