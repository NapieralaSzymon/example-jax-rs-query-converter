package pl.wercia.example.jaxrs.param.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.ext.ParamConverter;

public class LocalDateParamConverter implements ParamConverter<LocalDate> {

	@Override
	public LocalDate fromString(String localDateString) {
		return LocalDate.parse(localDateString);
	}

	@Override
	public String toString(LocalDate localDate) {
		return DateTimeFormatter.ISO_DATE.format(localDate);
	}

}
