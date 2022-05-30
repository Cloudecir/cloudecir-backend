package com.cloudecir.module;

import static java.util.Collections.emptyList;

import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private static final String SPLIT_CHAR = ";";

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
        return stringList != null ? String.join(SPLIT_CHAR, stringList) : "";
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<String> convertToEntityAttribute(String string) {
        return (List<String>) (string != null ? Arrays.asList(string.split(SPLIT_CHAR)) : emptyList());
    }
}
