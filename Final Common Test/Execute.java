import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// upper-right coordinates of the plateau
		int coordinateUpperRightX = s.nextInt();
		int coordinateUpperRightY = s.nextInt();
		
		while(true) {
		// rover first position:
		int coordinateRoverX = s.nextInt();
		int coordinateRoverY = s.nextInt();
		
		// facingRover
		char facingRover = s.nextLine().charAt(1);
		
		// commands
		String commands = s.nextLine();

		String result = executeCommands(coordinateUpperRightX, coordinateUpperRightY, coordinateRoverX,
				coordinateRoverY, facingRover, commands);
		System.out.println(result);
		}
		
		
	}

	public static char turn(char facingNow, char command) {

		// facing north or South
		if ((facingNow == 'N') && isL(command) || (facingNow == 'S') && isR(command)) {
			return 'W';
		} else if ((facingNow == 'N') && isR(command) || (facingNow == 'S') && isL(command)) {
			return 'E';
		}

		// facing west or East
		if ((facingNow == 'W') && isL(command) || (facingNow == 'E') && isR(command)) {
			return 'S';
		} else if ((facingNow == 'W') && isR(command) || (facingNow == 'E') && isL(command)) {
			return 'N';
		}

		return 'e';// error
	}

	public static boolean isR(char command) {
		return command == 'R';
	}

	public static boolean isL(char command) {
		return command == 'L';
	}

	public static int moveX(int coordinateX, char facingNow) {
		if (facingNow == 'E') {
			return coordinateX + 1;
		} else {
			return coordinateX - 1;
		}
	}

	public static int moveY(int coordinateY, char facingNow) {
		if (facingNow == 'N') {
			return coordinateY + 1;
		} else {
			return coordinateY - 1;
		}
	}

	public static void checkRover(int coordinateRoverX, int coordinateRoverY, int coordinateUpperRightX,
			int coordinateUpperRightY) {

		if (coordinateUpperRightX == 0 && coordinateUpperRightY == 0) {
			System.out.println("plateau is Null!!");
			System.exit(1);
		}

		if (coordinateRoverX > coordinateUpperRightX || coordinateRoverY > coordinateUpperRightY) {
			System.out.println("rover left the plateau or rover is broken!!");
			System.exit(1);
		}
	}

	public static String executeCommands(int coordinateUpperRightX, int coordinateUpperRightY, int coordinateRoverX,
			int coordinateRoverY, char facingRover, String commands) {

		for (int number = 0; number < commands.length(); number++) {
			checkRover(coordinateRoverX, coordinateRoverY, coordinateUpperRightX, coordinateUpperRightY);
			System.out.println("Rover=(" + coordinateRoverX + "," + coordinateRoverY + ") Face=" + facingRover);

			if (commands.charAt(number) == 'M') {
				if (facingRover == 'E' || facingRover == 'W') {
					coordinateRoverX = moveX(coordinateRoverX, facingRover);
				} else {
					coordinateRoverY = moveY(coordinateRoverY, facingRover);
				}
			} else {
				facingRover = turn(facingRover, commands.charAt(number));
			}
		}

		return coordinateRoverX + " " + coordinateRoverY + " " + facingRover;
	}
}
