package com.public_dot_com.command;

import java.util.HashMap;
import java.util.Map;

public enum FormatterType {

	LEFT_ALIGN("left"),
	RIGHT_ALIGN("right"),
	CENTER_ALIGN("center"),
	HARD_ALIGN("hard"),
	JUSTIFY_ALIGN("justify");

	private final String value;
    private static Map<String, FormatterType> map = new HashMap<String, FormatterType>();

    FormatterType(String value) {
		this.value = value;
	}
	
    static {
        for (FormatterType commandType : FormatterType.values()) {
            map.put(commandType.value, commandType);
        }
    }

    public static FormatterType valueOfString(String value) {
    	return map.get(value);
    }

    public String getValue() {
        return value;
    }
}
