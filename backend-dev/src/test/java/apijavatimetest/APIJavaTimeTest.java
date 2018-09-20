package apijavatimetest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import apijavatime.APIJavaTime;

public class APIJavaTimeTest {

	@Test
	public void testGetCorrespondentDateFormat() {
		String dateFormatType = "dd/MM/yyyy";
		// Without using the 'toString' method, the 'assertEquals' method
		// would always fail, since it'd be comparing two different instances
		// without the needed corrections on both 'equals' and 'hashCode' methods
		// from the DateTimeFormatter class.
		assertEquals(DateTimeFormatter.ofPattern(dateFormatType).toString(), 
				APIJavaTime.getCorrespondentDateFormat(dateFormatType).toString());
	}
	
	@Test
	public void testGetCorrespondentZone() {
		assertEquals(ZoneId.of("America/Sao_Paulo"), 
				APIJavaTime.getCorrespondentZone("America/Sao_Paulo"));
	}
	
	@Test
	public void testGetCurrentTime() {
		assertEquals(LocalDate.now(), APIJavaTime.getCurrentTime());
	}
	
	@Test
	public void testParseStringToLocalDate() {
		DateTimeFormatter dateType = APIJavaTime.getCorrespondentDateFormat("dd/MM/yyyy");
		assertEquals(LocalDate.parse(LocalDate.now().format(dateType), dateType), 
				APIJavaTime.parseStringToLocalDate(APIJavaTime.getCurrentTime().format(dateType), dateType));
	}
	
	@Test
	public void testParseLocalDateToString() {
		DateTimeFormatter dateType = APIJavaTime.getCorrespondentDateFormat("dd/MM/yyyy");
		assertEquals(LocalDate.now().format(dateType), 
				APIJavaTime.parseLocalDateToString(APIJavaTime.getCurrentTime(), dateType));
	}
	
	@Test
	public void testParseStringGMT3toLocalDateTime() {
		ZoneId zone = APIJavaTime.getCorrespondentZone("America/Sao_Paulo");
		assertEquals(LocalDateTime.now().atZone(zone).withNano(0), 
				APIJavaTime.parseStringGMT3toLocalDateTime(zone, APIJavaTime.getCurrentCompleteTime().toString()));
	}
	
	@Test
	public void testRecoverNextMonthFromAnyDate() {
		assertEquals(LocalDate.now().plusMonths(1).getMonth(),
				APIJavaTime.recoverNextMonthFromAnyDate(APIJavaTime.getCurrentTime()));
	}
	
	@Test
	public void testGetDateWithTenDaysAdded() {
		assertEquals(LocalDate.now().plusDays(10),
				APIJavaTime.getDateWithTenDaysAdded(APIJavaTime.getCurrentTime()));
	}
}