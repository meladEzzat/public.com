package com.public_dot_com.command;

import com.public_dot_com.PublicStringUtil;

public class RightAligner implements IFormatterCommand {

	public String formatString(String input, int width) {
		
		String formattingPattern = "%" + width + "s";

		return PublicStringUtil.formatString(input, width, formattingPattern);
	}

	public String getName() {
		return "Right align";
	}	
}
