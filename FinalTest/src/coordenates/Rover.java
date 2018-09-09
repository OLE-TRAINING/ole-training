package coordenates;

import coordenates.instructionschain.*;

public class Rover {

	private int xCoordinate;
	private int yCoordinate;
	private int cardinalCompassPoint;
	private InstructionHandler instructionHandler;
	private Plateau plateau;

	public Rover(int xCoordinate, int yCoordinate, Compass correspondentCompass, Plateau plateau) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.plateau = plateau;
		convertToInt(correspondentCompass);
	}

	public void move(char positionHeaded) {
		this.instructionHandler.handlesInstruction(this, positionHeaded);
	}

	public void convertToInt(Compass correspondetCompass) {
		this.cardinalCompassPoint = correspondetCompass.getValor();
	}

	public void printInfo() {
		System.out.println(xCoordinate + " " + yCoordinate + " " + 
				Compass.getUpdatedCorrespondentCompass(this.cardinalCompassPoint));
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public int getCardinalCompassPoint() {
		return cardinalCompassPoint;
	}

	public void setCardinalCompassPoint(int cardinalCompassPoint) {
		this.cardinalCompassPoint = cardinalCompassPoint;
	}
	
	public InstructionHandler getInstructionHandler() {
		return instructionHandler;
	}

	public void setInstructionHandler(InstructionHandler instructionHandler) {
		this.instructionHandler = instructionHandler;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
}
