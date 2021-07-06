package coordenates.instructionschain;

import coordenates.Rover;

public abstract class InstructionHandler {

	private InstructionHandler successor;

	public InstructionHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(InstructionHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handlesInstruction(Rover rover, char positionHeaded);
}
