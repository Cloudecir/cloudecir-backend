package com.cloudecir.module;

public enum Datatype {

    YPE_STRING(Constants.STRING, ""), 
	TYPE_INTEGER(Constants.INTEGER, ""),
	TYPE_DOUBLE(Constants.NUMBER, ""), 
	TYPE_EMAIL(Constants.STRING, "email"),
	TYPE_BOOLEAN(Constants.BOOLEAN, ""), 
	TYPE_DATE(Constants.STRING, "date"),
	TYPE_DATETIME(Constants.STRING, "date-time"),
	TYPE_TIME(Constants.STRING, "time"),
    TYPE_ENUM(Constants.STRING, "enum"), 
    TYPE_URL(Constants.STRING, "url");
	
    private final String jsonDatatype;
    private final String format;

    Datatype(String jsonDatatype, String format) {
        this.jsonDatatype = jsonDatatype;
        this.format = format;
    }

    public String getJsonDatatype() {
        return this.jsonDatatype;
    }

    public String getFormat() {
        return this.format;
    }

    private static class Constants {

        public static final String STRING = "string";
        public static final String INTEGER = "integer";
        public static final String NUMBER = "number";
        public static final String BOOLEAN = "boolean";

    }
    
}
