package com.public_dot_com;

import java.util.StringTokenizer;

public class PublicStringUtil {

	public static String addLinebreaks(String input, int width) {

		StringTokenizer tok = new StringTokenizer(input, " ");
		StringBuilder output = new StringBuilder(input.length());
		int lineLen = 0;

		while (tok.hasMoreTokens()) {
			String word = tok.nextToken();

			if (word.length() > width || (lineLen > 0 && lineLen + word.length() > width)) {
				if (lineLen > 0) {
					output.append("\n");
				} else {
					output.append(word).append("\n");
					continue;
				}
				lineLen = 0;
			}

			output.append(word).append(" ");

			lineLen += word.length() + 1;
		}
		return output.toString().replace(" \n", "\n");
	}

	
	public static String formatString(String input,int width, String formattingPattern) {

		String outString = PublicStringUtil.addLinebreaks(input, width);
		
		if(formattingPattern==null || formattingPattern.isEmpty())
			return outString;
		
		StringBuilder output = new StringBuilder(input.length());

		for (String line : outString.split("\n")) {
			output.append(String.format(formattingPattern, line)).append("\n");
		}
		
		return output.toString();
	}
}