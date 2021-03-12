package com.public_dot_com.command;

import org.junit.Assert;
import org.junit.Test;


public class FormatterCommandTest {
		
	private static final String LEFT_SAMPLE_TEXT="This text should be left aligned ";
	private static final String RIGHT_SAMPLE_TEXT="This text should be right aligned ";
	private static final String CENTER_SAMPLE_TEXT="This text should be center aligned ";


	IFormatterCommand alignCommand;


	@Test
	public void leftAlignCommand() throws Exception {
		alignCommand= FormatterCommandFactory.createFormatter(FormatterType.LEFT_ALIGN);
		
		String result=alignCommand.formatString(LEFT_SAMPLE_TEXT, 10);		
		String expected="This text \nshould be \nleft      \naligned   \n";

		Assert.assertEquals(expected, result);
		
		result=alignCommand.formatString(LEFT_SAMPLE_TEXT, 20);		
		expected="This text should be \nleft aligned        \n";

		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void righrAlignCommand() throws Exception {
		alignCommand= FormatterCommandFactory.createFormatter(FormatterType.RIGHT_ALIGN);
		
		String result=alignCommand.formatString(RIGHT_SAMPLE_TEXT, 10);		
		String expected=" This text\n should be\n     right\n  aligned \n";

		Assert.assertEquals(expected, result);
		
		result=alignCommand.formatString(RIGHT_SAMPLE_TEXT, 20);		
		expected=" This text should be\n      right aligned \n";

		Assert.assertEquals(expected, result);
	}

	
	@Test
	public void centerAlignCommand() throws Exception {
		alignCommand= FormatterCommandFactory.createFormatter(FormatterType.CENTER_ALIGN);
		
		String result=alignCommand.formatString(CENTER_SAMPLE_TEXT, 10);		
		String expected="This text \nshould be \n  center  \n aligned  \n";

		Assert.assertEquals(expected, result);
		
		result=alignCommand.formatString(CENTER_SAMPLE_TEXT, 20);		
		expected="This text should be \n  center aligned    \n";

		Assert.assertEquals(expected, result);
	}

}
