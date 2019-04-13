package edu.hunau.cxb.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatConverter implements Converter<String,LocalDate> {

    @Override
    public LocalDate convert(String s){
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
