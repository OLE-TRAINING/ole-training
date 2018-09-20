package apijavatime;

import java.time.LocalDate;

import org.apache.log4j.Logger;

public class ExecuteAPIJavaTime {

	// Complementing topic 6
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExecuteAPIJavaTime.class);
		LocalDate date = LocalDate.now();
		
		// Since LocalDate is an immutable class, adding ten days on a date will return 
		// another object with ten days added, but won't persist on the original object.
		APIJavaTime.getDateWithTenDaysAdded(date);
		logger.info(date);
		
		// You'd have to assign the original object to the new object that is being returned.
		date = APIJavaTime.getDateWithTenDaysAdded(date);
		logger.info(date);
	}
}
