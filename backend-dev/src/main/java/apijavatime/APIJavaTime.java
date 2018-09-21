package apijavatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class APIJavaTime {
	
	private APIJavaTime() {}

	public static DateTimeFormatter getCorrespondentDateFormat(String dateFormatType) {
		return DateTimeFormatter.ofPattern(dateFormatType);
	}
	
	public static ZoneId getCorrespondentZone(String zoneId) {
		return ZoneId.of(zoneId);
	}
	
	public static LocalDateTime getCurrentCompleteTime() {
		return LocalDateTime.now().withNano(0);
	}
	
	// topic 1
	public static LocalDate getCurrentTime() {
		return LocalDate.now();
	}
	
	// topic 2
	public static LocalDate parseStringToLocalDate(String dateAsString, DateTimeFormatter formatter) {
		return LocalDate.parse(dateAsString, formatter);
	}
	
	// topic 3
	public static String parseLocalDateToString(LocalDate date, DateTimeFormatter formatter) {
		return date.format(formatter);
	}
	
	// topic 4
	public static ZonedDateTime parseStringGMT3toLocalDateTime(ZoneId zoneId, String dateAsString) {
		return LocalDateTime.parse(dateAsString).atZone(zoneId);
	}
	
	// topic 5
	public static java.time.Month recoverNextMonthFromAnyDate(LocalDate date) {
		return date.getMonth().plus(1);
	}
	
	// topic 6
	public static LocalDate getDateWithTenDaysAdded(LocalDate date) {
		return date.plusDays(10);
	}
}