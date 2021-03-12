package com.public_dot_com.command;

public class FormatterCommandFactory {

	public static IFormatterCommand createFormatter(FormatterType commandType) throws CommandTypeNotFoundException {

		if (FormatterType.LEFT_ALIGN.equals(commandType)) {
			return new LeftAligner();
		}

		if (FormatterType.RIGHT_ALIGN.equals(commandType)) {
			return new RightAligner();
		}

		if (FormatterType.CENTER_ALIGN.equals(commandType)) {
			return new CenterAligner();
		}

		if (FormatterType.HARD_ALIGN.equals(commandType)) {
			return new HardAligner();
		}

		if (FormatterType.JUSTIFY_ALIGN.equals(commandType)) {
			return new JustifyAligner();
		}

		throw new CommandTypeNotFoundException();
	}
}
