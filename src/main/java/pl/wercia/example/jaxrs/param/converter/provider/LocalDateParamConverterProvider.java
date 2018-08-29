package pl.wercia.example.jaxrs.param.converter.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Objects;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import pl.wercia.example.jaxrs.param.converter.LocalDateParamConverter;

@Provider
public class LocalDateParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if (Objects.equals(rawType, LocalDate.class)) {
			return (ParamConverter<T>) new LocalDateParamConverter();
		}
		return null;
	}

}
