package edu.iris.fdsn.station.model;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

import edu.iris.dmc.fdsn.station.model.ZonedDateTimeXmlAdapter;

public class OffsetDateTimeXmlAdapterTest {

	@Test
	public void test1() throws Exception {
		ZonedDateTimeXmlAdapter offsetDateTimeXmlAdapter = new ZonedDateTimeXmlAdapter();
		ZonedDateTime offsetDateTime = offsetDateTimeXmlAdapter.unmarshal("2500-12-31T23:59:59Z");
	}

	@Test
	public void test2() throws Exception {
		ZonedDateTimeXmlAdapter offsetDateTimeXmlAdapter = new ZonedDateTimeXmlAdapter();
		ZonedDateTime offsetDateTime = offsetDateTimeXmlAdapter.unmarshal("1971-01-01T00:00:00");

		ZonedDateTime other = offsetDateTimeXmlAdapter.unmarshal("1971-01-01T00:00:00");

		assertEquals(offsetDateTime, other);

	}

	@Test
	public void test3() throws Exception {
		DateTimeFormatter dtf = new DateTimeFormatterBuilder()
				.appendPattern("yyyy-MM-dd['T'HH:mm:ss[.SSS]['Z']]").parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
				.toFormatter().withZone(ZoneId.of("UTC"));
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX][X]")
				//.withZone(ZoneId.of("UTC"));

		String source = "1971-01-01T00:00:00Z";
		
		ZonedDateTime result=ZonedDateTime.parse(source, dtf);
		//TemporalAccessor result = dtf.parseBest(source, ZonedDateTime::from, LocalDateTime::from);
		System.out.println("before: " + source + " after: " + result);

		
		
		source = "2019-01-16T16:49:56";
		result=ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);
		
		source = "1971-01-01T00:00:00Z";
		result=ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);
		
		source = "1971-01-01";
		result=ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);
	}

}