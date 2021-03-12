package com.public_dot_com;

import java.util.Scanner;

import com.public_dot_com.command.CommandTypeNotFoundException;
import com.public_dot_com.command.FormatterCommandFactory;
import com.public_dot_com.command.FormatterType;
import com.public_dot_com.command.IFormatterCommand;

public class PublicTextFormatter {

	public static void main(String[] args) {

		String command=args[0];
		int width=Integer.valueOf(args[1]);
		
		IFormatterCommand formatter=null;
		try {
			formatter=FormatterCommandFactory.createFormatter(FormatterType.valueOfString(command));
		} catch (CommandTypeNotFoundException e) {
			e.printStackTrace();
		}
		
        Scanner in = new Scanner(System.in); 
        String userInput = in.nextLine(); 
		in.close();
		
        System.out.println(formatter.getName()+" width " + width + " :\n" + formatter.formatString(userInput,width));
        
	}
}
