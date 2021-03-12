package com.public_dot_com;

import org.junit.Assert;
import org.junit.Test;


public class PublicStringUtilTest {
	
	private static final String SAMPLE_TEXT="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

	
	@Test
	public void addLinebreaks() {
		
		String result= PublicStringUtil.addLinebreaks(SAMPLE_TEXT, 30);
		String expected="Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor\nincididunt ut labore et dolore\nmagna aliqua. Ut enim ad minim\nveniam, quis nostrud\nexercitation ullamco laboris\nnisi ut aliquip ex ea commodo\nconsequat. Duis aute irure\ndolor in reprehenderit in\nvoluptate velit esse cillum\ndolore eu fugiat nulla\npariatur. Excepteur sint\noccaecat cupidatat non\nproident, sunt in culpa qui\nofficia deserunt mollit anim\nid est laborum. ";

		Assert.assertEquals(expected, result);
		
		result= PublicStringUtil.addLinebreaks(SAMPLE_TEXT, 100);
		expected="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\net dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut\naliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\ncillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in\nculpa qui officia deserunt mollit anim id est laborum. ";

		Assert.assertEquals(expected, result);
	}

	
	@Test
	public void formatString() {
		
		int width =40;
		String leftFormattingPattern = "%-" + width + "s";
		String rightFormattingPattern = "%" + width + "s";
		String otherOrNullFormattingPattern = "";

		String result= PublicStringUtil.formatString(SAMPLE_TEXT, width,leftFormattingPattern);
		String expected="Lorem ipsum dolor sit amet, consectetur \nadipiscing elit, sed do eiusmod tempor  \nincididunt ut labore et dolore magna    \naliqua. Ut enim ad minim veniam, quis   \nnostrud exercitation ullamco laboris    \nnisi ut aliquip ex ea commodo consequat.\nDuis aute irure dolor in reprehenderit  \nin voluptate velit esse cillum dolore eu\nfugiat nulla pariatur. Excepteur sint   \noccaecat cupidatat non proident, sunt in\nculpa qui officia deserunt mollit anim  \nid est laborum.                         \n";
		Assert.assertEquals(expected, result);
		
		result= PublicStringUtil.formatString(SAMPLE_TEXT, width,rightFormattingPattern);
		expected=" Lorem ipsum dolor sit amet, consectetur\n  adipiscing elit, sed do eiusmod tempor\n    incididunt ut labore et dolore magna\n   aliqua. Ut enim ad minim veniam, quis\n    nostrud exercitation ullamco laboris\nnisi ut aliquip ex ea commodo consequat.\n  Duis aute irure dolor in reprehenderit\nin voluptate velit esse cillum dolore eu\n   fugiat nulla pariatur. Excepteur sint\noccaecat cupidatat non proident, sunt in\n  culpa qui officia deserunt mollit anim\n                        id est laborum. \n";
		Assert.assertEquals(expected, result);
		
		result= PublicStringUtil.formatString(SAMPLE_TEXT, width,otherOrNullFormattingPattern);
		expected="Lorem ipsum dolor sit amet, consectetur\nadipiscing elit, sed do eiusmod tempor\nincididunt ut labore et dolore magna\naliqua. Ut enim ad minim veniam, quis\nnostrud exercitation ullamco laboris\nnisi ut aliquip ex ea commodo consequat.\nDuis aute irure dolor in reprehenderit\nin voluptate velit esse cillum dolore eu\nfugiat nulla pariatur. Excepteur sint\noccaecat cupidatat non proident, sunt in\nculpa qui officia deserunt mollit anim\nid est laborum. ";

		Assert.assertEquals(expected, result);
	}
}
