package com.public_dot_com.command;

import com.public_dot_com.PublicStringUtil;

public class CenterAligner implements IFormatterCommand {
	
	public String formatString(String input, int width) {
		
	    String formattingPattern = null;

	    String outString=PublicStringUtil.formatString(input, width, formattingPattern);
	    
	    StringBuilder output = new StringBuilder(input.length());

		for (String line : outString.split("\n")) {
			output.append(center(line, width)).append("\n");
		}
	    
		return output.toString();
		
	}
	
	public String getName() {
		return "Center align";
	}
	

    private String center(String string, int width) {
        if (string == null || width <= string.length())
            return string;

        StringBuilder sb = new StringBuilder(width);
        for (int i = 0; i < (width - string.length()) / 2; i++) {
            sb.append(" ");
        }
        sb.append(string);
        while (sb.length() < width) {
            sb.append(" ");
        }
        return sb.toString();
    }

}
